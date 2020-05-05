package com.elenasid.financialcalculator.root.mvp;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

/**
 * @author elenaSid
 */
@StateStrategyType(AddToEndSingleStrategy.class)
public interface RootView extends MvpView {
}
