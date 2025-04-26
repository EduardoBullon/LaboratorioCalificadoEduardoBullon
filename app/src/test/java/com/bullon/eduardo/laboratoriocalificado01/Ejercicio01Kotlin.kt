package com.bullon.eduardo.laboratoriocalificado01


// Clase Ejercicio01Kotlin que contiene la lógica de anagramas
class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    fun areAnagrams(word1: String, word2: String): Boolean {
        // Convierte el texto 1 en minúscula, en arreglo de caracteres y los ordena
        val sortedWord1 = word1.lowercase().toCharArray().sorted()

        // Convierte el texto 2 en minúscula, en arreglo de caracteres y los ordena
        val sortedWord2 = word2.lowercase().toCharArray().sorted()

        // Compara los dos arrays, si son iguales en caracteres entonces retorna true
        return sortedWord1 == sortedWord2
    }
}
