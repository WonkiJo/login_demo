package com.wonkijo.logindemo.di

import android.content.Context
import com.wonkijo.logindemo.MyApplication
import com.wonkijo.logindemo.di.modules.ActivityBindingModule
import com.wonkijo.logindemo.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

// todo : network module, data module

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBindingModule::class, AppModule::class])
interface MyComponent: AndroidInjector<MyApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): MyComponent
    }
}
