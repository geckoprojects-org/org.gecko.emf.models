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
 * A representation of the model object '<em><b>Specimen Definition Type Tested</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of specimen with associated set of requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getPreference <em>Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getContainer <em>Container</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getRetentionTime <em>Retention Time</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getSingleUse <em>Single Use</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getRejectionCriterion <em>Rejection Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getHandling <em>Handling</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getTestingDestination <em>Testing Destination</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested()
 * @model extendedMetaData="name='SpecimenDefinition.TypeTested' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpecimenDefinitionTypeTested extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary of secondary specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' containment reference.
	 * @see #setIsDerived(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_IsDerived()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isDerived' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getIsDerived <em>Is Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' containment reference.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of specimen conditioned for testing expected by lab.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preference for this type of conditioned specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preference</em>' containment reference.
	 * @see #setPreference(SpecimenContainedPreference)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_Preference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='preference' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenContainedPreference getPreference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getPreference <em>Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preference</em>' containment reference.
	 * @see #getPreference()
	 * @generated
	 */
	void setPreference(SpecimenContainedPreference value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specimen's container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(SpecimenDefinitionContainer)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecimenDefinitionContainer getContainer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(SpecimenDefinitionContainer value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements for delivery and special handling of this kind of conditioned specimen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_Requirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Markdown value);

	/**
	 * Returns the value of the '<em><b>Retention Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The usual time that a specimen of this kind is retained after the ordered tests are completed, for the purpose of additional testing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retention Time</em>' containment reference.
	 * @see #setRetentionTime(Duration)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_RetentionTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retentionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRetentionTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getRetentionTime <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Time</em>' containment reference.
	 * @see #getRetentionTime()
	 * @generated
	 */
	void setRetentionTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Single Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen can be used by only one test or panel if the value is "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Use</em>' containment reference.
	 * @see #setSingleUse(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_SingleUse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='singleUse' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getSingleUse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionTypeTested#getSingleUse <em>Single Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Use</em>' containment reference.
	 * @see #getSingleUse()
	 * @generated
	 */
	void setSingleUse(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Rejection Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Criterion for rejection of the specimen in its container by the laboratory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rejection Criterion</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_RejectionCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rejectionCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getRejectionCriterion();

	/**
	 * Returns the value of the '<em><b>Handling</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SpecimenDefinitionHandling}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of instructions for preservation/transport of the specimen at a defined temperature interval, prior the testing process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handling</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_Handling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handling' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecimenDefinitionHandling> getHandling();

	/**
	 * Returns the value of the '<em><b>Testing Destination</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the specimen will be tested: e.g., lab, sector, device or any combination of these.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Testing Destination</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionTypeTested_TestingDestination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testingDestination' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getTestingDestination();

} // SpecimenDefinitionTypeTested
