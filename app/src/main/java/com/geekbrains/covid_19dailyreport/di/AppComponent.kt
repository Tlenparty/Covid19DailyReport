package com.geekbrains.covid_19dailyreport.di

import android.content.Context
import com.geekbrains.covid_19dailyreport.App
import com.geekbrains.covid_19dailyreport.di.modules.UIModule
import com.geekbrains.covid_19dailyreport.helpers.scheduler.AppSchedulers
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        UIModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        //это singleton-зависимости
        @BindsInstance
        fun withContext(context: Context): Builder

        @BindsInstance
        fun withRouter(router: Router): Builder

        @BindsInstance
        fun withNavigationHolder(navigatorHolder: NavigatorHolder): Builder

        @BindsInstance
        fun withAppScheduler(appSchedulers: AppSchedulers): Builder

        fun build(): AppComponent
    }
}