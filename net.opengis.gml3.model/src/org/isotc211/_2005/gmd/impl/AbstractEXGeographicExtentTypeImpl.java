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

import org.isotc211._2005.gco.BooleanPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.AbstractEXGeographicExtentType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract EX Geographic Extent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.AbstractEXGeographicExtentTypeImpl#getExtentTypeCode <em>Extent Type Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractEXGeographicExtentTypeImpl extends AbstractObjectTypeImpl implements AbstractEXGeographicExtentType {
	/**
	 * The cached value of the '{@link #getExtentTypeCode() <em>Extent Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentTypeCode()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType extentTypeCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEXGeographicExtentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getAbstractEXGeographicExtentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getExtentTypeCode() {
		return extentTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtentTypeCode(BooleanPropertyType newExtentTypeCode, NotificationChain msgs) {
		BooleanPropertyType oldExtentTypeCode = extentTypeCode;
		extentTypeCode = newExtentTypeCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE, oldExtentTypeCode, newExtentTypeCode);
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
	public void setExtentTypeCode(BooleanPropertyType newExtentTypeCode) {
		if (newExtentTypeCode != extentTypeCode) {
			NotificationChain msgs = null;
			if (extentTypeCode != null)
				msgs = ((InternalEObject)extentTypeCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE, null, msgs);
			if (newExtentTypeCode != null)
				msgs = ((InternalEObject)newExtentTypeCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE, null, msgs);
			msgs = basicSetExtentTypeCode(newExtentTypeCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE, newExtentTypeCode, newExtentTypeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE:
				return basicSetExtentTypeCode(null, msgs);
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
			case GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE:
				return getExtentTypeCode();
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
			case GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE:
				setExtentTypeCode((BooleanPropertyType)newValue);
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
			case GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE:
				setExtentTypeCode((BooleanPropertyType)null);
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
			case GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE__EXTENT_TYPE_CODE:
				return extentTypeCode != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractEXGeographicExtentTypeImpl
