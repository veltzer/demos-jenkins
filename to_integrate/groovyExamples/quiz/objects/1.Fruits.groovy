class Fruits {

    String fruitName
    String fruitColor

    def getFruitName() {
        println "I'm $fruitName, my color is $fruitColor"
    }
}

Fruits fruit1 = new Fruits()
fruit1.fruitName = 'Apple'
fruit1.getFruitName()
