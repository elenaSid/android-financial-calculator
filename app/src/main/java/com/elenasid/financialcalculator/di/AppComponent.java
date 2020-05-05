package com.elenasid.financialcalculator.di;

import android.app.Application;

import com.elenasid.financialcalculator.FinancialCalculatorApp;

import androidx.annotation.NonNull;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author elenaSid
 */
@PerApplication
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        DataModule.class,
        BuilderModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(@NonNull Application applicationContext);
        AppComponent build();
    }

    void inject(@NonNull FinancialCalculatorApp womanCalendarApp);
}
