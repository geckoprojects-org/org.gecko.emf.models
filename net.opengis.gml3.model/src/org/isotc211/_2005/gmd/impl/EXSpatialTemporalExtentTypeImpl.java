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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gmd.EXGeographicExtentPropertyType;
import org.isotc211._2005.gmd.EXSpatialTemporalExtentType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Spatial Temporal Extent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXSpatialTemporalExtentTypeImpl#getSpatialExtent <em>Spatial Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXSpatialTemporalExtentTypeImpl extends EXTemporalExtentTypeImpl implements EXSpatialTemporalExtentType {
	/**
	 * The cached value of the '{@link #getSpatialExtent() <em>Spatial Extent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<EXGeographicExtentPropertyType> spatialExtent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXSpatialTemporalExtentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getEXSpatialTemporalExtentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EXGeographicExtentPropertyType> getSpatialExtent() {
		if (spatialExtent == null) {
			spatialExtent = new EObjectContainmentEList<EXGeographicExtentPropertyType>(EXGeographicExtentPropertyType.class, this, GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE__SPATIAL_EXTENT);
		}
		return spatialExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE__SPATIAL_EXTENT:
				return ((InternalEList<?>)getSpatialExtent()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE__SPATIAL_EXTENT:
				return getSpatialExtent();
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
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE__SPATIAL_EXTENT:
				getSpatialExtent().clear();
				getSpatialExtent().addAll((Collection<? extends EXGeographicExtentPropertyType>)newValue);
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
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE__SPATIAL_EXTENT:
				getSpatialExtent().clear();
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
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE__SPATIAL_EXTENT:
				return spatialExtent != null && !spatialExtent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EXSpatialTemporalExtentTypeImpl
