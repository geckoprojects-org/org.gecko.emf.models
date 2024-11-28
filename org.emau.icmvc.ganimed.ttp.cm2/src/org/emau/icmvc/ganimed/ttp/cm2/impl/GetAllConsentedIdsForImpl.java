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
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentedIdsFor;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;

import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All Consented Ids For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForImpl#getSignerIdTypeName <em>Signer Id Type Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForImpl#getPolicyKey <em>Policy Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentedIdsForImpl#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetAllConsentedIdsForImpl extends MinimalEObjectImpl.Container implements GetAllConsentedIdsFor {
	/**
	 * The default value of the '{@link #getSignerIdTypeName() <em>Signer Id Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIdTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNER_ID_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignerIdTypeName() <em>Signer Id Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIdTypeName()
	 * @generated
	 * @ordered
	 */
	protected String signerIdTypeName = SIGNER_ID_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicyKey() <em>Policy Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKey()
	 * @generated
	 * @ordered
	 */
	protected PolicyKeyDTO policyKey;

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
	protected GetAllConsentedIdsForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetAllConsentedIdsFor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignerIdTypeName() {
		return signerIdTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignerIdTypeName(String newSignerIdTypeName) {
		String oldSignerIdTypeName = signerIdTypeName;
		signerIdTypeName = newSignerIdTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME, oldSignerIdTypeName, signerIdTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyKeyDTO getPolicyKey() {
		return policyKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyKey(PolicyKeyDTO newPolicyKey, NotificationChain msgs) {
		PolicyKeyDTO oldPolicyKey = policyKey;
		policyKey = newPolicyKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY, oldPolicyKey, newPolicyKey);
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
	public void setPolicyKey(PolicyKeyDTO newPolicyKey) {
		if (newPolicyKey != policyKey) {
			NotificationChain msgs = null;
			if (policyKey != null)
				msgs = ((InternalEObject)policyKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY, null, msgs);
			if (newPolicyKey != null)
				msgs = ((InternalEObject)newPolicyKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY, null, msgs);
			msgs = basicSetPolicyKey(newPolicyKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY, newPolicyKey, newPolicyKey));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG, oldConfig, newConfig);
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
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY:
				return basicSetPolicyKey(null, msgs);
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG:
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
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME:
				return getSignerIdTypeName();
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY:
				return getPolicyKey();
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG:
				return getConfig();
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
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME:
				setSignerIdTypeName((String)newValue);
				return;
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)newValue);
				return;
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG:
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
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME:
				setSignerIdTypeName(SIGNER_ID_TYPE_NAME_EDEFAULT);
				return;
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)null);
				return;
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG:
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
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__SIGNER_ID_TYPE_NAME:
				return SIGNER_ID_TYPE_NAME_EDEFAULT == null ? signerIdTypeName != null : !SIGNER_ID_TYPE_NAME_EDEFAULT.equals(signerIdTypeName);
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__POLICY_KEY:
				return policyKey != null;
			case Cm2Package.GET_ALL_CONSENTED_IDS_FOR__CONFIG:
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
		result.append(" (signerIdTypeName: ");
		result.append(signerIdTypeName);
		result.append(')');
		return result.toString();
	}

} //GetAllConsentedIdsForImpl
