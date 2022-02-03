package solutions

fun main() {
    val jj = "Assalomu alaykum"

    for(i in 0..1000){
      if(i % 3 == 0 && i % 5 ==0 && i % 7 ==0){
          print("\n $i \n")
      }
    }

    //print(reverseWords1(jj))
    // print(reverseWords2(jj))
}


fun reverseWords1(s: String): String {
    var result = ""
    val arr = s.split(" ")

    for(i in arr.size-1 downTo 0){
        result = "${arr[i].reversed()} "+result
    }

    return result.trim()
}

fun reverseWords2(s: String): String {
    val list = mutableListOf<String>()
    var ss = ""
    var result = ""

    for(i in s){
        ss = if(i != ' '){
            "$i"+ss
        } else {
            list.add("$ss ")
            ""
        }
    }
    list.add(ss)

    list.forEach{
        result+=it
    }
    return result
}

fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
    var result = 0
    for(i in startTime.indices){
        if(queryTime > startTime[i] && queryTime < endTime[i]){
            result++
        }
    }

    return result
}