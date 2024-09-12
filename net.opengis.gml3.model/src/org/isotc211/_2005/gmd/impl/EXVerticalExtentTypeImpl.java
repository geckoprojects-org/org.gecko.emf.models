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

import org.isotc211._2005.gco.RealPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.EXVerticalExtentType;
import org.isotc211._2005.gmd.GMDPackage;

import org.isotc211._2005.gsr.SCCRSPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Vertical Extent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXVerticalExtentTypeImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXVerticalExtentTypeImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXVerticalExtentTypeImpl#getVerticalCRS <em>Vertical CRS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXVerticalExtentTypeImpl extends AbstractObjectTypeImpl implements EXVerticalExtentType {
	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType minimumValue;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected RealPropertyType maximumValue;

	/**
	 * The cached value of the '{@link #getVerticalCRS() <em>Vertical CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalCRS()
	 * @generated
	 * @ordered
	 */
	protected SCCRSPropertyType verticalCRS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXVerticalExtentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getEXVerticalExtentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumValue(RealPropertyType newMinimumValue, NotificationChain msgs) {
		RealPropertyType oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE, oldMinimumValue, newMinimumValue);
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
	public void setMinimumValue(RealPropertyType newMinimumValue) {
		if (newMinimumValue != minimumValue) {
			NotificationChain msgs = null;
			if (minimumValue != null)
				msgs = ((InternalEObject)minimumValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE, null, msgs);
			if (newMinimumValue != null)
				msgs = ((InternalEObject)newMinimumValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE, null, msgs);
			msgs = basicSetMinimumValue(newMinimumValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE, newMinimumValue, newMinimumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximumValue(RealPropertyType newMaximumValue, NotificationChain msgs) {
		RealPropertyType oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE, oldMaximumValue, newMaximumValue);
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
	public void setMaximumValue(RealPropertyType newMaximumValue) {
		if (newMaximumValue != maximumValue) {
			NotificationChain msgs = null;
			if (maximumValue != null)
				msgs = ((InternalEObject)maximumValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE, null, msgs);
			if (newMaximumValue != null)
				msgs = ((InternalEObject)newMaximumValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE, null, msgs);
			msgs = basicSetMaximumValue(newMaximumValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE, newMaximumValue, newMaximumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCCRSPropertyType getVerticalCRS() {
		return verticalCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCRS(SCCRSPropertyType newVerticalCRS, NotificationChain msgs) {
		SCCRSPropertyType oldVerticalCRS = verticalCRS;
		verticalCRS = newVerticalCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS, oldVerticalCRS, newVerticalCRS);
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
	public void setVerticalCRS(SCCRSPropertyType newVerticalCRS) {
		if (newVerticalCRS != verticalCRS) {
			NotificationChain msgs = null;
			if (verticalCRS != null)
				msgs = ((InternalEObject)verticalCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS, null, msgs);
			if (newVerticalCRS != null)
				msgs = ((InternalEObject)newVerticalCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS, null, msgs);
			msgs = basicSetVerticalCRS(newVerticalCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS, newVerticalCRS, newVerticalCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE:
				return basicSetMinimumValue(null, msgs);
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE:
				return basicSetMaximumValue(null, msgs);
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS:
				return basicSetVerticalCRS(null, msgs);
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
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE:
				return getMinimumValue();
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE:
				return getMaximumValue();
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS:
				return getVerticalCRS();
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
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE:
				setMinimumValue((RealPropertyType)newValue);
				return;
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE:
				setMaximumValue((RealPropertyType)newValue);
				return;
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS:
				setVerticalCRS((SCCRSPropertyType)newValue);
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
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE:
				setMinimumValue((RealPropertyType)null);
				return;
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE:
				setMaximumValue((RealPropertyType)null);
				return;
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS:
				setVerticalCRS((SCCRSPropertyType)null);
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
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MINIMUM_VALUE:
				return minimumValue != null;
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__MAXIMUM_VALUE:
				return maximumValue != null;
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE__VERTICAL_CRS:
				return verticalCRS != null;
		}
		return super.eIsSet(featureID);
	}

} //EXVerticalExtentTypeImpl
