fun main() {
    val sayi = 7
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc = sonuc * i
    }

    println("$sayi sayısının faktöriyeli: $sonuc")
}