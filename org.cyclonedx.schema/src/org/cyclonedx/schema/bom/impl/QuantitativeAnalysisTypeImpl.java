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
import org.cyclonedx.schema.bom.GraphicsType;
import org.cyclonedx.schema.bom.PerformanceMetricsType;
import org.cyclonedx.schema.bom.QuantitativeAnalysisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantitative Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.QuantitativeAnalysisTypeImpl#getPerformanceMetrics <em>Performance Metrics</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.QuantitativeAnalysisTypeImpl#getGraphics <em>Graphics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantitativeAnalysisTypeImpl extends MinimalEObjectImpl.Container implements QuantitativeAnalysisType {
	/**
	 * The cached value of the '{@link #getPerformanceMetrics() <em>Performance Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMetrics()
	 * @generated
	 * @ordered
	 */
	protected PerformanceMetricsType performanceMetrics;

	/**
	 * The cached value of the '{@link #getGraphics() <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected GraphicsType graphics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getQuantitativeAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMetricsType getPerformanceMetrics() {
		return performanceMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceMetrics(PerformanceMetricsType newPerformanceMetrics, NotificationChain msgs) {
		PerformanceMetricsType oldPerformanceMetrics = performanceMetrics;
		performanceMetrics = newPerformanceMetrics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS, oldPerformanceMetrics, newPerformanceMetrics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceMetrics(PerformanceMetricsType newPerformanceMetrics) {
		if (newPerformanceMetrics != performanceMetrics) {
			NotificationChain msgs = null;
			if (performanceMetrics != null)
				msgs = ((InternalEObject)performanceMetrics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS, null, msgs);
			if (newPerformanceMetrics != null)
				msgs = ((InternalEObject)newPerformanceMetrics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS, null, msgs);
			msgs = basicSetPerformanceMetrics(newPerformanceMetrics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS, newPerformanceMetrics, newPerformanceMetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicsType getGraphics() {
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphics(GraphicsType newGraphics, NotificationChain msgs) {
		GraphicsType oldGraphics = graphics;
		graphics = newGraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS, oldGraphics, newGraphics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphics(GraphicsType newGraphics) {
		if (newGraphics != graphics) {
			NotificationChain msgs = null;
			if (graphics != null)
				msgs = ((InternalEObject)graphics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS, null, msgs);
			if (newGraphics != null)
				msgs = ((InternalEObject)newGraphics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS, null, msgs);
			msgs = basicSetGraphics(newGraphics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS, newGraphics, newGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS:
				return basicSetPerformanceMetrics(null, msgs);
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS:
				return basicSetGraphics(null, msgs);
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
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS:
				return getPerformanceMetrics();
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS:
				return getGraphics();
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
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS:
				setPerformanceMetrics((PerformanceMetricsType)newValue);
				return;
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS:
				setGraphics((GraphicsType)newValue);
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
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS:
				setPerformanceMetrics((PerformanceMetricsType)null);
				return;
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS:
				setGraphics((GraphicsType)null);
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
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__PERFORMANCE_METRICS:
				return performanceMetrics != null;
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE__GRAPHICS:
				return graphics != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantitativeAnalysisTypeImpl
