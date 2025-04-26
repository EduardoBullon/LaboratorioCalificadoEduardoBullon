package com.bullon.eduardo.laboratoriocalificado01


// Clase Test para ejecutar la función de anagramas
class Test {

    // Función principal para ejecutar las pruebas
    fun main() {
        // Crear una instancia de Ejercicio01Kotlin
        val anagramTest = Ejercicio01Kotlin()

        // Test 1: Verificar si "listen" y "silent" son anagramas
        val result1 = anagramTest.areAnagrams("listen", "silent")
        println("¿Son anagramas 'listen' y 'silent'? $result1")  // Salida esperada: true

        // Test 2: Verificar si "hello" y "world" NO son anagramas
        val result2 = anagramTest.areAnagrams("hello", "world")
        println("¿Son anagramas 'hello' y 'world'? $result2")  // Salida esperada: false
    }
}

// Ejecutar el test
fun main() {
    val test = Test()  // Crear una instancia de Test
    test.main()  // Ejecutar la función principal de Test
}
