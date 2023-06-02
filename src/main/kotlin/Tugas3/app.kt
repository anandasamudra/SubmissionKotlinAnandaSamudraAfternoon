package Tugas3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai nilai dengan ketentuan:
    1. Jika nilai nilai lebih atau sama dengan 90
    - Isi variabel hasil dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai nilai ada di antara 80 hingga 89
    - Isi variabel hasil dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai nilai ada di antara 70 hingga 79
    - Isi variabel hasil dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai nilai ada di antara 60 hingga 69:
    - Isi variabel hasil dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai nilai di bawah 60:
    - Isi variabel hasil dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    println("Masukkan nama Anda:")
    val nama = readLine()

    println("Masukkan nilai Anda:")
    val nilai = readLine()?.toInt()

    val hasil = if (nilai != null) {
        if (nilai >= 90) {
            "Selamat! Anda mendapatkan nilai A."
        } else if (nilai in 80..89) {
            "Anda mendapatkan nilai B."
        } else if (nilai in 70..79) {
            "Anda mendapatkan nilai C."
        } else if (nilai in 60..69) {
            "Anda mendapatkan nilai D."
        } else {
            "Anda mendapatkan nilai E."
        }
    } else {
        "Nilai yang dimasukkan tidak valid."
    }


    println("Nama: $nama")
    println(hasil)
}