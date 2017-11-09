package br.com.miguelslemos.architecture.ui.splash

import android.content.Intent
import android.util.Log
import br.com.miguelslemos.architecture.R
import br.com.miguelslemos.architecture.ui.base.BaseActivity
import br.com.miguelslemos.architecture.ui.main.MainActivity

/**
 * Created by miguellemos on 11/9/17.
 */
class SplashActivity : BaseActivity<SplashPresenter, SplashView>(), SplashView {

    override fun onRequestLayout(): Int = R.layout.activity_splash

    override fun onCreate() {
        Log.d("lala", "lala")
        startActivity(Intent(this, MainActivity::class.java))
    }
}