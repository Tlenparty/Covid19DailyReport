package com.geekbrains.covid_19dailyreport.di.modules

import com.geekbrains.covid_19dailyreport.base_logic.covid_fragment.CovidFragment
import com.geekbrains.covid_19dailyreport.base_logic.main.MainActivity
import com.geekbrains.covid_19dailyreport.base_logic.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface UIModule {

    @ContributesAndroidInjector
    fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector
    fun bindCovidFragment(): CovidFragment

}