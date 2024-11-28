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
import org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForPolicyAndSignerIds;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Policy States For Policy And Signer Ids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsImpl#getPolicyKey <em>Policy Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsImpl#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetPolicyStatesForPolicyAndSignerIdsImpl#isUseAliases <em>Use Aliases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPolicyStatesForPolicyAndSignerIdsImpl extends MinimalEObjectImpl.Container implements GetPolicyStatesForPolicyAndSignerIds {
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
	 * The cached value of the '{@link #getSignerIds() <em>Signer Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIds()
	 * @generated
	 * @ordered
	 */
	protected EList<SignerIdDTO> signerIds;

	/**
	 * The default value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ALIASES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected boolean useAliases = USE_ALIASES_EDEFAULT;

	/**
	 * This is true if the Use Aliases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useAliasesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPolicyStatesForPolicyAndSignerIdsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetPolicyStatesForPolicyAndSignerIds();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY, oldPolicyKey, newPolicyKey);
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
				msgs = ((InternalEObject)policyKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY, null, msgs);
			if (newPolicyKey != null)
				msgs = ((InternalEObject)newPolicyKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY, null, msgs);
			msgs = basicSetPolicyKey(newPolicyKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY, newPolicyKey, newPolicyKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignerIdDTO> getSignerIds() {
		if (signerIds == null) {
			signerIds = new EObjectContainmentEList<SignerIdDTO>(SignerIdDTO.class, this, Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS);
		}
		return signerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAliases() {
		return useAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAliases(boolean newUseAliases) {
		boolean oldUseAliases = useAliases;
		useAliases = newUseAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES, oldUseAliases, useAliases, !oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseAliases() {
		boolean oldUseAliases = useAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliases = USE_ALIASES_EDEFAULT;
		useAliasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES, oldUseAliases, USE_ALIASES_EDEFAULT, oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseAliases() {
		return useAliasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY:
				return basicSetPolicyKey(null, msgs);
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS:
				return ((InternalEList<?>)getSignerIds()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY:
				return getPolicyKey();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS:
				return getSignerIds();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES:
				return isUseAliases();
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)newValue);
				return;
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS:
				getSignerIds().clear();
				getSignerIds().addAll((Collection<? extends SignerIdDTO>)newValue);
				return;
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES:
				setUseAliases((Boolean)newValue);
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)null);
				return;
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS:
				getSignerIds().clear();
				return;
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES:
				unsetUseAliases();
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
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__POLICY_KEY:
				return policyKey != null;
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__SIGNER_IDS:
				return signerIds != null && !signerIds.isEmpty();
			case Cm2Package.GET_POLICY_STATES_FOR_POLICY_AND_SIGNER_IDS__USE_ALIASES:
				return isSetUseAliases();
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
		result.append(" (useAliases: ");
		if (useAliasesESet) result.append(useAliases); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GetPolicyStatesForPolicyAndSignerIdsImpl
