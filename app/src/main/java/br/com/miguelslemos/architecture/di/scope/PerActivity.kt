package br.com.miguelslemos.architecture.di.scope

import javax.inject.Scope

/**
 * Created by miguellemos on 11/13/17.
 */

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class PerActivity