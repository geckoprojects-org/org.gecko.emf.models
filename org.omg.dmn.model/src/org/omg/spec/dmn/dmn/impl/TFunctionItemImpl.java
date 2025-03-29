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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TFunctionItem;
import org.omg.spec.dmn.dmn.TInformationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunction Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TFunctionItemImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TFunctionItemImpl#getOutputTypeRef <em>Output Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionItemImpl extends TDMNElementImpl implements TFunctionItem {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TInformationItem> parameters;

	/**
	 * The default value of the '{@link #getOutputTypeRef() <em>Output Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputTypeRef() <em>Output Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTypeRef()
	 * @generated
	 * @ordered
	 */
	protected String outputTypeRef = OUTPUT_TYPE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFunctionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TFUNCTION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInformationItem> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TInformationItem>(TInformationItem.class, this, DMNPackage.TFUNCTION_ITEM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputTypeRef() {
		return outputTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputTypeRef(String newOutputTypeRef) {
		String oldOutputTypeRef = outputTypeRef;
		outputTypeRef = newOutputTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TFUNCTION_ITEM__OUTPUT_TYPE_REF, oldOutputTypeRef, outputTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TFUNCTION_ITEM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TFUNCTION_ITEM__PARAMETERS:
				return getParameters();
			case DMNPackage.TFUNCTION_ITEM__OUTPUT_TYPE_REF:
				return getOutputTypeRef();
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
			case DMNPackage.TFUNCTION_ITEM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TInformationItem>)newValue);
				return;
			case DMNPackage.TFUNCTION_ITEM__OUTPUT_TYPE_REF:
				setOutputTypeRef((String)newValue);
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
			case DMNPackage.TFUNCTION_ITEM__PARAMETERS:
				getParameters().clear();
				return;
			case DMNPackage.TFUNCTION_ITEM__OUTPUT_TYPE_REF:
				setOutputTypeRef(OUTPUT_TYPE_REF_EDEFAULT);
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
			case DMNPackage.TFUNCTION_ITEM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DMNPackage.TFUNCTION_ITEM__OUTPUT_TYPE_REF:
				return OUTPUT_TYPE_REF_EDEFAULT == null ? outputTypeRef != null : !OUTPUT_TYPE_REF_EDEFAULT.equals(outputTypeRef);
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
		result.append(" (outputTypeRef: ");
		result.append(outputTypeRef);
		result.append(')');
		return result.toString();
	}

} //TFunctionItemImpl
