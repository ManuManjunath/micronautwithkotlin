package com.example.micronautwithkotlin.helloRestBasics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/micronautwithkotlin/helloRestBasics/TranslationConfig;", "", "getEnglish", "", "getHindi", "getSpanish", "micronautwithkotlin"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "language.translation")
public abstract interface TranslationConfig {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEnglish();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSpanish();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getHindi();
}