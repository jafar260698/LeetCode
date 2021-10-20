package solutions

fun main() {
    val nums1= "  Bob    Loves  Alice   "
    print(reverseWords(nums1))
}

fun reverseWords(s: String): String {
    var word= ""

    val arr = s.split(" ").toTypedArray()
    for (i in arr.size-1 downTo 0){
        if(arr[i].isNotEmpty()){
            word+=arr[i].trim()+" "
        }
    }
    return word.dropLast(1)
}