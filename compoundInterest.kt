//Georgy Thekkanal
//02.9 Compound Interest
//February 12, 2023


import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    print("Enter the amount of principal originally deposited into the account: ")
    val principal = scan.nextBigDecimal()
    print("Enter the annual interest rate paid by the account: ")
    val interestRate = scan.nextBigDecimal()
    print("Enter the number of times per year that the interest is compounded: ")
    val compoundingFrequency = scan.nextInt()
    print("Enter the number of years the account will be left to earn interest: ")
    val years = scan.nextInt()
    
    val ratePerPeriod = interestRate.divide(BigDecimal(compoundingFrequency), 10, RoundingMode.HALF_UP)
    val futureValue = principal * (BigDecimal.ONE + ratePerPeriod).pow(compoundingFrequency * years)
    println("The future value of the account is: $futureValue")
}
