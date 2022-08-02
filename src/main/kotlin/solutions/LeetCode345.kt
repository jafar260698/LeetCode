package solutions


fun main() {
    print(reverseVowelsOfString("hello"))
    print(reverseVowelsOfString("leetcode"))
}

private fun reverseVowelsOfString(s : String) : String{
    val vowels = setOf<Char>('a','e', 'o','u','i','A','E','O','U','I')
    var left = 0
    var right = s.length - 1
    val charArray = s.toCharArray()

    while (left < right) {
        while (left < right && !vowels.contains(charArray[left])) {
            left++
        }

        while (left < right && !vowels.contains(charArray[right])) {
            right--
        }

            val temp = charArray[left]
            charArray[left++] = charArray[right]
            charArray[right--] = temp

    }
    return charArray.joinToString("")
}