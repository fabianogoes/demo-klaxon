package com.example.demo

import com.beust.klaxon.Klaxon

fun main() {
    val json = "[\n" +
            "    { \"type\": \"home\", \"configuration\": { \"width\": 100, \"height\": 50 } },\n" +
            "    { \"type\": \"auto\", \"configuration\": { \"radius\": 20} }\n" +
            "]"
    println(json)


    val configuration = Klaxon().parseArray<Data>(json)

    println(configuration)
}