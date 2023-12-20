pipeline {
    agent {
	label 'unix'
    }
    stages {
	stage('Check stuff') {
	    steps {
		script {
			sh 'docker --version'
			sh 'groups'
		}
	    }
        }
	stage('Build docker image') {
	    steps {
		script {
			sh 'docker build --tag myapp:latest .'
		}
	    }
        }
	stage('Run docker container') {
	    steps {
		script {
			sh 'docker run myapp'
		}
	    }
        }
    }
}
