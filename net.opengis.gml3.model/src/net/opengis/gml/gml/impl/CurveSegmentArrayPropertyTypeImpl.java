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

import net.opengis.gml.gml.AbstractCurveSegmentType;
import net.opengis.gml.gml.CurveSegmentArrayPropertyType;
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
 * An implementation of the model object '<em><b>Curve Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.CurveSegmentArrayPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CurveSegmentArrayPropertyTypeImpl#getAbstractCurveSegmentGroup <em>Abstract Curve Segment Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.CurveSegmentArrayPropertyTypeImpl#getAbstractCurveSegment <em>Abstract Curve Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveSegmentArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements CurveSegmentArrayPropertyType {
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
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractCurveSegmentGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getCurveSegmentArrayPropertyType_AbstractCurveSegmentGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCurveSegmentType> getAbstractCurveSegment() {
		return getAbstractCurveSegmentGroup().list(GMLPackage.eINSTANCE.getCurveSegmentArrayPropertyType_AbstractCurveSegment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT_GROUP:
				return ((InternalEList<?>)getAbstractCurveSegmentGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT:
				return ((InternalEList<?>)getAbstractCurveSegment()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT_GROUP:
				if (coreType) return getAbstractCurveSegmentGroup();
				return ((FeatureMap.Internal)getAbstractCurveSegmentGroup()).getWrapper();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT:
				return getAbstractCurveSegment();
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT_GROUP:
				((FeatureMap.Internal)getAbstractCurveSegmentGroup()).set(newValue);
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT_GROUP:
				getAbstractCurveSegmentGroup().clear();
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
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT_GROUP:
				return !getAbstractCurveSegmentGroup().isEmpty();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_SEGMENT:
				return !getAbstractCurveSegment().isEmpty();
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

} //CurveSegmentArrayPropertyTypeImpl
