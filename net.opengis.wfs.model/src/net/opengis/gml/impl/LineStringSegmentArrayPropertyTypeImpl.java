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

import java.util.Collection;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.LineStringSegmentArrayPropertyType;
import net.opengis.gml.LineStringSegmentType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line String Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.LineStringSegmentArrayPropertyTypeImpl#getLineStringSegment <em>Line String Segment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStringSegmentArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements LineStringSegmentArrayPropertyType {
	/**
	 * The cached value of the '{@link #getLineStringSegment() <em>Line String Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStringSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<LineStringSegmentType> lineStringSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStringSegmentArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getLineStringSegmentArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LineStringSegmentType> getLineStringSegment() {
		if (lineStringSegment == null) {
			lineStringSegment = new EObjectContainmentEList<LineStringSegmentType>(LineStringSegmentType.class, this, GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE__LINE_STRING_SEGMENT);
		}
		return lineStringSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE__LINE_STRING_SEGMENT:
				return ((InternalEList<?>)getLineStringSegment()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE__LINE_STRING_SEGMENT:
				return getLineStringSegment();
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
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE__LINE_STRING_SEGMENT:
				getLineStringSegment().clear();
				getLineStringSegment().addAll((Collection<? extends LineStringSegmentType>)newValue);
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
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE__LINE_STRING_SEGMENT:
				getLineStringSegment().clear();
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
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE__LINE_STRING_SEGMENT:
				return lineStringSegment != null && !lineStringSegment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LineStringSegmentArrayPropertyTypeImpl
