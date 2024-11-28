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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Policy DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getPolicyKey <em>Policy Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignedPolicyDTO()
 * @model extendedMetaData="name='signedPolicyDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignedPolicyDTO extends FhirIdDTO {
	/**
	 * Returns the value of the '<em><b>Consent Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Key</em>' containment reference.
	 * @see #setConsentKey(ConsentKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignedPolicyDTO_ConsentKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consentKey'"
	 * @generated
	 */
	ConsentKeyDTO getConsentKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getConsentKey <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Key</em>' containment reference.
	 * @see #getConsentKey()
	 * @generated
	 */
	void setConsentKey(ConsentKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Key</em>' containment reference.
	 * @see #setPolicyKey(PolicyKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignedPolicyDTO_PolicyKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyKey'"
	 * @generated
	 */
	PolicyKeyDTO getPolicyKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getPolicyKey <em>Policy Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Key</em>' containment reference.
	 * @see #getPolicyKey()
	 * @generated
	 */
	void setPolicyKey(PolicyKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(ConsentStatus)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getSignedPolicyDTO_Status()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='status'"
	 * @generated
	 */
	ConsentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ConsentStatus value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ConsentStatus)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.SignedPolicyDTO#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ConsentStatus)
	 * @generated
	 */
	boolean isSetStatus();

} // SignedPolicyDTO
