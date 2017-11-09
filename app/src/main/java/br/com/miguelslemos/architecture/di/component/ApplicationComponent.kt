package br.com.miguelslemos.architecture.di.component

import android.app.Application
import br.com.miguelslemos.architecture.App
import br.com.miguelslemos.architecture.di.module.ApplicationModule
import br.com.miguelslemos.architecture.di.injector.ActivityInjector
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by Borja on 21/12/16.
 */
@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        AndroidInjectionModule::class,
        ActivityInjector::class))
interface ApplicationComponent {

    fun inject(application: App)

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }
}
