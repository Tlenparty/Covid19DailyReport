package com.geekbrains.covid_19dailyreport.base_logic.covid_fragment

import dagger.assisted.AssistedFactory

@AssistedFactory
interface CovidPresenterFactory {
    fun create():CovidPresenter
}