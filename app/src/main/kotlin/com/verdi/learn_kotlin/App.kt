package com.verdi.learn_kotlin

class App {
    val greeting: String
        get() {
            return "Hello Kotlin"
        }
}

fun main(){
    println(App().greeting)
}