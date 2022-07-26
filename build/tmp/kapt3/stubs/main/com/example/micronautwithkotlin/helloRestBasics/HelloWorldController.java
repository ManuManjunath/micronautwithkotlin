package com.example.micronautwithkotlin.helloRestBasics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020\tH\u0007J\b\u0010 \u001a\u00020\u0007H\u0007J\b\u0010!\u001a\u00020\u0007H\u0007J\b\u0010\"\u001a\u00020\u0007H\u0007J\b\u0010#\u001a\u00020\u0007H\u0007J\u0012\u0010$\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u0007H\u0007R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006&"}, d2 = {"Lcom/example/micronautwithkotlin/helloRestBasics/HelloWorldController;", "", "service", "Lcom/example/micronautwithkotlin/helloRestBasics/HelloWorldService;", "service2", "Lcom/example/micronautwithkotlin/helloRestBasics/UsingBaseService;", "messageFromConfig", "", "translationConfig", "Lcom/example/micronautwithkotlin/helloRestBasics/TranslationConfig;", "(Lcom/example/micronautwithkotlin/helloRestBasics/HelloWorldService;Lcom/example/micronautwithkotlin/helloRestBasics/UsingBaseService;Ljava/lang/String;Lcom/example/micronautwithkotlin/helloRestBasics/TranslationConfig;)V", "LOG", "Lorg/slf4j/Logger;", "getLOG", "()Lorg/slf4j/Logger;", "getMessageFromConfig", "()Ljava/lang/String;", "setMessageFromConfig", "(Ljava/lang/String;)V", "getService", "()Lcom/example/micronautwithkotlin/helloRestBasics/HelloWorldService;", "setService", "(Lcom/example/micronautwithkotlin/helloRestBasics/HelloWorldService;)V", "getService2", "()Lcom/example/micronautwithkotlin/helloRestBasics/UsingBaseService;", "setService2", "(Lcom/example/micronautwithkotlin/helloRestBasics/UsingBaseService;)V", "getTranslationConfig", "()Lcom/example/micronautwithkotlin/helloRestBasics/TranslationConfig;", "setTranslationConfig", "(Lcom/example/micronautwithkotlin/helloRestBasics/TranslationConfig;)V", "helloTranslation", "helloWorld", "helloWorld2", "helloWorld3", "helloWorld4", "showLang", "lang", "micronautwithkotlin"})
@io.micronaut.http.annotation.Controller(value = "/hello")
public final class HelloWorldController {
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.helloRestBasics.HelloWorldService service;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.helloRestBasics.UsingBaseService service2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String messageFromConfig;
    @org.jetbrains.annotations.NotNull()
    private com.example.micronautwithkotlin.helloRestBasics.TranslationConfig translationConfig;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger LOG = null;
    
    public HelloWorldController(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.helloRestBasics.HelloWorldService service, @org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.helloRestBasics.UsingBaseService service2, @org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.Property(name = "hello.world.message", defaultValue = "backup default message")
    java.lang.String messageFromConfig, @org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.helloRestBasics.TranslationConfig translationConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.helloRestBasics.HelloWorldService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.helloRestBasics.HelloWorldService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.helloRestBasics.UsingBaseService getService2() {
        return null;
    }
    
    public final void setService2(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.helloRestBasics.UsingBaseService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessageFromConfig() {
        return null;
    }
    
    public final void setMessageFromConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.micronautwithkotlin.helloRestBasics.TranslationConfig getTranslationConfig() {
        return null;
    }
    
    public final void setTranslationConfig(@org.jetbrains.annotations.NotNull()
    com.example.micronautwithkotlin.helloRestBasics.TranslationConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLOG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(uri = "/main")
    public final java.lang.String helloWorld() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(uri = "/service")
    public final java.lang.String helloWorld2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(uri = "/interface")
    public final java.lang.String helloWorld3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(uri = "/config")
    public final java.lang.String helloWorld4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(uri = "/translation")
    public final com.example.micronautwithkotlin.helloRestBasics.TranslationConfig helloTranslation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(uri = "/translation/{lang}")
    public final java.lang.String showLang(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String lang) {
        return null;
    }
}