package com.elenasid.financialcalculator.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author elenaSid
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApplication {}
