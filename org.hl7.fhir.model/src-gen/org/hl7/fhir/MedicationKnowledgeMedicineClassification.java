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
 * A representation of the model object '<em><b>Medication Knowledge Medicine Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeMedicineClassification()
 * @model extendedMetaData="name='MedicationKnowledge.MedicineClassification' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MedicationKnowledgeMedicineClassification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of category for the medication (for example, therapeutic classification, therapeutic sub-classification).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeMedicineClassification_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source String</em>' containment reference.
	 * @see #setSourceString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeMedicineClassification_SourceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSourceString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getSourceString <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source String</em>' containment reference.
	 * @see #getSourceString()
	 * @generated
	 */
	void setSourceString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Uri</em>' containment reference.
	 * @see #setSourceUri(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeMedicineClassification_SourceUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSourceUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeMedicineClassification#getSourceUri <em>Source Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' containment reference.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific category assigned to the medication (e.g. anti-infective, anti-hypertensive, antibiotic, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeMedicineClassification_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassification();

} // MedicationKnowledgeMedicineClassification
