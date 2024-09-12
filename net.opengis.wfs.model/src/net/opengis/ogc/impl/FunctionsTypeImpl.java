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
package net.opengis.ogc.impl;

import net.opengis.ogc.FunctionNamesType;
import net.opengis.ogc.FunctionsType;
import net.opengis.ogc.OGCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.FunctionsTypeImpl#getFunctionNames <em>Function Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionsTypeImpl extends MinimalEObjectImpl.Container implements FunctionsType {
	/**
	 * The cached value of the '{@link #getFunctionNames() <em>Function Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionNames()
	 * @generated
	 * @ordered
	 */
	protected FunctionNamesType functionNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.FUNCTIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionNamesType getFunctionNames() {
		return functionNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionNames(FunctionNamesType newFunctionNames, NotificationChain msgs) {
		FunctionNamesType oldFunctionNames = functionNames;
		functionNames = newFunctionNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES, oldFunctionNames, newFunctionNames);
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
	public void setFunctionNames(FunctionNamesType newFunctionNames) {
		if (newFunctionNames != functionNames) {
			NotificationChain msgs = null;
			if (functionNames != null)
				msgs = ((InternalEObject)functionNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES, null, msgs);
			if (newFunctionNames != null)
				msgs = ((InternalEObject)newFunctionNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES, null, msgs);
			msgs = basicSetFunctionNames(newFunctionNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES, newFunctionNames, newFunctionNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES:
				return basicSetFunctionNames(null, msgs);
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
			case OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES:
				return getFunctionNames();
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
			case OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES:
				setFunctionNames((FunctionNamesType)newValue);
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
			case OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES:
				setFunctionNames((FunctionNamesType)null);
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
			case OGCPackage.FUNCTIONS_TYPE__FUNCTION_NAMES:
				return functionNames != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionsTypeImpl
