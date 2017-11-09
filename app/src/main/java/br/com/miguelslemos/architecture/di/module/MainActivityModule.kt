package br.com.miguelslemos.architecture.di.module

import br.com.miguelslemos.architecture.ui.main.MainActivity
import br.com.miguelslemos.architecture.ui.main.MainView
import dagger.Module
import dagger.Provides

/**
 * Created by miguellemos on 11/9/17.
 */
@Module
class MainActivityModule {

    @Provides
    internal fun provideMainView(mainActivity: MainActivity): MainView = mainActivity
}
