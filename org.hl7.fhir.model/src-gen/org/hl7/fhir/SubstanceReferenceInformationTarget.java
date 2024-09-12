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
 * A representation of the model object '<em><b>Substance Reference Information Target</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getOrganism <em>Organism</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getOrganismType <em>Organism Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountQuantity <em>Amount Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountRange <em>Amount Range</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountString <em>Amount String</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget()
 * @model extendedMetaData="name='SubstanceReferenceInformation.Target' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubstanceReferenceInformationTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_Interaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interaction' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getInteraction();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Organism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organism</em>' containment reference.
	 * @see #setOrganism(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_Organism()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organism' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrganism();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getOrganism <em>Organism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism</em>' containment reference.
	 * @see #getOrganism()
	 * @generated
	 */
	void setOrganism(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Organism Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organism Type</em>' containment reference.
	 * @see #setOrganismType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_OrganismType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organismType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrganismType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getOrganismType <em>Organism Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organism Type</em>' containment reference.
	 * @see #getOrganismType()
	 * @generated
	 */
	void setOrganismType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Amount Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #setAmountQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_AmountQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getAmountQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountQuantity <em>Amount Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Quantity</em>' containment reference.
	 * @see #getAmountQuantity()
	 * @generated
	 */
	void setAmountQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Range</em>' containment reference.
	 * @see #setAmountRange(Range)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_AmountRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getAmountRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountRange <em>Amount Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Range</em>' containment reference.
	 * @see #getAmountRange()
	 * @generated
	 */
	void setAmountRange(Range value);

	/**
	 * Returns the value of the '<em><b>Amount String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount String</em>' containment reference.
	 * @see #setAmountString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_AmountString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmountString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountString <em>Amount String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount String</em>' containment reference.
	 * @see #getAmountString()
	 * @generated
	 */
	void setAmountString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Type</em>' containment reference.
	 * @see #setAmountType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_AmountType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amountType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAmountType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceReferenceInformationTarget#getAmountType <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' containment reference.
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Todo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstanceReferenceInformationTarget_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // SubstanceReferenceInformationTarget
