package com.example.micronautwithkotlin.stockRestLearning

import jakarta.inject.Singleton
import java.util.*
import kotlin.collections.HashMap

@Singleton
class InMemoryAccountStore {

    var watchListsPerAccount: HashMap<UUID, WatchList> = HashMap()

    fun getWatchList(accountId: UUID): WatchList {
        return watchListsPerAccount.getOrDefault(accountId, WatchList())
    }

    fun updateWatchList(accountId: UUID, watchList: WatchList): WatchList {
        watchListsPerAccount.put(accountId, watchList)
        return getWatchList(accountId)
    }

    fun deleteWatchList(accountId: UUID) {
        watchListsPerAccount.remove(accountId)
    }
}