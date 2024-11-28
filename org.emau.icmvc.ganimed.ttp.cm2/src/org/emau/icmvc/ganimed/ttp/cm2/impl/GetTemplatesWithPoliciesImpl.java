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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.GetTemplatesWithPolicies;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Templates With Policies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetTemplatesWithPoliciesImpl#getPolicyKeyDTOs <em>Policy Key DT Os</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetTemplatesWithPoliciesImpl extends MinimalEObjectImpl.Container implements GetTemplatesWithPolicies {
	/**
	 * The cached value of the '{@link #getPolicyKeyDTOs() <em>Policy Key DT Os</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKeyDTOs()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyKeyDTO> policyKeyDTOs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetTemplatesWithPoliciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetTemplatesWithPolicies();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PolicyKeyDTO> getPolicyKeyDTOs() {
		if (policyKeyDTOs == null) {
			policyKeyDTOs = new EObjectContainmentEList<PolicyKeyDTO>(PolicyKeyDTO.class, this, Cm2Package.GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS);
		}
		return policyKeyDTOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS:
				return ((InternalEList<?>)getPolicyKeyDTOs()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS:
				return getPolicyKeyDTOs();
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
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS:
				getPolicyKeyDTOs().clear();
				getPolicyKeyDTOs().addAll((Collection<? extends PolicyKeyDTO>)newValue);
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
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS:
				getPolicyKeyDTOs().clear();
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
			case Cm2Package.GET_TEMPLATES_WITH_POLICIES__POLICY_KEY_DT_OS:
				return policyKeyDTOs != null && !policyKeyDTOs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GetTemplatesWithPoliciesImpl
