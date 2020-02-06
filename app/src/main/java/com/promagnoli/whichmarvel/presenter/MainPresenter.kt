package com.promagnoli.whichmarvel.presenter

import com.promagnoli.whichmarvel.router.goToConsultDetailsActivity
import com.promagnoli.whichmarvel.view.MainActivity

class MainPresenter(private val mainActivity: MainActivity) {

    fun consult() {
        goToConsultDetailsActivity(mainActivity)
    }

}