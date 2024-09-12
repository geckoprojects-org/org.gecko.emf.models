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
package net.opengis.ows.impl;

import java.util.Collection;

import net.opengis.ows.ExceptionType;
import net.opengis.ows.OWSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.ExceptionTypeImpl#getExceptionText <em>Exception Text</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ExceptionTypeImpl#getExceptionCode <em>Exception Code</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ExceptionTypeImpl#getLocator <em>Locator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionTypeImpl extends MinimalEObjectImpl.Container implements ExceptionType {
	/**
	 * The cached value of the '{@link #getExceptionText() <em>Exception Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exceptionText;

	/**
	 * The default value of the '{@link #getExceptionCode() <em>Exception Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionCode() <em>Exception Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionCode()
	 * @generated
	 * @ordered
	 */
	protected String exceptionCode = EXCEPTION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocator() <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocator()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocator() <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocator()
	 * @generated
	 * @ordered
	 */
	protected String locator = LOCATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.EXCEPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExceptionText() {
		if (exceptionText == null) {
			exceptionText = new EDataTypeEList<String>(String.class, this, OWSPackage.EXCEPTION_TYPE__EXCEPTION_TEXT);
		}
		return exceptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExceptionCode() {
		return exceptionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionCode(String newExceptionCode) {
		String oldExceptionCode = exceptionCode;
		exceptionCode = newExceptionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.EXCEPTION_TYPE__EXCEPTION_CODE, oldExceptionCode, exceptionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocator() {
		return locator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocator(String newLocator) {
		String oldLocator = locator;
		locator = newLocator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.EXCEPTION_TYPE__LOCATOR, oldLocator, locator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_TEXT:
				return getExceptionText();
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_CODE:
				return getExceptionCode();
			case OWSPackage.EXCEPTION_TYPE__LOCATOR:
				return getLocator();
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
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_TEXT:
				getExceptionText().clear();
				getExceptionText().addAll((Collection<? extends String>)newValue);
				return;
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_CODE:
				setExceptionCode((String)newValue);
				return;
			case OWSPackage.EXCEPTION_TYPE__LOCATOR:
				setLocator((String)newValue);
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
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_TEXT:
				getExceptionText().clear();
				return;
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_CODE:
				setExceptionCode(EXCEPTION_CODE_EDEFAULT);
				return;
			case OWSPackage.EXCEPTION_TYPE__LOCATOR:
				setLocator(LOCATOR_EDEFAULT);
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
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_TEXT:
				return exceptionText != null && !exceptionText.isEmpty();
			case OWSPackage.EXCEPTION_TYPE__EXCEPTION_CODE:
				return EXCEPTION_CODE_EDEFAULT == null ? exceptionCode != null : !EXCEPTION_CODE_EDEFAULT.equals(exceptionCode);
			case OWSPackage.EXCEPTION_TYPE__LOCATOR:
				return LOCATOR_EDEFAULT == null ? locator != null : !LOCATOR_EDEFAULT.equals(locator);
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
		result.append(" (exceptionText: ");
		result.append(exceptionText);
		result.append(", exceptionCode: ");
		result.append(exceptionCode);
		result.append(", locator: ");
		result.append(locator);
		result.append(')');
		return result.toString();
	}

} //ExceptionTypeImpl
