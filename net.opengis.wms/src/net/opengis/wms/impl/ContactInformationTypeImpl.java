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

import net.opengis.wms.ContactAddressType;
import net.opengis.wms.ContactInformationType;
import net.opengis.wms.ContactPersonPrimaryType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.ContactInformationTypeImpl#getContactPersonPrimary <em>Contact Person Primary</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactInformationTypeImpl#getContactPosition <em>Contact Position</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactInformationTypeImpl#getContactAddress <em>Contact Address</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactInformationTypeImpl#getContactVoiceTelephone <em>Contact Voice Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactInformationTypeImpl#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactInformationTypeImpl#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactInformationTypeImpl extends MinimalEObjectImpl.Container implements ContactInformationType {
	/**
	 * The cached value of the '{@link #getContactPersonPrimary() <em>Contact Person Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPersonPrimary()
	 * @generated
	 * @ordered
	 */
	protected ContactPersonPrimaryType contactPersonPrimary;

	/**
	 * The default value of the '{@link #getContactPosition() <em>Contact Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactPosition() <em>Contact Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPosition()
	 * @generated
	 * @ordered
	 */
	protected String contactPosition = CONTACT_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactAddress() <em>Contact Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactAddress()
	 * @generated
	 * @ordered
	 */
	protected ContactAddressType contactAddress;

	/**
	 * The default value of the '{@link #getContactVoiceTelephone() <em>Contact Voice Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactVoiceTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_VOICE_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactVoiceTelephone() <em>Contact Voice Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactVoiceTelephone()
	 * @generated
	 * @ordered
	 */
	protected String contactVoiceTelephone = CONTACT_VOICE_TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactFacsimileTelephone() <em>Contact Facsimile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactFacsimileTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_FACSIMILE_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactFacsimileTelephone() <em>Contact Facsimile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactFacsimileTelephone()
	 * @generated
	 * @ordered
	 */
	protected String contactFacsimileTelephone = CONTACT_FACSIMILE_TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactElectronicMailAddress() <em>Contact Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactElectronicMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactElectronicMailAddress() <em>Contact Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactElectronicMailAddress()
	 * @generated
	 * @ordered
	 */
	protected String contactElectronicMailAddress = CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.CONTACT_INFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPersonPrimaryType getContactPersonPrimary() {
		return contactPersonPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactPersonPrimary(ContactPersonPrimaryType newContactPersonPrimary, NotificationChain msgs) {
		ContactPersonPrimaryType oldContactPersonPrimary = contactPersonPrimary;
		contactPersonPrimary = newContactPersonPrimary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY, oldContactPersonPrimary, newContactPersonPrimary);
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
	public void setContactPersonPrimary(ContactPersonPrimaryType newContactPersonPrimary) {
		if (newContactPersonPrimary != contactPersonPrimary) {
			NotificationChain msgs = null;
			if (contactPersonPrimary != null)
				msgs = ((InternalEObject)contactPersonPrimary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY, null, msgs);
			if (newContactPersonPrimary != null)
				msgs = ((InternalEObject)newContactPersonPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY, null, msgs);
			msgs = basicSetContactPersonPrimary(newContactPersonPrimary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY, newContactPersonPrimary, newContactPersonPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactPosition() {
		return contactPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPosition(String newContactPosition) {
		String oldContactPosition = contactPosition;
		contactPosition = newContactPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_POSITION, oldContactPosition, contactPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactAddressType getContactAddress() {
		return contactAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactAddress(ContactAddressType newContactAddress, NotificationChain msgs) {
		ContactAddressType oldContactAddress = contactAddress;
		contactAddress = newContactAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS, oldContactAddress, newContactAddress);
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
	public void setContactAddress(ContactAddressType newContactAddress) {
		if (newContactAddress != contactAddress) {
			NotificationChain msgs = null;
			if (contactAddress != null)
				msgs = ((InternalEObject)contactAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS, null, msgs);
			if (newContactAddress != null)
				msgs = ((InternalEObject)newContactAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS, null, msgs);
			msgs = basicSetContactAddress(newContactAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS, newContactAddress, newContactAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactVoiceTelephone() {
		return contactVoiceTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactVoiceTelephone(String newContactVoiceTelephone) {
		String oldContactVoiceTelephone = contactVoiceTelephone;
		contactVoiceTelephone = newContactVoiceTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE, oldContactVoiceTelephone, contactVoiceTelephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactFacsimileTelephone() {
		return contactFacsimileTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactFacsimileTelephone(String newContactFacsimileTelephone) {
		String oldContactFacsimileTelephone = contactFacsimileTelephone;
		contactFacsimileTelephone = newContactFacsimileTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE, oldContactFacsimileTelephone, contactFacsimileTelephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactElectronicMailAddress() {
		return contactElectronicMailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactElectronicMailAddress(String newContactElectronicMailAddress) {
		String oldContactElectronicMailAddress = contactElectronicMailAddress;
		contactElectronicMailAddress = newContactElectronicMailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS, oldContactElectronicMailAddress, contactElectronicMailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY:
				return basicSetContactPersonPrimary(null, msgs);
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS:
				return basicSetContactAddress(null, msgs);
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
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY:
				return getContactPersonPrimary();
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_POSITION:
				return getContactPosition();
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS:
				return getContactAddress();
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE:
				return getContactVoiceTelephone();
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE:
				return getContactFacsimileTelephone();
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				return getContactElectronicMailAddress();
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
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY:
				setContactPersonPrimary((ContactPersonPrimaryType)newValue);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_POSITION:
				setContactPosition((String)newValue);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS:
				setContactAddress((ContactAddressType)newValue);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE:
				setContactVoiceTelephone((String)newValue);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE:
				setContactFacsimileTelephone((String)newValue);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				setContactElectronicMailAddress((String)newValue);
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
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY:
				setContactPersonPrimary((ContactPersonPrimaryType)null);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_POSITION:
				setContactPosition(CONTACT_POSITION_EDEFAULT);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS:
				setContactAddress((ContactAddressType)null);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE:
				setContactVoiceTelephone(CONTACT_VOICE_TELEPHONE_EDEFAULT);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE:
				setContactFacsimileTelephone(CONTACT_FACSIMILE_TELEPHONE_EDEFAULT);
				return;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				setContactElectronicMailAddress(CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT);
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
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_PERSON_PRIMARY:
				return contactPersonPrimary != null;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_POSITION:
				return CONTACT_POSITION_EDEFAULT == null ? contactPosition != null : !CONTACT_POSITION_EDEFAULT.equals(contactPosition);
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ADDRESS:
				return contactAddress != null;
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_VOICE_TELEPHONE:
				return CONTACT_VOICE_TELEPHONE_EDEFAULT == null ? contactVoiceTelephone != null : !CONTACT_VOICE_TELEPHONE_EDEFAULT.equals(contactVoiceTelephone);
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_FACSIMILE_TELEPHONE:
				return CONTACT_FACSIMILE_TELEPHONE_EDEFAULT == null ? contactFacsimileTelephone != null : !CONTACT_FACSIMILE_TELEPHONE_EDEFAULT.equals(contactFacsimileTelephone);
			case WMSPackage.CONTACT_INFORMATION_TYPE__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				return CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT == null ? contactElectronicMailAddress != null : !CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT.equals(contactElectronicMailAddress);
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
		result.append(" (contactPosition: ");
		result.append(contactPosition);
		result.append(", contactVoiceTelephone: ");
		result.append(contactVoiceTelephone);
		result.append(", contactFacsimileTelephone: ");
		result.append(contactFacsimileTelephone);
		result.append(", contactElectronicMailAddress: ");
		result.append(contactElectronicMailAddress);
		result.append(')');
		return result.toString();
	}

} //ContactInformationTypeImpl
