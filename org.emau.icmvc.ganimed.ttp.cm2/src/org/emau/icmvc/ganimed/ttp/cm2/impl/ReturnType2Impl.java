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
import org.emau.icmvc.ganimed.ttp.cm2.ReturnType2;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdTypeDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ReturnType2Impl#getSignerIdTypes <em>Signer Id Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnType2Impl extends MinimalEObjectImpl.Container implements ReturnType2 {
	/**
	 * The cached value of the '{@link #getSignerIdTypes() <em>Signer Id Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIdTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SignerIdTypeDTO> signerIdTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getReturnType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignerIdTypeDTO> getSignerIdTypes() {
		if (signerIdTypes == null) {
			signerIdTypes = new EObjectContainmentEList<SignerIdTypeDTO>(SignerIdTypeDTO.class, this, Cm2Package.RETURN_TYPE2__SIGNER_ID_TYPES);
		}
		return signerIdTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.RETURN_TYPE2__SIGNER_ID_TYPES:
				return ((InternalEList<?>)getSignerIdTypes()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.RETURN_TYPE2__SIGNER_ID_TYPES:
				return getSignerIdTypes();
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
			case Cm2Package.RETURN_TYPE2__SIGNER_ID_TYPES:
				getSignerIdTypes().clear();
				getSignerIdTypes().addAll((Collection<? extends SignerIdTypeDTO>)newValue);
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
			case Cm2Package.RETURN_TYPE2__SIGNER_ID_TYPES:
				getSignerIdTypes().clear();
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
			case Cm2Package.RETURN_TYPE2__SIGNER_ID_TYPES:
				return signerIdTypes != null && !signerIdTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReturnType2Impl
