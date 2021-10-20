package com.geekbrains.covid_19dailyreport

import com.geekbrains.covid_19dailyreport.di.DaggerAppComponent
import com.geekbrains.covid_19dailyreport.helpers.scheduler.AppSchedulersImpl
import com.github.terrakok.cicerone.Cicerone
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<App> =
        DaggerAppComponent.builder()
            .apply {
                withContext(applicationContext)
                val cicerone = Cicerone.create()
                withNavigationHolder(cicerone.getNavigatorHolder())
                withRouter(cicerone.router)
                withAppScheduler(AppSchedulersImpl())
            }
            .build()
}