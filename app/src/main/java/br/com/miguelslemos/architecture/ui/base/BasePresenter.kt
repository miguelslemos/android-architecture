package br.com.miguelslemos.architecture.ui.base

import br.com.miguelslemos.architecture.ui.mvp.MvpPresenter
import br.com.miguelslemos.architecture.ui.mvp.MvpView
import java.lang.ref.WeakReference

/**
 * Created by miguellemos on 11/9/17.
 */
abstract class BasePresenter<VIEW : MvpView> : MvpPresenter<VIEW> {

    private var view: WeakReference<VIEW>? = null
    private var viewAttachedAtLeastOnce = false

    override fun attachView(view: VIEW) {
        this.view = WeakReference<VIEW>(view)
        viewAttachedAtLeastOnce = true
    }

    override fun detachView() {
        view?.let {
            it.clear()
            view = null
        }
    }

    fun getView(): VIEW {
        if (!viewAttachedAtLeastOnce) {
            throw IllegalStateException("No view has ever been attached to this presenter!")
        }
        return view!!.get()!!
    }
}