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

import net.opengis.gml.CodeType;
import net.opengis.gml.EllipsoidBaseType;
import net.opengis.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipsoid Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.EllipsoidBaseTypeImpl#getEllipsoidName <em>Ellipsoid Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EllipsoidBaseTypeImpl extends DefinitionTypeImpl implements EllipsoidBaseType {
	/**
	 * The cached value of the '{@link #getEllipsoidName() <em>Ellipsoid Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsoidName()
	 * @generated
	 * @ordered
	 */
	protected CodeType ellipsoidName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipsoidBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getEllipsoidBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getEllipsoidName() {
		return ellipsoidName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidName(CodeType newEllipsoidName, NotificationChain msgs) {
		CodeType oldEllipsoidName = ellipsoidName;
		ellipsoidName = newEllipsoidName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME, oldEllipsoidName, newEllipsoidName);
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
	public void setEllipsoidName(CodeType newEllipsoidName) {
		if (newEllipsoidName != ellipsoidName) {
			NotificationChain msgs = null;
			if (ellipsoidName != null)
				msgs = ((InternalEObject)ellipsoidName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME, null, msgs);
			if (newEllipsoidName != null)
				msgs = ((InternalEObject)newEllipsoidName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME, null, msgs);
			msgs = basicSetEllipsoidName(newEllipsoidName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME, newEllipsoidName, newEllipsoidName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME:
				return basicSetEllipsoidName(null, msgs);
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
			case GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME:
				return getEllipsoidName();
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
			case GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME:
				setEllipsoidName((CodeType)newValue);
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
			case GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME:
				setEllipsoidName((CodeType)null);
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
			case GMLPackage.ELLIPSOID_BASE_TYPE__ELLIPSOID_NAME:
				return ellipsoidName != null;
		}
		return super.eIsSet(featureID);
	}

} //EllipsoidBaseTypeImpl
