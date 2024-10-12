package com.rafi.project1

class Motor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "rafipilo17@gmail.com")

    // Mencetak nilai properti: email
    println(contact.email)

    // Memperbarui nilai properti: email
    contact.email = "rafi@gmail.com"

    // Mencetak nilai baru dari properti: email
    println(contact.email)
}