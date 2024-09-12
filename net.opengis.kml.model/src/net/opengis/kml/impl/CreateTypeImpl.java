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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractContainerType;
import net.opengis.kml.CreateType;
import net.opengis.kml.KMLPackage;

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
 * An implementation of the model object '<em><b>Create Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.CreateTypeImpl#getAbstractContainerGroupGroup <em>Abstract Container Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.CreateTypeImpl#getAbstractContainerGroup <em>Abstract Container Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateTypeImpl extends MinimalEObjectImpl.Container implements CreateType {
	/**
	 * The cached value of the '{@link #getAbstractContainerGroupGroup() <em>Abstract Container Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractContainerGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractContainerGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getCreateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractContainerGroupGroup() {
		if (abstractContainerGroupGroup == null) {
			abstractContainerGroupGroup = new BasicFeatureMap(this, KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP);
		}
		return abstractContainerGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractContainerType> getAbstractContainerGroup() {
		return getAbstractContainerGroupGroup().list(KMLPackage.eINSTANCE.getCreateType_AbstractContainerGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractContainerGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP:
				return ((InternalEList<?>)getAbstractContainerGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP:
				if (coreType) return getAbstractContainerGroupGroup();
				return ((FeatureMap.Internal)getAbstractContainerGroupGroup()).getWrapper();
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP:
				return getAbstractContainerGroup();
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
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractContainerGroupGroup()).set(newValue);
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
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP:
				getAbstractContainerGroupGroup().clear();
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
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP:
				return abstractContainerGroupGroup != null && !abstractContainerGroupGroup.isEmpty();
			case KMLPackage.CREATE_TYPE__ABSTRACT_CONTAINER_GROUP:
				return !getAbstractContainerGroup().isEmpty();
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
		result.append(" (abstractContainerGroupGroup: ");
		result.append(abstractContainerGroupGroup);
		result.append(')');
		return result.toString();
	}

} //CreateTypeImpl
