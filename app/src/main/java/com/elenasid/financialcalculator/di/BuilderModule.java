package com.elenasid.financialcalculator.di;

import com.elenasid.financialcalculator.root.di.RootModule;
import com.elenasid.financialcalculator.root.di.RootScope;
import com.elenasid.financialcalculator.root.ui.RootActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author elenaSid
 */
@Module
public abstract class BuilderModule {

    @RootScope
    @ContributesAndroidInjector(modules = RootModule.class)
    abstract RootActivity bindRootActivity();

}
