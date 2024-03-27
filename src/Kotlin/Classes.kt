package Kotlin

fun main() {
    val tv1 = SmartDevice("Samsung Smart TV", 100.0)
    val tv2 = SmartDevice("Samsung Smart TV", 100.0)

    println("== ${tv1 == tv2}")
    println("Memory location === ${tv1 === tv2}")
//    tv.brand = "Samsung Smart TV"
//    tv.price = 1000.0
//    tv.turnOff()
//    println("${tv.brand} ${tv.price}")

//    val phone = SmartDevice("", 0.0)
//    phone.brand = "Apple Iphone 13pro"
//    phone.price = 1200.0
//    phone.turnOn()
//    println("${phone.brand} ${phone.price}")
}


/**
 * Now lets look at classes, Classes are blueprints for building software expecially with programming languages that
 * deal with oop. they usually contain properties and behaviours that can be used by any object that calls the class.
 * Yes. so we can say that when we instantiate a class, we are creating an object from that class.
 * these are the attributes of a typical class
 * 1. the PROPERTIES which are also known as the variables of the class
 * 2. the BEHAVIOURS which are also known as the functions in the class
 * When fields are created, we can also create our getters and setters
 * with getters, every field can have its getters and setters created right underneath the declaration of the field
 */

    class SmartDevice constructor(
    //we can also make the variables nullable so there is the possibiity of accepting null values
        var brand: String?,
        var price: Double?,
        var isSwitchedOn:Boolean? = false
    ){
    /**
     * there is the possibility of creating multiple constructors  for example
     * here when creating multiple constructors, the keyword this is used to reference the main constructor
     *
     */

        constructor() : this("", 0.0)
        constructor(newConstructorBrand:String): this(newConstructorBrand, 0.0)

        //properties. variables. val or var
//        var brand: String = ""
//            get() = field
//            set(value) {
//                field = value
//            }
//        var price: Double = 0.0
//            get() = field
//            set(value) {
//                field = value
//            }
//        var isSwitchedOn: Boolean = false

        //behaviours. functions/methods
        private fun getDeviceState() {
            println("The $brand is on: $isSwitchedOn")
    }

    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
        getDeviceState()
    }

    fun turnOff(){
        isSwitchedOn = false
        println("$brand is turning off")
        getDeviceState()
    }

    //this is used for getting the tostring value
    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
        return result
    }

    //this is used for equality and hashode

}