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

import java.util.Collection;

import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.AliasType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.ResourceMapType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ResourceMapTypeImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ResourceMapTypeImpl#getResourceMapSimpleExtensionGroupGroup <em>Resource Map Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ResourceMapTypeImpl#getResourceMapSimpleExtensionGroup <em>Resource Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ResourceMapTypeImpl#getResourceMapObjectExtensionGroupGroup <em>Resource Map Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ResourceMapTypeImpl#getResourceMapObjectExtensionGroup <em>Resource Map Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceMapTypeImpl extends AbstractObjectTypeImpl implements ResourceMapType {
	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<AliasType> alias;

	/**
	 * The cached value of the '{@link #getResourceMapSimpleExtensionGroupGroup() <em>Resource Map Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMapSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap resourceMapSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getResourceMapObjectExtensionGroupGroup() <em>Resource Map Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMapObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap resourceMapObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getResourceMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AliasType> getAlias() {
		if (alias == null) {
			alias = new EObjectContainmentEList<AliasType>(AliasType.class, this, KMLPackage.RESOURCE_MAP_TYPE__ALIAS);
		}
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getResourceMapSimpleExtensionGroupGroup() {
		if (resourceMapSimpleExtensionGroupGroup == null) {
			resourceMapSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return resourceMapSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getResourceMapSimpleExtensionGroup() {
		return getResourceMapSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getResourceMapType_ResourceMapSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getResourceMapObjectExtensionGroupGroup() {
		if (resourceMapObjectExtensionGroupGroup == null) {
			resourceMapObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return resourceMapObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getResourceMapObjectExtensionGroup() {
		return getResourceMapObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getResourceMapType_ResourceMapObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.RESOURCE_MAP_TYPE__ALIAS:
				return ((InternalEList<?>)getAlias()).basicRemove(otherEnd, msgs);
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getResourceMapSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getResourceMapObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getResourceMapObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.RESOURCE_MAP_TYPE__ALIAS:
				return getAlias();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getResourceMapSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getResourceMapSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP:
				return getResourceMapSimpleExtensionGroup();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getResourceMapObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getResourceMapObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP:
				return getResourceMapObjectExtensionGroup();
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
			case KMLPackage.RESOURCE_MAP_TYPE__ALIAS:
				getAlias().clear();
				getAlias().addAll((Collection<? extends AliasType>)newValue);
				return;
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getResourceMapSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getResourceMapObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.RESOURCE_MAP_TYPE__ALIAS:
				getAlias().clear();
				return;
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				getResourceMapSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				getResourceMapObjectExtensionGroupGroup().clear();
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
			case KMLPackage.RESOURCE_MAP_TYPE__ALIAS:
				return alias != null && !alias.isEmpty();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP:
				return resourceMapSimpleExtensionGroupGroup != null && !resourceMapSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP:
				return !getResourceMapSimpleExtensionGroup().isEmpty();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP:
				return resourceMapObjectExtensionGroupGroup != null && !resourceMapObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP:
				return !getResourceMapObjectExtensionGroup().isEmpty();
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
		result.append(" (resourceMapSimpleExtensionGroupGroup: ");
		result.append(resourceMapSimpleExtensionGroupGroup);
		result.append(", resourceMapObjectExtensionGroupGroup: ");
		result.append(resourceMapObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ResourceMapTypeImpl
