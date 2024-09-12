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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.AppointmentYearlyTemplate;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment Yearly Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AppointmentYearlyTemplateImpl#getYearInterval <em>Year Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentYearlyTemplateImpl extends BackboneElementImpl implements AppointmentYearlyTemplate {
	/**
	 * The cached value of the '{@link #getYearInterval() <em>Year Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearInterval()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt yearInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentYearlyTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAppointmentYearlyTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getYearInterval() {
		return yearInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearInterval(PositiveInt newYearInterval, NotificationChain msgs) {
		PositiveInt oldYearInterval = yearInterval;
		yearInterval = newYearInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL, oldYearInterval, newYearInterval);
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
	public void setYearInterval(PositiveInt newYearInterval) {
		if (newYearInterval != yearInterval) {
			NotificationChain msgs = null;
			if (yearInterval != null)
				msgs = ((InternalEObject)yearInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL, null, msgs);
			if (newYearInterval != null)
				msgs = ((InternalEObject)newYearInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL, null, msgs);
			msgs = basicSetYearInterval(newYearInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL, newYearInterval, newYearInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL:
				return basicSetYearInterval(null, msgs);
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
			case FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL:
				return getYearInterval();
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
			case FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL:
				setYearInterval((PositiveInt)newValue);
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
			case FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL:
				setYearInterval((PositiveInt)null);
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
			case FHIRPackage.APPOINTMENT_YEARLY_TEMPLATE__YEAR_INTERVAL:
				return yearInterval != null;
		}
		return super.eIsSet(featureID);
	}

} //AppointmentYearlyTemplateImpl
