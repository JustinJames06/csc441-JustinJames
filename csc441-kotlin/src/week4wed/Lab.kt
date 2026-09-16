package week4wed

fun main(){

    println("---Step 1: Function returning nothing")
    describeToday()

    println("---Step 2: Function returning a string")
    println(favoriteThing())

    println("---Step 3: Function returning with a string with parameter")
    println(pickOne(number = 2))

    println("---Step 4: Function returning with a string with parameter, short way")
    println(pickOneShort(number = 4))

    println("---Step 5: Function returning with two parameters with defaults")
    println(pickWithDefault())
    println(pickWithDefault(name = "Justin"))

}

fun describeToday(){
    println("Today is Wednesday, September 16th")
}

fun favoriteThing(): String {
    return "My favorite thing is coming to CSC 441 class"
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "Baseball"
        2 -> "Football"
        3 -> "Basketball"
        4 -> "Hockey"
        else -> "Other Sport"
    }
}

fun pickOneShort(number: Int = 1): String = when(number) {
    1 -> "Baseball"
    2 -> "Football"
    3 -> "Basketball"
    4 -> "Hockey"
    else -> "Other Sport"
}

fun pickWithDefault(number: Int = 1, name: String = "Justin"): String{
    val sport = when(number) {
        1 -> "Baseball"
        2 -> "Football"
        3 -> "Basketball"
        4 -> "Hockey"
        else -> "Other Sport"
    }
    return "$name is playing $sport"
}