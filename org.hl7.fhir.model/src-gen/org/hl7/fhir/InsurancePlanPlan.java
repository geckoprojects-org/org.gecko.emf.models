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
 * A representation of the model object '<em><b>Insurance Plan Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Details of a Health Insurance product/plan provided by an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InsurancePlanPlan#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanPlan#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanPlan#getCoverageArea <em>Coverage Area</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanPlan#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanPlan#getGeneralCost <em>General Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.InsurancePlanPlan#getSpecificCost <em>Specific Cost</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan()
 * @model extendedMetaData="name='InsurancePlan.Plan' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InsurancePlanPlan extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this health insurance plan which remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of plan. For example, "Platinum" or "High Deductable".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InsurancePlanPlan#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Coverage Area</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The geographic region in which a health insurance plan's benefits apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Area</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan_CoverageArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getCoverageArea();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the network that providing the type of coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan_Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='network' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getNetwork();

	/**
	 * Returns the value of the '<em><b>General Cost</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanGeneralCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overall costs associated with the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Cost</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan_GeneralCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generalCost' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanGeneralCost> getGeneralCost();

	/**
	 * Returns the value of the '<em><b>Specific Cost</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.InsurancePlanSpecificCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Costs associated with the coverage provided by the product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Cost</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInsurancePlanPlan_SpecificCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificCost' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsurancePlanSpecificCost> getSpecificCost();

} // InsurancePlanPlan
