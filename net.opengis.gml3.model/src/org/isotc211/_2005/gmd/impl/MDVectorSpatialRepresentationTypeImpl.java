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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDGeometricObjectsPropertyType;
import org.isotc211._2005.gmd.MDTopologyLevelCodePropertyType;
import org.isotc211._2005.gmd.MDVectorSpatialRepresentationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Vector Spatial Representation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDVectorSpatialRepresentationTypeImpl#getTopologyLevel <em>Topology Level</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDVectorSpatialRepresentationTypeImpl#getGeometricObjects <em>Geometric Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDVectorSpatialRepresentationTypeImpl extends AbstractMDSpatialRepresentationTypeImpl implements MDVectorSpatialRepresentationType {
	/**
	 * The cached value of the '{@link #getTopologyLevel() <em>Topology Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyLevel()
	 * @generated
	 * @ordered
	 */
	protected MDTopologyLevelCodePropertyType topologyLevel;

	/**
	 * The cached value of the '{@link #getGeometricObjects() <em>Geometric Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<MDGeometricObjectsPropertyType> geometricObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDVectorSpatialRepresentationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDVectorSpatialRepresentationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDTopologyLevelCodePropertyType getTopologyLevel() {
		return topologyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyLevel(MDTopologyLevelCodePropertyType newTopologyLevel, NotificationChain msgs) {
		MDTopologyLevelCodePropertyType oldTopologyLevel = topologyLevel;
		topologyLevel = newTopologyLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL, oldTopologyLevel, newTopologyLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopologyLevel(MDTopologyLevelCodePropertyType newTopologyLevel) {
		if (newTopologyLevel != topologyLevel) {
			NotificationChain msgs = null;
			if (topologyLevel != null)
				msgs = ((InternalEObject)topologyLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL, null, msgs);
			if (newTopologyLevel != null)
				msgs = ((InternalEObject)newTopologyLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL, null, msgs);
			msgs = basicSetTopologyLevel(newTopologyLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL, newTopologyLevel, newTopologyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDGeometricObjectsPropertyType> getGeometricObjects() {
		if (geometricObjects == null) {
			geometricObjects = new EObjectContainmentEList<MDGeometricObjectsPropertyType>(MDGeometricObjectsPropertyType.class, this, GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__GEOMETRIC_OBJECTS);
		}
		return geometricObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL:
				return basicSetTopologyLevel(null, msgs);
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__GEOMETRIC_OBJECTS:
				return ((InternalEList<?>)getGeometricObjects()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL:
				return getTopologyLevel();
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__GEOMETRIC_OBJECTS:
				return getGeometricObjects();
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
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL:
				setTopologyLevel((MDTopologyLevelCodePropertyType)newValue);
				return;
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__GEOMETRIC_OBJECTS:
				getGeometricObjects().clear();
				getGeometricObjects().addAll((Collection<? extends MDGeometricObjectsPropertyType>)newValue);
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
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL:
				setTopologyLevel((MDTopologyLevelCodePropertyType)null);
				return;
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__GEOMETRIC_OBJECTS:
				getGeometricObjects().clear();
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
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__TOPOLOGY_LEVEL:
				return topologyLevel != null;
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE__GEOMETRIC_OBJECTS:
				return geometricObjects != null && !geometricObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDVectorSpatialRepresentationTypeImpl
