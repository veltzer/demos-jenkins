node('win') {
    def mvnHome
    def javaHome
    stage('Preparation') {
        git 'https://github.com/kpassoubady/SF_RefactoringConcepts.git'
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
            bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean verify -P cobertura,jacoco/)
        }
    }
    stage('Publish') {
        parallel junit: {
            junit '**/target/surefire-reports/TEST-*.xml'
        }, jococo: {
            jacoco()
        }, cobertura: {
            cobertura autoUpdateHealth: false, autoUpdateStability: false,
                    coberturaReportFile: '**/target/site/cobertura/coverage.xml',
                    conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false,
                    failUnstable: false, lineCoverageTargets: '80, 0, 0',
                    maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0',
                    onlyStable: false, sourceEncoding: 'ASCII',
                    zoomCoverageChart: false
        }
    }
    stage('Archive') {
        archiveArtifacts allowEmptyArchive: true, artifacts: 'target/*.jar',
                fingerprint: true, onlyIfSuccessful: true
    }

}