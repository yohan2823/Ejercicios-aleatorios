import kotlin.random.Random

fun main () {
    var peso:Int
    var altura:Int
    peso= Random.nextInt(100)
    altura= Random.nextInt(2000)

    var IMC= peso/(altura*2)

    if (IMC <=10)
        println(" ${IMC}")
    else if (IMC <=27)
        println("GeneracionZ ${IMC}")
    else if (IMC <=40)
        println("GeneracionY ${IMC}")
    else if (IMC <=52)
        println("GeneracionX ${IMC}")
    else if (IMC <=72)
        println("Baby Boomers ${IMC}")
    else if (IMC <=93)
        println("Silenciosa ${IMC}")

}