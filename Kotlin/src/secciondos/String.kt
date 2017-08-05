package secciondos

fun main(args: Array<String>) {

    var nombre = "Seve"

    println("Mi nombre es: " + nombre)
    println("Mi nombre es: $nombre")

    //El índice empieza desde 0
    var apellido = "Valdez" + " Pulido"

    println(apellido)

    // String = Cadena de caracteres o arreglo de Char
    // Char = Un caracter permitido en memoria , ya sea símbolo, número, letra, etc

    println("La cuarta letra es: " + apellido[3])

    println(nombre.toLowerCase())
    println(nombre.toUpperCase())
    println(apellido.trim())
}
