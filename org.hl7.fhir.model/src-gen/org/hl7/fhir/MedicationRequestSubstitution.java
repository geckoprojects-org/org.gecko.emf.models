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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationRequestSubstitution#getAllowedBoolean <em>Allowed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestSubstitution#getAllowedCodeableConcept <em>Allowed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationRequestSubstitution#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMedicationRequestSubstitution()
 * @model extendedMetaData="name='MedicationRequest.Substitution' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MedicationRequestSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Allowed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Boolean</em>' containment reference.
	 * @see #setAllowedBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationRequestSubstitution_AllowedBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAllowedBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestSubstitution#getAllowedBoolean <em>Allowed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Boolean</em>' containment reference.
	 * @see #getAllowedBoolean()
	 * @generated
	 */
	void setAllowedBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Allowed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Codeable Concept</em>' containment reference.
	 * @see #setAllowedCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationRequestSubstitution_AllowedCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAllowedCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestSubstitution#getAllowedCodeableConcept <em>Allowed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Codeable Concept</em>' containment reference.
	 * @see #getAllowedCodeableConcept()
	 * @generated
	 */
	void setAllowedCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the reason for the substitution, or why substitution must or must not be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationRequestSubstitution_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationRequestSubstitution#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

} // MedicationRequestSubstitution
