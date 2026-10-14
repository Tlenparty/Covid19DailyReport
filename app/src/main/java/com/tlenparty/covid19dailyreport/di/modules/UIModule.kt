package com.tlenparty.covid19dailyreport.di.modules

import com.tlenparty.covid19dailyreport.base_logic.covid_fragment.CovidFragment
import com.tlenparty.covid19dailyreport.base_logic.main.MainActivity
import com.tlenparty.covid19dailyreport.base_logic.splash.SplashActivity
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