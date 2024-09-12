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

import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.FeatureArrayPropertyType;
import net.opengis.gml.GMLPackage;

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
 * An implementation of the model object '<em><b>Feature Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.FeatureArrayPropertyTypeImpl#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.FeatureArrayPropertyTypeImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements FeatureArrayPropertyType {
	/**
	 * The cached value of the '{@link #getFeatureGroup() <em>Feature Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap featureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getFeatureArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFeatureGroup() {
		if (featureGroup == null) {
			featureGroup = new BasicFeatureMap(this, GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP);
		}
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeatureType> getFeature() {
		return getFeatureGroup().list(GMLPackage.eINSTANCE.getFeatureArrayPropertyType_Feature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				return ((InternalEList<?>)getFeatureGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				if (coreType) return getFeatureGroup();
				return ((FeatureMap.Internal)getFeatureGroup()).getWrapper();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE:
				return getFeature();
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				((FeatureMap.Internal)getFeatureGroup()).set(newValue);
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				getFeatureGroup().clear();
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				return featureGroup != null && !featureGroup.isEmpty();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE:
				return !getFeature().isEmpty();
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
		result.append(" (featureGroup: ");
		result.append(featureGroup);
		result.append(')');
		return result.toString();
	}

} //FeatureArrayPropertyTypeImpl
