# Parallel Pipelines

The idea behind this exercise is to run pipelines in parallel.

* Create a jenkins pipeline which does two stages
    (sleep?) in sequence.
    Show that it works. (by activating the build manually).

* Modify your pipeline to do two things in parallel
    (sleep?). Find out on your own how to do it.
    Show that it works. (by activating the build manually).

Notes:
* Remember that the number of your executors is 2 so have more than 2 pipeline allowed
    to run in parallel.
* Have a few stages in each of the pipelines (to simulate a real work complex project)
* Install (or check that it's already installed) the ocean-ui plugin to visualize the
    parallel execution (Not a must, nice to have)
* For the time, still use the "any" executor.
