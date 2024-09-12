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
import net.opengis.gml.MultiSolidDomainType;
import net.opengis.gml.MultiSolidType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Solid Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiSolidDomainTypeImpl#getMultiSolid <em>Multi Solid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiSolidDomainTypeImpl extends DomainSetTypeImpl implements MultiSolidDomainType {
	/**
	 * The cached value of the '{@link #getMultiSolid() <em>Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiSolid()
	 * @generated
	 * @ordered
	 */
	protected MultiSolidType multiSolid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiSolidDomainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMultiSolidDomainType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidType getMultiSolid() {
		return multiSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolid(MultiSolidType newMultiSolid, NotificationChain msgs) {
		MultiSolidType oldMultiSolid = multiSolid;
		multiSolid = newMultiSolid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID, oldMultiSolid, newMultiSolid);
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
	public void setMultiSolid(MultiSolidType newMultiSolid) {
		if (newMultiSolid != multiSolid) {
			NotificationChain msgs = null;
			if (multiSolid != null)
				msgs = ((InternalEObject)multiSolid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID, null, msgs);
			if (newMultiSolid != null)
				msgs = ((InternalEObject)newMultiSolid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID, null, msgs);
			msgs = basicSetMultiSolid(newMultiSolid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID, newMultiSolid, newMultiSolid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID:
				return basicSetMultiSolid(null, msgs);
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
			case GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID:
				return getMultiSolid();
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
			case GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID:
				setMultiSolid((MultiSolidType)newValue);
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
			case GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID:
				setMultiSolid((MultiSolidType)null);
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
			case GMLPackage.MULTI_SOLID_DOMAIN_TYPE__MULTI_SOLID:
				return multiSolid != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiSolidDomainTypeImpl
