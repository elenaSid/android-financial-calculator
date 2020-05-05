package com.elenasid.financialcalculator.root.ui;

import android.os.Bundle;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.elenasid.financialcalculator.R;
import com.elenasid.financialcalculator.extras.moxy.MvpAppCompatActivity;
import com.elenasid.financialcalculator.root.mvp.RootPresenter;
import com.elenasid.financialcalculator.root.mvp.RootView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import dagger.android.AndroidInjection;

public class RootActivity extends MvpAppCompatActivity implements RootView {

    @Inject @InjectPresenter RootPresenter presenter;
    @ProvidePresenter RootPresenter provideRootPresenter() {
        return presenter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
