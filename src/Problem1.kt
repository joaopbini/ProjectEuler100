/**
 * Multiples of 3 and 5
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */


fun main() {
    println(sumMultiplesOf3and5(1000))
}

fun sumMultiplesOf3and5(n: Int) = (1 until n).filter {
    multipleOf(it, 3) || multipleOf(it, 5)
}.reduce(Int::plus)

fun multipleOf(number: Int, multiple: Int) = number % multiple == 0
