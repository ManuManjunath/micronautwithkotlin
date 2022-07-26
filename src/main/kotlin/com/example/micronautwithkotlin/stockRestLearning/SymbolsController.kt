package com.example.micronautwithkotlin.stockRestLearning

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import jakarta.inject.Inject

@Controller("/symbols")
class SymbolsController{

    @Inject
    lateinit var inMemoryStore: InMemoryStore

    // Normal
   @Get
   fun getAll(): List<Symbol> {
       return inMemoryStore.showSymbols().values.toList()
   }

    // With path variables
    @Get("{value}")
    fun getSymbolByValue(@PathVariable value: String): Symbol {
        return inMemoryStore.showSymbols().getValue(value)
    }

    // With query parameters
    @Get("/filter")
    fun getSymbolsByFilter(
        @QueryValue("maxim") maxim: Int
    ): List<Symbol> {
        return inMemoryStore.showSymbols().values.toList().take(maxim)
    }
}

