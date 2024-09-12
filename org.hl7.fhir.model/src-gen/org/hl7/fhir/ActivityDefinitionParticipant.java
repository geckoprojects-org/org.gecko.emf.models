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
 * A representation of the model object '<em><b>Activity Definition Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ActivityDefinitionParticipant#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ActivityDefinitionParticipant#getTypeCanonical <em>Type Canonical</em>}</li>
 *   <li>{@link org.hl7.fhir.ActivityDefinitionParticipant#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ActivityDefinitionParticipant#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ActivityDefinitionParticipant#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getActivityDefinitionParticipant()
 * @model extendedMetaData="name='ActivityDefinition.Participant' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ActivityDefinitionParticipant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ActionParticipantType)
	 * @see org.hl7.fhir.FHIRPackage#getActivityDefinitionParticipant_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionParticipantType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActivityDefinitionParticipant#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionParticipantType value);

	/**
	 * Returns the value of the '<em><b>Type Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Canonical</em>' containment reference.
	 * @see #setTypeCanonical(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getActivityDefinitionParticipant_TypeCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getTypeCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActivityDefinitionParticipant#getTypeCanonical <em>Type Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Canonical</em>' containment reference.
	 * @see #getTypeCanonical()
	 * @generated
	 */
	void setTypeCanonical(Canonical value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participant in the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getActivityDefinitionParticipant_TypeReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTypeReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActivityDefinitionParticipant#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role the participant should play in performing the described action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getActivityDefinitionParticipant_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActivityDefinitionParticipant#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the actor will be involved in the action - author, reviewer, witness, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getActivityDefinitionParticipant_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFunction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ActivityDefinitionParticipant#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CodeableConcept value);

} // ActivityDefinitionParticipant
