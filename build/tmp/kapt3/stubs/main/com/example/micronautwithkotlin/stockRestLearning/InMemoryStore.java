package com.example.micronautwithkotlin.stockRestLearning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0007J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryStore;", "", "()V", "LOG", "Lorg/slf4j/Logger;", "getLOG", "()Lorg/slf4j/Logger;", "faker", "Lnet/datafaker/Faker;", "getFaker", "()Lnet/datafaker/Faker;", "symbols", "", "", "Lcom/example/micronautwithkotlin/stockRestLearning/Symbol;", "getSymbols", "()Ljava/util/Map;", "setSymbols", "(Ljava/util/Map;)V", "addNewSymbol", "", "initialize", "showSymbols", "", "micronautwithkotlin"})
@jakarta.inject.Singleton()
public final class InMemoryStore {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger LOG = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, com.example.micronautwithkotlin.stockRestLearning.Symbol> symbols;
    @org.jetbrains.annotations.NotNull()
    private final net.datafaker.Faker faker = null;
    
    public InMemoryStore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.micronautwithkotlin.stockRestLearning.Symbol> getSymbols() {
        return null;
    }
    
    public final void setSymbols(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.example.micronautwithkotlin.stockRestLearning.Symbol> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.datafaker.Faker getFaker() {
        return null;
    }
    
    @javax.annotation.PostConstruct()
    public final void initialize() {
    }
    
    private final void addNewSymbol() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.micronautwithkotlin.stockRestLearning.Symbol> showSymbols() {
        return null;
    }
}