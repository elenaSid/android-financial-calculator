package com.elenasid.financialcalculator;

import android.app.Application;

import com.elenasid.financialcalculator.di.AppInjector;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

/**
 * @author elena
 * Date: 05.05.2020
 * Time: 12:15
 */
public class FinancialCalculatorApp extends Application implements HasAndroidInjector {
    @Inject DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        AppInjector.init(this);
        AppInjector.get().getAppComponent().inject(this);
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }
}
