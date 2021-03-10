
* if you don't have a github account - open one
* open a repo to play with (call it "test"?)
* add some python code to your repo, for example:
	* do a function called add(a,b) that returns a+b
* add a test to your code using pytest (look it up).
	* check that add(2,2)==4
* push you code to you github repo.
* Configure a pipeline job in jenkins and connect it to your github account.
* Tell jenkins how to run you tests.
* Run a jenkins job and see how jenkins pulls your code from github and tests it.


Instructions for people who cannot reach their cloud machine at port 8080

* You must be connected with MobaXterm to do this.

* install firefox on your remote machine:

```shell
sudo apt install firefox
```

* run firefox in the background: 

```
firefox &
```

* Firefox should, after the appropriate wait time, appear on your windows desk

* Point your firefox to localhost:8080
