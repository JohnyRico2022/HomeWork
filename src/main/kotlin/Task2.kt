fun main() {

    val likes = 8111
    val result = likes % 10
    val result2 = likes % 100

    val res = when {
        result2 == 11 -> "людям"
        result == 1 -> "человеку"
        else -> "людям"
    }

    println("Понравилось $likes $res")
}

