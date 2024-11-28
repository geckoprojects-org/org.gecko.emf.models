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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.GetObjectByFhirID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Object By Fhir ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetObjectByFhirIDImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetObjectByFhirIDImpl#getFhirID <em>Fhir ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetObjectByFhirIDImpl extends MinimalEObjectImpl.Container implements GetObjectByFhirID {
	/**
	 * The default value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAZZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected String clazz = CLAZZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getFhirID() <em>Fhir ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirID()
	 * @generated
	 * @ordered
	 */
	protected static final String FHIR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFhirID() <em>Fhir ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirID()
	 * @generated
	 * @ordered
	 */
	protected String fhirID = FHIR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetObjectByFhirIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetObjectByFhirID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClazz() {
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClazz(String newClazz) {
		String oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_OBJECT_BY_FHIR_ID__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFhirID() {
		return fhirID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirID(String newFhirID) {
		String oldFhirID = fhirID;
		fhirID = newFhirID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_OBJECT_BY_FHIR_ID__FHIR_ID, oldFhirID, fhirID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__CLAZZ:
				return getClazz();
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__FHIR_ID:
				return getFhirID();
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
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__CLAZZ:
				setClazz((String)newValue);
				return;
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__FHIR_ID:
				setFhirID((String)newValue);
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
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__CLAZZ:
				setClazz(CLAZZ_EDEFAULT);
				return;
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__FHIR_ID:
				setFhirID(FHIR_ID_EDEFAULT);
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
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__CLAZZ:
				return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
			case Cm2Package.GET_OBJECT_BY_FHIR_ID__FHIR_ID:
				return FHIR_ID_EDEFAULT == null ? fhirID != null : !FHIR_ID_EDEFAULT.equals(fhirID);
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
		result.append(" (clazz: ");
		result.append(clazz);
		result.append(", fhirID: ");
		result.append(fhirID);
		result.append(')');
		return result.toString();
	}

} //GetObjectByFhirIDImpl
