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
import org.cyclonedx.schema.bom.MitigationStrategiesType1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mitigation Strategies Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.MitigationStrategiesType1Impl#getMitigationStrategy <em>Mitigation Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MitigationStrategiesType1Impl extends MinimalEObjectImpl.Container implements MitigationStrategiesType1 {
	/**
	 * The cached value of the '{@link #getMitigationStrategy() <em>Mitigation Strategy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMitigationStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mitigationStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MitigationStrategiesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getMitigationStrategiesType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMitigationStrategy() {
		if (mitigationStrategy == null) {
			mitigationStrategy = new EDataTypeEList<String>(String.class, this, BOMPackage.MITIGATION_STRATEGIES_TYPE1__MITIGATION_STRATEGY);
		}
		return mitigationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1__MITIGATION_STRATEGY:
				return getMitigationStrategy();
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
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1__MITIGATION_STRATEGY:
				getMitigationStrategy().clear();
				getMitigationStrategy().addAll((Collection<? extends String>)newValue);
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
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1__MITIGATION_STRATEGY:
				getMitigationStrategy().clear();
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
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1__MITIGATION_STRATEGY:
				return mitigationStrategy != null && !mitigationStrategy.isEmpty();
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
		result.append(" (mitigationStrategy: ");
		result.append(mitigationStrategy);
		result.append(')');
		return result.toString();
	}

} //MitigationStrategiesType1Impl
