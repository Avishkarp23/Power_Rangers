package com.example.power_rangers.ui.home


class DataClass(
    private val dataTitle: String,
    private val dataDesc: Int,
    private val dataLang: String,
    private val dataImage: Int
) {
    fun getDataTitle(): String {
        return dataTitle
    }

    fun getDataDesc(): Int {
        return dataDesc
    }

    fun getDataLang(): String {
        return dataLang
    }

    fun getDataImage(): Int {
        return dataImage
    }
}

