package com.example.a34b

fun main() {

//    val a : Double = 10.26;
//    print(a.toString())
//
    var name: String = "Softwarica"
    name.uppercase()
    name.lowercase()
    var i: Int = name.length
    var isEqual : Boolean = name.equals("dadadadad")
    var a : String = "   sasasas     "
    var sa : String = " college of IT and Ecommerce"

    println(isEqual)
    println(a.trim())
    println(sa.replace(" ","%20"))

    println(name.plus(sa))

    println("This is value ${sa.length}")
}