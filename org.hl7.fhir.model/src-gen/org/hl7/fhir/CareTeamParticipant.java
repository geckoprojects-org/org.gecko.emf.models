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
 * A representation of the model object '<em><b>Care Team Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CareTeamParticipant#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.CareTeamParticipant#getMember <em>Member</em>}</li>
 *   <li>{@link org.hl7.fhir.CareTeamParticipant#getOnBehalfOf <em>On Behalf Of</em>}</li>
 *   <li>{@link org.hl7.fhir.CareTeamParticipant#getCoveragePeriod <em>Coverage Period</em>}</li>
 *   <li>{@link org.hl7.fhir.CareTeamParticipant#getCoverageTiming <em>Coverage Timing</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getCareTeamParticipant()
 * @model extendedMetaData="name='CareTeam.Participant' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CareTeamParticipant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates specific responsibility of an individual within the care team, such as "Primary care physician", "Trained social worker counselor", "Caregiver", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getCareTeamParticipant_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CareTeamParticipant#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific person or organization who is participating/expected to participate in the care team.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getCareTeamParticipant_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getMember();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CareTeamParticipant#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Reference value);

	/**
	 * Returns the value of the '<em><b>On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization of the practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #setOnBehalfOf(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getCareTeamParticipant_OnBehalfOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='onBehalfOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOnBehalfOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CareTeamParticipant#getOnBehalfOf <em>On Behalf Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Behalf Of</em>' containment reference.
	 * @see #getOnBehalfOf()
	 * @generated
	 */
	void setOnBehalfOf(Reference value);

	/**
	 * Returns the value of the '<em><b>Coverage Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Period</em>' containment reference.
	 * @see #setCoveragePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getCareTeamParticipant_CoveragePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coveragePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getCoveragePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CareTeamParticipant#getCoveragePeriod <em>Coverage Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Period</em>' containment reference.
	 * @see #getCoveragePeriod()
	 * @generated
	 */
	void setCoveragePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Coverage Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Timing</em>' containment reference.
	 * @see #setCoverageTiming(Timing)
	 * @see org.hl7.fhir.FHIRPackage#getCareTeamParticipant_CoverageTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getCoverageTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CareTeamParticipant#getCoverageTiming <em>Coverage Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Timing</em>' containment reference.
	 * @see #getCoverageTiming()
	 * @generated
	 */
	void setCoverageTiming(Timing value);

} // CareTeamParticipant
