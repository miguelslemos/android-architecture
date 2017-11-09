package br.com.miguelslemos.architecture.di.module

import br.com.miguelslemos.architecture.ui.splash.SplashActivity
import br.com.miguelslemos.architecture.ui.splash.SplashView
import dagger.Module
import dagger.Provides

/**
 * Created by miguellemos on 11/9/17.
 */
@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashView(splashActivity: SplashActivity): SplashView = splashActivity
}