def num = 'Hello World 1000'
switch (num) {
    case 1000:
        println 'num is one thousand'
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
