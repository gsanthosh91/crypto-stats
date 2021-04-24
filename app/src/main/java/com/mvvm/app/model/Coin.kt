package com.mvvm.app.model

data class Coin(
    val id: String,
    val icon: String,
    val name: String,
    val symbol: String,
    val rank: Int,
    val price: Double,
    val priceBtc: Double,
    val volume: Double,
    val marketCap: Double,
    val availableSupply: Double,
    val totalSupply: Double,
    val priceChange1h: Double,
    val priceChange1d: Double,
    val priceChange1w: Double,
    val websiteUrl: String,
    val twitterUrl: String,
    val exp: List<String>
)