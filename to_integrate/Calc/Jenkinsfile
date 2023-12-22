node('win') {
    def mvnHome
    def javaHome
    stage('Preparation') {
        gitTool = tool 'GIT-WIN'
        mvnHome = tool 'MVN-WIN'
        javaHome = tool 'JDK11-WIN'
        echo "gitTool=$gitTool"
        git 'https://github.com/kpassoubady/Calc.git'
    }
    stage('Build') {
        // Run the maven build
        withEnv([
                "MVN_HOME=$mvnHome",
                "JAVA_HOME=$javaHome",
                "PATH=.:C:\\WINDOWS\\SYSTEM32;$mvnHome\\bin;$javaHome\\bin;$PATH"
        ]) {
            echo "PATH=$PATH"
            bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
        }
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
        cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/coverage.xml', conditionalCoverageTargets: '60, 0, 0', failNoReports: false, failUnhealthy: false, failUnstable: false, lineCoverageTargets: '70, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '50, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false
        jacoco deltaBranchCoverage: '75', deltaClassCoverage: '50', deltaComplexityCoverage: '50', deltaInstructionCoverage: '50', deltaLineCoverage: '30', deltaMethodCoverage: '50'
    }

    stage('Email Notifications') {
        mail bcc: '', body: "Please visit ${BUILD_URL} for more information", cc: '', from: 'kangs@kavinschool.com', replyTo: '', subject: "${JOB_NAME} build completed", to: 'kangs@kavinschool.com'
    }
}
