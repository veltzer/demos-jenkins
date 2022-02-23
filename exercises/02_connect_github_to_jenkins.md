The idea of this exercise is that every push to
your github repo will cause jenkins to rerun your pipeline (tests).

short description
You will have to confiure this at BOTH ENDS.
	* configure github to send notifications to your jenkins when the source code changes.
	* configure jenkins to respond to such notifications by running the pipeline.

* you can find plenty of guides on how to configure both github and jenkins.


long description

Phase 1
create a github repo with some python code and some testing code for that python code.
show that you can run the tests using pytest.

Phase 2
run a jenkins server and configure it to poll your github repository and test whenever
necessary. creat a "pipeline" type object in jenkins and configure it properly.

hints
* look for guides on the internet about how to connet a jenkins pipeline to a github repository.
* look for guides on the internet about how to test python code with jenknis.

Phase 3
Make sure that the outside world can access your linux box on port 80
You may need to:
	* configure your router
	* configure your hypervisor to trafer port 80 requests to your linux virtual machine.
	* you may need to open the port in either your windows firewall or your linux firewall or both.

Phase 4
Configure github to send a message to your jenkins whenever a commit is done (there are guides for this
over internet - look for github/jenkins intergration)
Configure genkins to receive such message and deactivate the polling you configured in phase 2
Push and enjoy (you should see jenkins run tests automatically on every push to github).
