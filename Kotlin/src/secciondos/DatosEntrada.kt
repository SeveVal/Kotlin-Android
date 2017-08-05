package secciondos

fun main(args: Array<String>) {

    print("¿Cuál es tu nombre?")
    val nombre = readLine()
    print("¿Cuál es tu edad?")
    val edad : Int = readLine()!!.toInt()

    println("Tu nombre es: " + nombre)
    println("Tu edad es: "+ edad)

}
