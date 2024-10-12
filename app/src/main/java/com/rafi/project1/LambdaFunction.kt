package com.rafi.project1

// Lambda Functions
// Lambda functions adalah fungsi yang tidak memiliki nama
// Lambda functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(name: String) : String {
    return name.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb :
fun main(){
    uppercaseString("rafi alif azhar")
    println({ name : String -> name.uppercase() }("rafi alif azhar"))
    // RAFI ALIF AZHAR
}