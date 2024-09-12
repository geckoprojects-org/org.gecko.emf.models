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
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Review Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponseReviewOutcome#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseReviewOutcome#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseReviewOutcome#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseReviewOutcome#getPreAuthPeriod <em>Pre Auth Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getClaimResponseReviewOutcome()
 * @model extendedMetaData="name='ClaimResponse.ReviewOutcome' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClaimResponseReviewOutcome extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of the claim, predetermination, or preauthorization adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference.
	 * @see #setDecision(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseReviewOutcome_Decision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDecision();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseReviewOutcome#getDecision <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' containment reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reasons for the result of the claim, predetermination, or preauthorization adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseReviewOutcome_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference from the Insurer which is used in later communications which refers to this adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference.
	 * @see #setPreAuthRef(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseReviewOutcome_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPreAuthRef();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseReviewOutcome#getPreAuthRef <em>Pre Auth Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Auth Ref</em>' containment reference.
	 * @see #getPreAuthRef()
	 * @generated
	 */
	void setPreAuthRef(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time frame during which this authorization is effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Period</em>' containment reference.
	 * @see #setPreAuthPeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseReviewOutcome_PreAuthPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPreAuthPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseReviewOutcome#getPreAuthPeriod <em>Pre Auth Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Auth Period</em>' containment reference.
	 * @see #getPreAuthPeriod()
	 * @generated
	 */
	void setPreAuthPeriod(Period value);

} // ClaimResponseReviewOutcome
