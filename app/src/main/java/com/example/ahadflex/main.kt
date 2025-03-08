package com.example.ahadflex

fun main(){

    //List
    val userList = listOf(
        UserDetails("Ahad",24,"ahadsaad45@gmail.com"),
        UserDetails("Renad",23,"renadha7878@gmail.com"),
        UserDetails("Eren",18,"freedom@gmail.com"),
        UserDetails("XuHao",27,"xuminghao@gmail.com")

    )

    //Lambda
    val adults = userList.filter { it.age > 18 }


    //print all users
    println("Users list: ")
    userList.forEach{println("- ${it.name} | ${it.age} years old | Email Address: ${it.email} ")}

    print("\n")

    //print users with age above 18
    println("Users above 18 years old: ")
    adults.forEach{println("- ${it.name} ")}

    print("\n")

    //greeting
    val user = User("Ahad",24,"ahadsaad45@gmail.com")
    user.greet()
    println(user.introduce())
}