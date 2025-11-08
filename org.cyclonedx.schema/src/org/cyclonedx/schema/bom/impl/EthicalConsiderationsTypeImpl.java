/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.EthicalConsiderationType;
import org.cyclonedx.schema.bom.EthicalConsiderationsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethical Considerations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EthicalConsiderationsTypeImpl#getEthicalConsideration <em>Ethical Consideration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthicalConsiderationsTypeImpl extends MinimalEObjectImpl.Container implements EthicalConsiderationsType {
	/**
	 * The cached value of the '{@link #getEthicalConsideration() <em>Ethical Consideration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthicalConsideration()
	 * @generated
	 * @ordered
	 */
	protected EList<EthicalConsiderationType> ethicalConsideration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthicalConsiderationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getEthicalConsiderationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EthicalConsiderationType> getEthicalConsideration() {
		if (ethicalConsideration == null) {
			ethicalConsideration = new EObjectContainmentEList<EthicalConsiderationType>(EthicalConsiderationType.class, this, BOMPackage.ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION);
		}
		return ethicalConsideration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION:
				return ((InternalEList<?>)getEthicalConsideration()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION:
				return getEthicalConsideration();
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
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION:
				getEthicalConsideration().clear();
				getEthicalConsideration().addAll((Collection<? extends EthicalConsiderationType>)newValue);
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
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION:
				getEthicalConsideration().clear();
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
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE__ETHICAL_CONSIDERATION:
				return ethicalConsideration != null && !ethicalConsideration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EthicalConsiderationsTypeImpl
