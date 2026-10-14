package com.tlenparty.covid19dailyreport.helpers.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.tlenparty.covid19dailyreport.base_logic.covid_fragment.CovidFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class CovidScreen:FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment  = CovidFragment.newInstance()
}