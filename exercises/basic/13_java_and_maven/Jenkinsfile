pipeline {
    agent {
        docker {
            image 'maven'
        }
    }
    stages {
        stage('compile') {
            steps {
                sh 'mvn compile'
            }
        }
    }
}
