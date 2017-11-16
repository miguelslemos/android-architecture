package br.com.miguelslemos.architecture.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject
import javax.inject.Provider

/**
 * Created by miguellemos on 11/9/17.
 */
abstract class BaseActivity<PRESENTER: BasePresenter<VIEW>, VIEW: BaseView> : AppCompatActivity(), BaseView {

    @Inject lateinit var presenterProvider: Provider<PRESENTER>
    lateinit var presenter: PRESENTER

    @Inject lateinit var viewProvider: Provider<VIEW>
    lateinit var view: VIEW

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        createPresenter()
        createView()
        attachPresenter(view)
        super.onCreate(savedInstanceState)
        setContentView(onRequestLayout())
        onCreate()
    }

    abstract fun onRequestLayout(): Int

    abstract fun onCreate()

    private fun createPresenter() {
        this.presenter = this.presenterProvider.get()
    }

    private fun createView() {
      this.view = this.viewProvider.get()
    }

    private fun attachPresenter(view: VIEW) = presenter.attachView(view)

    private fun detachPresenter() = presenter.detachView()

    override fun onDestroy() {
        super.onDestroy()
        detachPresenter()
    }


}