fun faktoriyel(n: Int): Int {
    var sonuc = 1
    for (i in 1..n) {
        sonuc = sonuc * i
    }
    return sonuc
}

fun main() {
    val sayi = 7
    val faktoriyelSonuc = faktoriyel(sayi)
    println("$sayi sayısının faktöriyel yonucu: $faktoriyelSonuc")
}