pipeline {
    agent {
        label 'win'
    }

    parameters {
        string defaultValue: 'Kangs', description: 'Please enter your user name', name: 'USER_NAME', trim: true
    }

    stages {
        stage('Hello World Execution') {
            steps {
                echo '========executing Hello World Execution========'
                bat label: 'DisplayUserName', script: '''echo "Hello World"
echo "My user name is: %USER_NAME%"
ping -n 5 127.0.0.1 > ping.txt'''
            }
        }
    }
}
