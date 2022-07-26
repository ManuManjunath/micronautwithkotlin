package com.example.micronautwithkotlin.storesRest

class StoresModel {

    data class Items(
        val itemName: String,
        val price: Double
    )

    data class Stores(
        val storeNum: Int,
        val storeName: String,
        var items: MutableList<Items>
    )
}