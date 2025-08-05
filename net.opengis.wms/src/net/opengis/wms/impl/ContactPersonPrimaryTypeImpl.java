/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms.impl;

import net.opengis.wms.ContactPersonPrimaryType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Person Primary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.ContactPersonPrimaryTypeImpl#getContactPerson <em>Contact Person</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactPersonPrimaryTypeImpl#getContactOrganization <em>Contact Organization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactPersonPrimaryTypeImpl extends MinimalEObjectImpl.Container implements ContactPersonPrimaryType {
	/**
	 * The default value of the '{@link #getContactPerson() <em>Contact Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPerson() <em>Contact Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPerson()
	 * @generated
	 * @ordered
	 */
	protected String contactPerson = CONTACT_PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactOrganization() <em>Contact Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactOrganization() <em>Contact Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactOrganization()
	 * @generated
	 * @ordered
	 */
	protected String contactOrganization = CONTACT_ORGANIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactPersonPrimaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.CONTACT_PERSON_PRIMARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactPerson() {
		return contactPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPerson(String newContactPerson) {
		String oldContactPerson = contactPerson;
		contactPerson = newContactPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON, oldContactPerson, contactPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactOrganization() {
		return contactOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactOrganization(String newContactOrganization) {
		String oldContactOrganization = contactOrganization;
		contactOrganization = newContactOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION, oldContactOrganization, contactOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON:
				return getContactPerson();
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION:
				return getContactOrganization();
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
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON:
				setContactPerson((String)newValue);
				return;
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION:
				setContactOrganization((String)newValue);
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
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON:
				setContactPerson(CONTACT_PERSON_EDEFAULT);
				return;
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION:
				setContactOrganization(CONTACT_ORGANIZATION_EDEFAULT);
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
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_PERSON:
				return CONTACT_PERSON_EDEFAULT == null ? contactPerson != null : !CONTACT_PERSON_EDEFAULT.equals(contactPerson);
			case WMSPackage.CONTACT_PERSON_PRIMARY_TYPE__CONTACT_ORGANIZATION:
				return CONTACT_ORGANIZATION_EDEFAULT == null ? contactOrganization != null : !CONTACT_ORGANIZATION_EDEFAULT.equals(contactOrganization);
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
		result.append(" (contactPerson: ");
		result.append(contactPerson);
		result.append(", contactOrganization: ");
		result.append(contactOrganization);
		result.append(')');
		return result.toString();
	}

} //ContactPersonPrimaryTypeImpl
