class Car {

    String make
    String model
    Integer year

    void displayInfo() {
        println "$make type is $model and the year built is $year"
    }

}

Car car1 = new Car(make:'toyota', model:'corolla', year: 2019)
car1.displayInfo()
Car car2 = new Car(make:'BMW', model:'1 Series', year: 2009)
car2.displayInfo()
