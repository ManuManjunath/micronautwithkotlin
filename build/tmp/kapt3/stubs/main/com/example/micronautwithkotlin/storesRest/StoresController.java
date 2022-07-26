package com.example.micronautwithkotlin.storesRest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u001c\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u0012H\u0007J\u0012\u0010\u0016\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/micronautwithkotlin/storesRest/StoresController;", "", "service", "Lcom/example/micronautwithkotlin/storesRest/StoresService;", "(Lcom/example/micronautwithkotlin/storesRest/StoresService;)V", "LOG", "Lorg/slf4j/Logger;", "getLOG", "()Lorg/slf4j/Logger;", "getService", "()Lcom/example/micronautwithkotlin/storesRest/StoresService;", "addItem", "strNum", "", "item", "Lcom/example/micronautwithkotlin/storesRest/StoresModel$Items;", "addStore", "strName", "", "getItemDetails", "str", "itm", "getItemsByStore", "listAllStores", "", "Lcom/example/micronautwithkotlin/storesRest/StoresModel$Stores;", "micronautwithkotlin"})
@io.micronaut.http.annotation.Controller(value = "/stores")
public final class StoresController {
    @org.jetbrains.annotations.NotNull()
    private final com.example.micronautwithkotlin.storesRest.StoresService service = null;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger LOG = null;
    
    public StoresController(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/")
    public final java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Stores> listAllStores() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{strNum}")
    public final java.lang.Object getItemsByStore(@io.micronaut.http.annotation.PathVariable()
    int strNum) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/item")
    public final java.lang.Object getItemDetails(@io.micronaut.http.annotation.QueryValue(value = "str")
    int str, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(value = "itm")
    java.lang.String itm) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/newStore/{strName}")
    public final java.lang.Object addStore(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String strName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "newItem/{strNum}")
    public final java.lang.Object addItem(@io.micronaut.http.annotation.PathVariable()
    int strNum, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.example.micronautwithkotlin.storesRest.StoresModel.Items item) {
        return null;
    }
}