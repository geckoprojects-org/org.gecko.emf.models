/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.dwd.cdc.forecast.pointforecast.impl;

import de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType;
import de.dwd.cdc.forecast.pointforecast.PointforecastPackage;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forecast Time Steps Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.ForecastTimeStepsTypeImpl#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForecastTimeStepsTypeImpl extends MinimalEObjectImpl.Container implements ForecastTimeStepsType {
	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected EList<XMLGregorianCalendar> timeStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForecastTimeStepsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PointforecastPackage.Literals.FORECAST_TIME_STEPS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XMLGregorianCalendar> getTimeStep() {
		if (timeStep == null) {
			timeStep = new EDataTypeEList<XMLGregorianCalendar>(XMLGregorianCalendar.class, this, PointforecastPackage.FORECAST_TIME_STEPS_TYPE__TIME_STEP);
		}
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PointforecastPackage.FORECAST_TIME_STEPS_TYPE__TIME_STEP:
				return getTimeStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PointforecastPackage.FORECAST_TIME_STEPS_TYPE__TIME_STEP:
				getTimeStep().clear();
				getTimeStep().addAll((Collection<? extends XMLGregorianCalendar>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PointforecastPackage.FORECAST_TIME_STEPS_TYPE__TIME_STEP:
				getTimeStep().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PointforecastPackage.FORECAST_TIME_STEPS_TYPE__TIME_STEP:
				return timeStep != null && !timeStep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timeStep: ");
		result.append(timeStep);
		result.append(')');
		return result.toString();
	}

} //ForecastTimeStepsTypeImpl
