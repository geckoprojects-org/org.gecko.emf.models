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
import org.cyclonedx.schema.bom.EnvironmentVarsType1;
import org.cyclonedx.schema.bom.PropertyType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Vars Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnvironmentVarsType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnvironmentVarsType1Impl#getEnvironmentVar <em>Environment Var</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnvironmentVarsType1Impl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentVarsType1Impl extends MinimalEObjectImpl.Container implements EnvironmentVarsType1 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentVarsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getEnvironmentVarsType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.ENVIRONMENT_VARS_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyType> getEnvironmentVar() {
		return getGroup().list(BOMPackage.eINSTANCE.getEnvironmentVarsType1_EnvironmentVar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValue() {
		return getGroup().list(BOMPackage.eINSTANCE.getEnvironmentVarsType1_Value());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__ENVIRONMENT_VAR:
				return ((InternalEList<?>)getEnvironmentVar()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__ENVIRONMENT_VAR:
				return getEnvironmentVar();
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__VALUE:
				return getValue();
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
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__ENVIRONMENT_VAR:
				getEnvironmentVar().clear();
				getEnvironmentVar().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
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
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__ENVIRONMENT_VAR:
				getEnvironmentVar().clear();
				return;
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__VALUE:
				getValue().clear();
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
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__ENVIRONMENT_VAR:
				return !getEnvironmentVar().isEmpty();
			case BOMPackage.ENVIRONMENT_VARS_TYPE1__VALUE:
				return !getValue().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //EnvironmentVarsType1Impl
