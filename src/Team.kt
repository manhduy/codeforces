/**
 * https://codeforces.com/problemset/problem/231/A
 *
 *
 */

fun main() {
    val n = readLine()!!.toInt()
    var output = 0
    for (i in 0 until n) {
        val line = readLine()!!
        val solutions = line.split(" ").map { it.toInt() }
        val sureSol = solutions.filter { s -> s == 1 }
        if (sureSol.size >= 2) output++
    }
    println(output)
}