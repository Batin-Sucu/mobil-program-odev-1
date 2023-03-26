fun main() {

    print("Bir sayı giriniz: ")
    val sayi = readLine()!!.toInt()

    var toplam = 0
    for (i in 1 until sayi) {
        if (sayi % i == 0) {
            toplam = toplam + i
        }
    }

    if (toplam == sayi) {
        println("Girdiğiniz sayı mükemmel sayıdır.")
    } else {
        println("Girdiğiniz sayı mükemmel sayı değildir.")
    }

}