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
package net.opengis.ogc.features.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.ogc.features.Begin;
import net.opengis.ogc.features.OGCFeaturesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Begin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.impl.BeginImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.BeginImpl#isInclusive <em>Inclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeginImpl extends MinimalEObjectImpl.Container implements Begin {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInclusive() <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInclusive() <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean inclusive = INCLUSIVE_EDEFAULT;

	/**
	 * This is true if the Inclusive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inclusiveESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCFeaturesPackage.Literals.BEGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(XMLGregorianCalendar newValue) {
		XMLGregorianCalendar oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.BEGIN__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInclusive() {
		return inclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclusive(boolean newInclusive) {
		boolean oldInclusive = inclusive;
		inclusive = newInclusive;
		boolean oldInclusiveESet = inclusiveESet;
		inclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCFeaturesPackage.BEGIN__INCLUSIVE, oldInclusive, inclusive, !oldInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInclusive() {
		boolean oldInclusive = inclusive;
		boolean oldInclusiveESet = inclusiveESet;
		inclusive = INCLUSIVE_EDEFAULT;
		inclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OGCFeaturesPackage.BEGIN__INCLUSIVE, oldInclusive, INCLUSIVE_EDEFAULT, oldInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInclusive() {
		return inclusiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OGCFeaturesPackage.BEGIN__VALUE:
				return getValue();
			case OGCFeaturesPackage.BEGIN__INCLUSIVE:
				return isInclusive();
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
			case OGCFeaturesPackage.BEGIN__VALUE:
				setValue((XMLGregorianCalendar)newValue);
				return;
			case OGCFeaturesPackage.BEGIN__INCLUSIVE:
				setInclusive((Boolean)newValue);
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
			case OGCFeaturesPackage.BEGIN__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case OGCFeaturesPackage.BEGIN__INCLUSIVE:
				unsetInclusive();
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
			case OGCFeaturesPackage.BEGIN__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case OGCFeaturesPackage.BEGIN__INCLUSIVE:
				return isSetInclusive();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", inclusive: ");
		if (inclusiveESet) result.append(inclusive); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BeginImpl
