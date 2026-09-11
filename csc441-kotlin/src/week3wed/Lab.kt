package week3wed

fun main() {
    //vals
    val name = "Justin"
    val major = "Computer Science"
    val favFood = "Pizza"

    //var
    var coursesAmount = 9
    coursesAmount ++

    //Types
    val string = "String"
    val int = 0
    val double = 0.00
    val boolean = true

    //string templates
    println("My name is $name")
    println("I have took ${coursesAmount -1} CSC classes")
    println("My name has ${name.length} letters")

    //ask user
    print("What is your age? ")
    val age = readlnOrNull()
    println("You are $age years old")

    //extra outputs
    println("My favorite food is $favFood")
    println("Major: $major")
    println("This is a string: $string")

}