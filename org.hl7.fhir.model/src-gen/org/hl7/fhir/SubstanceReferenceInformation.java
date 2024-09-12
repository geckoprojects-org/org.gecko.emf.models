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
 * A representation of the model object '<em><b>Substance Reference Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Todo.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformation#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformation#getGene <em>Gene</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformation#getGeneElement <em>Gene Element</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformation()
 * @model extendedMetaData="name='SubstanceReferenceInformation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubstanceReferenceInformation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformation_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformation#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Gene</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceReferenceInformationGene}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gene</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformation_Gene()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gene' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceReferenceInformationGene> getGene();

	/**
	 * Returns the value of the '<em><b>Gene Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceReferenceInformationGeneElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gene Element</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformation_GeneElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geneElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceReferenceInformationGeneElement> getGeneElement();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceReferenceInformationTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformation_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceReferenceInformationTarget> getTarget();

} // SubstanceReferenceInformation
