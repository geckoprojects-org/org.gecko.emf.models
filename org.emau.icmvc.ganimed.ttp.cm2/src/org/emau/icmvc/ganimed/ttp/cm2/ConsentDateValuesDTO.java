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
package org.emau.icmvc.ganimed.ttp.cm2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Date Values DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getConsentExpirationDate <em>Consent Expiration Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getGicsConsentDate <em>Gics Consent Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getLegalConsentDate <em>Legal Consent Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getMaxPolicyExpirationDate <em>Max Policy Expiration Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getModuleExpirations <em>Module Expirations</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getPolicyExpirations <em>Policy Expirations</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO()
 * @model extendedMetaData="name='consentDateValuesDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentDateValuesDTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Expiration Date</em>' attribute.
	 * @see #setConsentExpirationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO_ConsentExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='consentExpirationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getConsentExpirationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getConsentExpirationDate <em>Consent Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Expiration Date</em>' attribute.
	 * @see #getConsentExpirationDate()
	 * @generated
	 */
	void setConsentExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gics Consent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gics Consent Date</em>' attribute.
	 * @see #setGicsConsentDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO_GicsConsentDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='gicsConsentDate'"
	 * @generated
	 */
	XMLGregorianCalendar getGicsConsentDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getGicsConsentDate <em>Gics Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gics Consent Date</em>' attribute.
	 * @see #getGicsConsentDate()
	 * @generated
	 */
	void setGicsConsentDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Legal Consent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Consent Date</em>' attribute.
	 * @see #setLegalConsentDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO_LegalConsentDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='legalConsentDate'"
	 * @generated
	 */
	XMLGregorianCalendar getLegalConsentDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getLegalConsentDate <em>Legal Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Consent Date</em>' attribute.
	 * @see #getLegalConsentDate()
	 * @generated
	 */
	void setLegalConsentDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Max Policy Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Policy Expiration Date</em>' attribute.
	 * @see #setMaxPolicyExpirationDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO_MaxPolicyExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='maxPolicyExpirationDate'"
	 * @generated
	 */
	XMLGregorianCalendar getMaxPolicyExpirationDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getMaxPolicyExpirationDate <em>Max Policy Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Policy Expiration Date</em>' attribute.
	 * @see #getMaxPolicyExpirationDate()
	 * @generated
	 */
	void setMaxPolicyExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Module Expirations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Expirations</em>' containment reference.
	 * @see #setModuleExpirations(ModuleExpirationsType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO_ModuleExpirations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleExpirations'"
	 * @generated
	 */
	ModuleExpirationsType getModuleExpirations();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getModuleExpirations <em>Module Expirations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Expirations</em>' containment reference.
	 * @see #getModuleExpirations()
	 * @generated
	 */
	void setModuleExpirations(ModuleExpirationsType value);

	/**
	 * Returns the value of the '<em><b>Policy Expirations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Expirations</em>' containment reference.
	 * @see #setPolicyExpirations(PolicyExpirationsType)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentDateValuesDTO_PolicyExpirations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='policyExpirations'"
	 * @generated
	 */
	PolicyExpirationsType getPolicyExpirations();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentDateValuesDTO#getPolicyExpirations <em>Policy Expirations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Expirations</em>' containment reference.
	 * @see #getPolicyExpirations()
	 * @generated
	 */
	void setPolicyExpirations(PolicyExpirationsType value);

} // ConsentDateValuesDTO
