package com.example.micronautwithkotlin.storesRest

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import com.example.micronautwithkotlin.storesRest.StoresModel.Items
import com.example.micronautwithkotlin.storesRest.StoresModel.Stores
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Put
import io.micronaut.http.annotation.QueryValue
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Controller("/stores")
class StoresController(val service: StoresService) {

    val LOG: Logger = LoggerFactory.getLogger("StoresController")

    // Get list of all items and stores
    @Get("/")
    fun listAllStores(): List<Stores> {
        LOG.info("Requesting service to list all stores' information")
        return service.showAllStores()
    }

    // Get details on specific stores
    @Get("/{strNum}")
    fun getItemsByStore(@PathVariable strNum: Int): Any {
        LOG.info("Requesting service to get details on store: ${strNum}")
        return service.getSpecificStore(strNum)
    }

    // Get details on specific items
    @Get("/item")
    fun getItemDetails(
        @QueryValue("str") str: Int,
        @QueryValue("itm") itm: String
    ): Any {
        LOG.info("Requesting service to get details for Store: ${str}, and Item: ${itm}")
        return service.getSpecificItems(str, itm)
    }

    // Put new empty store
    @Put("/newStore/{strName}")
    fun addStore(@PathVariable strName: String): Any {
        LOG.info("Requesting service to add new Store: ${strName}")
        val newStr = service.createStore(strName)
        return service.getSpecificStore(newStr)
    }

    // Put new items to existing stores
    @Put("newItem/{strNum}")
    fun addItem(@PathVariable strNum: Int, @Body item: Items): Any {
        LOG.info("Requesting service to add new Item in Store: ${strNum}")
        // curl -X PUT -H "Content-Type: application/json" -d '{"itemName": "Some Item", "price": 32.5}' http://localhost:8081/stores/newItem/1
        return service.createItem(strNum, item)
    }

    // TODO: DELETE specific items from stores
    // TODO: DELETE specific stores


}