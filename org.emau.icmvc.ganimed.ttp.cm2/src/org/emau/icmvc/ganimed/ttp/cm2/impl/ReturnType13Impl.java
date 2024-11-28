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
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType13;
import org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type13</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType13Impl#getSignedPolicies <em>Signed Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnType13Impl extends MinimalEObjectImpl.Container implements ReturnType13 {
	/**
	 * The cached value of the '{@link #getSignedPolicies() <em>Signed Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignedPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<SignedPolicyDTO> signedPolicies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnType13Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getReturnType13();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignedPolicyDTO> getSignedPolicies() {
		if (signedPolicies == null) {
			signedPolicies = new EObjectContainmentEList<SignedPolicyDTO>(SignedPolicyDTO.class, this, Cm2Package.RETURN_TYPE13__SIGNED_POLICIES);
		}
		return signedPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.RETURN_TYPE13__SIGNED_POLICIES:
				return ((InternalEList<?>)getSignedPolicies()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.RETURN_TYPE13__SIGNED_POLICIES:
				return getSignedPolicies();
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
			case Cm2Package.RETURN_TYPE13__SIGNED_POLICIES:
				getSignedPolicies().clear();
				getSignedPolicies().addAll((Collection<? extends SignedPolicyDTO>)newValue);
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
			case Cm2Package.RETURN_TYPE13__SIGNED_POLICIES:
				getSignedPolicies().clear();
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
			case Cm2Package.RETURN_TYPE13__SIGNED_POLICIES:
				return signedPolicies != null && !signedPolicies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReturnType13Impl
