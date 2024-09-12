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
 * A representation of the model object '<em><b>Explanation Of Benefit Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getDiagnosisReference <em>Diagnosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getOnAdmission <em>On Admission</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitDiagnosis()
 * @model extendedMetaData="name='ExplanationOfBenefit.Diagnosis' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExplanationOfBenefitDiagnosis extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify diagnosis entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitDiagnosis_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Codeable Concept</em>' containment reference.
	 * @see #setDiagnosisCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitDiagnosis_DiagnosisCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDiagnosisCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getDiagnosisCodeableConcept <em>Diagnosis Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Codeable Concept</em>' containment reference.
	 * @see #getDiagnosisCodeableConcept()
	 * @generated
	 */
	void setDiagnosisCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Reference</em>' containment reference.
	 * @see #setDiagnosisReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitDiagnosis_DiagnosisReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDiagnosisReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getDiagnosisReference <em>Diagnosis Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosis Reference</em>' containment reference.
	 * @see #getDiagnosisReference()
	 * @generated
	 */
	void setDiagnosisReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the condition was observed or the relative ranking.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitDiagnosis_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>On Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether the diagnosis was present on admission to a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Admission</em>' containment reference.
	 * @see #setOnAdmission(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitDiagnosis_OnAdmission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onAdmission' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOnAdmission();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitDiagnosis#getOnAdmission <em>On Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Admission</em>' containment reference.
	 * @see #getOnAdmission()
	 * @generated
	 */
	void setOnAdmission(CodeableConcept value);

} // ExplanationOfBenefitDiagnosis
