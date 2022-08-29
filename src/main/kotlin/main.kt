fun main() {
    print("Enter number of iterations: ")
    var repeatNum = readln()!!.toLong()
    var pi: Double = 1.0
    var count = 3.0
    for (i in 1..repeatNum) {
        if (i % 2 != 0L)
        pi -= 1.0/count
        if (i % 2 == 0L)
        pi += 1.0/count
        count += 2
    }
    pi *= 4
    println(pi)
}