package com.mvvm.app.data.service

/**
 * Copyright 2020 Hongbeom Ahn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **/

import com.mvvm.app.model.CoinResponse
import com.mvvm.app.model.User
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap
import java.util.*

interface ApiInterface {

    @GET("v1/{house}")
    suspend fun userList(@Path("house") type: String): List<User>

    @GET("coins")
    suspend fun coins(@QueryMap map : Map<String, String>): CoinResponse


}