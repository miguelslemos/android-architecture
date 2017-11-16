package br.com.miguelslemos.architecture.ui.mvp

import android.support.annotation.UiThread

/**
 * Created by miguellemos on 11/13/17.
 */
interface MvpPresenter<VIEW : MvpView> {
    /**
     * Set or attach the view to this presenter
     */
    @UiThread
    fun attachView(view: VIEW)

    /**
     * Will be called if the view has been destroyed. Typically this method will be invoked from
     * `Activity.detachView()` or `Fragment.onDestroyView()`
     */
    @UiThread
    fun detachView()
}