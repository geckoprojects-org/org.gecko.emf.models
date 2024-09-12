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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.IntegerPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType;
import org.isotc211._2005.gmd.MDGeometricObjectsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Geometric Objects Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeometricObjectsTypeImpl#getGeometricObjectType <em>Geometric Object Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeometricObjectsTypeImpl#getGeometricObjectCount <em>Geometric Object Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDGeometricObjectsTypeImpl extends AbstractObjectTypeImpl implements MDGeometricObjectsType {
	/**
	 * The cached value of the '{@link #getGeometricObjectType() <em>Geometric Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricObjectType()
	 * @generated
	 * @ordered
	 */
	protected MDGeometricObjectTypeCodePropertyType geometricObjectType;

	/**
	 * The cached value of the '{@link #getGeometricObjectCount() <em>Geometric Object Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricObjectCount()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType geometricObjectCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDGeometricObjectsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDGeometricObjectsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeometricObjectTypeCodePropertyType getGeometricObjectType() {
		return geometricObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricObjectType(MDGeometricObjectTypeCodePropertyType newGeometricObjectType, NotificationChain msgs) {
		MDGeometricObjectTypeCodePropertyType oldGeometricObjectType = geometricObjectType;
		geometricObjectType = newGeometricObjectType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE, oldGeometricObjectType, newGeometricObjectType);
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
	public void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType newGeometricObjectType) {
		if (newGeometricObjectType != geometricObjectType) {
			NotificationChain msgs = null;
			if (geometricObjectType != null)
				msgs = ((InternalEObject)geometricObjectType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE, null, msgs);
			if (newGeometricObjectType != null)
				msgs = ((InternalEObject)newGeometricObjectType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE, null, msgs);
			msgs = basicSetGeometricObjectType(newGeometricObjectType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE, newGeometricObjectType, newGeometricObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getGeometricObjectCount() {
		return geometricObjectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricObjectCount(IntegerPropertyType newGeometricObjectCount, NotificationChain msgs) {
		IntegerPropertyType oldGeometricObjectCount = geometricObjectCount;
		geometricObjectCount = newGeometricObjectCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT, oldGeometricObjectCount, newGeometricObjectCount);
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
	public void setGeometricObjectCount(IntegerPropertyType newGeometricObjectCount) {
		if (newGeometricObjectCount != geometricObjectCount) {
			NotificationChain msgs = null;
			if (geometricObjectCount != null)
				msgs = ((InternalEObject)geometricObjectCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT, null, msgs);
			if (newGeometricObjectCount != null)
				msgs = ((InternalEObject)newGeometricObjectCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT, null, msgs);
			msgs = basicSetGeometricObjectCount(newGeometricObjectCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT, newGeometricObjectCount, newGeometricObjectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE:
				return basicSetGeometricObjectType(null, msgs);
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT:
				return basicSetGeometricObjectCount(null, msgs);
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
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE:
				return getGeometricObjectType();
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT:
				return getGeometricObjectCount();
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
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE:
				setGeometricObjectType((MDGeometricObjectTypeCodePropertyType)newValue);
				return;
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT:
				setGeometricObjectCount((IntegerPropertyType)newValue);
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
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE:
				setGeometricObjectType((MDGeometricObjectTypeCodePropertyType)null);
				return;
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT:
				setGeometricObjectCount((IntegerPropertyType)null);
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
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_TYPE:
				return geometricObjectType != null;
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE__GEOMETRIC_OBJECT_COUNT:
				return geometricObjectCount != null;
		}
		return super.eIsSet(featureID);
	}

} //MDGeometricObjectsTypeImpl
