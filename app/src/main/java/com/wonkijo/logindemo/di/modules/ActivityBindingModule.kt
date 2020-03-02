package com.wonkijo.logindemo.di.modules

import com.wonkijo.logindemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [])
    abstract fun bindLoginActivity(): MainActivity
}