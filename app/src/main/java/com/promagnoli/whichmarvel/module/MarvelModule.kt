package com.promagnoli.whichmarvel.module

import com.promagnoli.whichmarvel.view.ConsultDetailsActivity
import dagger.Module
import dagger.Provides

@Module
class MarvelModule(private val consultDetailsActivity: ConsultDetailsActivity) {

    @Provides
    fun providesConsultDetailsActivity(): ConsultDetailsActivity = consultDetailsActivity
}
