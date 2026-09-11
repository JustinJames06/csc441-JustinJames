package week3fri

fun main(){

    //range loop
    for (i in 1..10) {
        print("$i ")
    }
    println()
    //down to loop
    for(i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    //mutable list
    val packingList = mutableListOf("Clothes", "Phone", "Money", "Suncscreen")
    for (item in packingList) {
        println(item)
    }
    packingList.forEachIndexed { index, item ->
        println("$index is $item")
    }

    //for with until
    for (i in 0 until packingList.size) {
        println("$i: ${packingList[i]}")
    }

    //when
    val num = 1
    val dayOfWeek = when(num){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Not a valid number"
    }
    println(dayOfWeek)

    //val assigned from an if
    val age = 19
    val old = if(age > 50) true else false
    if(old){
        println("Old")
    }else{
        println("Young")
    }

}