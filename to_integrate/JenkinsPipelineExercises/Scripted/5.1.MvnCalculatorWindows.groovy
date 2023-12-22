node("win") {
    def mvnHome
    def javaHome
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        git 'https://github.com/kpassoubady/Calc.git'
        // Get the Maven tool.
        mvnHome = tool 'MVN-WIN'
        javaHome = tool 'JDK11-WIN'
    }
    stage('Build') {
        // Run the maven build
        withEnv([
                "MVN_HOME=$mvnHome",
                "JAVA_HOME=$javaHome",
                "PATH=$javaHome\bin:$PATH"
        ]) {
            bat label: 'RunMvn', returnStatus: true,
                    script: '"%MVN_HOME%\\bin\\mvn" -Dmaven.test.failure.ignore clean package'
        }

        echo "Maven successfully completed!!"
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/coverage.xml', conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false, failUnstable: false, lineCoverageTargets: '80, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false
        //archiveArtifacts 'target/*.jar'
        archiveArtifacts allowEmptyArchive: true, artifacts: 'target/*.jar', fingerprint: true
        //fingerprint 'target/*.jar'
    }
}
