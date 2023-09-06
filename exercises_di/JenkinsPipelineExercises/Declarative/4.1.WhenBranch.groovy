pipeline {
    agent any
    // Works for multi-branch pipeline ONLY
    stages {
        // Execute when branch = 'master'
        stage('Branch master') {
            when {
                branch 'master'
            }
            steps {
                echo 'WHEN - Master Branch!'
            }
        }

        // Execute when branch = 'calc-cube'
        stage('Branch feature') {
            when {
                branch 'calc-cube'
            }
            steps {
                echo 'WHEN - calc-cube!'
            }
        }
    }
}
