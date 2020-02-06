package com.promagnoli.whichmarvel.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promagnoli.whichmarvel.R
import com.promagnoli.whichmarvel.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)

        setupConsultButton()
    }

    private fun setupConsultButton() {
        consult_button.setOnClickListener {
            presenter.consult()
        }
    }
}
