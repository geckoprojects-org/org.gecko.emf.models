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

import net.opengis.gml.CartesianCSRefType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.ProjectedCRSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projected CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.ProjectedCRSTypeImpl#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectedCRSTypeImpl extends AbstractGeneralDerivedCRSTypeImpl implements ProjectedCRSType {
	/**
	 * The cached value of the '{@link #getUsesCartesianCS() <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesCartesianCS()
	 * @generated
	 * @ordered
	 */
	protected CartesianCSRefType usesCartesianCS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectedCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getProjectedCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSRefType getUsesCartesianCS() {
		return usesCartesianCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCartesianCS(CartesianCSRefType newUsesCartesianCS, NotificationChain msgs) {
		CartesianCSRefType oldUsesCartesianCS = usesCartesianCS;
		usesCartesianCS = newUsesCartesianCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS, oldUsesCartesianCS, newUsesCartesianCS);
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
	public void setUsesCartesianCS(CartesianCSRefType newUsesCartesianCS) {
		if (newUsesCartesianCS != usesCartesianCS) {
			NotificationChain msgs = null;
			if (usesCartesianCS != null)
				msgs = ((InternalEObject)usesCartesianCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS, null, msgs);
			if (newUsesCartesianCS != null)
				msgs = ((InternalEObject)newUsesCartesianCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS, null, msgs);
			msgs = basicSetUsesCartesianCS(newUsesCartesianCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS, newUsesCartesianCS, newUsesCartesianCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS:
				return basicSetUsesCartesianCS(null, msgs);
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
			case GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS:
				return getUsesCartesianCS();
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
			case GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSRefType)newValue);
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
			case GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSRefType)null);
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
			case GMLPackage.PROJECTED_CRS_TYPE__USES_CARTESIAN_CS:
				return usesCartesianCS != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectedCRSTypeImpl
