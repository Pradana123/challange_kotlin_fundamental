package Balok

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val panjang:Double
    val lebar:Double
    val tinggi:Double
    val volume : Double

    print("Masukkan Panjang Balok : ")
    panjang = reader.nextDouble()

    print("Masukkan Lebar Balok : ")
    lebar = reader.nextDouble()

    print("Masukkan Tinggi Balok : ")
    tinggi = reader.nextDouble()

    volume = hitungVolume(panjang,lebar, tinggi)
    val s = String.format("%.2f", volume)
    println("----------------------")
    print("Hasil = $s")

}
fun hitungVolume(p: Double, l:Double, t:Double): Double {
    return p * l * t
}