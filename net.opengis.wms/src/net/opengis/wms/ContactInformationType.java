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
 * A representation of the model object '<em><b>Contact Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.ContactInformationType#getContactPersonPrimary <em>Contact Person Primary</em>}</li>
 *   <li>{@link net.opengis.wms.ContactInformationType#getContactPosition <em>Contact Position</em>}</li>
 *   <li>{@link net.opengis.wms.ContactInformationType#getContactAddress <em>Contact Address</em>}</li>
 *   <li>{@link net.opengis.wms.ContactInformationType#getContactVoiceTelephone <em>Contact Voice Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.ContactInformationType#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.ContactInformationType#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getContactInformationType()
 * @model extendedMetaData="name='ContactInformation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ContactInformationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact Person Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Person Primary</em>' containment reference.
	 * @see #setContactPersonPrimary(ContactPersonPrimaryType)
	 * @see net.opengis.wms.WMSPackage#getContactInformationType_ContactPersonPrimary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactPersonPrimary' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPersonPrimaryType getContactPersonPrimary();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactInformationType#getContactPersonPrimary <em>Contact Person Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Primary</em>' containment reference.
	 * @see #getContactPersonPrimary()
	 * @generated
	 */
	void setContactPersonPrimary(ContactPersonPrimaryType value);

	/**
	 * Returns the value of the '<em><b>Contact Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Position</em>' attribute.
	 * @see #setContactPosition(String)
	 * @see net.opengis.wms.WMSPackage#getContactInformationType_ContactPosition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContactPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPosition();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactInformationType#getContactPosition <em>Contact Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Position</em>' attribute.
	 * @see #getContactPosition()
	 * @generated
	 */
	void setContactPosition(String value);

	/**
	 * Returns the value of the '<em><b>Contact Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Address</em>' containment reference.
	 * @see #setContactAddress(ContactAddressType)
	 * @see net.opengis.wms.WMSPackage#getContactInformationType_ContactAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactAddressType getContactAddress();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactInformationType#getContactAddress <em>Contact Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Address</em>' containment reference.
	 * @see #getContactAddress()
	 * @generated
	 */
	void setContactAddress(ContactAddressType value);

	/**
	 * Returns the value of the '<em><b>Contact Voice Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Voice Telephone</em>' attribute.
	 * @see #setContactVoiceTelephone(String)
	 * @see net.opengis.wms.WMSPackage#getContactInformationType_ContactVoiceTelephone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContactVoiceTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactVoiceTelephone();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactInformationType#getContactVoiceTelephone <em>Contact Voice Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Voice Telephone</em>' attribute.
	 * @see #getContactVoiceTelephone()
	 * @generated
	 */
	void setContactVoiceTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Contact Facsimile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Facsimile Telephone</em>' attribute.
	 * @see #setContactFacsimileTelephone(String)
	 * @see net.opengis.wms.WMSPackage#getContactInformationType_ContactFacsimileTelephone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContactFacsimileTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactFacsimileTelephone();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactInformationType#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Facsimile Telephone</em>' attribute.
	 * @see #getContactFacsimileTelephone()
	 * @generated
	 */
	void setContactFacsimileTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Contact Electronic Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Electronic Mail Address</em>' attribute.
	 * @see #setContactElectronicMailAddress(String)
	 * @see net.opengis.wms.WMSPackage#getContactInformationType_ContactElectronicMailAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContactElectronicMailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactElectronicMailAddress();

	/**
	 * Sets the value of the '{@link net.opengis.wms.ContactInformationType#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Electronic Mail Address</em>' attribute.
	 * @see #getContactElectronicMailAddress()
	 * @generated
	 */
	void setContactElectronicMailAddress(String value);

} // ContactInformationType
