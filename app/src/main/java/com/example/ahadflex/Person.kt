package com.example.ahadflex

open class Person (val name: String,
                   val age: Int){
    fun introduce(): String {
        return "My name is $name and I am $age years old."
    }
}