package com.example.a34b

fun main(args: Array<String>) {
    var data = mapOf<String?,String?>(
        "Nepal" to "It is a landlocked country",
        "Apple" to "It's a fruit",
        "Android" to "It's a operating system"
    )
    while(2>1){

    println("Enter any words::")
    var word : String = readln()
    var result : String? = data[word]
    println("The meaning of $word is $result")
    }
}