package com.example.micronautwithkotlin.helloRestBasics

import jakarta.inject.Singleton

@Singleton
class HelloWorldService {

    fun helloFromService(): String = "Hello from service"

}