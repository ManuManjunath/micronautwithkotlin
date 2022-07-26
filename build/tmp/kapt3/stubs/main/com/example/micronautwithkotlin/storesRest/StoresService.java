package com.example.micronautwithkotlin.storesRest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000fJ\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-J\u0016\u0010.\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020-J\u000e\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020)J\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t02R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#\u00a8\u00063"}, d2 = {"Lcom/example/micronautwithkotlin/storesRest/StoresService;", "", "()V", "LOG", "Lorg/slf4j/Logger;", "getLOG", "()Lorg/slf4j/Logger;", "allStores", "", "Lcom/example/micronautwithkotlin/storesRest/StoresModel$Stores;", "getAllStores", "()Ljava/util/List;", "setAllStores", "(Ljava/util/List;)V", "item0", "Lcom/example/micronautwithkotlin/storesRest/StoresModel$Items;", "getItem0", "()Lcom/example/micronautwithkotlin/storesRest/StoresModel$Items;", "item1", "getItem1", "setItem1", "(Lcom/example/micronautwithkotlin/storesRest/StoresModel$Items;)V", "item2", "getItem2", "setItem2", "item3", "getItem3", "setItem3", "newStoreItemsInit", "getNewStoreItemsInit", "setNewStoreItemsInit", "store1", "getStore1", "()Lcom/example/micronautwithkotlin/storesRest/StoresModel$Stores;", "setStore1", "(Lcom/example/micronautwithkotlin/storesRest/StoresModel$Stores;)V", "store2", "getStore2", "setStore2", "createItem", "strNum", "", "itm", "createStore", "strName", "", "getSpecificItems", "getSpecificStore", "num", "showAllStores", "", "micronautwithkotlin"})
@jakarta.inject.Singleton()
public final class StoresService {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger LOG = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.micronautwithkotlin.storesRest.StoresModel.Items item0 = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.storesRest.StoresModel.Items item1;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.storesRest.StoresModel.Items item2;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.storesRest.StoresModel.Items item3;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Items> newStoreItemsInit;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.storesRest.StoresModel.Stores store1;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.storesRest.StoresModel.Stores store2;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Stores> allStores;
    
    public StoresService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresModel.Items getItem0() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresModel.Items getItem1() {
        return null;
    }
    
    public final void setItem1(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresModel.Items p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresModel.Items getItem2() {
        return null;
    }
    
    public final void setItem2(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresModel.Items p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresModel.Items getItem3() {
        return null;
    }
    
    public final void setItem3(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresModel.Items p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Items> getNewStoreItemsInit() {
        return null;
    }
    
    public final void setNewStoreItemsInit(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Items> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresModel.Stores getStore1() {
        return null;
    }
    
    public final void setStore1(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresModel.Stores p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.storesRest.StoresModel.Stores getStore2() {
        return null;
    }
    
    public final void setStore2(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresModel.Stores p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Stores> getAllStores() {
        return null;
    }
    
    public final void setAllStores(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Stores> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.micronautwithkotlin.storesRest.StoresModel.Stores> showAllStores() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSpecificStore(int num) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSpecificItems(int strNum, @org.jetbrains.annotations.NotNull()
    java.lang.String itm) {
        return null;
    }
    
    public final int createStore(@org.jetbrains.annotations.NotNull()
    java.lang.String strName) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object createItem(int strNum, @org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.storesRest.StoresModel.Items itm) {
        return null;
    }
}