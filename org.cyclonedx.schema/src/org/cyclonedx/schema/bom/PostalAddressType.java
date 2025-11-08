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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 An address used to identify a contactable location.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getRegion <em>Region</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getPostOfficeBoxNumber <em>Post Office Box Number</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PostalAddressType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType()
 * @model extendedMetaData="name='postalAddressType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PostalAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The country name or the two-letter ISO 3166-1 country code.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_Country()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The region or state in the country. For example, Texas.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_Region()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='region' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The locality or city within the country. For example, Austin.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' attribute.
	 * @see #setLocality(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_Locality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='locality' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocality();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getLocality <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' attribute.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(String value);

	/**
	 * Returns the value of the '<em><b>Post Office Box Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The post office box number. For example, 901.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office Box Number</em>' attribute.
	 * @see #setPostOfficeBoxNumber(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_PostOfficeBoxNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postOfficeBoxNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostOfficeBoxNumber();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getPostOfficeBoxNumber <em>Post Office Box Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Office Box Number</em>' attribute.
	 * @see #getPostOfficeBoxNumber()
	 * @generated
	 */
	void setPostOfficeBoxNumber(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The postal code. For example, 78758.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_PostalCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The street address. For example, 100 Main Street.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Address</em>' attribute.
	 * @see #setStreetAddress(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_StreetAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='streetAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getStreetAddress <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Address</em>' attribute.
	 * @see #getStreetAddress()
	 * @generated
	 */
	void setStreetAddress(String value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the address elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPostalAddressType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PostalAddressType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // PostalAddressType
