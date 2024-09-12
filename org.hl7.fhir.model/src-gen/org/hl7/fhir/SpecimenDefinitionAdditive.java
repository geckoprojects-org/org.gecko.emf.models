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
 * A representation of the model object '<em><b>Specimen Definition Additive</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionAdditive#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.SpecimenDefinitionAdditive#getAdditiveReference <em>Additive Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionAdditive()
 * @model extendedMetaData="name='SpecimenDefinition.Additive' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpecimenDefinitionAdditive extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Additive Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Codeable Concept</em>' containment reference.
	 * @see #setAdditiveCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionAdditive_AdditiveCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAdditiveCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionAdditive#getAdditiveCodeableConcept <em>Additive Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Codeable Concept</em>' containment reference.
	 * @see #getAdditiveCodeableConcept()
	 * @generated
	 */
	void setAdditiveCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Additive Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Reference</em>' containment reference.
	 * @see #setAdditiveReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSpecimenDefinitionAdditive_AdditiveReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additiveReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAdditiveReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenDefinitionAdditive#getAdditiveReference <em>Additive Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Reference</em>' containment reference.
	 * @see #getAdditiveReference()
	 * @generated
	 */
	void setAdditiveReference(Reference value);

} // SpecimenDefinitionAdditive
