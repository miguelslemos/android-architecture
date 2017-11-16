package br.com.miguelslemos.architecture.ui.main

import android.util.Log
import br.com.miguelslemos.architecture.ui.base.BasePresenter
import javax.inject.Inject

/**
 * Created by miguellemos on 11/9/17.
 */
class MainPresenter
@Inject
constructor() : BasePresenter<MainView>() {

    fun lala() {
        Log.d("lala", " fun lala() {" )
        getView().teucu()

    }
}