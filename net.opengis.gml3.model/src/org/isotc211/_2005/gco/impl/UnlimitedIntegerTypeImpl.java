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
package org.isotc211._2005.gco.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211._2005.gco.GCOPackage;
import org.isotc211._2005.gco.UnlimitedIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unlimited Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.UnlimitedIntegerTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.UnlimitedIntegerTypeImpl#isIsInfinite <em>Is Infinite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnlimitedIntegerTypeImpl extends MinimalEObjectImpl.Container implements UnlimitedIntegerType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInfinite() <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInfinite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INFINITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInfinite() <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInfinite()
	 * @generated
	 * @ordered
	 */
	protected boolean isInfinite = IS_INFINITE_EDEFAULT;

	/**
	 * This is true if the Is Infinite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInfiniteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnlimitedIntegerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.UNLIMITED_INTEGER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(BigInteger newValue) {
		BigInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.UNLIMITED_INTEGER_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsInfinite() {
		return isInfinite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInfinite(boolean newIsInfinite) {
		boolean oldIsInfinite = isInfinite;
		isInfinite = newIsInfinite;
		boolean oldIsInfiniteESet = isInfiniteESet;
		isInfiniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.UNLIMITED_INTEGER_TYPE__IS_INFINITE, oldIsInfinite, isInfinite, !oldIsInfiniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsInfinite() {
		boolean oldIsInfinite = isInfinite;
		boolean oldIsInfiniteESet = isInfiniteESet;
		isInfinite = IS_INFINITE_EDEFAULT;
		isInfiniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GCOPackage.UNLIMITED_INTEGER_TYPE__IS_INFINITE, oldIsInfinite, IS_INFINITE_EDEFAULT, oldIsInfiniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsInfinite() {
		return isInfiniteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCOPackage.UNLIMITED_INTEGER_TYPE__VALUE:
				return getValue();
			case GCOPackage.UNLIMITED_INTEGER_TYPE__IS_INFINITE:
				return isIsInfinite();
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
			case GCOPackage.UNLIMITED_INTEGER_TYPE__VALUE:
				setValue((BigInteger)newValue);
				return;
			case GCOPackage.UNLIMITED_INTEGER_TYPE__IS_INFINITE:
				setIsInfinite((Boolean)newValue);
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
			case GCOPackage.UNLIMITED_INTEGER_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GCOPackage.UNLIMITED_INTEGER_TYPE__IS_INFINITE:
				unsetIsInfinite();
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
			case GCOPackage.UNLIMITED_INTEGER_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GCOPackage.UNLIMITED_INTEGER_TYPE__IS_INFINITE:
				return isSetIsInfinite();
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
		result.append(", isInfinite: ");
		if (isInfiniteESet) result.append(isInfinite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UnlimitedIntegerTypeImpl
