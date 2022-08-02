package preparation

fun main() {
    val nums1= "pwqtuwkew"
    print(longestSubstring(nums1))
}

 fun longestSubstring(num: String): Int {
    val list = num.split("")
     var max = 0

     for (i in 0..list.size-1) {
         val subSet: MutableSet<String> = HashSet()
         for (j in i until list.size-1) {
             if(subSet.contains(list[j])) {
                max = maxNum(max, subSet.size)
                break
             } else {
                 subSet.add(list[j])
             }
         }

         max = maxNum(max, subSet.size)
     }
    return  max
}

fun maxNum(a : Int, b :Int)  : Int{
    return if(a > b) {
        a
    }
    else {
        b
    }

}

