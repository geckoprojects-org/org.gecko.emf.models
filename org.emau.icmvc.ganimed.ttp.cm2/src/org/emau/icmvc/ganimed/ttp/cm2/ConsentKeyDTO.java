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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Key DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentDate <em>Consent Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentTemplateKey <em>Consent Template Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getSignerIds <em>Signer Ids</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentKeyDTO()
 * @model extendedMetaData="name='consentKeyDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentKeyDTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Date</em>' attribute.
	 * @see #setConsentDate(XMLGregorianCalendar)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentKeyDTO_ConsentDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='consentDate'"
	 * @generated
	 */
	XMLGregorianCalendar getConsentDate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentDate <em>Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Date</em>' attribute.
	 * @see #getConsentDate()
	 * @generated
	 */
	void setConsentDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Template Key</em>' containment reference.
	 * @see #setConsentTemplateKey(ConsentTemplateKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentKeyDTO_ConsentTemplateKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentTemplateKey'"
	 * @generated
	 */
	ConsentTemplateKeyDTO getConsentTemplateKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO#getConsentTemplateKey <em>Consent Template Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Template Key</em>' containment reference.
	 * @see #getConsentTemplateKey()
	 * @generated
	 */
	void setConsentTemplateKey(ConsentTemplateKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Signer Ids</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Ids</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getConsentKeyDTO_SignerIds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='signerIds'"
	 * @generated
	 */
	EList<SignerIdDTO> getSignerIds();

} // ConsentKeyDTO
