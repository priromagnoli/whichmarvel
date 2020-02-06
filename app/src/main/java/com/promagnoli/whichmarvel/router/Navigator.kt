package com.promagnoli.whichmarvel.router

import android.content.Intent
import com.promagnoli.whichmarvel.view.ConsultDetailsActivity
import com.promagnoli.whichmarvel.view.MainActivity

fun goToConsultDetailsActivity(mainActivity: MainActivity) {
    val intent = Intent(mainActivity, ConsultDetailsActivity::class.java)
    mainActivity.startActivity(intent)
}