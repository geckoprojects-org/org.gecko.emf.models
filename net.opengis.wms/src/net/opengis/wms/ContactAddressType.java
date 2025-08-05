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
package net.opengis.wms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.ContactAddressType#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link net.opengis.wms.ContactAddressType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.wms.ContactAddressType#getCity <em>City</em>}</li>
 *   <li>{@link net.opengis.wms.ContactAddressType#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link net.opengis.wms.ContactAddressType#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link net.opengis.wms.ContactAddressType#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getContactAddressType()
 * @model extendedMetaData="name='ContactAddress_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ContactAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(String)
	 * @see net.opengis.wms.WMSPackage#getContactAddressType_AddressType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AddressType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressType();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactAddressType#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see net.opengis.wms.WMSPackage#getContactAddressType_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactAddressType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see net.opengis.wms.WMSPackage#getContactAddressType_City()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactAddressType#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see net.opengis.wms.WMSPackage#getContactAddressType_StateOrProvince()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='StateOrProvince' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactAddressType#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

	/**
	 * Returns the value of the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Code</em>' attribute.
	 * @see #setPostCode(String)
	 * @see net.opengis.wms.WMSPackage#getContactAddressType_PostCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='PostCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostCode();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactAddressType#getPostCode <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Code</em>' attribute.
	 * @see #getPostCode()
	 * @generated
	 */
	void setPostCode(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see net.opengis.wms.WMSPackage#getContactAddressType_Country()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactAddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // ContactAddressType
