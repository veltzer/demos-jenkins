/**
 * A Pizza class description
 */
class Pizza {

    /** the name of the Pizza */
    String name
    /**
     * Prints types of Pizaa with the name.
     *
     * @param pizzaType the type of Pizza
     * @return a greeting message with Pizza type and its name
     */
    String typeOfPizza(String pizzaType) {
        "Hello ${pizzaType} ${name}"
    }

}

// Instatiate a pizza object
Pizza pizza = new Pizza(name:'Hawaiian Chicken')
// Print the type of pizza
println pizza.typeOfPizza('Thin Crust')
