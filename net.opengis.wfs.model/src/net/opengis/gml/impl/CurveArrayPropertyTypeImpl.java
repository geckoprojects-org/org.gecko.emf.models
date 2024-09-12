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

import net.opengis.gml.AbstractCurveType;
import net.opengis.gml.CurveArrayPropertyType;
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
 * An implementation of the model object '<em><b>Curve Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CurveArrayPropertyTypeImpl#getCurveGroup <em>Curve Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CurveArrayPropertyTypeImpl#getCurve <em>Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements CurveArrayPropertyType {
	/**
	 * The cached value of the '{@link #getCurveGroup() <em>Curve Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap curveGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCurveArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCurveGroup() {
		if (curveGroup == null) {
			curveGroup = new BasicFeatureMap(this, GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE_GROUP);
		}
		return curveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCurveType> getCurve() {
		return getCurveGroup().list(GMLPackage.eINSTANCE.getCurveArrayPropertyType_Curve());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE_GROUP:
				return ((InternalEList<?>)getCurveGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE:
				return ((InternalEList<?>)getCurve()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE_GROUP:
				if (coreType) return getCurveGroup();
				return ((FeatureMap.Internal)getCurveGroup()).getWrapper();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE:
				return getCurve();
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE_GROUP:
				((FeatureMap.Internal)getCurveGroup()).set(newValue);
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE_GROUP:
				getCurveGroup().clear();
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE_GROUP:
				return curveGroup != null && !curveGroup.isEmpty();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__CURVE:
				return !getCurve().isEmpty();
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
		result.append(" (curveGroup: ");
		result.append(curveGroup);
		result.append(')');
		return result.toString();
	}

} //CurveArrayPropertyTypeImpl
