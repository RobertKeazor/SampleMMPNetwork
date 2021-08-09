package com.robertkeazor.samplenetworkingproject

import kotlinx.serialization.Serializable

@Serializable
data class TileCard(
    val title: String,
    val body: String,
    val positiveButtonTitle: String,
    val negativeButtonTitle: String
    )

