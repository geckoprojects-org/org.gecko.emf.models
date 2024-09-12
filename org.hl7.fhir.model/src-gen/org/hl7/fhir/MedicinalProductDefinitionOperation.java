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
 * A representation of the model object '<em><b>Medicinal Product Definition Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product, being a substance or combination of substances that is intended to treat, prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting a pharmacological, immunological or metabolic action. This resource is intended to define and detail such products and their properties, for uses other than direct patient care (e.g. regulatory use, or drug catalogs).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getConfidentialityIndicator <em>Confidentiality Indicator</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMedicinalProductDefinitionOperation()
 * @model extendedMetaData="name='MedicinalProductDefinition.Operation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MedicinalProductDefinitionOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of manufacturing operation e.g. manufacturing itself, re-packaging. For the authorization of this, a RegulatedAuthorization would point to the same plan or activity referenced here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableReference)
	 * @see org.hl7.fhir.FHIRPackage#getMedicinalProductDefinitionOperation_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date range of applicability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effective Date</em>' containment reference.
	 * @see #setEffectiveDate(Period)
	 * @see org.hl7.fhir.FHIRPackage#getMedicinalProductDefinitionOperation_EffectiveDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getEffectiveDate <em>Effective Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' containment reference.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(Period value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization or establishment responsible for (or associated with) the particular process or step, examples include the manufacturer, importer, agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMedicinalProductDefinitionOperation_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOrganization();

	/**
	 * Returns the value of the '<em><b>Confidentiality Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether this particular business or manufacturing process is considered proprietary or confidential.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidentiality Indicator</em>' containment reference.
	 * @see #setConfidentialityIndicator(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getMedicinalProductDefinitionOperation_ConfidentialityIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentialityIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getConfidentialityIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDefinitionOperation#getConfidentialityIndicator <em>Confidentiality Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality Indicator</em>' containment reference.
	 * @see #getConfidentialityIndicator()
	 * @generated
	 */
	void setConfidentialityIndicator(CodeableConcept value);

} // MedicinalProductDefinitionOperation
