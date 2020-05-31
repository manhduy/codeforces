import kotlin.math.ceil
import kotlin.math.min
import kotlin.math.sqrt

/**
 * https://codeforces.com/problemset/problem/1360/D
 *
 * D. Buying Shovels
 *
 */

fun main() {
    val t = readLine()!!.toInt()
    for (i in 0 until t) {
        val line = readLine()!!
        val (n, k) = line.split(" ").map { s -> s.toInt()}
        buyShovels(n, k)
    }
}

fun buyShovels(n: Int, k: Int) {
    if (n <= k) {
        println("1")
        return
    }
    val sqrt = sqrt(n.toFloat()).toInt()
    var divisor = n
    for (i in 1..sqrt) {
        if (n % i == 0) {
            val m = n/i
            if (m <= k) {
                divisor = min(divisor, i)
            } else if (i <= k) {
                divisor = min(divisor, m)
            }
        }
    }
    println(divisor)
}