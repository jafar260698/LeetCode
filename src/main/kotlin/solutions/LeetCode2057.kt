package solutions

fun main() {
    val jj = arrayOf(2,1,3,4,5)

    print(smallestEqual(jj))
}


fun smallestEqual(nums: Array<Int>): Int {
    var i = 0
    var min = -1

    nums.forEach {
        if(it == (i % 10)){

            if(min == -1) min = i
            if(min > i){
                min = i
            }
        }
        i++
    }

    return min
}