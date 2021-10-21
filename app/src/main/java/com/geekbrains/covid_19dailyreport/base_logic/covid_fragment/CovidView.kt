package com.geekbrains.covid_19dailyreport.base_logic.covid_fragment

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface CovidView:MvpView {
    //проинициализировать view
    fun init()
}