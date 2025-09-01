/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.ogc.features.impl;

import net.opengis.ogc.features.Extent;
import net.opengis.ogc.features.OGCFeaturesPackage;
import net.opengis.ogc.features.SpatialExtent;
import net.opengis.ogc.features.TemporalExtent;

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
 * An implementation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.impl.ExtentImpl#getSpatialExtentGroup <em>Spatial Extent Group</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.ExtentImpl#getSpatialExtent <em>Spatial Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.ExtentImpl#getTemporalExtentGroup <em>Temporal Extent Group</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.ExtentImpl#getTemporalExtent <em>Temporal Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtentImpl extends MinimalEObjectImpl.Container implements Extent {
	/**
	 * The cached value of the '{@link #getSpatialExtentGroup() <em>Spatial Extent Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialExtentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap spatialExtentGroup;

	/**
	 * The cached value of the '{@link #getTemporalExtentGroup() <em>Temporal Extent Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalExtentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap temporalExtentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCFeaturesPackage.Literals.EXTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSpatialExtentGroup() {
		if (spatialExtentGroup == null) {
			spatialExtentGroup = new BasicFeatureMap(this, OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT_GROUP);
		}
		return spatialExtentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpatialExtent> getSpatialExtent() {
		return getSpatialExtentGroup().list(OGCFeaturesPackage.Literals.EXTENT__SPATIAL_EXTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTemporalExtentGroup() {
		if (temporalExtentGroup == null) {
			temporalExtentGroup = new BasicFeatureMap(this, OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT_GROUP);
		}
		return temporalExtentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalExtent> getTemporalExtent() {
		return getTemporalExtentGroup().list(OGCFeaturesPackage.Literals.EXTENT__TEMPORAL_EXTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT_GROUP:
				return ((InternalEList<?>)getSpatialExtentGroup()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT:
				return ((InternalEList<?>)getSpatialExtent()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT_GROUP:
				return ((InternalEList<?>)getTemporalExtentGroup()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT:
				return ((InternalEList<?>)getTemporalExtent()).basicRemove(otherEnd, msgs);
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
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT_GROUP:
				if (coreType) return getSpatialExtentGroup();
				return ((FeatureMap.Internal)getSpatialExtentGroup()).getWrapper();
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT:
				return getSpatialExtent();
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT_GROUP:
				if (coreType) return getTemporalExtentGroup();
				return ((FeatureMap.Internal)getTemporalExtentGroup()).getWrapper();
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT:
				return getTemporalExtent();
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
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT_GROUP:
				((FeatureMap.Internal)getSpatialExtentGroup()).set(newValue);
				return;
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT_GROUP:
				((FeatureMap.Internal)getTemporalExtentGroup()).set(newValue);
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
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT_GROUP:
				getSpatialExtentGroup().clear();
				return;
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT_GROUP:
				getTemporalExtentGroup().clear();
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
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT_GROUP:
				return spatialExtentGroup != null && !spatialExtentGroup.isEmpty();
			case OGCFeaturesPackage.EXTENT__SPATIAL_EXTENT:
				return !getSpatialExtent().isEmpty();
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT_GROUP:
				return temporalExtentGroup != null && !temporalExtentGroup.isEmpty();
			case OGCFeaturesPackage.EXTENT__TEMPORAL_EXTENT:
				return !getTemporalExtent().isEmpty();
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
		result.append(" (spatialExtentGroup: ");
		result.append(spatialExtentGroup);
		result.append(", temporalExtentGroup: ");
		result.append(temporalExtentGroup);
		result.append(')');
		return result.toString();
	}

} //ExtentImpl
