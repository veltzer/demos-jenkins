node('win||unix') {
   def mvnHome
   def javaHome
   def slackChannel = '#202004_sf_jenkins'
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git credentialsId: 'kpassoubady_git_ssh', url: 'git@github.com:kpassoubady/Calc.git'
      // Get the Maven tool from the global configuration.
      if (!isUnix()) {
         mvnHome = tool 'MVN-WIN'
         javaHome = tool 'JDK11-WIN'
      } else {
         mvnHome = tool 'MVN-UBUNTU'
         javaHome = tool 'JDK11-UBUNTU'
      }
   }
   stage('Build') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome",
      "JAVA_HOME=$javaHome"]) {
         if (isUnix()) {
            sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
         } else {
            bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
         }
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts allowEmptyArchive: true, artifacts: 'target/*.jar',
         fingerprint: true, onlyIfSuccessful: true
   }
   stage('Notify') {
      slackSend channel: slackChannel, color: 'good',
         message: 'Successfully completed', tokenCredentialId: 'slack'
   }
}
