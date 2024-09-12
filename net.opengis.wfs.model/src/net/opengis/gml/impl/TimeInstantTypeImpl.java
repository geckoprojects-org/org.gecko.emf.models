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
import net.opengis.gml.TimeInstantType;
import net.opengis.gml.TimePositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Instant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TimeInstantTypeImpl#getTimePosition <em>Time Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeInstantTypeImpl extends AbstractTimeGeometricPrimitiveTypeImpl implements TimeInstantType {
	/**
	 * The cached value of the '{@link #getTimePosition() <em>Time Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePosition()
	 * @generated
	 * @ordered
	 */
	protected TimePositionType timePosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeInstantTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTimeInstantType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePositionType getTimePosition() {
		return timePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePosition(TimePositionType newTimePosition, NotificationChain msgs) {
		TimePositionType oldTimePosition = timePosition;
		timePosition = newTimePosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION, oldTimePosition, newTimePosition);
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
	public void setTimePosition(TimePositionType newTimePosition) {
		if (newTimePosition != timePosition) {
			NotificationChain msgs = null;
			if (timePosition != null)
				msgs = ((InternalEObject)timePosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION, null, msgs);
			if (newTimePosition != null)
				msgs = ((InternalEObject)newTimePosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION, null, msgs);
			msgs = basicSetTimePosition(newTimePosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION, newTimePosition, newTimePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION:
				return basicSetTimePosition(null, msgs);
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
			case GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION:
				return getTimePosition();
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
			case GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION:
				setTimePosition((TimePositionType)newValue);
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
			case GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION:
				setTimePosition((TimePositionType)null);
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
			case GMLPackage.TIME_INSTANT_TYPE__TIME_POSITION:
				return timePosition != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeInstantTypeImpl
