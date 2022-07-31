package preparation

fun main() {
    val nums1= intArrayOf(9, 1, 21, 32, 4, 5, 12, 45, 23, 3, 5)
    print("Solution: \n")
    bubbleSorting(nums1).forEach { a -> print("$a \n")}
}

// by me
fun bubbleSorting(nums1: IntArray): IntArray {
    val list = nums1

    for(j in list.indices){
        for(i in list.indices-j) {
            if(list[j] > list[i]){
                val temp = list[i]
                list[i] = list[j]
                list[j] = temp
            }
        }
    }
    return  list.reversedArray()
}

//by video
fun realBubbleSorting(nums1: IntArray): IntArray {
    val list = nums1

    val length = nums1.size
    for(i in 0..length){
        for(j in 0 until length-i-1) {
            if(list[j] > list[j+1]){
                val temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp
            }
        }
    }
    return  list
}