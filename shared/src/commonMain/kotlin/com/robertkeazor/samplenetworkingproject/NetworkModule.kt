package com.robertkeazor.samplenetworkingproject

import io.ktor.client.request.*

class NetworkModule {
    suspend fun tiles(): List<TileCard> {
        return NetworkClient.client.get("${Platform().baseUrl}:8080")
    }
}