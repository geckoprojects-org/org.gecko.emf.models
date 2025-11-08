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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.PostalAddressType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getPostOfficeBoxNumber <em>Post Office Box Number</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.PostalAddressTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressTypeImpl extends MinimalEObjectImpl.Container implements PostalAddressType {
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
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected String locality = LOCALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostOfficeBoxNumber() <em>Post Office Box Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOfficeBoxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_OFFICE_BOX_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostOfficeBoxNumber() <em>Post Office Box Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOfficeBoxNumber()
	 * @generated
	 * @ordered
	 */
	protected String postOfficeBoxNumber = POST_OFFICE_BOX_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetAddress() <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected String streetAddress = STREET_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getPostalAddressType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocality(String newLocality) {
		String oldLocality = locality;
		locality = newLocality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__LOCALITY, oldLocality, locality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostOfficeBoxNumber() {
		return postOfficeBoxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostOfficeBoxNumber(String newPostOfficeBoxNumber) {
		String oldPostOfficeBoxNumber = postOfficeBoxNumber;
		postOfficeBoxNumber = newPostOfficeBoxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__POST_OFFICE_BOX_NUMBER, oldPostOfficeBoxNumber, postOfficeBoxNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreetAddress(String newStreetAddress) {
		String oldStreetAddress = streetAddress;
		streetAddress = newStreetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__STREET_ADDRESS, oldStreetAddress, streetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.POSTAL_ADDRESS_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.POSTAL_ADDRESS_TYPE__COUNTRY:
				return getCountry();
			case BOMPackage.POSTAL_ADDRESS_TYPE__REGION:
				return getRegion();
			case BOMPackage.POSTAL_ADDRESS_TYPE__LOCALITY:
				return getLocality();
			case BOMPackage.POSTAL_ADDRESS_TYPE__POST_OFFICE_BOX_NUMBER:
				return getPostOfficeBoxNumber();
			case BOMPackage.POSTAL_ADDRESS_TYPE__POSTAL_CODE:
				return getPostalCode();
			case BOMPackage.POSTAL_ADDRESS_TYPE__STREET_ADDRESS:
				return getStreetAddress();
			case BOMPackage.POSTAL_ADDRESS_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.POSTAL_ADDRESS_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__REGION:
				setRegion((String)newValue);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__LOCALITY:
				setLocality((String)newValue);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__POST_OFFICE_BOX_NUMBER:
				setPostOfficeBoxNumber((String)newValue);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__STREET_ADDRESS:
				setStreetAddress((String)newValue);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.POSTAL_ADDRESS_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__LOCALITY:
				setLocality(LOCALITY_EDEFAULT);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__POST_OFFICE_BOX_NUMBER:
				setPostOfficeBoxNumber(POST_OFFICE_BOX_NUMBER_EDEFAULT);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__STREET_ADDRESS:
				setStreetAddress(STREET_ADDRESS_EDEFAULT);
				return;
			case BOMPackage.POSTAL_ADDRESS_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.POSTAL_ADDRESS_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case BOMPackage.POSTAL_ADDRESS_TYPE__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case BOMPackage.POSTAL_ADDRESS_TYPE__LOCALITY:
				return LOCALITY_EDEFAULT == null ? locality != null : !LOCALITY_EDEFAULT.equals(locality);
			case BOMPackage.POSTAL_ADDRESS_TYPE__POST_OFFICE_BOX_NUMBER:
				return POST_OFFICE_BOX_NUMBER_EDEFAULT == null ? postOfficeBoxNumber != null : !POST_OFFICE_BOX_NUMBER_EDEFAULT.equals(postOfficeBoxNumber);
			case BOMPackage.POSTAL_ADDRESS_TYPE__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case BOMPackage.POSTAL_ADDRESS_TYPE__STREET_ADDRESS:
				return STREET_ADDRESS_EDEFAULT == null ? streetAddress != null : !STREET_ADDRESS_EDEFAULT.equals(streetAddress);
			case BOMPackage.POSTAL_ADDRESS_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(" (country: ");
		result.append(country);
		result.append(", region: ");
		result.append(region);
		result.append(", locality: ");
		result.append(locality);
		result.append(", postOfficeBoxNumber: ");
		result.append(postOfficeBoxNumber);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", streetAddress: ");
		result.append(streetAddress);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //PostalAddressTypeImpl
