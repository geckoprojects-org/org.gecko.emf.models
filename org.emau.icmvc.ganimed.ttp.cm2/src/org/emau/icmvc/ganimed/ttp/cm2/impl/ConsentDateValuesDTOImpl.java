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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleExpirationsType;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyExpirationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Date Values DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl#getConsentExpirationDate <em>Consent Expiration Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl#getGicsConsentDate <em>Gics Consent Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl#getLegalConsentDate <em>Legal Consent Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl#getMaxPolicyExpirationDate <em>Max Policy Expiration Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl#getModuleExpirations <em>Module Expirations</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentDateValuesDTOImpl#getPolicyExpirations <em>Policy Expirations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentDateValuesDTOImpl extends MinimalEObjectImpl.Container implements ConsentDateValuesDTO {
	/**
	 * The default value of the '{@link #getConsentExpirationDate() <em>Consent Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CONSENT_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsentExpirationDate() <em>Consent Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar consentExpirationDate = CONSENT_EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGicsConsentDate() <em>Gics Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGicsConsentDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GICS_CONSENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGicsConsentDate() <em>Gics Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGicsConsentDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gicsConsentDate = GICS_CONSENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegalConsentDate() <em>Legal Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalConsentDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LEGAL_CONSENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegalConsentDate() <em>Legal Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalConsentDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar legalConsentDate = LEGAL_CONSENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPolicyExpirationDate() <em>Max Policy Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPolicyExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MAX_POLICY_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPolicyExpirationDate() <em>Max Policy Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPolicyExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar maxPolicyExpirationDate = MAX_POLICY_EXPIRATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModuleExpirations() <em>Module Expirations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleExpirations()
	 * @generated
	 * @ordered
	 */
	protected ModuleExpirationsType moduleExpirations;

	/**
	 * The cached value of the '{@link #getPolicyExpirations() <em>Policy Expirations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyExpirations()
	 * @generated
	 * @ordered
	 */
	protected PolicyExpirationsType policyExpirations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDateValuesDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getConsentDateValuesDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getConsentExpirationDate() {
		return consentExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentExpirationDate(XMLGregorianCalendar newConsentExpirationDate) {
		XMLGregorianCalendar oldConsentExpirationDate = consentExpirationDate;
		consentExpirationDate = newConsentExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE, oldConsentExpirationDate, consentExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGicsConsentDate() {
		return gicsConsentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGicsConsentDate(XMLGregorianCalendar newGicsConsentDate) {
		XMLGregorianCalendar oldGicsConsentDate = gicsConsentDate;
		gicsConsentDate = newGicsConsentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE, oldGicsConsentDate, gicsConsentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLegalConsentDate() {
		return legalConsentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegalConsentDate(XMLGregorianCalendar newLegalConsentDate) {
		XMLGregorianCalendar oldLegalConsentDate = legalConsentDate;
		legalConsentDate = newLegalConsentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE, oldLegalConsentDate, legalConsentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMaxPolicyExpirationDate() {
		return maxPolicyExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPolicyExpirationDate(XMLGregorianCalendar newMaxPolicyExpirationDate) {
		XMLGregorianCalendar oldMaxPolicyExpirationDate = maxPolicyExpirationDate;
		maxPolicyExpirationDate = newMaxPolicyExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE, oldMaxPolicyExpirationDate, maxPolicyExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleExpirationsType getModuleExpirations() {
		return moduleExpirations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleExpirations(ModuleExpirationsType newModuleExpirations, NotificationChain msgs) {
		ModuleExpirationsType oldModuleExpirations = moduleExpirations;
		moduleExpirations = newModuleExpirations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS, oldModuleExpirations, newModuleExpirations);
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
	public void setModuleExpirations(ModuleExpirationsType newModuleExpirations) {
		if (newModuleExpirations != moduleExpirations) {
			NotificationChain msgs = null;
			if (moduleExpirations != null)
				msgs = ((InternalEObject)moduleExpirations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS, null, msgs);
			if (newModuleExpirations != null)
				msgs = ((InternalEObject)newModuleExpirations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS, null, msgs);
			msgs = basicSetModuleExpirations(newModuleExpirations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS, newModuleExpirations, newModuleExpirations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyExpirationsType getPolicyExpirations() {
		return policyExpirations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyExpirations(PolicyExpirationsType newPolicyExpirations, NotificationChain msgs) {
		PolicyExpirationsType oldPolicyExpirations = policyExpirations;
		policyExpirations = newPolicyExpirations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS, oldPolicyExpirations, newPolicyExpirations);
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
	public void setPolicyExpirations(PolicyExpirationsType newPolicyExpirations) {
		if (newPolicyExpirations != policyExpirations) {
			NotificationChain msgs = null;
			if (policyExpirations != null)
				msgs = ((InternalEObject)policyExpirations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS, null, msgs);
			if (newPolicyExpirations != null)
				msgs = ((InternalEObject)newPolicyExpirations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS, null, msgs);
			msgs = basicSetPolicyExpirations(newPolicyExpirations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS, newPolicyExpirations, newPolicyExpirations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS:
				return basicSetModuleExpirations(null, msgs);
			case Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS:
				return basicSetPolicyExpirations(null, msgs);
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
			case Cm2Package.CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE:
				return getConsentExpirationDate();
			case Cm2Package.CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE:
				return getGicsConsentDate();
			case Cm2Package.CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE:
				return getLegalConsentDate();
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE:
				return getMaxPolicyExpirationDate();
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS:
				return getModuleExpirations();
			case Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS:
				return getPolicyExpirations();
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
			case Cm2Package.CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE:
				setConsentExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE:
				setGicsConsentDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE:
				setLegalConsentDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE:
				setMaxPolicyExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS:
				setModuleExpirations((ModuleExpirationsType)newValue);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS:
				setPolicyExpirations((PolicyExpirationsType)newValue);
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
			case Cm2Package.CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE:
				setConsentExpirationDate(CONSENT_EXPIRATION_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE:
				setGicsConsentDate(GICS_CONSENT_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE:
				setLegalConsentDate(LEGAL_CONSENT_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE:
				setMaxPolicyExpirationDate(MAX_POLICY_EXPIRATION_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS:
				setModuleExpirations((ModuleExpirationsType)null);
				return;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS:
				setPolicyExpirations((PolicyExpirationsType)null);
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
			case Cm2Package.CONSENT_DATE_VALUES_DTO__CONSENT_EXPIRATION_DATE:
				return CONSENT_EXPIRATION_DATE_EDEFAULT == null ? consentExpirationDate != null : !CONSENT_EXPIRATION_DATE_EDEFAULT.equals(consentExpirationDate);
			case Cm2Package.CONSENT_DATE_VALUES_DTO__GICS_CONSENT_DATE:
				return GICS_CONSENT_DATE_EDEFAULT == null ? gicsConsentDate != null : !GICS_CONSENT_DATE_EDEFAULT.equals(gicsConsentDate);
			case Cm2Package.CONSENT_DATE_VALUES_DTO__LEGAL_CONSENT_DATE:
				return LEGAL_CONSENT_DATE_EDEFAULT == null ? legalConsentDate != null : !LEGAL_CONSENT_DATE_EDEFAULT.equals(legalConsentDate);
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MAX_POLICY_EXPIRATION_DATE:
				return MAX_POLICY_EXPIRATION_DATE_EDEFAULT == null ? maxPolicyExpirationDate != null : !MAX_POLICY_EXPIRATION_DATE_EDEFAULT.equals(maxPolicyExpirationDate);
			case Cm2Package.CONSENT_DATE_VALUES_DTO__MODULE_EXPIRATIONS:
				return moduleExpirations != null;
			case Cm2Package.CONSENT_DATE_VALUES_DTO__POLICY_EXPIRATIONS:
				return policyExpirations != null;
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
		result.append(" (consentExpirationDate: ");
		result.append(consentExpirationDate);
		result.append(", gicsConsentDate: ");
		result.append(gicsConsentDate);
		result.append(", legalConsentDate: ");
		result.append(legalConsentDate);
		result.append(", maxPolicyExpirationDate: ");
		result.append(maxPolicyExpirationDate);
		result.append(')');
		return result.toString();
	}

} //ConsentDateValuesDTOImpl
