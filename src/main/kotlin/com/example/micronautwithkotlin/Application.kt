package com.example.micronautwithkotlin

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.example.micronautwithkotlin")
        .start()
}

