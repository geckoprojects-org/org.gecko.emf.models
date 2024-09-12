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
package org.isotc211._2005.gts.impl;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211._2005.gts.GTSPackage;
import org.isotc211._2005.gts.TMPeriodDurationPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TM Period Duration Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gts.impl.TMPeriodDurationPropertyTypeImpl#getTMPeriodDuration <em>TM Period Duration</em>}</li>
 *   <li>{@link org.isotc211._2005.gts.impl.TMPeriodDurationPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMPeriodDurationPropertyTypeImpl extends MinimalEObjectImpl.Container implements TMPeriodDurationPropertyType {
	/**
	 * The default value of the '{@link #getTMPeriodDuration() <em>TM Period Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMPeriodDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TM_PERIOD_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTMPeriodDuration() <em>TM Period Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMPeriodDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration tMPeriodDuration = TM_PERIOD_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMPeriodDurationPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTSPackage.Literals.TM_PERIOD_DURATION_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getTMPeriodDuration() {
		return tMPeriodDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTMPeriodDuration(Duration newTMPeriodDuration) {
		Duration oldTMPeriodDuration = tMPeriodDuration;
		tMPeriodDuration = newTMPeriodDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION, oldTMPeriodDuration, tMPeriodDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION:
				return getTMPeriodDuration();
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION:
				setTMPeriodDuration((Duration)newValue);
				return;
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION:
				setTMPeriodDuration(TM_PERIOD_DURATION_EDEFAULT);
				return;
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION:
				return TM_PERIOD_DURATION_EDEFAULT == null ? tMPeriodDuration != null : !TM_PERIOD_DURATION_EDEFAULT.equals(tMPeriodDuration);
			case GTSPackage.TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tMPeriodDuration: ");
		result.append(tMPeriodDuration);
		result.append(", nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //TMPeriodDurationPropertyTypeImpl
