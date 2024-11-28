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
import org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module State DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStateDTOImpl#getConsentState <em>Consent State</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStateDTOImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ModuleStateDTOImpl#getPolicyKeys <em>Policy Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleStateDTOImpl extends MinimalEObjectImpl.Container implements ModuleStateDTO {
	/**
	 * The default value of the '{@link #getConsentState() <em>Consent State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentState()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentStatus CONSENT_STATE_EDEFAULT = ConsentStatus.ACCEPTED;

	/**
	 * The cached value of the '{@link #getConsentState() <em>Consent State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentState()
	 * @generated
	 * @ordered
	 */
	protected ConsentStatus consentState = CONSENT_STATE_EDEFAULT;

	/**
	 * This is true if the Consent State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consentStateESet;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected ModuleKeyDTO key;

	/**
	 * The cached value of the '{@link #getPolicyKeys() <em>Policy Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyKeyDTO> policyKeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleStateDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getModuleStateDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentStatus getConsentState() {
		return consentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentState(ConsentStatus newConsentState) {
		ConsentStatus oldConsentState = consentState;
		consentState = newConsentState == null ? CONSENT_STATE_EDEFAULT : newConsentState;
		boolean oldConsentStateESet = consentStateESet;
		consentStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_STATE_DTO__CONSENT_STATE, oldConsentState, consentState, !oldConsentStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConsentState() {
		ConsentStatus oldConsentState = consentState;
		boolean oldConsentStateESet = consentStateESet;
		consentState = CONSENT_STATE_EDEFAULT;
		consentStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.MODULE_STATE_DTO__CONSENT_STATE, oldConsentState, CONSENT_STATE_EDEFAULT, oldConsentStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConsentState() {
		return consentStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTO getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(ModuleKeyDTO newKey, NotificationChain msgs) {
		ModuleKeyDTO oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_STATE_DTO__KEY, oldKey, newKey);
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
	public void setKey(ModuleKeyDTO newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.MODULE_STATE_DTO__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.MODULE_STATE_DTO__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.MODULE_STATE_DTO__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyKeyDTO> getPolicyKeys() {
		if (policyKeys == null) {
			policyKeys = new EObjectContainmentEList<PolicyKeyDTO>(PolicyKeyDTO.class, this, Cm2Package.MODULE_STATE_DTO__POLICY_KEYS);
		}
		return policyKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.MODULE_STATE_DTO__KEY:
				return basicSetKey(null, msgs);
			case Cm2Package.MODULE_STATE_DTO__POLICY_KEYS:
				return ((InternalEList<?>)getPolicyKeys()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.MODULE_STATE_DTO__CONSENT_STATE:
				return getConsentState();
			case Cm2Package.MODULE_STATE_DTO__KEY:
				return getKey();
			case Cm2Package.MODULE_STATE_DTO__POLICY_KEYS:
				return getPolicyKeys();
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
			case Cm2Package.MODULE_STATE_DTO__CONSENT_STATE:
				setConsentState((ConsentStatus)newValue);
				return;
			case Cm2Package.MODULE_STATE_DTO__KEY:
				setKey((ModuleKeyDTO)newValue);
				return;
			case Cm2Package.MODULE_STATE_DTO__POLICY_KEYS:
				getPolicyKeys().clear();
				getPolicyKeys().addAll((Collection<? extends PolicyKeyDTO>)newValue);
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
			case Cm2Package.MODULE_STATE_DTO__CONSENT_STATE:
				unsetConsentState();
				return;
			case Cm2Package.MODULE_STATE_DTO__KEY:
				setKey((ModuleKeyDTO)null);
				return;
			case Cm2Package.MODULE_STATE_DTO__POLICY_KEYS:
				getPolicyKeys().clear();
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
			case Cm2Package.MODULE_STATE_DTO__CONSENT_STATE:
				return isSetConsentState();
			case Cm2Package.MODULE_STATE_DTO__KEY:
				return key != null;
			case Cm2Package.MODULE_STATE_DTO__POLICY_KEYS:
				return policyKeys != null && !policyKeys.isEmpty();
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
		result.append(" (consentState: ");
		if (consentStateESet) result.append(consentState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModuleStateDTOImpl
