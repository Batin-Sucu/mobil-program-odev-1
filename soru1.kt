fun main(args: Array<String>) {

    //1 den 350 ye kadar olan tek sayıların toplamı ve çarpımı , çift sayıların ise karelerinin toplamını bulan
    //programın kotlin kodunu yazınız

    var teksayicarpim = 1
    var teksayitoplam = 0
    var ciftsayikaretoplam = 0

    for (i in 1..350)
    {
        if (i % 2 == 0)
        {
            ciftsayikaretoplam = ciftsayikaretoplam + (i * i)
        }
        else
        {
            teksayicarpim = i * teksayicarpim
            teksayitoplam = i + teksayitoplam
        }
    }

    println("1 ile 350 arasındaki tek sayıların çarpımı : $teksayicarpim")
    println("1 ile 350 arasındaki tek sayıların toplamı : $teksayitoplam")
    println("1 ile 350 arasındaki çift sayıların karelerinin toplamı : $ciftsayikaretoplam")
}