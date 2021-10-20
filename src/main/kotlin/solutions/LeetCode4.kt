package solutions

fun main() {
    val nums1= intArrayOf(2,3,5,1,3)
    val nums2= intArrayOf(2,3)
    print(findMedianSortedArrays(nums1,nums2))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val list = mutableListOf<Int>()
    var number = 0
    list.addAll(nums1.toTypedArray())
    list.addAll(nums2.toTypedArray())
    list.sort()
    number = list.size / 2

    if(list.size % 2 != 0){
        return list[number].toDouble()
    } else {
        return (list[number].toDouble() + list[number-1].toDouble())/2
    }
}