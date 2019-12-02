import java.math.BigInteger

/**
https://codeforces.com/problemset/problem/1119/D

6
3 1 4 1 5 9
3
7 7
0 2
8 17

5 10 18

2
1 500000000000000000
2
1000000000000000000 1000000000000000000
0 1000000000000000000

2 1500000000000000000
 */

fun main() {
    //number of strings
    val n = readLine().toString().toInt() - 1
    val s = readLine()!!.trim().split(" ")
    val listS = ArrayList<BigInteger>()
    for (i in 0..n) {
        listS.add(s[i].toBigInteger())
    }
    val distListS = listS.distinct()
    val q: Int = readLine()!!.toInt()
    var strResult = ""
    for (i in 1..q) {
        val arr = readLine()!!.split(" ")
        val l: BigInteger = arr[0].toBigInteger()
        val r: BigInteger = arr[1].toBigInteger()

        var preFrom = BigInteger.valueOf(-1)
        var preTo = BigInteger.valueOf(-1)

        var count: BigInteger = BigInteger.valueOf(0)
        for (ds in distListS) {
            val from = ds + l
            val to = ds + r

            if (preFrom.equals(BigInteger.valueOf(-1))) {
                count = to - from + BigInteger.valueOf(1)
                preFrom = from
                preTo = to
            } else {
                if (to < preFrom || from > preTo) {
                    count += to - from + BigInteger.ONE
                } else {
                    var diffFrom = preFrom - from
                    if (diffFrom < BigInteger.valueOf(0)) {
                        diffFrom = BigInteger.valueOf(0)
                    }
                    var diffTo = to - preTo
                    if (diffTo < BigInteger.valueOf(0)) {
                        diffTo = BigInteger.valueOf(0)
                    }
                    count += diffFrom + diffTo
                }

                if (preFrom > from) {
                    preFrom = from
                }
                if (preTo < to) {
                    preTo = to
                }
            }
        }
        strResult+= " $count"
    }
    print(strResult.trim())
}
