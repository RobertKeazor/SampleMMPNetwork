package com.robertkeazor.samplenetworkingproject

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

object NetworkClient {
    val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    suspend fun callLocalHost() = client.get<List<TileCard>>("http://10.0.2.2:8080/tilecard")


}
