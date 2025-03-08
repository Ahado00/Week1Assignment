package com.example.ahadflex
open class User(  name:String,
                  age:Int,
                 val email:String) :  Person(name, age){

    fun greet() {
        val greeting = FriendlyGreeting()
        println("${greeting.provideGreeting()}")
    }

}
