enum PizzaSize {

    SMALL,
    MEDIUM,
    LARGE,
    EXTRA

}

enum SauceType {

    CLASSIC,
    CREAMY,
    BBQ,
    BUFFALO

}

enum ToppingsType {

    NOTHING,
    CHICKEN,
    PEPPERONI,
    JALAPENO,
    SPINACH,
    PINEAPPLE,
    BELLPEPPERS,
    ONIONS,
    MUSHROOM

}

enum DeliveryType {

CARRYOUT,
DELIVERY

}

enum CrustType {

    ORIGINAL,
    PAN_PIZZA,
    TOSSED,
    THIN_N_CRISPY,
    ORIGINAL_STUFFED,

}

enum AmountType {

    LIGHT,
    REGULAR,
    MEDIUM,
    EXTRA,
    NONE

}

class Pizza {

    PizzaSize size
    CrustType crust
    SauceType sauce
    Boolean isCheese
    AmountType sauceAmount
    AmountType cheeseAmount
    DeliveryType delivery
    ToppingsType[] toppings

    @Override
    String toString() {
       """\
        | Pizza [size=$size, crust=$crust, sauce=$sauce, isCheese=$isCheese,
        | sauceAmount=$sauceAmount, cheeseAmount=$cheeseAmount, delivery=$delivery,
        | toppings=$toppings]
        """.stripMargin().stripIndent().replaceAll('\n', '')
    }

}

// No Toping Pizza
Pizza pizza1 = new Pizza(size: PizzaSize.LARGE, crust: CrustType.ORIGINAL_STUFFED,
    sauce: SauceType.BBQ, isCheese: true, sauceAmount: AmountType.EXTRA, cheeseAmount: AmountType.MEDIUM)
println(pizza1)

// No Toping Pizza
Pizza pizza2 = new Pizza(size: PizzaSize.LARGE, crust: CrustType.ORIGINAL_STUFFED, sauce: SauceType.CLASSIC,
    isCheese: true, sauceAmount: AmountType.EXTRA, cheeseAmount: AmountType.MEDIUM)
println(pizza2)

// No Toping Pizza with Carryout Delivery
Pizza pizza3 = new Pizza(size: PizzaSize.LARGE, crust: CrustType.ORIGINAL_STUFFED, sauce: SauceType.CLASSIC,
    isCheese: true, sauceAmount: AmountType.EXTRA, cheeseAmount: AmountType.MEDIUM, delivery: DeliveryType.CARRYOUT)
println(pizza3)

def toppings = [ToppingsType.ONIONS, ToppingsType.PINEAPPLE, ToppingsType.CHICKEN, ToppingsType.JALAPENO]
// With Topings
Pizza pizza4 = new Pizza(size: PizzaSize.LARGE, crust: CrustType.ORIGINAL_STUFFED, sauce: SauceType.CLASSIC,
 isCheese: true, sauceAmount: AmountType.EXTRA, cheeseAmount: AmountType.MEDIUM, toppings: toppings)
println(pizza4 )
