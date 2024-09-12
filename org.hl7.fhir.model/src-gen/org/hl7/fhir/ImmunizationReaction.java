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
 * A representation of the model object '<em><b>Immunization Reaction</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImmunizationReaction#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationReaction#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link org.hl7.fhir.ImmunizationReaction#getReported <em>Reported</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getImmunizationReaction()
 * @model extendedMetaData="name='Immunization.Reaction' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImmunizationReaction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of reaction to the immunization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationReaction_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationReaction#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the reaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference.
	 * @see #setManifestation(CodeableReference)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationReaction_Manifestation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manifestation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getManifestation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationReaction#getManifestation <em>Manifestation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifestation</em>' containment reference.
	 * @see #getManifestation()
	 * @generated
	 */
	void setManifestation(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Reported</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Self-reported indicator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reported</em>' containment reference.
	 * @see #setReported(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getImmunizationReaction_Reported()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reported' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getReported();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImmunizationReaction#getReported <em>Reported</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reported</em>' containment reference.
	 * @see #getReported()
	 * @generated
	 */
	void setReported(org.hl7.fhir.Boolean value);

} // ImmunizationReaction
