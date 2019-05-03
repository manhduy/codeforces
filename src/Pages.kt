fun main() {
    val input = readLine()
    val args = input!!.split(" ")
    val n: Int = args[0].toInt()
    val p: Int  = args[1].toInt()
    val k: Int = args[2].toInt()
    var prefix = ""
    var suffix = ""
    var start: Int = p - k
    if (start <= 1)
        start = 1
    else
        prefix = "<< "
    var end: Int = p + k
    if (end >= n)
        end = n
    else
        suffix = " >>"

    var result = prefix

    for (i in start..end) {
        result +=
            if (i == p) " ($p) "
            else " $i "
    }

    result += suffix

    print(result.trim())
}


/** Test case
17 5 2
<< 3 4 (5) 6 7 >>

6 5 2
<< 3 4 (5) 6

6 1 2
(1) 2 3 >>

6 2 2
1 (2) 3 4 >>

9 6 3
<< 3 4 5 (6) 7 8 9

10 6 3
<< 3 4 5 (6) 7 8 9 >>

8 5 4
1 2 3 4 (5) 6 7 8
 **/