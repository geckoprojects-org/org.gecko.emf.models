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
 * A representation of the model object '<em><b>Immunization Program Eligibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImmunizationProgramEligibility#getProgram <em>Program</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationProgramEligibility#getProgramStatus <em>Program Status</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getImmunizationProgramEligibility()
 * @model extendedMetaData="name='Immunization.ProgramEligibility' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImmunizationProgramEligibility extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which program the patient had their eligility evaluated for.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationProgramEligibility_Program()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='program' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProgram();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProgramEligibility#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Program Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the patient's eligility status for for a specific payment program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Status</em>' containment reference.
	 * @see #setProgramStatus(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationProgramEligibility_ProgramStatus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='programStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProgramStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationProgramEligibility#getProgramStatus <em>Program Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Status</em>' containment reference.
	 * @see #getProgramStatus()
	 * @generated
	 */
	void setProgramStatus(CodeableConcept value);

} // ImmunizationProgramEligibility
