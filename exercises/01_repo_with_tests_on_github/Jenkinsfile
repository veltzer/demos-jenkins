pipeline {
    agent {
        docker {
            image 'qnib/pytest'
        }
    }
    stages {
        stage('test') {
            steps {
	        sh 'python -m pytest'
            }
        }
    }
}
