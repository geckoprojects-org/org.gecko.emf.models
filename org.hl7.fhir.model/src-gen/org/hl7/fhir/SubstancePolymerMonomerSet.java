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
 * A representation of the model object '<em><b>Substance Polymer Monomer Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a substance specific to it being a polymer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerMonomerSet#getStartingMaterial <em>Starting Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerMonomerSet()
 * @model extendedMetaData="name='SubstancePolymer.MonomerSet' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubstancePolymerMonomerSet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Ratio Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures the type of ratio to the entire polymer, e.g. Monomer/Polymer ratio, SRU/Polymer Ratio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio Type</em>' containment reference.
	 * @see #setRatioType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerMonomerSet_RatioType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratioType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRatioType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Type</em>' containment reference.
	 * @see #getRatioType()
	 * @generated
	 */
	void setRatioType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Starting Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerStartingMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting materials - monomer(s) used in the synthesis of the polymer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Material</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerMonomerSet_StartingMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startingMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerStartingMaterial> getStartingMaterial();

} // SubstancePolymerMonomerSet
