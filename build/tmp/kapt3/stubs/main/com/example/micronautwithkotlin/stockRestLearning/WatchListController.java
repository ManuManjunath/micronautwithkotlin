package com.example.micronautwithkotlin.stockRestLearning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004\u00a8\u0006\u0016"}, d2 = {"Lcom/example/micronautwithkotlin/stockRestLearning/WatchListController;", "", "store", "Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryAccountStore;", "(Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryAccountStore;)V", "ACCOUNT_ID", "Ljava/util/UUID;", "getACCOUNT_ID", "()Ljava/util/UUID;", "LOG", "Lorg/slf4j/Logger;", "getLOG", "()Lorg/slf4j/Logger;", "getStore", "()Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryAccountStore;", "setStore", "delete", "", "get", "Lcom/example/micronautwithkotlin/stockRestLearning/WatchList;", "update", "watchList", "micronautwithkotlin"})
@io.micronaut.http.annotation.Controller(value = "/account/watchlist")
public final class WatchListController {
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.stockRestLearning.InMemoryAccountStore store;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger LOG = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID ACCOUNT_ID = null;
    
    public WatchListController(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.stockRestLearning.InMemoryAccountStore store) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.stockRestLearning.InMemoryAccountStore getStore() {
        return null;
    }
    
    public final void setStore(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.stockRestLearning.InMemoryAccountStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getACCOUNT_ID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final com.example.micronautwithkotlin.stockRestLearning.WatchList get() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put()
    public final com.example.micronautwithkotlin.stockRestLearning.WatchList update(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.example.micronautwithkotlin.stockRestLearning.WatchList watchList) {
        return null;
    }
    
    @io.micronaut.http.annotation.Delete()
    public final void delete() {
    }
}