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
import org.cyclonedx.schema.bom.ConfidenceIntervalType;
import org.cyclonedx.schema.bom.PerformanceMetricType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Metric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PerformanceMetricTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PerformanceMetricTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PerformanceMetricTypeImpl#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PerformanceMetricTypeImpl#getConfidenceInterval <em>Confidence Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceMetricTypeImpl extends MinimalEObjectImpl.Container implements PerformanceMetricType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlice() <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlice()
	 * @generated
	 * @ordered
	 */
	protected static final String SLICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlice() <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlice()
	 * @generated
	 * @ordered
	 */
	protected String slice = SLICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfidenceInterval() <em>Confidence Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceInterval()
	 * @generated
	 * @ordered
	 */
	protected ConfidenceIntervalType confidenceInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceMetricTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getPerformanceMetricType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PERFORMANCE_METRIC_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PERFORMANCE_METRIC_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSlice() {
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlice(String newSlice) {
		String oldSlice = slice;
		slice = newSlice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PERFORMANCE_METRIC_TYPE__SLICE, oldSlice, slice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceIntervalType getConfidenceInterval() {
		return confidenceInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidenceInterval(ConfidenceIntervalType newConfidenceInterval, NotificationChain msgs) {
		ConfidenceIntervalType oldConfidenceInterval = confidenceInterval;
		confidenceInterval = newConfidenceInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL, oldConfidenceInterval, newConfidenceInterval);
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
	public void setConfidenceInterval(ConfidenceIntervalType newConfidenceInterval) {
		if (newConfidenceInterval != confidenceInterval) {
			NotificationChain msgs = null;
			if (confidenceInterval != null)
				msgs = ((InternalEObject)confidenceInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL, null, msgs);
			if (newConfidenceInterval != null)
				msgs = ((InternalEObject)newConfidenceInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL, null, msgs);
			msgs = basicSetConfidenceInterval(newConfidenceInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL, newConfidenceInterval, newConfidenceInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL:
				return basicSetConfidenceInterval(null, msgs);
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
			case BOMPackage.PERFORMANCE_METRIC_TYPE__TYPE:
				return getType();
			case BOMPackage.PERFORMANCE_METRIC_TYPE__VALUE:
				return getValue();
			case BOMPackage.PERFORMANCE_METRIC_TYPE__SLICE:
				return getSlice();
			case BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL:
				return getConfidenceInterval();
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
			case BOMPackage.PERFORMANCE_METRIC_TYPE__TYPE:
				setType((String)newValue);
				return;
			case BOMPackage.PERFORMANCE_METRIC_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case BOMPackage.PERFORMANCE_METRIC_TYPE__SLICE:
				setSlice((String)newValue);
				return;
			case BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL:
				setConfidenceInterval((ConfidenceIntervalType)newValue);
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
			case BOMPackage.PERFORMANCE_METRIC_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BOMPackage.PERFORMANCE_METRIC_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BOMPackage.PERFORMANCE_METRIC_TYPE__SLICE:
				setSlice(SLICE_EDEFAULT);
				return;
			case BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL:
				setConfidenceInterval((ConfidenceIntervalType)null);
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
			case BOMPackage.PERFORMANCE_METRIC_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BOMPackage.PERFORMANCE_METRIC_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BOMPackage.PERFORMANCE_METRIC_TYPE__SLICE:
				return SLICE_EDEFAULT == null ? slice != null : !SLICE_EDEFAULT.equals(slice);
			case BOMPackage.PERFORMANCE_METRIC_TYPE__CONFIDENCE_INTERVAL:
				return confidenceInterval != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", slice: ");
		result.append(slice);
		result.append(')');
		return result.toString();
	}

} //PerformanceMetricTypeImpl
