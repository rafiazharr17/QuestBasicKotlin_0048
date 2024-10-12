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