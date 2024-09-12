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
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.KMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Container Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.AbstractContainerTypeImpl#getAbstractContainerSimpleExtensionGroupGroup <em>Abstract Container Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractContainerTypeImpl#getAbstractContainerSimpleExtensionGroup <em>Abstract Container Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractContainerTypeImpl#getAbstractContainerObjectExtensionGroupGroup <em>Abstract Container Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.AbstractContainerTypeImpl#getAbstractContainerObjectExtensionGroup <em>Abstract Container Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractContainerTypeImpl extends AbstractFeatureTypeImpl implements AbstractContainerType {
	/**
	 * The cached value of the '{@link #getAbstractContainerSimpleExtensionGroupGroup() <em>Abstract Container Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractContainerSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractContainerSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getAbstractContainerObjectExtensionGroupGroup() <em>Abstract Container Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractContainerObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractContainerObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContainerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getAbstractContainerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractContainerSimpleExtensionGroupGroup() {
		if (abstractContainerSimpleExtensionGroupGroup == null) {
			abstractContainerSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return abstractContainerSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getAbstractContainerSimpleExtensionGroup() {
		return getAbstractContainerSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractContainerType_AbstractContainerSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractContainerObjectExtensionGroupGroup() {
		if (abstractContainerObjectExtensionGroupGroup == null) {
			abstractContainerObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return abstractContainerObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getAbstractContainerObjectExtensionGroup() {
		return getAbstractContainerObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getAbstractContainerType_AbstractContainerObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractContainerSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractContainerObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractContainerObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractContainerSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractContainerSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP:
				return getAbstractContainerSimpleExtensionGroup();
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getAbstractContainerObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getAbstractContainerObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP:
				return getAbstractContainerObjectExtensionGroup();
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
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractContainerSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractContainerObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP:
				getAbstractContainerSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP:
				getAbstractContainerObjectExtensionGroupGroup().clear();
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
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP:
				return abstractContainerSimpleExtensionGroupGroup != null && !abstractContainerSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP:
				return !getAbstractContainerSimpleExtensionGroup().isEmpty();
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP:
				return abstractContainerObjectExtensionGroupGroup != null && !abstractContainerObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP:
				return !getAbstractContainerObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractContainerSimpleExtensionGroupGroup: ");
		result.append(abstractContainerSimpleExtensionGroupGroup);
		result.append(", abstractContainerObjectExtensionGroupGroup: ");
		result.append(abstractContainerObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractContainerTypeImpl
