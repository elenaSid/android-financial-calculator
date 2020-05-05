package com.elenasid.financialcalculator.root.di;

import com.elenasid.financialcalculator.root.mvp.RootPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author elenaSid
 */
@Module
public class RootModule {

    @Provides
    @RootScope
    RootPresenter provideRootPresenter() {
        return new RootPresenter();
    }
}
