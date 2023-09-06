node('built-in') {
    def mvnHome
    def javaHome
    def slackChannel='#202210-advanced-jenkins'
    
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        git 'https://github.com/kpassoubady/Calc.git'
        // Get the Maven tool.
        mvnHome = tool 'MVN-UNIX'
        javaHome = tool 'JDK11-UNIX'
    }

    stage('Build') {
        // Run the maven build
        withEnv([
            "MVN_HOME=$mvnHome",
            "JAVA_HOME=$javaHome",
            "PATH=$javaHome/bin:$PATH"
        ]) {
            //sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
            try {
                sh '"$MVN_HOME/bin/mvn" clean package'
                buildResult = 'SUCCESS'
                
            }
            catch (Exception ex) {
                buildDescription 'Maven build failed'
                buildResult = 'FAILURE'
            } finally {
                currentBuild.result = buildResult
            }
        }
    }

    stage('Results') {
        if (buildResult.equals('SUCCESSS')) {
            build quietPeriod: 5, job: 'KP-UNIX-ASTRISK-PYRAMID', parameters: [string(name: 'NUMBER_OF_ROWS', value: '15')]
        }
        def summary = junit '**/target/surefire-reports/TEST-*.xml'
        cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/coverage.xml', conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false, failUnstable: false, lineCoverageTargets: '80, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false
        archiveArtifacts allowEmptyArchive: true, artifacts: 'target/*.jar', fingerprint: true, followSymlinks: false, onlyIfSuccessful: true
        if (currentBuild.result.equals('FAILURE')) {
            emailext body: 'The Build Failed - Take a look at - ${BUILD_URL}', recipientProviders: [developers(), buildUser()], subject: 'Build Failed ${JOB_NAME}'
        } else {
            emailext body: 'The Build Success - Take a look at - ${BUILD_URL}', recipientProviders: [developers(), buildUser()], subject: 'Build Success ${JOB_NAME}'
        }
        buildPath = "${env.BUILD_URL}"
        buildURL = "${buildPath}|View Build"
        if (summary.failCount == 0) {
            buildDescription 'Maven build Completed Sucessfully!!!'
            slackSend channel: slackChannel, message: 'Success - ' + buildURL, tokenCredentialId: 'slackCredentialsID'
        } else {
            buildDescription 'Maven build has test failures!!!'
            slackSend channel: slackChannel, message: 'Failed - ' + buildURL, tokenCredentialId: 'slackCredentialsID'
        }
    }
}