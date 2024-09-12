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
 * A representation of the model object '<em><b>Service Request Patient Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionMarkdown <em>Instruction Markdown</em>}</li>
 *   <li>{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionReference <em>Instruction Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getServiceRequestPatientInstruction()
 * @model extendedMetaData="name='ServiceRequest.PatientInstruction' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceRequestPatientInstruction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instruction Markdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Markdown</em>' containment reference.
	 * @see #setInstructionMarkdown(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getServiceRequestPatientInstruction_InstructionMarkdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionMarkdown' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getInstructionMarkdown();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionMarkdown <em>Instruction Markdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Markdown</em>' containment reference.
	 * @see #getInstructionMarkdown()
	 * @generated
	 */
	void setInstructionMarkdown(Markdown value);

	/**
	 * Returns the value of the '<em><b>Instruction Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Reference</em>' containment reference.
	 * @see #setInstructionReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getServiceRequestPatientInstruction_InstructionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instructionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInstructionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ServiceRequestPatientInstruction#getInstructionReference <em>Instruction Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction Reference</em>' containment reference.
	 * @see #getInstructionReference()
	 * @generated
	 */
	void setInstructionReference(Reference value);

} // ServiceRequestPatientInstruction
