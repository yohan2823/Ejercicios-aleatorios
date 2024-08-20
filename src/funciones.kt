fun main (){
    suma()
    resta()
    raiz()
    println("la raiz es:${raiz()}")
    println(cuadrado())
    println(saludo())
    division(n1,n2)


}
var n1=4
var n2=8

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

