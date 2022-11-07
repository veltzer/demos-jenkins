pipeline {
    agent any
    stages {
        stage("parallel") {
            parallel {
                stage("stage1") {
                    steps {
                        echo "going to sleep for 10 seconds"
                        sleep 10
                    }
                }
                stage("stage2") {
                    steps {
                        echo "going to sleep for 10 seconds"
                        sleep 10
                    }
                }
            }
        }
    }
}
