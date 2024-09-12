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
import net.opengis.gml.TrianglePatchArrayPropertyType;
import net.opengis.gml.TriangulatedSurfaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triangulated Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TriangulatedSurfaceTypeImpl#getTrianglePatches <em>Triangle Patches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangulatedSurfaceTypeImpl extends SurfaceTypeImpl implements TriangulatedSurfaceType {
	/**
	 * The cached value of the '{@link #getTrianglePatches() <em>Triangle Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrianglePatches()
	 * @generated
	 * @ordered
	 */
	protected TrianglePatchArrayPropertyType trianglePatches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangulatedSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTriangulatedSurfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrianglePatchArrayPropertyType getTrianglePatches() {
		return trianglePatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrianglePatches(TrianglePatchArrayPropertyType newTrianglePatches, NotificationChain msgs) {
		TrianglePatchArrayPropertyType oldTrianglePatches = trianglePatches;
		trianglePatches = newTrianglePatches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES, oldTrianglePatches, newTrianglePatches);
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
	public void setTrianglePatches(TrianglePatchArrayPropertyType newTrianglePatches) {
		if (newTrianglePatches != trianglePatches) {
			NotificationChain msgs = null;
			if (trianglePatches != null)
				msgs = ((InternalEObject)trianglePatches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES, null, msgs);
			if (newTrianglePatches != null)
				msgs = ((InternalEObject)newTrianglePatches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES, null, msgs);
			msgs = basicSetTrianglePatches(newTrianglePatches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES, newTrianglePatches, newTrianglePatches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES:
				return basicSetTrianglePatches(null, msgs);
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
			case GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES:
				return getTrianglePatches();
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
			case GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES:
				setTrianglePatches((TrianglePatchArrayPropertyType)newValue);
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
			case GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES:
				setTrianglePatches((TrianglePatchArrayPropertyType)null);
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
			case GMLPackage.TRIANGULATED_SURFACE_TYPE__TRIANGLE_PATCHES:
				return trianglePatches != null;
		}
		return super.eIsSet(featureID);
	}

} //TriangulatedSurfaceTypeImpl
