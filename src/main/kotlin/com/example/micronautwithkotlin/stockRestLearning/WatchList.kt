package com.example.micronautwithkotlin.stockRestLearning

data class WatchList(val symbols: List<Symbol>) {
    constructor(): this(listOf<Symbol>())
}