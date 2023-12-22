env.USER_NAME_LOWER = params.USER_NAME.toLowerCase()
env.USER_NAME_UPPER = params.USER_NAME.toUpperCase()
def waitTime
if (params.WAIT_TIME.toString().equals("null")) {
    waitTime = "1"
} else {
    waitTime = params.WAIT_TIME.toString()
}
waitTime = Integer.parseInt(waitTime)
env.PING_TIMES = waitTime
if (waitTime > 200) {
    env.PING_TIMES = 1
    env.ERROR_MSG = "WAIT_TIME Should not exceed 200, reset to 1"
} else {
    env.ERROR_MSG = "."
}

pipeline {
    agent {
        label 'win'
    }

    parameters {
        string defaultValue: 'Kangs', description: 'Please enter your user name', name: 'USER_NAME', trim: true
        string defaultValue: '10', description: 'Please enter number of pings, should be <= 200', name: 'WAIT_TIME', trim: true
    }

    stages {
        stage('Hello World Execution') {
            steps {
                echo '========executing Hello World Execution========'
                bat label: 'DisplayUserName', script: '''
                echo "Hello World"
                echo "My user name is: %USER_NAME%"
                echo "Lower case user name is: " + %USER_NAME_LOWER%
                echo "Upper Case user name is: " + %USER_NAME_UPPER%
                echo %ERROR_MSG%
                ping -n %PING_TIMES% 127.0.0.1 > ping.txt
                '''
            }
        }
    }
}
