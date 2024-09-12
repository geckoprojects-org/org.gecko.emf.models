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
import net.opengis.gml.MultiSurfaceDomainType;
import net.opengis.gml.MultiSurfaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Surface Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiSurfaceDomainTypeImpl#getMultiSurface <em>Multi Surface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiSurfaceDomainTypeImpl extends DomainSetTypeImpl implements MultiSurfaceDomainType {
	/**
	 * The cached value of the '{@link #getMultiSurface() <em>Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfaceType multiSurface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiSurfaceDomainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMultiSurfaceDomainType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfaceType getMultiSurface() {
		return multiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurface(MultiSurfaceType newMultiSurface, NotificationChain msgs) {
		MultiSurfaceType oldMultiSurface = multiSurface;
		multiSurface = newMultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE, oldMultiSurface, newMultiSurface);
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
	public void setMultiSurface(MultiSurfaceType newMultiSurface) {
		if (newMultiSurface != multiSurface) {
			NotificationChain msgs = null;
			if (multiSurface != null)
				msgs = ((InternalEObject)multiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE, null, msgs);
			if (newMultiSurface != null)
				msgs = ((InternalEObject)newMultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE, null, msgs);
			msgs = basicSetMultiSurface(newMultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE, newMultiSurface, newMultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE:
				return basicSetMultiSurface(null, msgs);
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
			case GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE:
				return getMultiSurface();
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
			case GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE:
				setMultiSurface((MultiSurfaceType)newValue);
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
			case GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE:
				setMultiSurface((MultiSurfaceType)null);
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
			case GMLPackage.MULTI_SURFACE_DOMAIN_TYPE__MULTI_SURFACE:
				return multiSurface != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiSurfaceDomainTypeImpl
