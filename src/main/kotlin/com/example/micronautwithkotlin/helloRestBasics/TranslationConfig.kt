package com.example.micronautwithkotlin.helloRestBasics

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("language.translation")
interface TranslationConfig {

    fun getEnglish(): String
    fun getSpanish(): String
    fun getHindi(): String

}