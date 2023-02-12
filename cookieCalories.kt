
// Georgy Thekkanal
// 02.7 Cookie Calorie Calculator
// February 12, 2023
 


fun main() {
    val cookiesPerServing = 4
    val caloriesPerServing = 300
    val totalCookies = 40
    val cookiesEaten: Int

    print("Enter the number of cookies you ate: ")
    cookiesEaten = readLine()!!.toInt()

    val caloriesConsumed = cookiesEaten * caloriesPerServing / cookiesPerServing
    println("You consumed $caloriesConsumed calories.")
}
