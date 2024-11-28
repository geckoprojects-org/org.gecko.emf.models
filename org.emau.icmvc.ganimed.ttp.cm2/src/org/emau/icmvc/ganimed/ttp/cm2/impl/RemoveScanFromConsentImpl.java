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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.RemoveScanFromConsent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Scan From Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RemoveScanFromConsentImpl#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RemoveScanFromConsentImpl#getFhirId <em>Fhir Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveScanFromConsentImpl extends MinimalEObjectImpl.Container implements RemoveScanFromConsent {
	/**
	 * The cached value of the '{@link #getConsentKey() <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentKey()
	 * @generated
	 * @ordered
	 */
	protected ConsentKeyDTO consentKey;

	/**
	 * The default value of the '{@link #getFhirId() <em>Fhir Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirId()
	 * @generated
	 * @ordered
	 */
	protected static final String FHIR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFhirId() <em>Fhir Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFhirId()
	 * @generated
	 * @ordered
	 */
	protected String fhirId = FHIR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveScanFromConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getRemoveScanFromConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentKeyDTO getConsentKey() {
		return consentKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentKey(ConsentKeyDTO newConsentKey, NotificationChain msgs) {
		ConsentKeyDTO oldConsentKey = consentKey;
		consentKey = newConsentKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY, oldConsentKey, newConsentKey);
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
	public void setConsentKey(ConsentKeyDTO newConsentKey) {
		if (newConsentKey != consentKey) {
			NotificationChain msgs = null;
			if (consentKey != null)
				msgs = ((InternalEObject)consentKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY, null, msgs);
			if (newConsentKey != null)
				msgs = ((InternalEObject)newConsentKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY, null, msgs);
			msgs = basicSetConsentKey(newConsentKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY, newConsentKey, newConsentKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFhirId() {
		return fhirId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFhirId(String newFhirId) {
		String oldFhirId = fhirId;
		fhirId = newFhirId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.REMOVE_SCAN_FROM_CONSENT__FHIR_ID, oldFhirId, fhirId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY:
				return basicSetConsentKey(null, msgs);
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
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY:
				return getConsentKey();
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__FHIR_ID:
				return getFhirId();
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
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)newValue);
				return;
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__FHIR_ID:
				setFhirId((String)newValue);
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
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)null);
				return;
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__FHIR_ID:
				setFhirId(FHIR_ID_EDEFAULT);
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
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__CONSENT_KEY:
				return consentKey != null;
			case Cm2Package.REMOVE_SCAN_FROM_CONSENT__FHIR_ID:
				return FHIR_ID_EDEFAULT == null ? fhirId != null : !FHIR_ID_EDEFAULT.equals(fhirId);
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
		result.append(" (fhirId: ");
		result.append(fhirId);
		result.append(')');
		return result.toString();
	}

} //RemoveScanFromConsentImpl
