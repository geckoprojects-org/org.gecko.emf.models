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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Location of the responsible individual or organisation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CIAddressType#getDeliveryPoint <em>Delivery Point</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIAddressType#getCity <em>City</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIAddressType#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIAddressType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIAddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIAddressType#getElectronicMailAddress <em>Electronic Mail Address</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType()
 * @model extendedMetaData="name='CI_Address_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CIAddressType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Delivery Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Point</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType_DeliveryPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deliveryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getDeliveryPoint();

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference.
	 * @see #setCity(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType_City()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCity();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIAddressType#getCity <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' containment reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrative Area</em>' containment reference.
	 * @see #setAdministrativeArea(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType_AdministrativeArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='administrativeArea' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getAdministrativeArea();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIAddressType#getAdministrativeArea <em>Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Area</em>' containment reference.
	 * @see #getAdministrativeArea()
	 * @generated
	 */
	void setAdministrativeArea(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getPostalCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIAddressType#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getCountry();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIAddressType#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Electronic Mail Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Mail Address</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIAddressType_ElectronicMailAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='electronicMailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getElectronicMailAddress();

} // CIAddressType
