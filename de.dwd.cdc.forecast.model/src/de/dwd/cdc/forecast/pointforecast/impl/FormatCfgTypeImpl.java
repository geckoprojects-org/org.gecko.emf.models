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
package de.dwd.cdc.forecast.pointforecast.impl;

import de.dwd.cdc.forecast.pointforecast.FormatCfgType;
import de.dwd.cdc.forecast.pointforecast.PointforecastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Cfg Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.impl.FormatCfgTypeImpl#getDefaultUndefSign <em>Default Undef Sign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormatCfgTypeImpl extends MinimalEObjectImpl.Container implements FormatCfgType {
	/**
	 * The default value of the '{@link #getDefaultUndefSign() <em>Default Undef Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUndefSign()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_UNDEF_SIGN_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getDefaultUndefSign() <em>Default Undef Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUndefSign()
	 * @generated
	 * @ordered
	 */
	protected String defaultUndefSign = DEFAULT_UNDEF_SIGN_EDEFAULT;

	/**
	 * This is true if the Default Undef Sign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultUndefSignESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormatCfgTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PointforecastPackage.Literals.FORMAT_CFG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultUndefSign() {
		return defaultUndefSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultUndefSign(String newDefaultUndefSign) {
		String oldDefaultUndefSign = defaultUndefSign;
		defaultUndefSign = newDefaultUndefSign;
		boolean oldDefaultUndefSignESet = defaultUndefSignESet;
		defaultUndefSignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PointforecastPackage.FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN, oldDefaultUndefSign, defaultUndefSign, !oldDefaultUndefSignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDefaultUndefSign() {
		String oldDefaultUndefSign = defaultUndefSign;
		boolean oldDefaultUndefSignESet = defaultUndefSignESet;
		defaultUndefSign = DEFAULT_UNDEF_SIGN_EDEFAULT;
		defaultUndefSignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PointforecastPackage.FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN, oldDefaultUndefSign, DEFAULT_UNDEF_SIGN_EDEFAULT, oldDefaultUndefSignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDefaultUndefSign() {
		return defaultUndefSignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PointforecastPackage.FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN:
				return getDefaultUndefSign();
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
			case PointforecastPackage.FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN:
				setDefaultUndefSign((String)newValue);
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
			case PointforecastPackage.FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN:
				unsetDefaultUndefSign();
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
			case PointforecastPackage.FORMAT_CFG_TYPE__DEFAULT_UNDEF_SIGN:
				return isSetDefaultUndefSign();
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
		result.append(" (defaultUndefSign: ");
		if (defaultUndefSignESet) result.append(defaultUndefSign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FormatCfgTypeImpl
