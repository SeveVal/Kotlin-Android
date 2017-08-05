package secciondos

fun main(args: Array<String>) {

    var num1 : Int = 9
    var num2 : Int?

    var stringNumero : String = "12"

    num2 = stringNumero.toInt()

    println("Num2 es $num2")

    var flotante : Float = num1.toFloat()

    println("Flotante es $flotante")

    stringNumero = num1.toString()

    println("stringNumero es $stringNumero")

}
