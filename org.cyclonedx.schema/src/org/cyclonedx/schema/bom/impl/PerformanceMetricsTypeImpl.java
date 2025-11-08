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

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.PerformanceMetricType;
import org.cyclonedx.schema.bom.PerformanceMetricsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Metrics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PerformanceMetricsTypeImpl#getPerformanceMetric <em>Performance Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceMetricsTypeImpl extends MinimalEObjectImpl.Container implements PerformanceMetricsType {
	/**
	 * The cached value of the '{@link #getPerformanceMetric() <em>Performance Metric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceMetricType> performanceMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceMetricsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getPerformanceMetricsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PerformanceMetricType> getPerformanceMetric() {
		if (performanceMetric == null) {
			performanceMetric = new EObjectContainmentEList<PerformanceMetricType>(PerformanceMetricType.class, this, BOMPackage.PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC);
		}
		return performanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC:
				return ((InternalEList<?>)getPerformanceMetric()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC:
				return getPerformanceMetric();
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
			case BOMPackage.PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC:
				getPerformanceMetric().clear();
				getPerformanceMetric().addAll((Collection<? extends PerformanceMetricType>)newValue);
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
			case BOMPackage.PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC:
				getPerformanceMetric().clear();
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
			case BOMPackage.PERFORMANCE_METRICS_TYPE__PERFORMANCE_METRIC:
				return performanceMetric != null && !performanceMetric.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerformanceMetricsTypeImpl
