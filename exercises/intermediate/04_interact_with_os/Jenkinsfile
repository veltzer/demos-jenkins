pipeline {
    agent none
    stages {
        stage('Run Parallel Tests') {
            parallel {
                stage('Windows') {
                    agent {
                        label 'windows'
                    }
                    steps {
			script {
				bat 'ver'
			}
                    }
                }
                stage('Linux') {
                    agent {
                        label 'unix'
                    }
                    steps {
			script {
				sh 'uname -r'
			}
                    }
                }
            }
        }
    }
}
