package com.example.micronautwithkotlin.stockRestLearning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006R6\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/micronautwithkotlin/stockRestLearning/InMemoryAccountStore;", "", "()V", "watchListsPerAccount", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lcom/example/micronautwithkotlin/stockRestLearning/WatchList;", "Lkotlin/collections/HashMap;", "getWatchListsPerAccount", "()Ljava/util/HashMap;", "setWatchListsPerAccount", "(Ljava/util/HashMap;)V", "deleteWatchList", "", "accountId", "getWatchList", "updateWatchList", "watchList", "micronautwithkotlin"})
@jakarta.inject.Singleton()
public final class InMemoryAccountStore {
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.util.UUID, com.example.micronautwithkotlin.stockRestLearning.WatchList> watchListsPerAccount;
    
    public InMemoryAccountStore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, com.example.micronautwithkotlin.stockRestLearning.WatchList> getWatchListsPerAccount() {
        return null;
    }
    
    public final void setWatchListsPerAccount(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, com.example.micronautwithkotlin.stockRestLearning.WatchList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.stockRestLearning.WatchList getWatchList(@org.jetbrains.annotations.NotNull()
    java.util.UUID accountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.stockRestLearning.WatchList updateWatchList(@org.jetbrains.annotations.NotNull()
    java.util.UUID accountId, @org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.stockRestLearning.WatchList watchList) {
        return null;
    }
    
    public final void deleteWatchList(@org.jetbrains.annotations.NotNull()
    java.util.UUID accountId) {
    }
}