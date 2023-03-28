The idea behind this exercise is to run pipelines in docker.

* Install the `Docker Pipeline` plugin.

* Select a docer image from docker hub which has slim python (`python:3-alpine`)

* Configure the pipeline to run inside this docker
	(all you need to change is the "agent" line)

* Check that you can run the build inside docker


* Here is a dockerfile to build a docker with python and pytest:
================
FROM python:3-alpine
RUN pip install pytest
================

* create the image with the command:
`docker build --tag python_with_pytest .`

* to install docker on your machine use:
$ sudo apt install docker.io

* to add auser to the docker group so that he will be able to use docker use:
$ sudo adduser $USER docker
and restart docker

* to support docker at the jenkins level add the 'Docker Pipeline' plugin and restart jenkins.

* to restart your jenkins if you are running it with "java -jar jenkins.war":
find the pid of the java jenkins process
`ps -ef | grep java`
kill the process with
`kill -9 [PID]`
run it again:
`java -jar jenkins.war &`

* to make your pipeline run in a docker container add the following line to it:
    agent { docker { image 'python_with_pytest:latest' } }

References:
- https://www.jenkins.io/doc/book/pipeline/docker/
