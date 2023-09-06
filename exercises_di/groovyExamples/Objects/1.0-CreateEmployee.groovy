abstract class Employee {

    String name
    int payPerHour

    String displayInfo() {
        "Employee $name has salary per hour is $payPerHour"
    }

    abstract int calculatePerDaySalary()
    abstract int calculatePerWeekSalary()
    //abstract int calculatePerMonthSalary()

}

interface Payroll {

   abstract int calculatePayroll()

}

class Contractor extends Employee {

    int workingHoursPerDay
    int numberOfDaysWorkedPerWeek

    @Override
    int calculatePerDaySalary() {
        payPerHour * workingHoursPerDay
    }

    @Override
    int calculatePerWeekSalary() {
        payPerHour * workingHoursPerDay * numberOfDaysWorkedPerWeek
    }

    @Override
    String displayInfo() {
        println super.displayInfo()
        println "Per Day Salary is ${calculatePerDaySalary()}"
        println "Per Week Salary is ${calculatePerWeekSalary()}"
    }

}

class FullTimeEmployee extends Employee {

    static final int FULL_TIME_HOURS = 8
    static final int WEEKLY_DAYS_PAID = 5

    @Override
    int calculatePerDaySalary() {
        payPerHour * FULL_TIME_HOURS
    }

    @Override
    int calculatePerWeekSalary() {
        payPerHour * FULL_TIME_HOURS * WEEKLY_DAYS_PAID
    }

    @Override
    String displayInfo() {
        "${super.displayInfo()} and total salary per day is ${calculatePerDaySalary()}" +
        " and per week is ${calculatePerWeekSalary()}"
    }

}

class CommissionedEmployee extends Employee implements Payroll {

    static final int FULL_TIME_HOURS = 8
    static final int WEEKLY_DAYS_PAID = 5
    static final int COMMISION_RATE = 0.10
    int totalSales

    @Override
    int calculatePerDaySalary() {
        payPerHour * FULL_TIME_HOURS
    }

    @Override
    int calculatePerWeekSalary() {
        payPerHour * FULL_TIME_HOURS * WEEKLY_DAYS_PAID
    }

    @Override
    String displayInfo() {
        "${super.displayInfo()} and total salary per day is ${calculatePerDaySalary()}" +
        " and per week is ${calculatePerWeekSalary()}"
    }

    @Override
    int calculatePayroll() {
        def commissionAmount = totalSales * COMMISION_RATE
        calculatePerWeekSalary() * 4 + commissionAmount
    }

}

def contractor1 = new Contractor(name:'John', payPerHour:50,
    workingHoursPerDay:30, numberOfDaysWorkedPerWeek:5)
contractor1.displayInfo()

def fte1 = new FullTimeEmployee(name:'David', payPerHour:80)
println fte1.displayInfo()

def contractor2 = new Contractor(name:'Craig', payPerHour:100,
    workingHoursPerDay:20, numberOfDaysWorkedPerWeek:6)
contractor2.displayInfo()

def fte2 = new FullTimeEmployee(name:'Richard', payPerHour:80)
println fte2.displayInfo()

def salesEmployee1 = new CommissionedEmployee(name:'Robin', payPerHour:30, totalSales:100000)
println salesEmployee1.displayInfo()
println "Payroll Amount is ${salesEmployee1.calculatePayroll()}"
