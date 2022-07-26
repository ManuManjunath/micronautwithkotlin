package com.example.micronautwithkotlin.storesRest

import jakarta.inject.Singleton
import com.example.micronautwithkotlin.storesRest.StoresModel.Items
import com.example.micronautwithkotlin.storesRest.StoresModel.Stores
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Singleton
class StoresService {

    val LOG: Logger = LoggerFactory.getLogger("StoresService")

    val item0 = Items("Dummy", 0.0)
    var item1 = Items("Item1", 10.0)
    var item2 = Items("Item2", 20.0)
    var item3 = Items("Item3", 30.0)

    var newStoreItemsInit: MutableList<Items> = mutableListOf(item0)
    //var allItems: MutableList<Items> = mutableListOf(item1, item2, item3)

    var store1 = Stores(1, "Store#1", mutableListOf(item1, item2, item3))
    var store2 = Stores(2, "Store#2", mutableListOf(item1, item2, item3))

    var allStores: MutableList<Stores> = mutableListOf(store1, store2)

    fun showAllStores(): List<Stores> {
        return allStores
    }

    fun getSpecificStore(num: Int): Any {
        LOG.info("Showing details for Store ${num}")
        return allStores.filter { it.storeNum == num }
    }

    fun getSpecificItems(strNum: Int, itm: String): Any {
        LOG.info("First filtering for the required store: ${strNum}")
        val requestedStore = allStores.filter { it.storeNum == strNum }.first()
        LOG.info(requestedStore.toString())
        LOG.info("Trying to get the required item: ${itm}")
        for (i in requestedStore.items) {
            if (i.itemName == itm) {
                return i
            }
        }
        return "Item not present"
    }

    fun createStore(strName: String): Int {
        // Get max Store ID
        var storeIDs: MutableList<Int> = mutableListOf()
        allStores.forEach { storeIDs.add(it.storeNum) }
        val maxStrId: Int? = storeIDs.maxOrNull()
        val maxId = maxStrId ?: 0
        val nextStrId = maxId + 1
        LOG.info("Adding new store with ID ${nextStrId}")
        allStores.add(Stores(nextStrId, strName, newStoreItemsInit))
        return nextStrId
    }

    fun createItem(strNum: Int, itm: Items): Any {
        LOG.info("First filtering for the required store: ${strNum}")
        val requestedStore = allStores.filter { it.storeNum == strNum }.first()
        LOG.info("Adding new item: ${requestedStore.toString()}")
        requestedStore.items.add(itm)
        return requestedStore.items
    }
}

