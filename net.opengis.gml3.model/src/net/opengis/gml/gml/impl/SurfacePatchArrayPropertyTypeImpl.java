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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.AbstractSurfacePatchType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.SurfacePatchArrayPropertyType;

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
 * An implementation of the model object '<em><b>Surface Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.SurfacePatchArrayPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.SurfacePatchArrayPropertyTypeImpl#getAbstractSurfacePatchGroup <em>Abstract Surface Patch Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.SurfacePatchArrayPropertyTypeImpl#getAbstractSurfacePatch <em>Abstract Surface Patch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfacePatchArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements SurfacePatchArrayPropertyType {
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
	protected SurfacePatchArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getSurfacePatchArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractSurfacePatchGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getSurfacePatchArrayPropertyType_AbstractSurfacePatchGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractSurfacePatchType> getAbstractSurfacePatch() {
		return getAbstractSurfacePatchGroup().list(GMLPackage.eINSTANCE.getSurfacePatchArrayPropertyType_AbstractSurfacePatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH_GROUP:
				return ((InternalEList<?>)getAbstractSurfacePatchGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH:
				return ((InternalEList<?>)getAbstractSurfacePatch()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH_GROUP:
				if (coreType) return getAbstractSurfacePatchGroup();
				return ((FeatureMap.Internal)getAbstractSurfacePatchGroup()).getWrapper();
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH:
				return getAbstractSurfacePatch();
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
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH_GROUP:
				((FeatureMap.Internal)getAbstractSurfacePatchGroup()).set(newValue);
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
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH_GROUP:
				getAbstractSurfacePatchGroup().clear();
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
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH_GROUP:
				return !getAbstractSurfacePatchGroup().isEmpty();
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__ABSTRACT_SURFACE_PATCH:
				return !getAbstractSurfacePatch().isEmpty();
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

} //SurfacePatchArrayPropertyTypeImpl
