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

import net.opengis.gml.AbstractCurveSegmentType;
import net.opengis.gml.CurveSegmentArrayPropertyType;
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
 * An implementation of the model object '<em><b>Curve Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CurveSegmentArrayPropertyTypeImpl#getCurveSegmentGroup <em>Curve Segment Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CurveSegmentArrayPropertyTypeImpl#getCurveSegment <em>Curve Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveSegmentArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements CurveSegmentArrayPropertyType {
	/**
	 * The cached value of the '{@link #getCurveSegmentGroup() <em>Curve Segment Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveSegmentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap curveSegmentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveSegmentArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCurveSegmentArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getCurveSegmentGroup() {
		if (curveSegmentGroup == null) {
			curveSegmentGroup = new BasicFeatureMap(this, GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP);
		}
		return curveSegmentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCurveSegmentType> getCurveSegment() {
		return getCurveSegmentGroup().list(GMLPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				return ((InternalEList<?>)getCurveSegmentGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT:
				return ((InternalEList<?>)getCurveSegment()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				if (coreType) return getCurveSegmentGroup();
				return ((FeatureMap.Internal)getCurveSegmentGroup()).getWrapper();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT:
				return getCurveSegment();
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				((FeatureMap.Internal)getCurveSegmentGroup()).set(newValue);
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				getCurveSegmentGroup().clear();
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				return curveSegmentGroup != null && !curveSegmentGroup.isEmpty();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT:
				return !getCurveSegment().isEmpty();
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
		result.append(" (curveSegmentGroup: ");
		result.append(curveSegmentGroup);
		result.append(')');
		return result.toString();
	}

} //CurveSegmentArrayPropertyTypeImpl
