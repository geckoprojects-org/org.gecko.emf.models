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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211._2005.gco.CodeListValueType;
import org.isotc211._2005.gco.GCOPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code List Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.impl.CodeListValueTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.CodeListValueTypeImpl#getCodeList <em>Code List</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.CodeListValueTypeImpl#getCodeListValue <em>Code List Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.impl.CodeListValueTypeImpl#getCodeSpace <em>Code Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeListValueTypeImpl extends MinimalEObjectImpl.Container implements CodeListValueType {
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
	 * The default value of the '{@link #getCodeList() <em>Code List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeList()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeList() <em>Code List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeList()
	 * @generated
	 * @ordered
	 */
	protected String codeList = CODE_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeListValue() <em>Code List Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LIST_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeListValue() <em>Code List Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeListValue()
	 * @generated
	 * @ordered
	 */
	protected String codeListValue = CODE_LIST_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeSpace() <em>Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSpace()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSpace() <em>Code Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSpace()
	 * @generated
	 * @ordered
	 */
	protected String codeSpace = CODE_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeListValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCOPackage.Literals.CODE_LIST_VALUE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.CODE_LIST_VALUE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeList() {
		return codeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeList(String newCodeList) {
		String oldCodeList = codeList;
		codeList = newCodeList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST, oldCodeList, codeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeListValue() {
		return codeListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeListValue(String newCodeListValue) {
		String oldCodeListValue = codeListValue;
		codeListValue = newCodeListValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE, oldCodeListValue, codeListValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodeSpace() {
		return codeSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodeSpace(String newCodeSpace) {
		String oldCodeSpace = codeSpace;
		codeSpace = newCodeSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCOPackage.CODE_LIST_VALUE_TYPE__CODE_SPACE, oldCodeSpace, codeSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCOPackage.CODE_LIST_VALUE_TYPE__VALUE:
				return getValue();
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST:
				return getCodeList();
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE:
				return getCodeListValue();
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_SPACE:
				return getCodeSpace();
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
			case GCOPackage.CODE_LIST_VALUE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST:
				setCodeList((String)newValue);
				return;
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE:
				setCodeListValue((String)newValue);
				return;
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_SPACE:
				setCodeSpace((String)newValue);
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
			case GCOPackage.CODE_LIST_VALUE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST:
				setCodeList(CODE_LIST_EDEFAULT);
				return;
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE:
				setCodeListValue(CODE_LIST_VALUE_EDEFAULT);
				return;
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_SPACE:
				setCodeSpace(CODE_SPACE_EDEFAULT);
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
			case GCOPackage.CODE_LIST_VALUE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST:
				return CODE_LIST_EDEFAULT == null ? codeList != null : !CODE_LIST_EDEFAULT.equals(codeList);
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE:
				return CODE_LIST_VALUE_EDEFAULT == null ? codeListValue != null : !CODE_LIST_VALUE_EDEFAULT.equals(codeListValue);
			case GCOPackage.CODE_LIST_VALUE_TYPE__CODE_SPACE:
				return CODE_SPACE_EDEFAULT == null ? codeSpace != null : !CODE_SPACE_EDEFAULT.equals(codeSpace);
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
		result.append(", codeList: ");
		result.append(codeList);
		result.append(", codeListValue: ");
		result.append(codeListValue);
		result.append(", codeSpace: ");
		result.append(codeSpace);
		result.append(')');
		return result.toString();
	}

} //CodeListValueTypeImpl
