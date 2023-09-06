import java.security.SecureRandom

def result = 'Not walked today'
def totalSteps = Math.abs(new SecureRandom().nextInt() % 12000) + 1
//def numberOfTimesWalked = Math.abs(new SecureRandom().nextInt() % 5)
def numberOfTimesWalked = 0
def avgWalkSteps = 0
try {
    avgWalkSteps = totalSteps / numberOfTimesWalked
} catch (error) {
    println error.message
    assert error !in ArithmeticException
}
finally {
    if (avgWalkSteps > 2000) {
        result = 'Good walk today'
    }
    else {
        result = 'Improve your walk tomorrow'
    }
}
println "totalSteps:$totalSteps"
println "numberOfTimesWalked:$numberOfTimesWalked"
println "avgWalkSteps:$avgWalkSteps"
println "result:$result"
