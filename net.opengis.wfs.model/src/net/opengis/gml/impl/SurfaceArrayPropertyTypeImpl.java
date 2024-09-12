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
package net.opengis.gml.impl;

import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.SurfaceArrayPropertyType;

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
 * An implementation of the model object '<em><b>Surface Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.SurfaceArrayPropertyTypeImpl#getSurfaceGroup <em>Surface Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.SurfaceArrayPropertyTypeImpl#getSurface <em>Surface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfaceArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements SurfaceArrayPropertyType {
	/**
	 * The cached value of the '{@link #getSurfaceGroup() <em>Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap surfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getSurfaceArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSurfaceGroup() {
		if (surfaceGroup == null) {
			surfaceGroup = new BasicFeatureMap(this, GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP);
		}
		return surfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractSurfaceType> getSurface() {
		return getSurfaceGroup().list(GMLPackage.eINSTANCE.getSurfaceArrayPropertyType_Surface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				return ((InternalEList<?>)getSurfaceGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE:
				return ((InternalEList<?>)getSurface()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				if (coreType) return getSurfaceGroup();
				return ((FeatureMap.Internal)getSurfaceGroup()).getWrapper();
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE:
				return getSurface();
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
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				((FeatureMap.Internal)getSurfaceGroup()).set(newValue);
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
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				getSurfaceGroup().clear();
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
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				return surfaceGroup != null && !surfaceGroup.isEmpty();
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE:
				return !getSurface().isEmpty();
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
		result.append(" (surfaceGroup: ");
		result.append(surfaceGroup);
		result.append(')');
		return result.toString();
	}

} //SurfaceArrayPropertyTypeImpl
