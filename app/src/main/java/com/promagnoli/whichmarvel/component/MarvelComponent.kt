package com.promagnoli.whichmarvel.component

import com.promagnoli.whichmarvel.view.ConsultDetailsActivity
import dagger.Component

@Component(modules = [MarvelComponent::class])
interface MarvelComponent {
    fun inject(consultDetailsActivity: ConsultDetailsActivity)
}