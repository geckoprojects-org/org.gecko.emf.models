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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ValidFromPropertiesDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valid From Properties DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidFromPropertiesDTOImpl#getFixedValidFromDate <em>Fixed Valid From Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidFromPropertiesDTOImpl#getInvalidPeriod <em>Invalid Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidFromPropertiesDTOImpl extends MinimalEObjectImpl.Container implements ValidFromPropertiesDTO {
	/**
	 * The default value of the '{@link #getFixedValidFromDate() <em>Fixed Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIXED_VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedValidFromDate() <em>Fixed Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fixedValidFromDate = FIXED_VALID_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidPeriod() <em>Invalid Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String INVALID_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvalidPeriod() <em>Invalid Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidPeriod()
	 * @generated
	 * @ordered
	 */
	protected String invalidPeriod = INVALID_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidFromPropertiesDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getValidFromPropertiesDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getFixedValidFromDate() {
		return fixedValidFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedValidFromDate(XMLGregorianCalendar newFixedValidFromDate) {
		XMLGregorianCalendar oldFixedValidFromDate = fixedValidFromDate;
		fixedValidFromDate = newFixedValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE, oldFixedValidFromDate, fixedValidFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvalidPeriod() {
		return invalidPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidPeriod(String newInvalidPeriod) {
		String oldInvalidPeriod = invalidPeriod;
		invalidPeriod = newInvalidPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD, oldInvalidPeriod, invalidPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE:
				return getFixedValidFromDate();
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD:
				return getInvalidPeriod();
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
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE:
				setFixedValidFromDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD:
				setInvalidPeriod((String)newValue);
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
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE:
				setFixedValidFromDate(FIXED_VALID_FROM_DATE_EDEFAULT);
				return;
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD:
				setInvalidPeriod(INVALID_PERIOD_EDEFAULT);
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
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__FIXED_VALID_FROM_DATE:
				return FIXED_VALID_FROM_DATE_EDEFAULT == null ? fixedValidFromDate != null : !FIXED_VALID_FROM_DATE_EDEFAULT.equals(fixedValidFromDate);
			case Cm2Package.VALID_FROM_PROPERTIES_DTO__INVALID_PERIOD:
				return INVALID_PERIOD_EDEFAULT == null ? invalidPeriod != null : !INVALID_PERIOD_EDEFAULT.equals(invalidPeriod);
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
		result.append(" (fixedValidFromDate: ");
		result.append(fixedValidFromDate);
		result.append(", invalidPeriod: ");
		result.append(invalidPeriod);
		result.append(')');
		return result.toString();
	}

} //ValidFromPropertiesDTOImpl
