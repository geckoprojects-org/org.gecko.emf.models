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
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.AvailabilityAvailableTime;
import org.hl7.fhir.Code;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability Available Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AvailabilityAvailableTimeImpl#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AvailabilityAvailableTimeImpl#getAllDay <em>All Day</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AvailabilityAvailableTimeImpl#getAvailableStartTime <em>Available Start Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AvailabilityAvailableTimeImpl#getAvailableEndTime <em>Available End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityAvailableTimeImpl extends DataTypeImpl implements AvailabilityAvailableTime {
	/**
	 * The cached value of the '{@link #getDaysOfWeek() <em>Days Of Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysOfWeek()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> daysOfWeek;

	/**
	 * The cached value of the '{@link #getAllDay() <em>All Day</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean allDay;

	/**
	 * The cached value of the '{@link #getAvailableStartTime() <em>Available Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableStartTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableStartTime;

	/**
	 * The cached value of the '{@link #getAvailableEndTime() <em>Available End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableEndTime()
	 * @generated
	 * @ordered
	 */
	protected Time availableEndTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityAvailableTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAvailabilityAvailableTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getDaysOfWeek() {
		if (daysOfWeek == null) {
			daysOfWeek = new EObjectContainmentEList<Code>(Code.class, this, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK);
		}
		return daysOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getAllDay() {
		return allDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllDay(org.hl7.fhir.Boolean newAllDay, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAllDay = allDay;
		allDay = newAllDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY, oldAllDay, newAllDay);
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
	public void setAllDay(org.hl7.fhir.Boolean newAllDay) {
		if (newAllDay != allDay) {
			NotificationChain msgs = null;
			if (allDay != null)
				msgs = ((InternalEObject)allDay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY, null, msgs);
			if (newAllDay != null)
				msgs = ((InternalEObject)newAllDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY, null, msgs);
			msgs = basicSetAllDay(newAllDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY, newAllDay, newAllDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getAvailableStartTime() {
		return availableStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableStartTime(Time newAvailableStartTime, NotificationChain msgs) {
		Time oldAvailableStartTime = availableStartTime;
		availableStartTime = newAvailableStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME, oldAvailableStartTime, newAvailableStartTime);
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
	public void setAvailableStartTime(Time newAvailableStartTime) {
		if (newAvailableStartTime != availableStartTime) {
			NotificationChain msgs = null;
			if (availableStartTime != null)
				msgs = ((InternalEObject)availableStartTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME, null, msgs);
			if (newAvailableStartTime != null)
				msgs = ((InternalEObject)newAvailableStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME, null, msgs);
			msgs = basicSetAvailableStartTime(newAvailableStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME, newAvailableStartTime, newAvailableStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time getAvailableEndTime() {
		return availableEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableEndTime(Time newAvailableEndTime, NotificationChain msgs) {
		Time oldAvailableEndTime = availableEndTime;
		availableEndTime = newAvailableEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME, oldAvailableEndTime, newAvailableEndTime);
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
	public void setAvailableEndTime(Time newAvailableEndTime) {
		if (newAvailableEndTime != availableEndTime) {
			NotificationChain msgs = null;
			if (availableEndTime != null)
				msgs = ((InternalEObject)availableEndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME, null, msgs);
			if (newAvailableEndTime != null)
				msgs = ((InternalEObject)newAvailableEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME, null, msgs);
			msgs = basicSetAvailableEndTime(newAvailableEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME, newAvailableEndTime, newAvailableEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK:
				return ((InternalEList<?>)getDaysOfWeek()).basicRemove(otherEnd, msgs);
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY:
				return basicSetAllDay(null, msgs);
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return basicSetAvailableStartTime(null, msgs);
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return basicSetAvailableEndTime(null, msgs);
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
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK:
				return getDaysOfWeek();
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY:
				return getAllDay();
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return getAvailableStartTime();
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return getAvailableEndTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeek().clear();
				getDaysOfWeek().addAll((Collection<? extends Code>)newValue);
				return;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.hl7.fhir.Boolean)newValue);
				return;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)newValue);
				return;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)newValue);
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
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK:
				getDaysOfWeek().clear();
				return;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY:
				setAllDay((org.hl7.fhir.Boolean)null);
				return;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME:
				setAvailableStartTime((Time)null);
				return;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME:
				setAvailableEndTime((Time)null);
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
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__DAYS_OF_WEEK:
				return daysOfWeek != null && !daysOfWeek.isEmpty();
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__ALL_DAY:
				return allDay != null;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_START_TIME:
				return availableStartTime != null;
			case FHIRPackage.AVAILABILITY_AVAILABLE_TIME__AVAILABLE_END_TIME:
				return availableEndTime != null;
		}
		return super.eIsSet(featureID);
	}

} //AvailabilityAvailableTimeImpl
