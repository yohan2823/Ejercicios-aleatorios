//Yohan Yamith Lopez Yomayuza Id 815392
import jdk.internal.jimage.decompressor.CompressIndexes.readInt
fun main (){
    //suma()
    //resta()
    //raiz()
    //println("la raiz es:${raiz()}")
    //println(cuadrado())
    //println(saludo())
    //division(n1,n2)
    while (true) {
        println("Selecciona una opción:")
        println("1. Sumar")
        println("2. Restar")
        println("3. Raíz")
        println("4. Cuadrado")
        println("5. Saludo")
        println("6. Dividir")
        println("7. Multiplicar")
        println("8. Salir")

        print("Opción: ")
        val option = readlnOrNull()?.toInt()

        if (option == 1) {
            suma()
        } else if (option == 2) {
            resta()
        } else if (option == 3) {
            println("La raíz es: ${raiz()}")
        } else if (option == 4) {
            println("El cuadrado es: ${cuadrado()}")
        } else if (option == 5) {
            println(saludo())
        } else if (option == 6) {
            division(n1, n2)
        } else if (option == 7) {
            println(multi(n1.toDouble(), n2.toDouble()))
        } else if (option == 8) {
            println("Saliendo del programa...")
            break
        } else {
            println("Opción no válida, por favor selecciona una opción del 1 al 8.")
        }
        println()
    }   
}



var n1=4
var n2=82
fun suma(){
    var suma=n1+n2
    println("la suma es:$suma")
}
fun resta (){
    var resta=n1-n2
    println("la resta es:$resta")
}
fun raiz ():Double{
    return Math.sqrt(n1.toDouble())
}
fun cuadrado():Double{
    return Math.pow(n1.toDouble(), 2.0)
}
fun saludo ():String{
    return "Hola clase"
}
fun division(n1: Int, n2: Int){
    var div=n1/n2
    println("la division es:${div}")
}
fun multi(n1: Double, n2: Double): String {
    return "La multiplicación es: ${n1 * n2}"
}

