package com.example.power_rangers.ui.auth

data class user (val username: String, val password: String)

class UserRepository {
    private val users = mutableListOf<user>()

    fun addUser(user: user) {
        users.add(user)
    }

    fun getUser(username: String, password: String): user? {
        return users.find { it.username == username && it.password == password }
    }
}