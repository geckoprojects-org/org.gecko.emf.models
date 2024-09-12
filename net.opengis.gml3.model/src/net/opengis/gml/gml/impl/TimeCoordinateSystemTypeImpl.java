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

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.TimeCoordinateSystemType;
import net.opengis.gml.gml.TimeInstantPropertyType;
import net.opengis.gml.gml.TimeIntervalLengthType;
import net.opengis.gml.gml.TimePositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Coordinate System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCoordinateSystemTypeImpl#getOriginPosition <em>Origin Position</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCoordinateSystemTypeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeCoordinateSystemTypeImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeCoordinateSystemTypeImpl extends TimeReferenceSystemTypeImpl implements TimeCoordinateSystemType {
	/**
	 * The cached value of the '{@link #getOriginPosition() <em>Origin Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginPosition()
	 * @generated
	 * @ordered
	 */
	protected TimePositionType originPosition;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected TimeInstantPropertyType origin;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected TimeIntervalLengthType interval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeCoordinateSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTimeCoordinateSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePositionType getOriginPosition() {
		return originPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginPosition(TimePositionType newOriginPosition, NotificationChain msgs) {
		TimePositionType oldOriginPosition = originPosition;
		originPosition = newOriginPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION, oldOriginPosition, newOriginPosition);
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
	public void setOriginPosition(TimePositionType newOriginPosition) {
		if (newOriginPosition != originPosition) {
			NotificationChain msgs = null;
			if (originPosition != null)
				msgs = ((InternalEObject)originPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION, null, msgs);
			if (newOriginPosition != null)
				msgs = ((InternalEObject)newOriginPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION, null, msgs);
			msgs = basicSetOriginPosition(newOriginPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION, newOriginPosition, newOriginPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInstantPropertyType getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(TimeInstantPropertyType newOrigin, NotificationChain msgs) {
		TimeInstantPropertyType oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN, oldOrigin, newOrigin);
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
	public void setOrigin(TimeInstantPropertyType newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeIntervalLengthType getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(TimeIntervalLengthType newInterval, NotificationChain msgs) {
		TimeIntervalLengthType oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL, oldInterval, newInterval);
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
	public void setInterval(TimeIntervalLengthType newInterval) {
		if (newInterval != interval) {
			NotificationChain msgs = null;
			if (interval != null)
				msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL, null, msgs);
			if (newInterval != null)
				msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL, null, msgs);
			msgs = basicSetInterval(newInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL, newInterval, newInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION:
				return basicSetOriginPosition(null, msgs);
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN:
				return basicSetOrigin(null, msgs);
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL:
				return basicSetInterval(null, msgs);
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
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION:
				return getOriginPosition();
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN:
				return getOrigin();
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL:
				return getInterval();
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
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION:
				setOriginPosition((TimePositionType)newValue);
				return;
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN:
				setOrigin((TimeInstantPropertyType)newValue);
				return;
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL:
				setInterval((TimeIntervalLengthType)newValue);
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
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION:
				setOriginPosition((TimePositionType)null);
				return;
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN:
				setOrigin((TimeInstantPropertyType)null);
				return;
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL:
				setInterval((TimeIntervalLengthType)null);
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
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN_POSITION:
				return originPosition != null;
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__ORIGIN:
				return origin != null;
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE__INTERVAL:
				return interval != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeCoordinateSystemTypeImpl
