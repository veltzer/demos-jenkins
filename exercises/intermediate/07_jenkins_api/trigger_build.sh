#!/bin/bash -e
 
user="veltzer"
token_value="115b34c6c33fcd4d094a3008dd56137dba"
token_name="marks_token"
url="ec2-52-41-142-136.us-west-2.compute.amazonaws.com"
port="8080"
protocol="http"
job_name="mv_pytest"
if [ "${protocol}" = "http" ]
then
	EXTRA_ARGS="--insecure"
else
	EXTRA_ARGS=""
fi
curl ${EXTRA_ARGS} -X POST "${protocol}://${user}:${token_value}@${url}:${port}/job/${job_name}/build?token=${token_name}"
