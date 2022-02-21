#!/bin/bash -eu
docker run --detach --publish 8080:8080 --publish 50000:50000 --name my-jenkins jenkins/jenkins:lts-jdk11
