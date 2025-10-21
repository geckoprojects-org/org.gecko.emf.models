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
package code.impl;

import code.Code;
import code.CodePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link code.impl.CodeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link code.impl.CodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link code.impl.CodeImpl#getListURI <em>List URI</em>}</li>
 *   <li>{@link code.impl.CodeImpl#getListVersionID <em>List Version ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeImpl extends MinimalEObjectImpl.Container implements Code {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getListURI() <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListURI() <em>List URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListURI()
	 * @generated
	 * @ordered
	 */
	protected String listURI = LIST_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getListVersionID() <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListVersionID() <em>List Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListVersionID()
	 * @generated
	 * @ordered
	 */
	protected String listVersionID = LIST_VERSION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListURI() {
		return listURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListURI(String newListURI) {
		String oldListURI = listURI;
		listURI = newListURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE__LIST_URI, oldListURI, listURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListVersionID() {
		return listVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListVersionID(String newListVersionID) {
		String oldListVersionID = listVersionID;
		listVersionID = newListVersionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CODE__LIST_VERSION_ID, oldListVersionID, listVersionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.CODE__CODE:
				return getCode();
			case CodePackage.CODE__NAME:
				return getName();
			case CodePackage.CODE__LIST_URI:
				return getListURI();
			case CodePackage.CODE__LIST_VERSION_ID:
				return getListVersionID();
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
			case CodePackage.CODE__CODE:
				setCode((String)newValue);
				return;
			case CodePackage.CODE__NAME:
				setName((String)newValue);
				return;
			case CodePackage.CODE__LIST_URI:
				setListURI((String)newValue);
				return;
			case CodePackage.CODE__LIST_VERSION_ID:
				setListVersionID((String)newValue);
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
			case CodePackage.CODE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CodePackage.CODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodePackage.CODE__LIST_URI:
				setListURI(LIST_URI_EDEFAULT);
				return;
			case CodePackage.CODE__LIST_VERSION_ID:
				setListVersionID(LIST_VERSION_ID_EDEFAULT);
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
			case CodePackage.CODE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CodePackage.CODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CodePackage.CODE__LIST_URI:
				return LIST_URI_EDEFAULT == null ? listURI != null : !LIST_URI_EDEFAULT.equals(listURI);
			case CodePackage.CODE__LIST_VERSION_ID:
				return LIST_VERSION_ID_EDEFAULT == null ? listVersionID != null : !LIST_VERSION_ID_EDEFAULT.equals(listVersionID);
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", listURI: ");
		result.append(listURI);
		result.append(", listVersionID: ");
		result.append(listVersionID);
		result.append(')');
		return result.toString();
	}

} //CodeImpl
