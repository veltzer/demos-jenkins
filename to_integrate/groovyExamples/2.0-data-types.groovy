byte  b = 100
char  c = 67
short s = 300
int   i = 400
long  l = 500
BigInteger numberOfDockerUsers =  15000000

println b
println c
println s
println i
println l
println "$numberOfDockerUsers+ docker users in the world"

float  f = 1.234
double d = 2.345
BigDecimal amount = 300.95

println f
println d
println '$' + amount

def isSuccess = true
boolean isFinished = false
isCompleted = true

println isSuccess
println isFinished
println isCompleted

//List
def years = [2001, 2002, 2003]
sizeYears = years.size()
println "number of years = $sizeYears"

//Arrays
String[] fruits = ['Apple', 'Banana', 'Cherry']
secondFruit = fruits[1]
println "Second fruit is $secondFruit"

// Java Style
def animals = new String[] {'cat', 'dog','elephant'}
animals.each { animal -> println animal }

//Maps
def pizza = [name: 'Buffalo Chicken', type: 'crust', howMany:4]
println "Ordered $pizza.howMany $pizza.type $pizza.name for dinner"

//Maps
def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
println "color value of green is $colors.green"
colors.each { key, val -> println "color: $key , value: $val" }

int age = 35
println age

