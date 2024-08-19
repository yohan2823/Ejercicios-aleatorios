import kotlin.random.Random

fun main() {

    var caraCount = 0
    var selloCount = 0


    repeat(20) {

        val resultado = lanzarMoneda()


        if (resultado == "cara") {
            caraCount++
        } else {
            selloCount++
        }
    }

    println("Número de veces que cayó cara: $caraCount")
    println("Número de veces que cayó sello: $selloCount")
}


fun lanzarMoneda(): String {
    return if (Random.nextBoolean()) "cara" else "sello"
}
