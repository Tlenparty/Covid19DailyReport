package com.geekbrains.covid_19dailyreport.helpers.scheduler

import io.reactivex.Scheduler
//Для указания потока применяется Scheduler
interface AppSchedulers {
    fun background():Scheduler
    fun main():Scheduler
}