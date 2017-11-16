package br.com.miguelslemos.architecture.di.injector

import br.com.miguelslemos.architecture.di.module.MainActivityModule
import br.com.miguelslemos.architecture.di.module.SplashActivityModule
import br.com.miguelslemos.architecture.di.scope.PerActivity
import br.com.miguelslemos.architecture.ui.main.MainActivity
import br.com.miguelslemos.architecture.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by miguellemos on 11/9/17.
 */

@Module
abstract class ActivityInjector {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun contributeMainActivityInjector(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(SplashActivityModule::class))
    abstract fun contributeSplashActivityInjector(): SplashActivity
}
