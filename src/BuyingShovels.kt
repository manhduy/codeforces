import kotlin.math.floor
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
    val limit = floor(sqrt(n.toFloat())).toInt()

    var divisor = -1
    for (i in 1..limit) {
        if (n % i == 0 && n/i <= k) {
            divisor = i
            break
        }
    }
    val result = if (divisor == -1) n else divisor
    println(result)

}