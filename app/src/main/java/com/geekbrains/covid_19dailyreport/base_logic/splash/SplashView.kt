package com.geekbrains.covid_19dailyreport.base_logic.splash

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
// StateStrategyType - добавит пришедшую команду в конец очереди команд
@StateStrategyType(AddToEndSingleStrategy::class)
interface SplashView:MvpView
