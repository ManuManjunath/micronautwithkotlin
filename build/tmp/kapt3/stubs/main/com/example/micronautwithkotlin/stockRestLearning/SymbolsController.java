package com.example.micronautwithkotlin.stockRestLearning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/micronautwithkotlin/stockRestLearning/SymbolsController;", "", "()V", "inMemoryStore", "Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryStore;", "getInMemoryStore", "()Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryStore;", "setInMemoryStore", "(Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryStore;)V", "getAll", "", "Lcom/example/micronautwithkotlin/stockRestLearning/Symbol;", "getSymbolByValue", "value", "", "getSymbolsByFilter", "maxim", "", "micronautwithkotlin"})
@io.micronaut.http.annotation.Controller(value = "/symbols")
public final class SymbolsController {
    @jakarta.inject.Inject()
    public com.example.micronautwithkotlin.stockRestLearning.InMemoryStore inMemoryStore;
    
    public SymbolsController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.stockRestLearning.InMemoryStore getInMemoryStore() {
        return null;
    }
    
    public final void setInMemoryStore(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.stockRestLearning.InMemoryStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final java.util.List<com.example.micronautwithkotlin.stockRestLearning.Symbol> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "{value}")
    public final com.example.micronautwithkotlin.stockRestLearning.Symbol getSymbolByValue(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/filter")
    public final java.util.List<com.example.micronautwithkotlin.stockRestLearning.Symbol> getSymbolsByFilter(@io.micronaut.http.annotation.QueryValue(value = "maxim")
    int maxim) {
        return null;
    }
}