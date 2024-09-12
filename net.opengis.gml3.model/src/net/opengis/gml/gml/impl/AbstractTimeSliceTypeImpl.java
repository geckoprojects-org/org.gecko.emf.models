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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.AbstractTimeSliceType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.StringOrRefType;
import net.opengis.gml.gml.TimePrimitivePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Time Slice Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractTimeSliceTypeImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractTimeSliceTypeImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTimeSliceTypeImpl extends AbstractGMLTypeImpl implements AbstractTimeSliceType {
	/**
	 * The cached value of the '{@link #getValidTime() <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected TimePrimitivePropertyType validTime;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType dataSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTimeSliceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractTimeSliceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePrimitivePropertyType getValidTime() {
		return validTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTime(TimePrimitivePropertyType newValidTime, NotificationChain msgs) {
		TimePrimitivePropertyType oldValidTime = validTime;
		validTime = newValidTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME, oldValidTime, newValidTime);
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
	public void setValidTime(TimePrimitivePropertyType newValidTime) {
		if (newValidTime != validTime) {
			NotificationChain msgs = null;
			if (validTime != null)
				msgs = ((InternalEObject)validTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME, null, msgs);
			if (newValidTime != null)
				msgs = ((InternalEObject)newValidTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME, null, msgs);
			msgs = basicSetValidTime(newValidTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME, newValidTime, newValidTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(StringOrRefType newDataSource, NotificationChain msgs) {
		StringOrRefType oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE, oldDataSource, newDataSource);
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
	public void setDataSource(StringOrRefType newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME:
				return basicSetValidTime(null, msgs);
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
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
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME:
				return getValidTime();
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE:
				return getDataSource();
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
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)newValue);
				return;
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE:
				setDataSource((StringOrRefType)newValue);
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
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)null);
				return;
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE:
				setDataSource((StringOrRefType)null);
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
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__VALID_TIME:
				return validTime != null;
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE__DATA_SOURCE:
				return dataSource != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTimeSliceTypeImpl
