package com.rafi.project1

// Conditional Expression
// Condotional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch

fun ConditionalStatement(){
    println("=== Conditional Expression ===")
    // if-else
    val number = 10
    if (number > 0) {
        println("Angka positif")
    } else {
        println("Angka negatif")
    }

    // when
    val day = 1
    when (day) {
        1 -> println("Senin")
        2 -> println("Selasa")
        3 -> println("Rabu")
        4 -> println("Kamis")
        5 -> println("Jumat")
        6 -> println("Sabtu")
        7 -> println("Minggu")
        else -> println("Tidak valid")
    }

    // Try-catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== Perulangan ===")
    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    val cars = listOf("Toyota", "Honda", "Tesla")
    for (car in cars) {
        println("car type: $car")
    }

    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}

