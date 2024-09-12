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
 * A representation of the model object '<em><b>Medication Knowledge Regulatory</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeRegulatory#getRegulatoryAuthority <em>Regulatory Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeRegulatory#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeRegulatory#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgeRegulatory#getMaxDispense <em>Max Dispense</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeRegulatory()
 * @model extendedMetaData="name='MedicationKnowledge.Regulatory' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MedicationKnowledgeRegulatory extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Regulatory Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The authority that is specifying the regulations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regulatory Authority</em>' containment reference.
	 * @see #setRegulatoryAuthority(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeRegulatory_RegulatoryAuthority()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='regulatoryAuthority' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRegulatoryAuthority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeRegulatory#getRegulatoryAuthority <em>Regulatory Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatory Authority</em>' containment reference.
	 * @see #getRegulatoryAuthority()
	 * @generated
	 */
	void setRegulatoryAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeSubstitution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeRegulatory_Substitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeSubstitution> getSubstitution();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the schedule of a medication in jurisdiction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeRegulatory_Schedule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSchedule();

	/**
	 * Returns the value of the '<em><b>Max Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of units of the medication that can be dispensed in a period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Dispense</em>' containment reference.
	 * @see #setMaxDispense(MedicationKnowledgeMaxDispense)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgeRegulatory_MaxDispense()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationKnowledgeMaxDispense getMaxDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgeRegulatory#getMaxDispense <em>Max Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dispense</em>' containment reference.
	 * @see #getMaxDispense()
	 * @generated
	 */
	void setMaxDispense(MedicationKnowledgeMaxDispense value);

} // MedicationKnowledgeRegulatory
