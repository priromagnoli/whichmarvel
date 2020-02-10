package com.promagnoli.whichmarvel.interactor

import com.promagnoli.whichmarvel.BuildConfig
import com.promagnoli.whichmarvel.interactor.service.MarvelService
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MarvelInteractor @Inject constructor(private val marvelService: MarvelService) {

    fun fetchCharacters(): Observable<String?> {
        return marvelService.fetchRandomCharacter(BuildConfig.API_KEY)
            .map { it.data.results.random().name }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}