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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentScanDTO;
import org.emau.icmvc.ganimed.ttp.cm2.FreeTextValDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDTOImpl#getFreeTextVals <em>Free Text Vals</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDTOImpl#getPatientSignatureBase64 <em>Patient Signature Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDTOImpl#getPhysicianSignatureBase64 <em>Physician Signature Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDTOImpl#getScans <em>Scans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentDTOImpl extends ConsentLightDTOImpl implements ConsentDTO {
	/**
	 * The cached value of the '{@link #getFreeTextVals() <em>Free Text Vals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeTextVals()
	 * @generated
	 * @ordered
	 */
	protected EList<FreeTextValDTO> freeTextVals;

	/**
	 * The default value of the '{@link #getPatientSignatureBase64() <em>Patient Signature Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSignatureBase64()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_SIGNATURE_BASE64_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientSignatureBase64() <em>Patient Signature Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSignatureBase64()
	 * @generated
	 * @ordered
	 */
	protected String patientSignatureBase64 = PATIENT_SIGNATURE_BASE64_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicianSignatureBase64() <em>Physician Signature Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianSignatureBase64()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICIAN_SIGNATURE_BASE64_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicianSignatureBase64() <em>Physician Signature Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicianSignatureBase64()
	 * @generated
	 * @ordered
	 */
	protected String physicianSignatureBase64 = PHYSICIAN_SIGNATURE_BASE64_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScans() <em>Scans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScans()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsentScanDTO> scans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getConsentDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FreeTextValDTO> getFreeTextVals() {
		if (freeTextVals == null) {
			freeTextVals = new EObjectContainmentEList<FreeTextValDTO>(FreeTextValDTO.class, this, Cm2Package.CONSENT_DTO__FREE_TEXT_VALS);
		}
		return freeTextVals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatientSignatureBase64() {
		return patientSignatureBase64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientSignatureBase64(String newPatientSignatureBase64) {
		String oldPatientSignatureBase64 = patientSignatureBase64;
		patientSignatureBase64 = newPatientSignatureBase64;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DTO__PATIENT_SIGNATURE_BASE64, oldPatientSignatureBase64, patientSignatureBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicianSignatureBase64() {
		return physicianSignatureBase64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicianSignatureBase64(String newPhysicianSignatureBase64) {
		String oldPhysicianSignatureBase64 = physicianSignatureBase64;
		physicianSignatureBase64 = newPhysicianSignatureBase64;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64, oldPhysicianSignatureBase64, physicianSignatureBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentScanDTO> getScans() {
		if (scans == null) {
			scans = new EObjectContainmentEList<ConsentScanDTO>(ConsentScanDTO.class, this, Cm2Package.CONSENT_DTO__SCANS);
		}
		return scans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.CONSENT_DTO__FREE_TEXT_VALS:
				return ((InternalEList<?>)getFreeTextVals()).basicRemove(otherEnd, msgs);
			case Cm2Package.CONSENT_DTO__SCANS:
				return ((InternalEList<?>)getScans()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.CONSENT_DTO__FREE_TEXT_VALS:
				return getFreeTextVals();
			case Cm2Package.CONSENT_DTO__PATIENT_SIGNATURE_BASE64:
				return getPatientSignatureBase64();
			case Cm2Package.CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64:
				return getPhysicianSignatureBase64();
			case Cm2Package.CONSENT_DTO__SCANS:
				return getScans();
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
			case Cm2Package.CONSENT_DTO__FREE_TEXT_VALS:
				getFreeTextVals().clear();
				getFreeTextVals().addAll((Collection<? extends FreeTextValDTO>)newValue);
				return;
			case Cm2Package.CONSENT_DTO__PATIENT_SIGNATURE_BASE64:
				setPatientSignatureBase64((String)newValue);
				return;
			case Cm2Package.CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64:
				setPhysicianSignatureBase64((String)newValue);
				return;
			case Cm2Package.CONSENT_DTO__SCANS:
				getScans().clear();
				getScans().addAll((Collection<? extends ConsentScanDTO>)newValue);
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
			case Cm2Package.CONSENT_DTO__FREE_TEXT_VALS:
				getFreeTextVals().clear();
				return;
			case Cm2Package.CONSENT_DTO__PATIENT_SIGNATURE_BASE64:
				setPatientSignatureBase64(PATIENT_SIGNATURE_BASE64_EDEFAULT);
				return;
			case Cm2Package.CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64:
				setPhysicianSignatureBase64(PHYSICIAN_SIGNATURE_BASE64_EDEFAULT);
				return;
			case Cm2Package.CONSENT_DTO__SCANS:
				getScans().clear();
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
			case Cm2Package.CONSENT_DTO__FREE_TEXT_VALS:
				return freeTextVals != null && !freeTextVals.isEmpty();
			case Cm2Package.CONSENT_DTO__PATIENT_SIGNATURE_BASE64:
				return PATIENT_SIGNATURE_BASE64_EDEFAULT == null ? patientSignatureBase64 != null : !PATIENT_SIGNATURE_BASE64_EDEFAULT.equals(patientSignatureBase64);
			case Cm2Package.CONSENT_DTO__PHYSICIAN_SIGNATURE_BASE64:
				return PHYSICIAN_SIGNATURE_BASE64_EDEFAULT == null ? physicianSignatureBase64 != null : !PHYSICIAN_SIGNATURE_BASE64_EDEFAULT.equals(physicianSignatureBase64);
			case Cm2Package.CONSENT_DTO__SCANS:
				return scans != null && !scans.isEmpty();
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
		result.append(" (patientSignatureBase64: ");
		result.append(patientSignatureBase64);
		result.append(", physicianSignatureBase64: ");
		result.append(physicianSignatureBase64);
		result.append(')');
		return result.toString();
	}

} //ConsentDTOImpl
