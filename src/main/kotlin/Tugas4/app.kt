package Tugas4

fun main() {
    try {
        val result = 5 / 0
        println("The result: $result")
    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
    } finally {
        println("Maju - maju!")
    }
}