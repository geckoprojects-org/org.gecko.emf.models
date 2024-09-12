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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIAddressType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIAddressTypeImpl#getDeliveryPoint <em>Delivery Point</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIAddressTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIAddressTypeImpl#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIAddressTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIAddressTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CIAddressTypeImpl#getElectronicMailAddress <em>Electronic Mail Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIAddressTypeImpl extends AbstractObjectTypeImpl implements CIAddressType {
	/**
	 * The cached value of the '{@link #getDeliveryPoint() <em>Delivery Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> deliveryPoint;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType city;

	/**
	 * The cached value of the '{@link #getAdministrativeArea() <em>Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeArea()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType administrativeArea;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType postalCode;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType country;

	/**
	 * The cached value of the '{@link #getElectronicMailAddress() <em>Electronic Mail Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicMailAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> electronicMailAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCIAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getDeliveryPoint() {
		if (deliveryPoint == null) {
			deliveryPoint = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.CI_ADDRESS_TYPE__DELIVERY_POINT);
		}
		return deliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(CharacterStringPropertyType newCity, NotificationChain msgs) {
		CharacterStringPropertyType oldCity = city;
		city = newCity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__CITY, oldCity, newCity);
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
	public void setCity(CharacterStringPropertyType newCity) {
		if (newCity != city) {
			NotificationChain msgs = null;
			if (city != null)
				msgs = ((InternalEObject)city).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__CITY, null, msgs);
			if (newCity != null)
				msgs = ((InternalEObject)newCity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__CITY, null, msgs);
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__CITY, newCity, newCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getAdministrativeArea() {
		return administrativeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrativeArea(CharacterStringPropertyType newAdministrativeArea, NotificationChain msgs) {
		CharacterStringPropertyType oldAdministrativeArea = administrativeArea;
		administrativeArea = newAdministrativeArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA, oldAdministrativeArea, newAdministrativeArea);
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
	public void setAdministrativeArea(CharacterStringPropertyType newAdministrativeArea) {
		if (newAdministrativeArea != administrativeArea) {
			NotificationChain msgs = null;
			if (administrativeArea != null)
				msgs = ((InternalEObject)administrativeArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA, null, msgs);
			if (newAdministrativeArea != null)
				msgs = ((InternalEObject)newAdministrativeArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA, null, msgs);
			msgs = basicSetAdministrativeArea(newAdministrativeArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA, newAdministrativeArea, newAdministrativeArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(CharacterStringPropertyType newPostalCode, NotificationChain msgs) {
		CharacterStringPropertyType oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
	public void setPostalCode(CharacterStringPropertyType newPostalCode) {
		if (newPostalCode != postalCode) {
			NotificationChain msgs = null;
			if (postalCode != null)
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CharacterStringPropertyType newCountry, NotificationChain msgs) {
		CharacterStringPropertyType oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__COUNTRY, oldCountry, newCountry);
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
	public void setCountry(CharacterStringPropertyType newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_ADDRESS_TYPE__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_ADDRESS_TYPE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getElectronicMailAddress() {
		if (electronicMailAddress == null) {
			electronicMailAddress = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.CI_ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS);
		}
		return electronicMailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_ADDRESS_TYPE__DELIVERY_POINT:
				return ((InternalEList<?>)getDeliveryPoint()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_ADDRESS_TYPE__CITY:
				return basicSetCity(null, msgs);
			case GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA:
				return basicSetAdministrativeArea(null, msgs);
			case GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case GMDPackage.CI_ADDRESS_TYPE__COUNTRY:
				return basicSetCountry(null, msgs);
			case GMDPackage.CI_ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS:
				return ((InternalEList<?>)getElectronicMailAddress()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.CI_ADDRESS_TYPE__DELIVERY_POINT:
				return getDeliveryPoint();
			case GMDPackage.CI_ADDRESS_TYPE__CITY:
				return getCity();
			case GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA:
				return getAdministrativeArea();
			case GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE:
				return getPostalCode();
			case GMDPackage.CI_ADDRESS_TYPE__COUNTRY:
				return getCountry();
			case GMDPackage.CI_ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS:
				return getElectronicMailAddress();
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
			case GMDPackage.CI_ADDRESS_TYPE__DELIVERY_POINT:
				getDeliveryPoint().clear();
				getDeliveryPoint().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__CITY:
				setCity((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA:
				setAdministrativeArea((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE:
				setPostalCode((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__COUNTRY:
				setCountry((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS:
				getElectronicMailAddress().clear();
				getElectronicMailAddress().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
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
			case GMDPackage.CI_ADDRESS_TYPE__DELIVERY_POINT:
				getDeliveryPoint().clear();
				return;
			case GMDPackage.CI_ADDRESS_TYPE__CITY:
				setCity((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA:
				setAdministrativeArea((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE:
				setPostalCode((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__COUNTRY:
				setCountry((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS:
				getElectronicMailAddress().clear();
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
			case GMDPackage.CI_ADDRESS_TYPE__DELIVERY_POINT:
				return deliveryPoint != null && !deliveryPoint.isEmpty();
			case GMDPackage.CI_ADDRESS_TYPE__CITY:
				return city != null;
			case GMDPackage.CI_ADDRESS_TYPE__ADMINISTRATIVE_AREA:
				return administrativeArea != null;
			case GMDPackage.CI_ADDRESS_TYPE__POSTAL_CODE:
				return postalCode != null;
			case GMDPackage.CI_ADDRESS_TYPE__COUNTRY:
				return country != null;
			case GMDPackage.CI_ADDRESS_TYPE__ELECTRONIC_MAIL_ADDRESS:
				return electronicMailAddress != null && !electronicMailAddress.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CIAddressTypeImpl
