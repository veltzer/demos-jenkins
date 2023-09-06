String[] fruits = ['Apple', 'Banana', 'Cherry']

for (String fruit in fruits) {
  println "fruit name ${fruit.toUpperCase()}"
}

// Java Style
def animals = new String[] {'cat', 'dog','elephant'}
println 'Using index'
for (int i = 0; i < 3; i++) {
    println animals[i]
}
// Groovy Style
println 'Using each'
animals.each { animal -> println animal }

int[] stepsLevel = new int[] { 2500, 5000, 7500, 10000, 15000 }

stepsLevel.each((steps) -> {
  if (steps > 10000) {
    println "$steps are more than expected per day"
  } else if (steps == 10000) {
    println "$steps are minimum expected to walk per day"
  } else {
    println "only $steps, please try to walk more"
  }
})
