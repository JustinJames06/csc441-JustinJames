package week4fri
fun main(){
    println("--- Step1: two names ---")
    val college: String = "Le Moyne College"
    val highschool: String? = null

    println("--- Step2: safe call ---")
    println(highschool?.length)

    println("--- Step3: Elvis operator ---")
    println(highschool?.length ?:0)

    println("--- Step 4: ?. let block ---")
    highschool?.let {
        println("Highschool is: $it")
    }

    println("--- Step 5: toIntOrNull() ---")
    println(college.toIntOrNull() ?: "not a number")

    println("--- Step 6: listOf ---")
    val movies = listOf("Star Wars", "Avengers", "The Odyssey", "Interstellar")

    println(movies)

    println("--- Step 7: mutableList ---")
    val classes = mutableListOf("CSC441", "CSC442", "CSC443", "CSC444")
    classes.add("CSC445")
    classes.remove("CSC441")
    println("Classes: $classes")
    println("size: ${classes.size}")

    println("--- Step 8: number list ---")
    val nums = listOf<Int>(1, 2, 3, 4, 5)
    println(nums.sum())
    println(nums.average())
    println(nums.filter { it % 2 == 0 })
}

