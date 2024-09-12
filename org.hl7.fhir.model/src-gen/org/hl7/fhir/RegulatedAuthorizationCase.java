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
 * A representation of the model object '<em><b>Regulated Authorization Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorizationCase#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorizationCase#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorizationCase#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorizationCase#getDatePeriod <em>Date Period</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorizationCase#getDateDateTime <em>Date Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.RegulatedAuthorizationCase#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase()
 * @model extendedMetaData="name='RegulatedAuthorization.Case' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RegulatedAuthorizationCase extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this case can be referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorizationCase#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The defining type of case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorizationCase#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status associated with the case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorizationCase#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Date Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Period</em>' containment reference.
	 * @see #setDatePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase_DatePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDatePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorizationCase#getDatePeriod <em>Date Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Period</em>' containment reference.
	 * @see #getDatePeriod()
	 * @generated
	 */
	void setDatePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Date Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Date Time</em>' containment reference.
	 * @see #setDateDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase_DateDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RegulatedAuthorizationCase#getDateDateTime <em>Date Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Date Time</em>' containment reference.
	 * @see #getDateDateTime()
	 * @generated
	 */
	void setDateDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.RegulatedAuthorizationCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A regulatory submission from an organization to a regulator, as part of an assessing case. Multiple applications may occur over time, with more or different information to support or modify the submission or the authorization. The applications can be considered as steps within the longer running case or procedure for this authorization process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRegulatedAuthorizationCase_Application()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='application' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegulatedAuthorizationCase> getApplication();

} // RegulatedAuthorizationCase
