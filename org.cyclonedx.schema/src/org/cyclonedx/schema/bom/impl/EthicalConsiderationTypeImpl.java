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
import org.cyclonedx.schema.bom.EthicalConsiderationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethical Consideration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EthicalConsiderationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EthicalConsiderationTypeImpl#getMitigationStrategy <em>Mitigation Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthicalConsiderationTypeImpl extends MinimalEObjectImpl.Container implements EthicalConsiderationType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMitigationStrategy() <em>Mitigation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String MITIGATION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMitigationStrategy() <em>Mitigation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategy()
	 * @generated
	 * @ordered
	 */
	protected String mitigationStrategy = MITIGATION_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthicalConsiderationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getEthicalConsiderationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ETHICAL_CONSIDERATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMitigationStrategy() {
		return mitigationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMitigationStrategy(String newMitigationStrategy) {
		String oldMitigationStrategy = mitigationStrategy;
		mitigationStrategy = newMitigationStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ETHICAL_CONSIDERATION_TYPE__MITIGATION_STRATEGY, oldMitigationStrategy, mitigationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__NAME:
				return getName();
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__MITIGATION_STRATEGY:
				return getMitigationStrategy();
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
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__MITIGATION_STRATEGY:
				setMitigationStrategy((String)newValue);
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
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__MITIGATION_STRATEGY:
				setMitigationStrategy(MITIGATION_STRATEGY_EDEFAULT);
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
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE__MITIGATION_STRATEGY:
				return MITIGATION_STRATEGY_EDEFAULT == null ? mitigationStrategy != null : !MITIGATION_STRATEGY_EDEFAULT.equals(mitigationStrategy);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mitigationStrategy: ");
		result.append(mitigationStrategy);
		result.append(')');
		return result.toString();
	}

} //EthicalConsiderationTypeImpl
