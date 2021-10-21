package com.geekbrains.covid_19dailyreport.base_logic.covid_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geekbrains.covid_19dailyreport.base_logic.BaseDaggerFragment
import com.geekbrains.covid_19dailyreport.databinding.CovidFragmentBinding
import com.geekbrains.covid_19dailyreport.databinding.MainActivityBinding
import moxy.ktx.moxyPresenter
import javax.inject.Inject

class CovidFragment : BaseDaggerFragment(), CovidView {

    @Inject
    lateinit var covidPresenterFactory: CovidPresenterFactory

    private val presenter by moxyPresenter { covidPresenterFactory.create() }
    private var visibleSubmenu = false

    private val binding: CovidFragmentBinding by viewBinding(createMethod = CreateMethod.INFLATE)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    companion object {
        fun newInstance() = CovidFragment()
    }

    //проинициализировать view
    override fun init() {
    }

}