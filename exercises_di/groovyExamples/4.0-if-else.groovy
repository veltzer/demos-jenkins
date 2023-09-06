def numberOfSteps = 5000

if (numberOfSteps >= 1000 && numberOfSteps < 2500) {
  println 'Today you did not walk at all, please try to walk tomorrow'
} else if (numberOfSteps >= 2500 && numberOfSteps < 5000) {
  println 'Good Start'
} else if (numberOfSteps >= 5000 && numberOfSteps < 9000) {
  println 'You have walked more than 1/2 of your goal. Good Job'
} else if (numberOfSteps >= 10000) {
  println 'You have reached today\'s walk goal'
} else {
  println 'Try your best to walk as much as possible'
}
