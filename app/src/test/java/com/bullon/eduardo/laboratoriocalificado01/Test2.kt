package com.bullon.eduardo.laboratoriocalificado01


// Clase Test2 para ejecutar las pruebas del Ejercicio 2
class Test2 {

    // Función principal para ejecutar las pruebas
    fun main() {
        // Crear una instancia de Ejercicio02Kotlin
        val vowelTest = Ejercicio02Kotlin()

        // Test 1: Contar las vocales en "Hola mundo"
        val result1 = vowelTest.countVowels("Hola mundo")
        println("Vocales en 'Hola mundo': $result1")  // Salida esperada: 4

        // Test 2: Contar las vocales en "Kotlin es genial"
        val result2 = vowelTest.countVowels("Kotlin es genial")
        println("Vocales en 'Kotlin es genial': $result2")  // Salida esperada: 6
    }
}

// Ejecutar el test para el Ejercicio 2
fun main() {
    val test2 = Test2()  // Crear una instancia de Test2
    test2.main()  // Ejecutar la función principal de Test2
}
