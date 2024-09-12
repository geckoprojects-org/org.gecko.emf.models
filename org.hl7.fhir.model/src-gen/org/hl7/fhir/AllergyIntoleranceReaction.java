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
 * A representation of the model object '<em><b>Allergy Intolerance Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk of harmful or undesirable physiological response which is specific to an individual and associated with exposure to a substance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getOnset <em>Onset</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}</li>
 *   <li>{@link org.hl7.fhir.AllergyIntoleranceReaction#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction()
 * @model extendedMetaData="name='AllergyIntolerance.Reaction' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllergyIntoleranceReaction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the specific substance (or pharmaceutical product) considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different from the substance identified as the cause of the risk, but it must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite product that includes the identified substance. It must be clinically safe to only process the 'code' and ignore the 'reaction.substance'.  If a receiving system is unable to confirm that AllergyIntolerance.reaction.substance falls within the semantic scope of AllergyIntolerance.code, then the receiving system should ignore AllergyIntolerance.reaction.substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_Substance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substance' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_Manifestation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manifestation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getManifestation();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text description about the reaction as a whole, including details of the manifestation if required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Onset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record of the date and/or time of the onset of the Reaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Onset</em>' containment reference.
	 * @see #setOnset(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_Onset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onset' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOnset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getOnset <em>Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onset</em>' containment reference.
	 * @see #getOnset()
	 * @generated
	 */
	void setOnset(DateTime value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(AllergyIntoleranceSeverity)
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntoleranceSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(AllergyIntoleranceSeverity value);

	/**
	 * Returns the value of the '<em><b>Exposure Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of the route by which the subject was exposed to the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure Route</em>' containment reference.
	 * @see #setExposureRoute(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_ExposureRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exposureRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getExposureRoute();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AllergyIntoleranceReaction#getExposureRoute <em>Exposure Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Route</em>' containment reference.
	 * @see #getExposureRoute()
	 * @generated
	 */
	void setExposureRoute(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional text about the adverse reaction event not captured in other fields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getAllergyIntoleranceReaction_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // AllergyIntoleranceReaction
