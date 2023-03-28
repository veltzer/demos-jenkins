The idea behind this exercise is to run pipelines in docker.

* Install the docker plugin.

* Select a docker image from docker hub which has slim python.

* Configure the pipeline to run inside this docker
	(all you need to change is the "agent" line)

* Check that you can run the build inside docker


* Here is a dockerfile to build a docker with python and pytest:
================
FROM python:3-alpine
RUN pip install pytest
================

* to install docker on your machine use:
$ sudo apt install docker.io

* to add auser to the docker group so that he will be able to use docker use:
$ sudo adduser $USER docker
and restart docker

* to support docker at the jenkins level add the 'Docker Pipeline' plugin and restart jenkins.

References:
- https://www.jenkins.io/doc/book/pipeline/docker/
