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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIAddressPropertyType;
import org.isotc211._2005.gmd.CIContactType;
import org.isotc211._2005.gmd.CIOnlineResourcePropertyType;
import org.isotc211._2005.gmd.CITelephonePropertyType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Contact Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIContactTypeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIContactTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIContactTypeImpl#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIContactTypeImpl#getHoursOfService <em>Hours Of Service</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIContactTypeImpl#getContactInstructions <em>Contact Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIContactTypeImpl extends AbstractObjectTypeImpl implements CIContactType {
	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected CITelephonePropertyType phone;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected CIAddressPropertyType address;

	/**
	 * The cached value of the '{@link #getOnlineResource() <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineResource()
	 * @generated
	 * @ordered
	 */
	protected CIOnlineResourcePropertyType onlineResource;

	/**
	 * The cached value of the '{@link #getHoursOfService() <em>Hours Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoursOfService()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType hoursOfService;

	/**
	 * The cached value of the '{@link #getContactInstructions() <em>Contact Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInstructions()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType contactInstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIContactTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCIContactType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CITelephonePropertyType getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(CITelephonePropertyType newPhone, NotificationChain msgs) {
		CITelephonePropertyType oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__PHONE, oldPhone, newPhone);
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
	public void setPhone(CITelephonePropertyType newPhone) {
		if (newPhone != phone) {
			NotificationChain msgs = null;
			if (phone != null)
				msgs = ((InternalEObject)phone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__PHONE, null, msgs);
			if (newPhone != null)
				msgs = ((InternalEObject)newPhone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__PHONE, null, msgs);
			msgs = basicSetPhone(newPhone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__PHONE, newPhone, newPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIAddressPropertyType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(CIAddressPropertyType newAddress, NotificationChain msgs) {
		CIAddressPropertyType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__ADDRESS, oldAddress, newAddress);
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
	public void setAddress(CIAddressPropertyType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnlineResourcePropertyType getOnlineResource() {
		return onlineResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnlineResource(CIOnlineResourcePropertyType newOnlineResource, NotificationChain msgs) {
		CIOnlineResourcePropertyType oldOnlineResource = onlineResource;
		onlineResource = newOnlineResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE, oldOnlineResource, newOnlineResource);
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
	public void setOnlineResource(CIOnlineResourcePropertyType newOnlineResource) {
		if (newOnlineResource != onlineResource) {
			NotificationChain msgs = null;
			if (onlineResource != null)
				msgs = ((InternalEObject)onlineResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE, null, msgs);
			if (newOnlineResource != null)
				msgs = ((InternalEObject)newOnlineResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE, null, msgs);
			msgs = basicSetOnlineResource(newOnlineResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE, newOnlineResource, newOnlineResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getHoursOfService() {
		return hoursOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoursOfService(CharacterStringPropertyType newHoursOfService, NotificationChain msgs) {
		CharacterStringPropertyType oldHoursOfService = hoursOfService;
		hoursOfService = newHoursOfService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE, oldHoursOfService, newHoursOfService);
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
	public void setHoursOfService(CharacterStringPropertyType newHoursOfService) {
		if (newHoursOfService != hoursOfService) {
			NotificationChain msgs = null;
			if (hoursOfService != null)
				msgs = ((InternalEObject)hoursOfService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE, null, msgs);
			if (newHoursOfService != null)
				msgs = ((InternalEObject)newHoursOfService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE, null, msgs);
			msgs = basicSetHoursOfService(newHoursOfService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE, newHoursOfService, newHoursOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getContactInstructions() {
		return contactInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInstructions(CharacterStringPropertyType newContactInstructions, NotificationChain msgs) {
		CharacterStringPropertyType oldContactInstructions = contactInstructions;
		contactInstructions = newContactInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS, oldContactInstructions, newContactInstructions);
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
	public void setContactInstructions(CharacterStringPropertyType newContactInstructions) {
		if (newContactInstructions != contactInstructions) {
			NotificationChain msgs = null;
			if (contactInstructions != null)
				msgs = ((InternalEObject)contactInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS, null, msgs);
			if (newContactInstructions != null)
				msgs = ((InternalEObject)newContactInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS, null, msgs);
			msgs = basicSetContactInstructions(newContactInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS, newContactInstructions, newContactInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_CONTACT_TYPE__PHONE:
				return basicSetPhone(null, msgs);
			case GMDPackage.CI_CONTACT_TYPE__ADDRESS:
				return basicSetAddress(null, msgs);
			case GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE:
				return basicSetOnlineResource(null, msgs);
			case GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE:
				return basicSetHoursOfService(null, msgs);
			case GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS:
				return basicSetContactInstructions(null, msgs);
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
			case GMDPackage.CI_CONTACT_TYPE__PHONE:
				return getPhone();
			case GMDPackage.CI_CONTACT_TYPE__ADDRESS:
				return getAddress();
			case GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE:
				return getOnlineResource();
			case GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE:
				return getHoursOfService();
			case GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS:
				return getContactInstructions();
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
			case GMDPackage.CI_CONTACT_TYPE__PHONE:
				setPhone((CITelephonePropertyType)newValue);
				return;
			case GMDPackage.CI_CONTACT_TYPE__ADDRESS:
				setAddress((CIAddressPropertyType)newValue);
				return;
			case GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE:
				setOnlineResource((CIOnlineResourcePropertyType)newValue);
				return;
			case GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE:
				setHoursOfService((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS:
				setContactInstructions((CharacterStringPropertyType)newValue);
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
			case GMDPackage.CI_CONTACT_TYPE__PHONE:
				setPhone((CITelephonePropertyType)null);
				return;
			case GMDPackage.CI_CONTACT_TYPE__ADDRESS:
				setAddress((CIAddressPropertyType)null);
				return;
			case GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE:
				setOnlineResource((CIOnlineResourcePropertyType)null);
				return;
			case GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE:
				setHoursOfService((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS:
				setContactInstructions((CharacterStringPropertyType)null);
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
			case GMDPackage.CI_CONTACT_TYPE__PHONE:
				return phone != null;
			case GMDPackage.CI_CONTACT_TYPE__ADDRESS:
				return address != null;
			case GMDPackage.CI_CONTACT_TYPE__ONLINE_RESOURCE:
				return onlineResource != null;
			case GMDPackage.CI_CONTACT_TYPE__HOURS_OF_SERVICE:
				return hoursOfService != null;
			case GMDPackage.CI_CONTACT_TYPE__CONTACT_INSTRUCTIONS:
				return contactInstructions != null;
		}
		return super.eIsSet(featureID);
	}

} //CIContactTypeImpl
