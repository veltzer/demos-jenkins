def num = 'a'
switch (num) {
    case 0:
        println 'num is zero'
        break
    case { num > 0 }:
        println 'num is positive'
        break
    case { num < 0 }:
        println 'num is negative'
        break
    default:
        println 'invalid input'
}
