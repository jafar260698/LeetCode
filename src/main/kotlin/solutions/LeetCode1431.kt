package solutions

fun main() {
    val candies= intArrayOf(2,3,5,1,3)
    val extraCandies = 3
    print(kidsWithCandies(candies,extraCandies))
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val list = mutableListOf<Boolean>()
    var candy=0

    candies.forEach {
        candy=it+extraCandies

        for(i in candies.indices) {
            if(candies[i] > candy) {
                list.add(false)
                break
            }

            if(i+1==candies.size){
                list.add(true)
            }

        }
    }

    return list
}
