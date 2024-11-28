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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToIncluding;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Consent Status Type From Excluding To Including</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl#getVersionFrom <em>Version From</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl#getVersionTo <em>Version To</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetConsentStatusTypeFromExcludingToIncludingImpl#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetConsentStatusTypeFromExcludingToIncludingImpl extends MinimalEObjectImpl.Container implements GetConsentStatusTypeFromExcludingToIncluding {
	/**
	 * The cached value of the '{@link #getSignerIds() <em>Signer Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIds()
	 * @generated
	 * @ordered
	 */
	protected EList<SignerIdDTO> signerIds;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected String policyName = POLICY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionFrom() <em>Version From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionFrom() <em>Version From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionFrom()
	 * @generated
	 * @ordered
	 */
	protected String versionFrom = VERSION_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionTo() <em>Version To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTo()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionTo() <em>Version To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTo()
	 * @generated
	 * @ordered
	 */
	protected String versionTo = VERSION_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected CheckConsentConfig config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetConsentStatusTypeFromExcludingToIncludingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetConsentStatusTypeFromExcludingToIncluding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignerIdDTO> getSignerIds() {
		if (signerIds == null) {
			signerIds = new EObjectContainmentEList<SignerIdDTO>(SignerIdDTO.class, this, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS);
		}
		return signerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyName() {
		return policyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyName(String newPolicyName) {
		String oldPolicyName = policyName;
		policyName = newPolicyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME, oldPolicyName, policyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionFrom() {
		return versionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionFrom(String newVersionFrom) {
		String oldVersionFrom = versionFrom;
		versionFrom = newVersionFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM, oldVersionFrom, versionFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionTo() {
		return versionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionTo(String newVersionTo) {
		String oldVersionTo = versionTo;
		versionTo = newVersionTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO, oldVersionTo, versionTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckConsentConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(CheckConsentConfig newConfig, NotificationChain msgs) {
		CheckConsentConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG, oldConfig, newConfig);
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
	public void setConfig(CheckConsentConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS:
				return ((InternalEList<?>)getSignerIds()).basicRemove(otherEnd, msgs);
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG:
				return basicSetConfig(null, msgs);
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
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS:
				return getSignerIds();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME:
				return getDomainName();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME:
				return getPolicyName();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM:
				return getVersionFrom();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO:
				return getVersionTo();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG:
				return getConfig();
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
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS:
				getSignerIds().clear();
				getSignerIds().addAll((Collection<? extends SignerIdDTO>)newValue);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME:
				setPolicyName((String)newValue);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM:
				setVersionFrom((String)newValue);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO:
				setVersionTo((String)newValue);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG:
				setConfig((CheckConsentConfig)newValue);
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
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS:
				getSignerIds().clear();
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME:
				setPolicyName(POLICY_NAME_EDEFAULT);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM:
				setVersionFrom(VERSION_FROM_EDEFAULT);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO:
				setVersionTo(VERSION_TO_EDEFAULT);
				return;
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG:
				setConfig((CheckConsentConfig)null);
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
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__SIGNER_IDS:
				return signerIds != null && !signerIds.isEmpty();
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__POLICY_NAME:
				return POLICY_NAME_EDEFAULT == null ? policyName != null : !POLICY_NAME_EDEFAULT.equals(policyName);
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_FROM:
				return VERSION_FROM_EDEFAULT == null ? versionFrom != null : !VERSION_FROM_EDEFAULT.equals(versionFrom);
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__VERSION_TO:
				return VERSION_TO_EDEFAULT == null ? versionTo != null : !VERSION_TO_EDEFAULT.equals(versionTo);
			case Cm2Package.GET_CONSENT_STATUS_TYPE_FROM_EXCLUDING_TO_INCLUDING__CONFIG:
				return config != null;
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
		result.append(" (domainName: ");
		result.append(domainName);
		result.append(", policyName: ");
		result.append(policyName);
		result.append(", versionFrom: ");
		result.append(versionFrom);
		result.append(", versionTo: ");
		result.append(versionTo);
		result.append(')');
		return result.toString();
	}

} //GetConsentStatusTypeFromExcludingToIncludingImpl
