String name = 'Kangs'
println name

def multiLineText = '''
1. One
2. Two
3. Three
'''
println multiLineText

def strippedFirstNewline = '''\
1. One
2. Two
3. Three
'''
println strippedFirstNewline

String helloWorld = "Hello world ${name}"
println helloWorld
// Print the 5th character of the string
println(helloWorld[4])

// Print the 1st character in the string starting from the back
println(helloWorld[-1])
// Prints a string starting from Index 1 to 2
println(helloWorld[1..2])
// Prints a string starting from Index 4 back to 2
println(helloWorld[4..2])

// Concatenate Strings
println helloWorld + ' ' + '!!!'

// Repeat n times
println name * 5

// Length of a String
println name.length()

// reverse
println name.reverse()

// Up/Lower cases
println name.toUpperCase()
println name.toLowerCase()
