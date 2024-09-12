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

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Contact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information required enabling contact with the  responsible person and/or organisation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CIContactType#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIContactType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIContactType#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIContactType#getHoursOfService <em>Hours Of Service</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIContactType#getContactInstructions <em>Contact Instructions</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCIContactType()
 * @model extendedMetaData="name='CI_Contact_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CIContactType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(CITelephonePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIContactType_Phone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace'"
	 * @generated
	 */
	CITelephonePropertyType getPhone();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIContactType#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(CITelephonePropertyType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(CIAddressPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIContactType_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	CIAddressPropertyType getAddress();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIContactType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(CIAddressPropertyType value);

	/**
	 * Returns the value of the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Resource</em>' containment reference.
	 * @see #setOnlineResource(CIOnlineResourcePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIContactType_OnlineResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onlineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	CIOnlineResourcePropertyType getOnlineResource();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIContactType#getOnlineResource <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Resource</em>' containment reference.
	 * @see #getOnlineResource()
	 * @generated
	 */
	void setOnlineResource(CIOnlineResourcePropertyType value);

	/**
	 * Returns the value of the '<em><b>Hours Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours Of Service</em>' containment reference.
	 * @see #setHoursOfService(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIContactType_HoursOfService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hoursOfService' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getHoursOfService();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIContactType#getHoursOfService <em>Hours Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours Of Service</em>' containment reference.
	 * @see #getHoursOfService()
	 * @generated
	 */
	void setHoursOfService(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Contact Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Instructions</em>' containment reference.
	 * @see #setContactInstructions(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIContactType_ContactInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contactInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getContactInstructions();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIContactType#getContactInstructions <em>Contact Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Instructions</em>' containment reference.
	 * @see #getContactInstructions()
	 * @generated
	 */
	void setContactInstructions(CharacterStringPropertyType value);

} // CIContactType
