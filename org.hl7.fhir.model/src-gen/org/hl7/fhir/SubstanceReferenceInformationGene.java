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
 * A representation of the model object '<em><b>Substance Reference Information Gene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Todo.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationGene#getGeneSequenceOrigin <em>Gene Sequence Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationGene#getGene <em>Gene</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationGene#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationGene()
 * @model extendedMetaData="name='SubstanceReferenceInformation.Gene' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubstanceReferenceInformationGene extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Gene Sequence Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gene Sequence Origin</em>' containment reference.
	 * @see #setGeneSequenceOrigin(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationGene_GeneSequenceOrigin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geneSequenceOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGeneSequenceOrigin();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationGene#getGeneSequenceOrigin <em>Gene Sequence Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gene Sequence Origin</em>' containment reference.
	 * @see #getGeneSequenceOrigin()
	 * @generated
	 */
	void setGeneSequenceOrigin(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Gene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gene</em>' containment reference.
	 * @see #setGene(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationGene_Gene()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gene' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getGene();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationGene#getGene <em>Gene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gene</em>' containment reference.
	 * @see #getGene()
	 * @generated
	 */
	void setGene(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationGene_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceReferenceInformationGene
