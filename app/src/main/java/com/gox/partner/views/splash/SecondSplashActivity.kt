package com.gox.partner.views.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.gox.partner.BuildConfig
import com.gox.partner.R
import com.gox.partner.views.on_board.OnBoardActivity

class SecondSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_splash)

        val timer: Long = if (BuildConfig.DEBUG) 2000 else 3000
        Handler().postDelayed({

                openNewActivity(this, OnBoardActivity::class.java, true)
        }, timer)
    }
    fun openNewActivity(activity: AppCompatActivity, cls: Class<*>, finishCurrent: Boolean) {
        val intent = Intent(activity, cls)
        startActivity(intent)
        if (finishCurrent) activity.finish()
    }
}