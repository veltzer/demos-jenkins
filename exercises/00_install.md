* Install jenkins in two ways out of the follwing three:
	* war file (recommended)
		use
		$ java -jar [file.war]
		The war file can be downloaded from https://www.jenkins.io/download/
		You will need to install java if you don't already have it.
	* docker
		follow the instructions on the jenkins website.
		You will need to install docker, configure it properly.
	* from binary distribution
		download, unzip and run
		You will need to install java if you don't already have it.

	* Once You have installed jenkins open it in your browser:
		http://[your_ip]:8080/

* play around with the GUI.


Instructions for people who cannot reach their cloud machine at port 8080
=========================================================================

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
