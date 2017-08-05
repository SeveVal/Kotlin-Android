package seccioncuatro

fun main(args: Array<String>) {

    val x = 16

    when (x) {

        1 -> print("El valor es 1")
        2 -> print("El valor es 2")
        3 -> print("El valor es 3")
        in 5..15 -> print("El valor está en el rango de 5 a 15")
    //!in 5..15 -> print("El valor no está en el rango de 5 a 15")
        else -> print("El valor está fuera de rango")
    }

    val promedio = 7

    when (promedio) {

        10 -> println("Tu resultado es sobresaliente, Felicidades! Tu calificación es $promedio")
        9 -> println("Tu resultado es bueno. Tu calificación es $promedio")
        6, 7, 8 -> println("Tu resultado es suficiente. Tu calificación es $promedio")
        else -> println("Tu resultado es insuficiente. Tu calificación es $promedio")
    }

}
