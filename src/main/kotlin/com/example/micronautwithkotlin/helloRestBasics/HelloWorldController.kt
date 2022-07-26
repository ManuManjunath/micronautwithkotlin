package com.example.micronautwithkotlin.helloRestBasics

import io.micronaut.context.annotation.Property
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller("/hello")
class HelloWorldController(
    // Using constructor based injection
    var service: HelloWorldService,
    var service2: UsingBaseService,
    @Property(name = "hello.world.message", defaultValue = "backup default message") var messageFromConfig: String,
    var translationConfig: TranslationConfig
) {

    // To enable logging
    val LOG: Logger = LoggerFactory.getLogger("HelloWorldController")

    // Loading content directly from the controller
    @Get(uri = "/main")
    fun helloWorld(): String {
        LOG.info("Loading string directly from controller")
        return "Hello world"
    }

    // Loading content from HelloWorldService
    @Get(uri = "/service")
    fun helloWorld2(): String {
        LOG.info("Loading string using HelloWorldService")
        return service.helloFromService()
    }

    // Loading content using interface implementation
    @Get(uri = "/interface")
    fun helloWorld3(): String {
        LOG.info("Loading string using Interface implementation")
        return service2.helloUsingInterface()
    }

    // Loading content from application config file
    @Get(uri = "/config")
    fun helloWorld4(): String {
        LOG.info("Loading string using application config file")
        return messageFromConfig
    }

    // Loading json from application config file
    @Get(uri = "/translation")
    fun helloTranslation(): TranslationConfig {
        LOG.info("Loading JSON using application config file")
        return translationConfig
    }

    @Get(uri = "/translation/{lang}")
    fun showLang(@PathVariable lang: String): String {
        LOG.info("Loading language based on path variable")
        return when (lang) {
            "english" -> translationConfig.getEnglish()
            "spanish" -> translationConfig.getSpanish()
            "hindi" -> translationConfig.getHindi()
            else -> ""
        }
    }
}