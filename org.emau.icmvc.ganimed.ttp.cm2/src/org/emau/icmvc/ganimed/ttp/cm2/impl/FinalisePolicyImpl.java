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
import org.emau.icmvc.ganimed.ttp.cm2.FinalisePolicy;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finalise Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FinalisePolicyImpl#getPolicyKey <em>Policy Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalisePolicyImpl extends MinimalEObjectImpl.Container implements FinalisePolicy {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalisePolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getFinalisePolicy();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.FINALISE_POLICY__POLICY_KEY, oldPolicyKey, newPolicyKey);
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
				msgs = ((InternalEObject)policyKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.FINALISE_POLICY__POLICY_KEY, null, msgs);
			if (newPolicyKey != null)
				msgs = ((InternalEObject)newPolicyKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.FINALISE_POLICY__POLICY_KEY, null, msgs);
			msgs = basicSetPolicyKey(newPolicyKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FINALISE_POLICY__POLICY_KEY, newPolicyKey, newPolicyKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.FINALISE_POLICY__POLICY_KEY:
				return basicSetPolicyKey(null, msgs);
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
			case Cm2Package.FINALISE_POLICY__POLICY_KEY:
				return getPolicyKey();
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
			case Cm2Package.FINALISE_POLICY__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)newValue);
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
			case Cm2Package.FINALISE_POLICY__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)null);
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
			case Cm2Package.FINALISE_POLICY__POLICY_KEY:
				return policyKey != null;
		}
		return super.eIsSet(featureID);
	}

} //FinalisePolicyImpl
