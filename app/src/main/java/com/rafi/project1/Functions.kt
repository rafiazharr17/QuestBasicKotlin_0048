package com.rafi.project1

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name")
}

// Named argument
// Named argument adalah cara yang memanggil fungsi dengan menyebutkan nama parameter

fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello $name, your $age years old")
}

// Default parameter value
// Default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "rafi", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello $name, your $age years old")
}

fun withReturn(panjang : Int, lebar : Int) {
    println()
    println("== Panjang * Lebar ==")
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("Rafi")
    withNamedArgument(name = "Azhar", age = 21)
    withDefaultParameter(age = 21)
    withReturn(4,5)
}