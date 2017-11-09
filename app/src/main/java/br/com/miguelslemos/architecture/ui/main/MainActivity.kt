package br.com.miguelslemos.architecture.ui.main

import android.util.Log
import br.com.miguelslemos.architecture.R
import br.com.miguelslemos.architecture.ui.base.BaseActivity

class MainActivity : BaseActivity<MainPresenter, MainView>(), MainView {

    override fun onRequestLayout(): Int = R.layout.activity_main

    override fun onCreate() {
        Log.d("lala", "lala")
    }


}
