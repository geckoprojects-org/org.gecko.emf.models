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
 * A representation of the model object '<em><b>Episode Of Care</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getStatusHistory <em>Status History</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getManagingOrganization <em>Managing Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getCareManager <em>Care Manager</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getCareTeam <em>Care Team</em>}</li>
 *   <li>{@link org.hl7.fhir.EpisodeOfCare#getAccount <em>Account</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare()
 * @model extendedMetaData="name='EpisodeOfCare' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EpisodeOfCare extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Identifier()
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
	 * planned | waitlist | active | onhold | finished | cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EpisodeOfCareStatus)
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCareStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EpisodeOfCareStatus value);

	/**
	 * Returns the value of the '<em><b>Status History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EpisodeOfCareStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status History</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_StatusHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EpisodeOfCareStatusHistory> getStatusHistory();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EpisodeOfCareReason}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of medical reasons that are expected to be addressed during the episode of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EpisodeOfCareReason> getReason();

	/**
	 * Returns the value of the '<em><b>Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EpisodeOfCareDiagnosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of medical conditions that were addressed during the episode of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Diagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EpisodeOfCareDiagnosis> getDiagnosis();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who is the focus of this episode of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Managing Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that has assumed the specific responsibilities for care coordination, care delivery, or other services for the specified duration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managing Organization</em>' containment reference.
	 * @see #setManagingOrganization(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_ManagingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='managingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getManagingOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getManagingOrganization <em>Managing Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Organization</em>' containment reference.
	 * @see #getManagingOrganization()
	 * @generated
	 */
	void setManagingOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval during which the managing organization assumes the defined responsibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Referral Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Request</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_ReferralRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referralRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getReferralRequest();

	/**
	 * Returns the value of the '<em><b>Care Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner that is the care manager/care coordinator for this patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Manager</em>' containment reference.
	 * @see #setCareManager(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_CareManager()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careManager' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCareManager();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EpisodeOfCare#getCareManager <em>Care Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Manager</em>' containment reference.
	 * @see #getCareManager()
	 * @generated
	 */
	void setCareManager(Reference value);

	/**
	 * Returns the value of the '<em><b>Care Team</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of practitioners that may be facilitating this episode of care for specific purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Team</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_CareTeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='careTeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCareTeam();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of accounts that may be used for billing for this EpisodeOfCare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEpisodeOfCare_Account()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='account' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAccount();

} // EpisodeOfCare
