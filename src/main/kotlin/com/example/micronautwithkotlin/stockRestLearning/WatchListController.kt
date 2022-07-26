package com.example.micronautwithkotlin.stockRestLearning

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Put
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Delete
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import java.util.*

@Controller("/account/watchlist")
class WatchListController(var store: InMemoryAccountStore) {

    val LOG: Logger = LoggerFactory.getLogger("WatchListController")

    val ACCOUNT_ID: UUID = UUID.randomUUID()

    @Get
    fun get(): WatchList {
        LOG.info("Showing data")
        return store.getWatchList(ACCOUNT_ID)
    }

    @Put//(consumes = arrayOf(MediaType.APPLICATION_JSON), produces = arrayOf(MediaType.APPLICATION_JSON))
    fun update(@Body watchList: WatchList): WatchList {
        LOG.info("In PUT method")
        // Use this for testing -
        // curl -X PUT -H "Content-Type: application/json" -d '{"symbols": [{"value": "AAPL"}, {"value": "MSFT"}]}' http://localhost:8081/account/watchlist
        return store.updateWatchList(ACCOUNT_ID, watchList)
    }

    @Delete
    fun delete() {
        // curl -X DELETE http://localhost:8081/account/watchlist
        LOG.info("Deleting everything")
        return store.deleteWatchList(ACCOUNT_ID)
    }

}