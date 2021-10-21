package com.geekbrains.covid_19dailyreport.base_logic.main

import android.os.Bundle
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geekbrains.covid_19dailyreport.R
import com.geekbrains.covid_19dailyreport.base_logic.listeners.BackButtonListener
import com.geekbrains.covid_19dailyreport.databinding.MainActivityBinding
import com.geekbrains.covid_19dailyreport.di.BaseDaggerActivity
import com.geekbrains.covid_19dailyreport.helpers.screens.CovidScreen
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import moxy.MvpView
import moxy.ktx.moxyPresenter
import javax.inject.Inject

class MainActivity : BaseDaggerActivity(), MvpView {

 /*   @Inject
    lateinit var mainPresenterFactory: MainPresenterFactory*/

    private val navigator = AppNavigator(this, android.R.id.content)
    private val binding: MainActivityBinding by viewBinding(createMethod = CreateMethod.INFLATE)
   // private val presenter by moxyPresenter { mainPresenterFactory.create() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState ?: router.newRootScreen(CovidScreen())
        setContentView(binding.root)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

    override fun onBackPressed() {
        supportFragmentManager.fragments.forEach {
            if (it is BackButtonListener && (it as BackButtonListener).backPressed()) {
                return
            }
        }
        super.onBackPressed()
    }
}