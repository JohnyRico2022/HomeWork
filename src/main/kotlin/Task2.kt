fun main() {

    val likes = 92
    val result = likes % 10

    val res = if (result == 1) "человеку" else "людям"

    println("Понравилось $likes $res")
}