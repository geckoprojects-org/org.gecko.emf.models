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
 * A representation of the model object '<em><b>Claim Response Sub Detail</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getSubDetailSequence <em>Sub Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseSubDetail#getAdjudication <em>Adjudication</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getClaimResponseSubDetail()
 * @model extendedMetaData="name='ClaimResponse.SubDetail' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClaimResponseSubDetail extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sub Detail Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely reference the claim sub-detail entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #setSubDetailSequence(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseSubDetail_SubDetailSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subDetailSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSubDetailSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseSubDetail#getSubDetailSequence <em>Sub Detail Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Detail Sequence</em>' containment reference.
	 * @see #getSubDetailSequence()
	 * @generated
	 */
	void setSubDetailSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Trace Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Number</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseSubDetail_TraceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getTraceNumber();

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numbers associated with notes below which apply to the adjudication of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseSubDetail_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Review Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high-level results of the adjudication if adjudication has been performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Outcome</em>' containment reference.
	 * @see #setReviewOutcome(ClaimResponseReviewOutcome)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseSubDetail_ReviewOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponseReviewOutcome getReviewOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseSubDetail#getReviewOutcome <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Outcome</em>' containment reference.
	 * @see #getReviewOutcome()
	 * @generated
	 */
	void setReviewOutcome(ClaimResponseReviewOutcome value);

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudication results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseSubDetail_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication> getAdjudication();

} // ClaimResponseSubDetail
