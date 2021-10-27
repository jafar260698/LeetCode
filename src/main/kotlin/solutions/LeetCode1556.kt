package solutions

fun main() {
    val n = 459
    print(thousandSeparator(n))
}

fun thousandSeparator(n: Int): String {
    val s = n.toString()
    var result=""

    for((counter, i) in (s.length-1 downTo 0).withIndex()){
        if(counter % 3 == 0 && s.length-1>i){
            result= ".$result"
        }
        result=s[i]+result
    }

    return result
}

