package com.example.micronautwithkotlin.stockRestLearning

import jakarta.inject.Singleton
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.stream.IntStream
import javax.annotation.PostConstruct
import net.datafaker.Faker

@Singleton
class InMemoryStore {

    val LOG: Logger = LoggerFactory.getLogger("InMemoryStore")

    var symbols = mutableMapOf<String, Symbol>()
    val faker = Faker()


    @PostConstruct
    public fun initialize() {
        IntStream.range(0, 10).forEach { addNewSymbol() }
    }

    private fun addNewSymbol() {
        var symbol = Symbol(faker.stock().nsdqSymbol())
        symbols.put(symbol.value, symbol)
        LOG.info("Added symbol $symbol")
    }

    fun showSymbols(): Map<String, Symbol> {
        return symbols
    }
}