int numberOfSteps = 12000

switch (numberOfSteps) {
  case 0..999:
    println 'Try your best to walk as much as possible'
    break
  case 1000..2500:
    println 'Good Start'
    break
  case 5000..7500:
    println 'You have walked more than 1/2 of your goal. Good Job'
    break
  case 7500..9999:
    println 'You have walked more than 3/4 of your goal. Good Job'
    break
    case 10000..99999:
    println 'Reached today\'s goal'
    break
  default:
    println 'Try your best to walk as much as possible'
}
