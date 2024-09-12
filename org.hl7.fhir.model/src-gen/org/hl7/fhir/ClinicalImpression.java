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
 * A representation of the model object '<em><b>Clinical Impression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getStatusReason <em>Status Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getProblem <em>Problem</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getChangePattern <em>Change Pattern</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getFinding <em>Finding</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrognosisCodeableConcept <em>Prognosis Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getPrognosisReference <em>Prognosis Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getSupportingInfo <em>Supporting Info</em>}</li>
 *   <li>{@link org.hl7.fhir.ClinicalImpression#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression()
 * @model extendedMetaData="name='ClinicalImpression' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClinicalImpression extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the workflow status of the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EventStatus)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EventStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EventStatus value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the reason for the current state of the ClinicalImpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference.
	 * @see #setStatusReason(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_StatusReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatusReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getStatusReason <em>Status Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Reason</em>' containment reference.
	 * @see #getStatusReason()
	 * @generated
	 */
	void setStatusReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A summary of the context and/or cause of the assessment - why / where it was performed, and what patient events/status prompted it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient or group of individuals assessed as part of this record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter during which this ClinicalImpression was created or to which the creation of this record is tightly associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates when the documentation of the assessment was complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinician performing the assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the last assessment that was conducted on this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Previous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='previous' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPrevious();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Reference value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the relevant problems/conditions for a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Problem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='problem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getProblem();

	/**
	 * Returns the value of the '<em><b>Change Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change in the status/pattern of a subject's condition since previously assessed, such as worsening, improving, or no change.  It is a subjective assessment of the direction of the change.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Pattern</em>' containment reference.
	 * @see #setChangePattern(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_ChangePattern()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changePattern' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChangePattern();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getChangePattern <em>Change Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Pattern</em>' containment reference.
	 * @see #getChangePattern()
	 * @generated
	 */
	void setChangePattern(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getProtocol();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A text summary of the investigations and the diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSummary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClinicalImpression#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Finding</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClinicalImpressionFinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finding</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Finding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClinicalImpressionFinding> getFinding();

	/**
	 * Returns the value of the '<em><b>Prognosis Codeable Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimate of likely outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prognosis Codeable Concept</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_PrognosisCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prognosisCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPrognosisCodeableConcept();

	/**
	 * Returns the value of the '<em><b>Prognosis Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment expressing likely outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prognosis Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_PrognosisReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prognosisReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPrognosisReference();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information supporting the clinical impression, which can contain investigation results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_SupportingInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInfo();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClinicalImpression_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // ClinicalImpression
