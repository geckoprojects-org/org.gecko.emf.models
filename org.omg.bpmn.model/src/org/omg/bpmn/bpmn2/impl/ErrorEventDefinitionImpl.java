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
package org.omg.bpmn.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.bpmn.bpmn2.Bpmn2Package;
import org.omg.bpmn.bpmn2.ErrorEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.impl.ErrorEventDefinitionImpl#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorEventDefinitionImpl extends EventDefinitionImpl implements ErrorEventDefinition {
	/**
	 * The cached value of the '{@link #getErrorRef() <em>Error Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRef()
	 * @generated
	 * @ordered
	 */
	protected org.omg.bpmn.bpmn2.Error errorRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getErrorEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.bpmn.bpmn2.Error getErrorRef() {
		if (errorRef != null && errorRef.eIsProxy()) {
			InternalEObject oldErrorRef = (InternalEObject)errorRef;
			errorRef = (org.omg.bpmn.bpmn2.Error)eResolveProxy(oldErrorRef);
			if (errorRef != oldErrorRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF, oldErrorRef, errorRef));
			}
		}
		return errorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.bpmn.bpmn2.Error basicGetErrorRef() {
		return errorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorRef(org.omg.bpmn.bpmn2.Error newErrorRef) {
		org.omg.bpmn.bpmn2.Error oldErrorRef = errorRef;
		errorRef = newErrorRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF, oldErrorRef, errorRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				if (resolve) return getErrorRef();
				return basicGetErrorRef();
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
			case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				setErrorRef((org.omg.bpmn.bpmn2.Error)newValue);
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
			case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				setErrorRef((org.omg.bpmn.bpmn2.Error)null);
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
			case Bpmn2Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				return errorRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorEventDefinitionImpl
