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
import net.opengis.gml.RectifiedGridCoverageType;
import net.opengis.gml.RectifiedGridDomainType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectified Grid Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.RectifiedGridCoverageTypeImpl#getRectifiedGridDomain <em>Rectified Grid Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectifiedGridCoverageTypeImpl extends AbstractDiscreteCoverageTypeImpl implements RectifiedGridCoverageType {
	/**
	 * The cached value of the '{@link #getRectifiedGridDomain() <em>Rectified Grid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifiedGridDomain()
	 * @generated
	 * @ordered
	 */
	protected RectifiedGridDomainType rectifiedGridDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectifiedGridCoverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getRectifiedGridCoverageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectifiedGridDomainType getRectifiedGridDomain() {
		return rectifiedGridDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGridDomain(RectifiedGridDomainType newRectifiedGridDomain, NotificationChain msgs) {
		RectifiedGridDomainType oldRectifiedGridDomain = rectifiedGridDomain;
		rectifiedGridDomain = newRectifiedGridDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN, oldRectifiedGridDomain, newRectifiedGridDomain);
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
	public void setRectifiedGridDomain(RectifiedGridDomainType newRectifiedGridDomain) {
		if (newRectifiedGridDomain != rectifiedGridDomain) {
			NotificationChain msgs = null;
			if (rectifiedGridDomain != null)
				msgs = ((InternalEObject)rectifiedGridDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN, null, msgs);
			if (newRectifiedGridDomain != null)
				msgs = ((InternalEObject)newRectifiedGridDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN, null, msgs);
			msgs = basicSetRectifiedGridDomain(newRectifiedGridDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN, newRectifiedGridDomain, newRectifiedGridDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN:
				return basicSetRectifiedGridDomain(null, msgs);
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
			case GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN:
				return getRectifiedGridDomain();
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
			case GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN:
				setRectifiedGridDomain((RectifiedGridDomainType)newValue);
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
			case GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN:
				setRectifiedGridDomain((RectifiedGridDomainType)null);
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
			case GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE__RECTIFIED_GRID_DOMAIN:
				return rectifiedGridDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //RectifiedGridCoverageTypeImpl
