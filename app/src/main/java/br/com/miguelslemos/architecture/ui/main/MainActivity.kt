package br.com.miguelslemos.architecture.ui.main

import android.content.Context
import android.content.Intent
import android.util.Log
import br.com.miguelslemos.architecture.R
import br.com.miguelslemos.architecture.ui.base.BaseActivity

class MainActivity : BaseActivity<MainPresenter, MainView>(), MainView {

    companion object {
        fun newIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onRequestLayout(): Int = R.layout.activity_main

    override fun onCreate() {
        Log.d("lala", "override fun onCreate() MainActivity {" )
       presenter.lala()
    }

    override fun teucu() {
        Log.d("lala", "    override fun teucu() {" )
    }

}
