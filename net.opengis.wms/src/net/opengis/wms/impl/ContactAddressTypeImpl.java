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
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.ContactAddressTypeImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactAddressTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactAddressTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactAddressTypeImpl#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactAddressTypeImpl#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link net.opengis.wms.impl.ContactAddressTypeImpl#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactAddressTypeImpl extends MinimalEObjectImpl.Container implements ContactAddressType {
	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected String addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected String stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected String postCode = POST_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.CONTACT_ADDRESS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(String newAddressType) {
		String oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_ADDRESS_TYPE__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateOrProvince() {
		return stateOrProvince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateOrProvince(String newStateOrProvince) {
		String oldStateOrProvince = stateOrProvince;
		stateOrProvince = newStateOrProvince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE, oldStateOrProvince, stateOrProvince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostCode() {
		return postCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostCode(String newPostCode) {
		String oldPostCode = postCode;
		postCode = newPostCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_ADDRESS_TYPE__POST_CODE, oldPostCode, postCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WMSPackage.CONTACT_ADDRESS_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS_TYPE:
				return getAddressType();
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS:
				return getAddress();
			case WMSPackage.CONTACT_ADDRESS_TYPE__CITY:
				return getCity();
			case WMSPackage.CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case WMSPackage.CONTACT_ADDRESS_TYPE__POST_CODE:
				return getPostCode();
			case WMSPackage.CONTACT_ADDRESS_TYPE__COUNTRY:
				return getCountry();
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
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS_TYPE:
				setAddressType((String)newValue);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__CITY:
				setCity((String)newValue);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE:
				setStateOrProvince((String)newValue);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__POST_CODE:
				setPostCode((String)newValue);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__COUNTRY:
				setCountry((String)newValue);
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
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE:
				setStateOrProvince(STATE_OR_PROVINCE_EDEFAULT);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__POST_CODE:
				setPostCode(POST_CODE_EDEFAULT);
				return;
			case WMSPackage.CONTACT_ADDRESS_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
			case WMSPackage.CONTACT_ADDRESS_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case WMSPackage.CONTACT_ADDRESS_TYPE__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case WMSPackage.CONTACT_ADDRESS_TYPE__STATE_OR_PROVINCE:
				return STATE_OR_PROVINCE_EDEFAULT == null ? stateOrProvince != null : !STATE_OR_PROVINCE_EDEFAULT.equals(stateOrProvince);
			case WMSPackage.CONTACT_ADDRESS_TYPE__POST_CODE:
				return POST_CODE_EDEFAULT == null ? postCode != null : !POST_CODE_EDEFAULT.equals(postCode);
			case WMSPackage.CONTACT_ADDRESS_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
		result.append(" (addressType: ");
		result.append(addressType);
		result.append(", address: ");
		result.append(address);
		result.append(", city: ");
		result.append(city);
		result.append(", stateOrProvince: ");
		result.append(stateOrProvince);
		result.append(", postCode: ");
		result.append(postCode);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //ContactAddressTypeImpl
