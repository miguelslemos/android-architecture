package br.com.miguelslemos.architecture.ui.splash

import br.com.miguelslemos.architecture.R
import br.com.miguelslemos.architecture.ui.base.BaseActivity
import br.com.miguelslemos.architecture.ui.main.MainActivity

/**
 * Created by miguellemos on 11/9/17.
 */
class SplashActivity : BaseActivity<SplashPresenter, SplashView>(), SplashView {

    override fun onRequestLayout(): Int = R.layout.activity_splash

    override fun onCreate() {
        presenter.lala()
    }

    override fun teucu() {
        startActivity(MainActivity.newIntent(this))
    }

}