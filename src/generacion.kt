import kotlin.random.Random

fun main () {
    var edad:Int
    edad= Random.nextInt(100)

    if (edad <=10)
        println("GeneracionT ${edad}")
    else if (edad <=27)
        println("GeneracionZ ${edad}")
    else if (edad <=40)
        println("GeneracionY ${edad}")
    else if (edad <=52)
        println("GeneracionX ${edad}")
    else if (edad <=72)
    println("Baby Boomers ${edad}")
    else if (edad <=93)
    println("Silenciosa ${edad}")



}
