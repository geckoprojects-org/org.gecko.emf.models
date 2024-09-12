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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.MeasurePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDDimensionNameTypeCodePropertyType;
import org.isotc211._2005.gmd.MDDimensionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDimensionTypeImpl#getDimensionName <em>Dimension Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDimensionTypeImpl#getDimensionSize <em>Dimension Size</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDimensionTypeImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDDimensionTypeImpl extends AbstractObjectTypeImpl implements MDDimensionType {
	/**
	 * The cached value of the '{@link #getDimensionName() <em>Dimension Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionName()
	 * @generated
	 * @ordered
	 */
	protected MDDimensionNameTypeCodePropertyType dimensionName;

	/**
	 * The cached value of the '{@link #getDimensionSize() <em>Dimension Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionSize()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType dimensionSize;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected MeasurePropertyType resolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDDimensionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDDimensionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDimensionNameTypeCodePropertyType getDimensionName() {
		return dimensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionName(MDDimensionNameTypeCodePropertyType newDimensionName, NotificationChain msgs) {
		MDDimensionNameTypeCodePropertyType oldDimensionName = dimensionName;
		dimensionName = newDimensionName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME, oldDimensionName, newDimensionName);
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
	public void setDimensionName(MDDimensionNameTypeCodePropertyType newDimensionName) {
		if (newDimensionName != dimensionName) {
			NotificationChain msgs = null;
			if (dimensionName != null)
				msgs = ((InternalEObject)dimensionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME, null, msgs);
			if (newDimensionName != null)
				msgs = ((InternalEObject)newDimensionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME, null, msgs);
			msgs = basicSetDimensionName(newDimensionName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME, newDimensionName, newDimensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getDimensionSize() {
		return dimensionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionSize(IntegerPropertyType newDimensionSize, NotificationChain msgs) {
		IntegerPropertyType oldDimensionSize = dimensionSize;
		dimensionSize = newDimensionSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE, oldDimensionSize, newDimensionSize);
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
	public void setDimensionSize(IntegerPropertyType newDimensionSize) {
		if (newDimensionSize != dimensionSize) {
			NotificationChain msgs = null;
			if (dimensionSize != null)
				msgs = ((InternalEObject)dimensionSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE, null, msgs);
			if (newDimensionSize != null)
				msgs = ((InternalEObject)newDimensionSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE, null, msgs);
			msgs = basicSetDimensionSize(newDimensionSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE, newDimensionSize, newDimensionSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurePropertyType getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolution(MeasurePropertyType newResolution, NotificationChain msgs) {
		MeasurePropertyType oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIMENSION_TYPE__RESOLUTION, oldResolution, newResolution);
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
	public void setResolution(MeasurePropertyType newResolution) {
		if (newResolution != resolution) {
			NotificationChain msgs = null;
			if (resolution != null)
				msgs = ((InternalEObject)resolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIMENSION_TYPE__RESOLUTION, null, msgs);
			if (newResolution != null)
				msgs = ((InternalEObject)newResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DIMENSION_TYPE__RESOLUTION, null, msgs);
			msgs = basicSetResolution(newResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DIMENSION_TYPE__RESOLUTION, newResolution, newResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME:
				return basicSetDimensionName(null, msgs);
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE:
				return basicSetDimensionSize(null, msgs);
			case GMDPackage.MD_DIMENSION_TYPE__RESOLUTION:
				return basicSetResolution(null, msgs);
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
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME:
				return getDimensionName();
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE:
				return getDimensionSize();
			case GMDPackage.MD_DIMENSION_TYPE__RESOLUTION:
				return getResolution();
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
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME:
				setDimensionName((MDDimensionNameTypeCodePropertyType)newValue);
				return;
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE:
				setDimensionSize((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_DIMENSION_TYPE__RESOLUTION:
				setResolution((MeasurePropertyType)newValue);
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
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME:
				setDimensionName((MDDimensionNameTypeCodePropertyType)null);
				return;
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE:
				setDimensionSize((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_DIMENSION_TYPE__RESOLUTION:
				setResolution((MeasurePropertyType)null);
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
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_NAME:
				return dimensionName != null;
			case GMDPackage.MD_DIMENSION_TYPE__DIMENSION_SIZE:
				return dimensionSize != null;
			case GMDPackage.MD_DIMENSION_TYPE__RESOLUTION:
				return resolution != null;
		}
		return super.eIsSet(featureID);
	}

} //MDDimensionTypeImpl
