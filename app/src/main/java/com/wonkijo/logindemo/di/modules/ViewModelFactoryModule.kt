package com.wonkijo.logindemo.di.modules

import androidx.lifecycle.ViewModelProvider
import com.wonkijo.logindemo.di.common_vm.CommonViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: CommonViewModelFactory): ViewModelProvider.Factory
}