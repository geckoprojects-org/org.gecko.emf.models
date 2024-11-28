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
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentPolicyStatesForSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Current Policy States For Signer Ids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsImpl#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentPolicyStatesForSignerIdsImpl#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetCurrentPolicyStatesForSignerIdsImpl extends MinimalEObjectImpl.Container implements GetCurrentPolicyStatesForSignerIds {
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
	 * The cached value of the '{@link #getSignerIds() <em>Signer Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIds()
	 * @generated
	 * @ordered
	 */
	protected EList<SignerIdDTO> signerIds;

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
	protected GetCurrentPolicyStatesForSignerIdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetCurrentPolicyStatesForSignerIds();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignerIdDTO> getSignerIds() {
		if (signerIds == null) {
			signerIds = new EObjectContainmentEList<SignerIdDTO>(SignerIdDTO.class, this, Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS);
		}
		return signerIds;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG, oldConfig, newConfig);
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
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS:
				return ((InternalEList<?>)getSignerIds()).basicRemove(otherEnd, msgs);
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG:
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
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME:
				return getDomainName();
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS:
				return getSignerIds();
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG:
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
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS:
				getSignerIds().clear();
				getSignerIds().addAll((Collection<? extends SignerIdDTO>)newValue);
				return;
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG:
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
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS:
				getSignerIds().clear();
				return;
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG:
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
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__SIGNER_IDS:
				return signerIds != null && !signerIds.isEmpty();
			case Cm2Package.GET_CURRENT_POLICY_STATES_FOR_SIGNER_IDS__CONFIG:
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
		result.append(')');
		return result.toString();
	}

} //GetCurrentPolicyStatesForSignerIdsImpl
