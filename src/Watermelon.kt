/**
 * https://codeforces.com/problemset/problem/4/A
 *
 *
 */

fun main(args: Array<String>) {
    var n = 0
    val input = readLine()
    input?.let {
        n = it.toInt()
    }
    if (n % 2 == 0 && n != 2) {
        println("YES")
    } else {
        println("NO")
    }
}