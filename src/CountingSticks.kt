/**
 * https://codeforces.com/problemset/problem/394/A
 * 
 * A. Counting Sticks
 */

 fun main() {
     val input = readLine();
     val arr = input.toString().split('=')
     val c = arr.get(1)
     val ab = arr.get(0).split('+')
     val a = ab.get(0)
     val b = ab.get(1)
     var lenA = a.length
     var lenB = b.length
     var lenC = c.length

     val minus = lenC - lenA - lenB

     if (minus == 0) {
         print(input)
     } else if (minus == 2) {
        lenA += 1
        lenC -= 1
        printOutput(lenA, lenB, lenC)
     } else if (minus == -2) {
        lenC += 1
        if (lenA > 1) {
            lenA -= 1
        } else {
           lenB -= 1
        }
        printOutput(lenA, lenB, lenC)
     } else {
         print("Impossible")
     }
 }

 fun printOutput(a: Int, b: Int, c:Int) {
    var rs: String = ""
    for (i in 0 until a) {
        rs += "|"
    }
    rs += "+"
    for (i in 0 until b) {
        rs += "|"
    }
    rs += "="
    for (i in 0 until c) {
        rs += "|"
    }
    print(rs)
 } 