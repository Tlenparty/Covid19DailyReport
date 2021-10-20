package com.geekbrains.covid_19dailyreport.base_logic.splash

import android.animation.Animator
import android.os.Bundle
import android.os.Handler
import android.view.animation.AccelerateDecelerateInterpolator
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geekbrains.covid_19dailyreport.R
import com.geekbrains.covid_19dailyreport.databinding.SplashActivityBinding
import com.geekbrains.covid_19dailyreport.di.BaseDaggerActivity
import com.geekbrains.covid_19dailyreport.helpers.screens.MainActivityScreen
import com.github.terrakok.cicerone.androidx.AppNavigator

class SplashActivity : BaseDaggerActivity(),SplashView {

    private val binding:SplashActivityBinding by viewBinding(createMethod = CreateMethod.INFLATE)
    private val navigator = AppNavigator(this, R.id.content)
    var handler = Handler()

   /* private val presenter by moxyPresenter {
        SplashPresenter(router)
    }
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        navigatorHolder.setNavigator(navigator)
        binding.imageViewSplash.animate().rotationBy(550f)
            .setInterpolator(AccelerateDecelerateInterpolator()).setDuration(2750)
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator?) {
                }

                override fun onAnimationEnd(animation: Animator?) {
                }

                override fun onAnimationCancel(animation: Animator?) {
                }

                override fun onAnimationRepeat(animation: Animator?) {
                }

            })
        handler.postDelayed({
            //startActivity(Intent(this, MainActivity::class.java))
            router.navigateTo(MainActivityScreen())
            finish()
        },1000)
    }

    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }


}