package solutions

fun main() {
    val jj = "G()(al)(al)"

    print(interpret(jj))
}


fun interpret(command: String): String {
    var result = ""
    var sample = ""

    command.forEach{
        sample+=""+it
        if(sample=="G"){
            result+="G"
            sample=""
        }
        if(sample =="()"){
            result+="o"
            sample=""
        }
        if(sample == "(al)"){
            result+="al"
            sample=""
        }
    }

    return result
}
