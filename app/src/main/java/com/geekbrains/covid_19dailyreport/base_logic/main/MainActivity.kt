package com.geekbrains.covid_19dailyreport.base_logic.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geekbrains.covid_19dailyreport.R
import com.geekbrains.covid_19dailyreport.di.BaseDaggerActivity

class MainActivity : BaseDaggerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}