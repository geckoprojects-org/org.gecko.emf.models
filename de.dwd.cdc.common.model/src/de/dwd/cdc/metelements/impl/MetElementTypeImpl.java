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
package de.dwd.cdc.metelements.impl;

import de.dwd.cdc.metelements.MetElementType;
import de.dwd.cdc.metelements.MetElementsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Met Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.metelements.impl.MetElementTypeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.dwd.cdc.metelements.impl.MetElementTypeImpl#getUnitOfMeasurement <em>Unit Of Measurement</em>}</li>
 *   <li>{@link de.dwd.cdc.metelements.impl.MetElementTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetElementTypeImpl extends MinimalEObjectImpl.Container implements MetElementType {
	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitOfMeasurement() <em>Unit Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasurement()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_OF_MEASUREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitOfMeasurement() <em>Unit Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasurement()
	 * @generated
	 * @ordered
	 */
	protected String unitOfMeasurement = UNIT_OF_MEASUREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetElementsPackage.Literals.MET_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetElementsPackage.MET_ELEMENT_TYPE__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitOfMeasurement(String newUnitOfMeasurement) {
		String oldUnitOfMeasurement = unitOfMeasurement;
		unitOfMeasurement = newUnitOfMeasurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetElementsPackage.MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT, oldUnitOfMeasurement, unitOfMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetElementsPackage.MET_ELEMENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetElementsPackage.MET_ELEMENT_TYPE__SHORT_NAME:
				return getShortName();
			case MetElementsPackage.MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT:
				return getUnitOfMeasurement();
			case MetElementsPackage.MET_ELEMENT_TYPE__DESCRIPTION:
				return getDescription();
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
			case MetElementsPackage.MET_ELEMENT_TYPE__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case MetElementsPackage.MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT:
				setUnitOfMeasurement((String)newValue);
				return;
			case MetElementsPackage.MET_ELEMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case MetElementsPackage.MET_ELEMENT_TYPE__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case MetElementsPackage.MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT:
				setUnitOfMeasurement(UNIT_OF_MEASUREMENT_EDEFAULT);
				return;
			case MetElementsPackage.MET_ELEMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MetElementsPackage.MET_ELEMENT_TYPE__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case MetElementsPackage.MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT:
				return UNIT_OF_MEASUREMENT_EDEFAULT == null ? unitOfMeasurement != null : !UNIT_OF_MEASUREMENT_EDEFAULT.equals(unitOfMeasurement);
			case MetElementsPackage.MET_ELEMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (shortName: ");
		result.append(shortName);
		result.append(", unitOfMeasurement: ");
		result.append(unitOfMeasurement);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MetElementTypeImpl
