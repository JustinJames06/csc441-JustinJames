package week3wed

fun main() {
    println("---Step 1 - main and output")
    println("CSC 441")
    println("Kotlin, first day")

    println("---Step 2 - val and var---")
    val course = "CSC 441"
    var weekNumber = 3
    weekNumber += 1

    println(course)
    println(weekNumber)

    println("---Step 3 - the four basic types")
    val name = "Justin"
    val age: Int = 19
    val gpa = 3.75
    val learning = true

    println(name)
    println(age)
    println(gpa)
    println(learning)

    println("---Step 4 - String templates")
    println("$name learns in $course")
//    println(name + " " + "teaches" + " " + course)
//    println("$name teaches $course")
    println("Next year: ${age+1}")
    println("name length: ${name.length}")

    println("---Step5 - Reading input")
    print("What is your name? ")
    val yourName = readlnOrNull()
    println("Hello, $yourName")







}