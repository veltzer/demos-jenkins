#!/bin/bash -e
 
user="veltzer"
token="115b34c6c33fcd4d094a3008dd56137dba"
url="ec2-52-41-142-136.us-west-2.compute.amazonaws.com"
port="8080"
job_name="mv_pytest"
curl --insecure -X POST "http://${user}:${token}@${url}:${port}/job/${job_name}/build?token=marks_token"
