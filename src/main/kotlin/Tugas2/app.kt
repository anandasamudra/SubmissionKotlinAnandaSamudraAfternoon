package Tugas2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
// Buat di bawah sini
    val bilanganBulat = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            bilanganBulat.add(i)
        }
    }

    println("List bilangan bulat 2 sampai 100:")
    for (angka in bilanganBulat) {
        println(angka)
    }

}