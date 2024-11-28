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
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expiration Properties DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ExpirationPropertiesDTOImpl#getFixedExpirationDate <em>Fixed Expiration Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ExpirationPropertiesDTOImpl#getValidPeriod <em>Valid Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpirationPropertiesDTOImpl extends MinimalEObjectImpl.Container implements ExpirationPropertiesDTO {
	/**
	 * The default value of the '{@link #getFixedExpirationDate() <em>Fixed Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIXED_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedExpirationDate() <em>Fixed Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fixedExpirationDate = FIXED_EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidPeriod() <em>Valid Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidPeriod() <em>Valid Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidPeriod()
	 * @generated
	 * @ordered
	 */
	protected String validPeriod = VALID_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpirationPropertiesDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getExpirationPropertiesDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getFixedExpirationDate() {
		return fixedExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedExpirationDate(XMLGregorianCalendar newFixedExpirationDate) {
		XMLGregorianCalendar oldFixedExpirationDate = fixedExpirationDate;
		fixedExpirationDate = newFixedExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE, oldFixedExpirationDate, fixedExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidPeriod() {
		return validPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidPeriod(String newValidPeriod) {
		String oldValidPeriod = validPeriod;
		validPeriod = newValidPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.EXPIRATION_PROPERTIES_DTO__VALID_PERIOD, oldValidPeriod, validPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE:
				return getFixedExpirationDate();
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__VALID_PERIOD:
				return getValidPeriod();
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
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE:
				setFixedExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__VALID_PERIOD:
				setValidPeriod((String)newValue);
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
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE:
				setFixedExpirationDate(FIXED_EXPIRATION_DATE_EDEFAULT);
				return;
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__VALID_PERIOD:
				setValidPeriod(VALID_PERIOD_EDEFAULT);
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
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__FIXED_EXPIRATION_DATE:
				return FIXED_EXPIRATION_DATE_EDEFAULT == null ? fixedExpirationDate != null : !FIXED_EXPIRATION_DATE_EDEFAULT.equals(fixedExpirationDate);
			case Cm2Package.EXPIRATION_PROPERTIES_DTO__VALID_PERIOD:
				return VALID_PERIOD_EDEFAULT == null ? validPeriod != null : !VALID_PERIOD_EDEFAULT.equals(validPeriod);
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
		result.append(" (fixedExpirationDate: ");
		result.append(fixedExpirationDate);
		result.append(", validPeriod: ");
		result.append(validPeriod);
		result.append(')');
		return result.toString();
	}

} //ExpirationPropertiesDTOImpl
