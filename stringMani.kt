
//Georgy Thekkanal
//02.8 String Manipulator
// February 12, 2023
 


fun main() {
    print("Enter the name of your favorite city: ")
    val city = readLine()

    
    println("The number of characters in the city name: ${city?.length}")

   
    println("The name of the city in all uppercase letters: ${city?.toUpperCase()}")

   
    println("The name of the city in all lowercase letters: ${city?.toLowerCase()}")

    
    println("The first character in the name of the city: ${city?.get(0)}")
}
