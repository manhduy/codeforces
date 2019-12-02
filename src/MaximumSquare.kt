/**
* https://codeforces.com/problemset/problem/1243/A
* Problem 1243A
* Maximum Square
* 

input:
4
5
4 3 1 4 5
4
4 4 4 4
3
1 1 1
5
5 5 1 1 5

output:
3
4
1
3

*/

fun main() {
    val testCount = readLine().toString().toInt()
    for (i in 1..testCount) {
        runTest()
    }
}

fun runTest() {
    val n = readLine().toString().toInt()
    val planks = readLine().toString()
    val arr = planks.split(' ').map {it.toInt()}.sortedDescending()

    var square = 0
    for (i in 1..n) {

        val newSquare = square(i, arr[i-1])
        if (newSquare <= square) {
            break
        }
        square = newSquare
    }

    println(square)
}

fun square(w: Int, h: Int): Int {
    return  if (w < h)  w else h
}