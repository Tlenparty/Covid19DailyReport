package com.geekbrains.covid_19dailyreport.base_logic.covid_fragment

import com.geekbrains.covid_19dailyreport.base_logic.BasePresenter
import com.github.terrakok.cicerone.Router
import dagger.assisted.AssistedInject

class CovidPresenter @AssistedInject constructor(router: Router) :
    BasePresenter<CovidView>(router) {

    override fun attachView(view: CovidView?) {
        super.attachView(view)
        viewState.init()
    }
}