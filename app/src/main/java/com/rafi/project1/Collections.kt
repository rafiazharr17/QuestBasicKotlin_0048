package com.rafi.project1

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listof
// List Mutable menggunakan mutableListof


fun ContohList()  {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("X", "Y", "Z")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Futsal", "Basket", "Voli")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Futsal")
    println(shape)

    // Menghapus data dari list mutable
    shape.remove("Basket")
    println(shape)

    // Mengubah data dari list mutable
    shape[0] = "Renang"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {
    println()
    println("=== Set ==")

    // Set Read-Only
    val readOnlyAbjad = setOf("X", "Y", "Z")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Futsal", "Basket", "Voli")
    println(shape)

    // Menambahkan data ke set mutable
    shape.add("Futsal")
    println(shape)

    // Menghapus data dari set mutable
    shape.remove("Basket")
    println(shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}