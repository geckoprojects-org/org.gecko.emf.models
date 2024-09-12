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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Availability;
import org.hl7.fhir.AvailabilityAvailableTime;
import org.hl7.fhir.AvailabilityNotAvailableTime;
import org.hl7.fhir.FHIRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AvailabilityImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AvailabilityImpl#getNotAvailableTime <em>Not Available Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityImpl extends DataTypeImpl implements Availability {
	/**
	 * The cached value of the '{@link #getAvailableTime() <em>Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailabilityAvailableTime> availableTime;

	/**
	 * The cached value of the '{@link #getNotAvailableTime() <em>Not Available Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailabilityNotAvailableTime> notAvailableTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getAvailability();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AvailabilityAvailableTime> getAvailableTime() {
		if (availableTime == null) {
			availableTime = new EObjectContainmentEList<AvailabilityAvailableTime>(AvailabilityAvailableTime.class, this, FHIRPackage.AVAILABILITY__AVAILABLE_TIME);
		}
		return availableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AvailabilityNotAvailableTime> getNotAvailableTime() {
		if (notAvailableTime == null) {
			notAvailableTime = new EObjectContainmentEList<AvailabilityNotAvailableTime>(AvailabilityNotAvailableTime.class, this, FHIRPackage.AVAILABILITY__NOT_AVAILABLE_TIME);
		}
		return notAvailableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.AVAILABILITY__AVAILABLE_TIME:
				return ((InternalEList<?>)getAvailableTime()).basicRemove(otherEnd, msgs);
			case FHIRPackage.AVAILABILITY__NOT_AVAILABLE_TIME:
				return ((InternalEList<?>)getNotAvailableTime()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.AVAILABILITY__AVAILABLE_TIME:
				return getAvailableTime();
			case FHIRPackage.AVAILABILITY__NOT_AVAILABLE_TIME:
				return getNotAvailableTime();
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
			case FHIRPackage.AVAILABILITY__AVAILABLE_TIME:
				getAvailableTime().clear();
				getAvailableTime().addAll((Collection<? extends AvailabilityAvailableTime>)newValue);
				return;
			case FHIRPackage.AVAILABILITY__NOT_AVAILABLE_TIME:
				getNotAvailableTime().clear();
				getNotAvailableTime().addAll((Collection<? extends AvailabilityNotAvailableTime>)newValue);
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
			case FHIRPackage.AVAILABILITY__AVAILABLE_TIME:
				getAvailableTime().clear();
				return;
			case FHIRPackage.AVAILABILITY__NOT_AVAILABLE_TIME:
				getNotAvailableTime().clear();
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
			case FHIRPackage.AVAILABILITY__AVAILABLE_TIME:
				return availableTime != null && !availableTime.isEmpty();
			case FHIRPackage.AVAILABILITY__NOT_AVAILABLE_TIME:
				return notAvailableTime != null && !notAvailableTime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AvailabilityImpl
