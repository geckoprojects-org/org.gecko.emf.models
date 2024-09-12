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

import net.opengis.gml.GMLPackage;
import net.opengis.gml.PolygonPatchArrayPropertyType;
import net.opengis.gml.PolyhedralSurfaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyhedral Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.PolyhedralSurfaceTypeImpl#getPolygonPatches <em>Polygon Patches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolyhedralSurfaceTypeImpl extends SurfaceTypeImpl implements PolyhedralSurfaceType {
	/**
	 * The cached value of the '{@link #getPolygonPatches() <em>Polygon Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonPatches()
	 * @generated
	 * @ordered
	 */
	protected PolygonPatchArrayPropertyType polygonPatches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolyhedralSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPolyhedralSurfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonPatchArrayPropertyType getPolygonPatches() {
		return polygonPatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonPatches(PolygonPatchArrayPropertyType newPolygonPatches, NotificationChain msgs) {
		PolygonPatchArrayPropertyType oldPolygonPatches = polygonPatches;
		polygonPatches = newPolygonPatches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES, oldPolygonPatches, newPolygonPatches);
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
	public void setPolygonPatches(PolygonPatchArrayPropertyType newPolygonPatches) {
		if (newPolygonPatches != polygonPatches) {
			NotificationChain msgs = null;
			if (polygonPatches != null)
				msgs = ((InternalEObject)polygonPatches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES, null, msgs);
			if (newPolygonPatches != null)
				msgs = ((InternalEObject)newPolygonPatches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES, null, msgs);
			msgs = basicSetPolygonPatches(newPolygonPatches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES, newPolygonPatches, newPolygonPatches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES:
				return basicSetPolygonPatches(null, msgs);
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
			case GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES:
				return getPolygonPatches();
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
			case GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES:
				setPolygonPatches((PolygonPatchArrayPropertyType)newValue);
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
			case GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES:
				setPolygonPatches((PolygonPatchArrayPropertyType)null);
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
			case GMLPackage.POLYHEDRAL_SURFACE_TYPE__POLYGON_PATCHES:
				return polygonPatches != null;
		}
		return super.eIsSet(featureID);
	}

} //PolyhedralSurfaceTypeImpl
