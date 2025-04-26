package com.bullon.eduardo.laboratoriocalificado01

// Clase Ejercicio02Kotlin que contiene la lógica para contar las vocales
class Ejercicio02Kotlin {

    // Función para contar las vocales (a, e, i, o, u) en una cadena de texto
    fun countVowels(text: String): Int {
        // Convertir el texto a minúsculas y contar las vocales
        val vowels = "aeiou"
        var count = 0

        // Recorremos cada carácter del texto
        for (char in text.lowercase()) {
            // Si el carácter es una vocal, aumentamos el contador
            if (char in vowels) {
                count++
            }
        }
        return count
    }
}
