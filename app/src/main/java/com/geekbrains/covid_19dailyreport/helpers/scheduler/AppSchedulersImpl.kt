package com.geekbrains.covid_19dailyreport.helpers.scheduler

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AppSchedulersImpl : AppSchedulers {
    // для выполнения операций в произвольным новом потоке.
    override fun background(): Scheduler = Schedulers.newThread()
    // для получения обработанных дланных в UI
    override fun main(): Scheduler = AndroidSchedulers.mainThread()
}