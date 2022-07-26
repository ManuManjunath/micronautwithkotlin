package com.example.micronautwithkotlin.helloRestBasics

import jakarta.inject.Singleton

// @Primary
/*
@Primary can be used if there are multiple implementations of the interface
    and the controller needs to use this one in particular.
This is useful if we have to quickly change implementations
*/
@Singleton
class UsingBaseService: BaseService {
    override fun helloUsingInterface(): String {
        return "Hello using interface"
    }
}