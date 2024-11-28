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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Signer Id To Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getSignerId <em>Signer Id</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToConsent()
 * @model extendedMetaData="name='addSignerIdToConsent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddSignerIdToConsent extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Key</em>' containment reference.
	 * @see #setConsentKey(ConsentKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToConsent_ConsentKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consentKey'"
	 * @generated
	 */
	ConsentKeyDTO getConsentKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getConsentKey <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Key</em>' containment reference.
	 * @see #getConsentKey()
	 * @generated
	 */
	void setConsentKey(ConsentKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Id</em>' containment reference.
	 * @see #setSignerId(SignerIdDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToConsent_SignerId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signerId'"
	 * @generated
	 */
	SignerIdDTO getSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToConsent#getSignerId <em>Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signer Id</em>' containment reference.
	 * @see #getSignerId()
	 * @generated
	 */
	void setSignerId(SignerIdDTO value);

} // AddSignerIdToConsent
