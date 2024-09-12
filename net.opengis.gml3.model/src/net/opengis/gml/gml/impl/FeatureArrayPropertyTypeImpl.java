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

import net.opengis.gml.gml.AbstractFeatureType;
import net.opengis.gml.gml.FeatureArrayPropertyType;
import net.opengis.gml.gml.GMLPackage;

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
 *   <li>{@link net.opengis.gml.gml.impl.FeatureArrayPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FeatureArrayPropertyTypeImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.FeatureArrayPropertyTypeImpl#getAbstractFeature <em>Abstract Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements FeatureArrayPropertyType {
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
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getFeatureArrayPropertyType_AbstractFeatureGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeatureType> getAbstractFeature() {
		return getAbstractFeatureGroup().list(GMLPackage.eINSTANCE.getFeatureArrayPropertyType_AbstractFeature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE:
				return ((InternalEList<?>)getAbstractFeature()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE_GROUP:
				if (coreType) return getAbstractFeatureGroup();
				return ((FeatureMap.Internal)getAbstractFeatureGroup()).getWrapper();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE:
				return getAbstractFeature();
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE_GROUP:
				((FeatureMap.Internal)getAbstractFeatureGroup()).set(newValue);
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE_GROUP:
				getAbstractFeatureGroup().clear();
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
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE_GROUP:
				return !getAbstractFeatureGroup().isEmpty();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE__ABSTRACT_FEATURE:
				return !getAbstractFeature().isEmpty();
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

} //FeatureArrayPropertyTypeImpl
