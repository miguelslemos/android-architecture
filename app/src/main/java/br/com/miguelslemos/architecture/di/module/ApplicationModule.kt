package br.com.miguelslemos.architecture.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Borja on 21/12/16.
 */
@Module
class ApplicationModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application
}
