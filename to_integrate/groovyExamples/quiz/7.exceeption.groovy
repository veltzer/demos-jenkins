print 'S'
try {
    int num = 1 / 0
} catch (ArithmeticException aexp) {
    print 'A'
}
finally {
    print 'F'
}
println 'E'
