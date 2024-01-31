# "Hello Docker" for Jenkins

* install docker on your ubuntu machine and make sure that it is running:

```shell
sudo apt install docker.io
```

* to check that docker is indeed running well:

```shell
ps -ef | grep docker
```

* add your user to the `docker` group like this:
    `sudo adduser $USER docker`

* logout and login, and check that the output of `groups` contained `docker`.

* restart your jenkins:

* find you jenkins process id with:

```shell
ps -ef | grep jenkins.war
```

```
kill [pid]
```

```
java -jar jenkins.war &
```

* install the `docker pipeline` plugin for jenkins.

* Create a new `pipeline` project in jenkins with the following content:

```groovy
pipeline {
    agent {
        docker {
            image 'python:3-slim'
        }
    }
    stages {
        stage('test') {
            steps {
                step {
                    sh 'python --version'
                }
            }
        }
    }
}
```

* Check that your pipeline runs successfully.
