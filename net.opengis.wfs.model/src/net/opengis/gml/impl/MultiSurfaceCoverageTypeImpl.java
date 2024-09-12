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
import net.opengis.gml.MultiSurfaceCoverageType;
import net.opengis.gml.MultiSurfaceDomainType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Surface Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiSurfaceCoverageTypeImpl#getMultiSurfaceDomain <em>Multi Surface Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiSurfaceCoverageTypeImpl extends AbstractDiscreteCoverageTypeImpl implements MultiSurfaceCoverageType {
	/**
	 * The cached value of the '{@link #getMultiSurfaceDomain() <em>Multi Surface Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiSurfaceDomain()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfaceDomainType multiSurfaceDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiSurfaceCoverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMultiSurfaceCoverageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfaceDomainType getMultiSurfaceDomain() {
		return multiSurfaceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceDomain(MultiSurfaceDomainType newMultiSurfaceDomain, NotificationChain msgs) {
		MultiSurfaceDomainType oldMultiSurfaceDomain = multiSurfaceDomain;
		multiSurfaceDomain = newMultiSurfaceDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN, oldMultiSurfaceDomain, newMultiSurfaceDomain);
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
	public void setMultiSurfaceDomain(MultiSurfaceDomainType newMultiSurfaceDomain) {
		if (newMultiSurfaceDomain != multiSurfaceDomain) {
			NotificationChain msgs = null;
			if (multiSurfaceDomain != null)
				msgs = ((InternalEObject)multiSurfaceDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN, null, msgs);
			if (newMultiSurfaceDomain != null)
				msgs = ((InternalEObject)newMultiSurfaceDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN, null, msgs);
			msgs = basicSetMultiSurfaceDomain(newMultiSurfaceDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN, newMultiSurfaceDomain, newMultiSurfaceDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN:
				return basicSetMultiSurfaceDomain(null, msgs);
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
			case GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN:
				return getMultiSurfaceDomain();
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
			case GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN:
				setMultiSurfaceDomain((MultiSurfaceDomainType)newValue);
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
			case GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN:
				setMultiSurfaceDomain((MultiSurfaceDomainType)null);
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
			case GMLPackage.MULTI_SURFACE_COVERAGE_TYPE__MULTI_SURFACE_DOMAIN:
				return multiSurfaceDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiSurfaceCoverageTypeImpl
