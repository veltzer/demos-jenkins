* if you don't have a github account - open one
* open a repo to play with (call it "test"?)
* add some python code to your repo, for example:
	* do a function called add(a,b) that returns a+b
* add a test to your code using pytest (look it up).
	* check that add(2,2)==4
* push you code to you github repo.
* Configure a pipeline job in jenkins and connect it to your github account.
	Tell the pipeline to use the "Jenkinsfile" in your source repository.
* Tell jenkins how to run you tests by placing the appropriate "Jenkinsfile"
	at the root of your repository and telling it how to run your python tests.
* Run a jenkins job and see how jenkins pulls your code from github and tests it.
	(This is done from the Jenkins GUI).
* You may need to install 'pytest' on your machine so that jenkins could use it.

Hints:
* here is a python function that adds two integers and returns their sum:
    ====== add.py ========
    def add(a, b):
        return a+b
* here is a test for that function:
    ====== tests/test_add.py =======
    from add import add
    def test_add():
        assert add(2,2)==4
* to install pytest use:
    $ pip install pytest
