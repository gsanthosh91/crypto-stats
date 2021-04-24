package com.mvvm.app.model

import com.google.gson.annotations.SerializedName

data class CoinResponse(
    @SerializedName("coins") val coins: List<Coin>
)