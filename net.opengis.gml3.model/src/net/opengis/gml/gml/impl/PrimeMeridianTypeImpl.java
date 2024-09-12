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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.AngleType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.PrimeMeridianType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prime Meridian Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.PrimeMeridianTypeImpl#getGreenwichLongitude <em>Greenwich Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimeMeridianTypeImpl extends IdentifiedObjectTypeImpl implements PrimeMeridianType {
	/**
	 * The cached value of the '{@link #getGreenwichLongitude() <em>Greenwich Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenwichLongitude()
	 * @generated
	 * @ordered
	 */
	protected AngleType greenwichLongitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimeMeridianTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPrimeMeridianType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType getGreenwichLongitude() {
		return greenwichLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenwichLongitude(AngleType newGreenwichLongitude, NotificationChain msgs) {
		AngleType oldGreenwichLongitude = greenwichLongitude;
		greenwichLongitude = newGreenwichLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, oldGreenwichLongitude, newGreenwichLongitude);
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
	public void setGreenwichLongitude(AngleType newGreenwichLongitude) {
		if (newGreenwichLongitude != greenwichLongitude) {
			NotificationChain msgs = null;
			if (greenwichLongitude != null)
				msgs = ((InternalEObject)greenwichLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, null, msgs);
			if (newGreenwichLongitude != null)
				msgs = ((InternalEObject)newGreenwichLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, null, msgs);
			msgs = basicSetGreenwichLongitude(newGreenwichLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE, newGreenwichLongitude, newGreenwichLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				return basicSetGreenwichLongitude(null, msgs);
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				return getGreenwichLongitude();
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleType)newValue);
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleType)null);
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
			case GMLPackage.PRIME_MERIDIAN_TYPE__GREENWICH_LONGITUDE:
				return greenwichLongitude != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimeMeridianTypeImpl
