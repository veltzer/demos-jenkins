The idea of this exercise is to connect jenkins to ec2 and have jenkins run agents
on ec2 machines.

https://plugins.jenkins.io/ec2/

Follow the instructions, install ec2 plugin to jenkins, configure it properly (this
will require creating key and secret for the agent via IAM), configure which machine
profiles it should use to launch new machines, configure limits (max and min), and
see it all work.
