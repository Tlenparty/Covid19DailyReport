package com.geekbrains.covid_19dailyreport.helpers.screens

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.geekbrains.covid_19dailyreport.base_logic.main.MainActivity
import com.github.terrakok.cicerone.androidx.ActivityScreen

class MainActivityScreen:ActivityScreen {
    override fun createIntent(context: Context): Intent = Intent(context,MainActivity::class.java)
}