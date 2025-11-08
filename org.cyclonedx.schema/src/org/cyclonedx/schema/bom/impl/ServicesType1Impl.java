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
import org.cyclonedx.schema.bom.Service;
import org.cyclonedx.schema.bom.ServicesType1;

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
 * An implementation of the model object '<em><b>Services Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServicesType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServicesType1Impl#getService <em>Service</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ServicesType1Impl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicesType1Impl extends MinimalEObjectImpl.Container implements ServicesType1 {
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
	protected ServicesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getServicesType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.SERVICES_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getService() {
		return getGroup().list(BOMPackage.eINSTANCE.getServicesType1_Service());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(BOMPackage.eINSTANCE.getServicesType1_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.SERVICES_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.SERVICES_TYPE1__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case BOMPackage.SERVICES_TYPE1__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.SERVICES_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.SERVICES_TYPE1__SERVICE:
				return getService();
			case BOMPackage.SERVICES_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.SERVICES_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.SERVICES_TYPE1__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case BOMPackage.SERVICES_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.SERVICES_TYPE1__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.SERVICES_TYPE1__SERVICE:
				getService().clear();
				return;
			case BOMPackage.SERVICES_TYPE1__ANY:
				getAny().clear();
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
			case BOMPackage.SERVICES_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.SERVICES_TYPE1__SERVICE:
				return !getService().isEmpty();
			case BOMPackage.SERVICES_TYPE1__ANY:
				return !getAny().isEmpty();
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

} //ServicesType1Impl
