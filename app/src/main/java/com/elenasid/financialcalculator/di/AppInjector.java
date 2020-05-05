package com.elenasid.financialcalculator.di;

import android.app.Application;

import androidx.annotation.NonNull;

/**
 * Класс-хэлпер для внедрения зависимостей
 *
 * @author elenaSid
 */
public class AppInjector {

    private static AppInjector sAppInjector;
    private AppComponent appComponent;

    private AppInjector(@NonNull Application applicationContext) {
        appComponent = buildAppComponent(applicationContext);
    }

    public static void init(@NonNull Application applicationContext) {
        sAppInjector = new AppInjector(applicationContext);
    }

    /**
     * Получает экземпляр {@link AppInjector}
     *
     * @return {@link AppInjector}
     */
    @NonNull
    public static AppInjector get() {
        if (sAppInjector == null) {
            throw new IllegalStateException("Injector not initialized");
        }

        return sAppInjector;
    }

    /**
     * Инициализирует {@link AppComponent}
     *
     * @param applicationContext {@link Application}
     * @return {@link AppComponent}
     */
    @NonNull
    private AppComponent buildAppComponent(@NonNull Application applicationContext) {
        return DaggerAppComponent.builder().context(applicationContext).build();
    }

    /**
     * Получает {@link AppComponent}
     *
     * @return {@link AppComponent}
     */
    @NonNull
    public AppComponent getAppComponent() {
        if (appComponent == null) {
            throw new IllegalStateException("AppComponent not initialized");
        }
        return appComponent;
    }
}
