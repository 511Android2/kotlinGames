package com.example.koffingames.games

// Adivina un número
// Se debe seleccionar un numero dentro de un rango
// la computadora debe de ser capaz de seleccionar ese numero
// El programa debe solicitar al usuario ingresar la suposicion
// Debe de asegurarse recibir numeros validos
// El juego termina cuando el jugador acierte el numero

fun main(){
    val range = 1 .. 10
    val numberToGuess = range.random()
    var attemps = 0
    println("Bienvenido al juego de Adivina un Número")
    println("Estoy pensando en un numero entre 1 y 10. Adivinalo")
    println("Ingresa tu suposicion.")

    do{
        var guess = readlnOrNull()?.toIntOrNull()
        if(guess != null) {
            attemps++
            when {
                guess < numberToGuess -> println("El numero que estoy pensando es mayor")
                guess > numberToGuess -> println("El numero que estoy pensando es menor")
                else -> println("Felicidades le atinaste pa, lo adivinaste en $attemps intentos")
            }
//            if(guess == numberToGuess) {
//                println("Felicidades le atinaste pa")
//            } else if(guess > numberToGuess) {
//                println("El numero que estoy pensando es menor")
//            } else if(guess < numberToGuess) {
//                println("El numero que estoy pensando es mayor")
//            }
        } else {
            println("Por favor, ingresa un numero valido")
        }
    }
    while(guess != numberToGuess)
}

