void goal(String name, int goal) {
    if (goal > 10000) {
        println "You have reached your goal $name"
    }
}
goal('Kangs', 15000)

int square(int x) {
  return x * x
}

int cube(int x) {
  return x * x * x
}

println cube(10)
println square(5)

void printJavaHome() {
    def javaHome = System.getenv('JAVA_HOME') ?: 'Not found'
    println javaHome
}

printJavaHome()
