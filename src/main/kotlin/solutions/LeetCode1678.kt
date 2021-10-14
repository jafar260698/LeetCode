package solutions

fun main() {
    val jj = "G()(al)(al)"

    print(interpret(jj))
}


fun interpret(command: String): String {
    val tempResult = StringBuilder()
    command.toCharArray().forEachIndexed { index, c ->
        if(c == 'G')
            tempResult.append(c)
        if(c == '(' && command[index+1] == 'a')
            tempResult.append("al")
        if(c == '(' && command[index+1] == ')')
            tempResult.append("o")
    }
    return tempResult.toString()
}