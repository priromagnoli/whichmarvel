package com.promagnoli.whichmarvel.module

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val MARVEL_URL: String = "https://gateway.marvel.com:443/v1/public"

@Module
class ServiceModule {

    @Provides
    fun providesMarvelService(): MarvelModule = Retrofit.Builder()
        .baseUrl(MARVEL_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(MarvelModule::class.java)
}