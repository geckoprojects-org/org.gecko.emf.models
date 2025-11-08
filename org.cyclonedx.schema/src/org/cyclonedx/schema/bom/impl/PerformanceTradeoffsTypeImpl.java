/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.PerformanceTradeoffsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Tradeoffs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PerformanceTradeoffsTypeImpl#getPerformanceTradeoff <em>Performance Tradeoff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceTradeoffsTypeImpl extends MinimalEObjectImpl.Container implements PerformanceTradeoffsType {
	/**
	 * The default value of the '{@link #getPerformanceTradeoff() <em>Performance Tradeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceTradeoff()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMANCE_TRADEOFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformanceTradeoff() <em>Performance Tradeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceTradeoff()
	 * @generated
	 * @ordered
	 */
	protected String performanceTradeoff = PERFORMANCE_TRADEOFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceTradeoffsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getPerformanceTradeoffsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformanceTradeoff() {
		return performanceTradeoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceTradeoff(String newPerformanceTradeoff) {
		String oldPerformanceTradeoff = performanceTradeoff;
		performanceTradeoff = newPerformanceTradeoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PERFORMANCE_TRADEOFFS_TYPE__PERFORMANCE_TRADEOFF, oldPerformanceTradeoff, performanceTradeoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE__PERFORMANCE_TRADEOFF:
				return getPerformanceTradeoff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE__PERFORMANCE_TRADEOFF:
				setPerformanceTradeoff((String)newValue);
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
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE__PERFORMANCE_TRADEOFF:
				setPerformanceTradeoff(PERFORMANCE_TRADEOFF_EDEFAULT);
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
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE__PERFORMANCE_TRADEOFF:
				return PERFORMANCE_TRADEOFF_EDEFAULT == null ? performanceTradeoff != null : !PERFORMANCE_TRADEOFF_EDEFAULT.equals(performanceTradeoff);
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
		result.append(" (performanceTradeoff: ");
		result.append(performanceTradeoff);
		result.append(')');
		return result.toString();
	}

} //PerformanceTradeoffsTypeImpl
