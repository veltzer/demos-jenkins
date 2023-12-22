node('win1') {
    def mvnHome = tool 'MVN-WIN'
    def javaHome = tool 'JDK11-WIN'
    stage('SCM') {
        def gitTool = tool 'GIT-WIN'
        echo "gitTool=$gitTool"
        git 'https://github.com/kpassoubady/Calc.git'
    }
    stage('Build') {
        withEnv([
                "MVN_HOME=$mvnHome",
                "JAVA_HOME=$javaHome",
                "PATH=.:C:\\WINDOWS\\SYSTEM32;$mvnHome\\bin;$javaHome\\bin;$PATH"
        ]) {
            echo "PATH=$PATH"
            bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean test/)
        }
    }
    stage('Test') {
        junit '**/target/surefire-reports/TEST-*.xml'
    }
}