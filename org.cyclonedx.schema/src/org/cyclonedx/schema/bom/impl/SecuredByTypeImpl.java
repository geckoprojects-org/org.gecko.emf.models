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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.SecuredByType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secured By Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SecuredByTypeImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.SecuredByTypeImpl#getAlgorithmRef <em>Algorithm Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuredByTypeImpl extends MinimalEObjectImpl.Container implements SecuredByType {
	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected String mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmRef() <em>Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmRef() <em>Algorithm Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmRef()
	 * @generated
	 * @ordered
	 */
	protected String algorithmRef = ALGORITHM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuredByTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getSecuredByType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanism(String newMechanism) {
		String oldMechanism = mechanism;
		mechanism = newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SECURED_BY_TYPE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithmRef() {
		return algorithmRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithmRef(String newAlgorithmRef) {
		String oldAlgorithmRef = algorithmRef;
		algorithmRef = newAlgorithmRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.SECURED_BY_TYPE__ALGORITHM_REF, oldAlgorithmRef, algorithmRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.SECURED_BY_TYPE__MECHANISM:
				return getMechanism();
			case BOMPackage.SECURED_BY_TYPE__ALGORITHM_REF:
				return getAlgorithmRef();
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
			case BOMPackage.SECURED_BY_TYPE__MECHANISM:
				setMechanism((String)newValue);
				return;
			case BOMPackage.SECURED_BY_TYPE__ALGORITHM_REF:
				setAlgorithmRef((String)newValue);
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
			case BOMPackage.SECURED_BY_TYPE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case BOMPackage.SECURED_BY_TYPE__ALGORITHM_REF:
				setAlgorithmRef(ALGORITHM_REF_EDEFAULT);
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
			case BOMPackage.SECURED_BY_TYPE__MECHANISM:
				return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
			case BOMPackage.SECURED_BY_TYPE__ALGORITHM_REF:
				return ALGORITHM_REF_EDEFAULT == null ? algorithmRef != null : !ALGORITHM_REF_EDEFAULT.equals(algorithmRef);
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
		result.append(" (mechanism: ");
		result.append(mechanism);
		result.append(", algorithmRef: ");
		result.append(algorithmRef);
		result.append(')');
		return result.toString();
	}

} //SecuredByTypeImpl
