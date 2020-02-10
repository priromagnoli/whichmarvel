package com.promagnoli.whichmarvel.interactor.service

import com.promagnoli.whichmarvel.entity.Base
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface MarvelService {

    @GET("characters?{apiKey}")
    fun fetchRandomCharacter(@Path("apiKey") quantity : String) : Observable<Base>
}
