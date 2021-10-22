package solutions

fun main() {
    val n = 1412
    print(thousandSeparator(n))
}


fun thousandSeparator(n: Int): String {
    val result = n.toString().reversed()
    var res = ""

    for ( i in result){
        res += if (res.isNotEmpty() && res.length % 3 == 0){
            ".$i"
        } else {
            "$i"
        }
    }
    return res.reversed()
}