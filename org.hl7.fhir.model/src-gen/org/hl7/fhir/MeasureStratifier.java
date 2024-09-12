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
 * A representation of the model object '<em><b>Measure Stratifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Measure resource provides the definition of a quality measure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MeasureStratifier#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureStratifier#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureStratifier#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureStratifier#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureStratifier#getGroupDefinition <em>Group Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.MeasureStratifier#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier()
 * @model extendedMetaData="name='Measure.Stratifier' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MeasureStratifier extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that is unique within the Measure allowing linkage to the equivalent item in a MeasureReport resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference.
	 * @see #setLinkId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier_LinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLinkId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureStratifier#getLinkId <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' containment reference.
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a meaning for the stratifier. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing stratifiers to be correlated across measures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureStratifier#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human readable description of this stratifier criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureStratifier#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expression that specifies the criteria for the stratifier. This is typically the name of an expression defined within a referenced library, but it may also be a path to a stratifier element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference.
	 * @see #setCriteria(Expression)
	 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier_Criteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='criteria' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureStratifier#getCriteria <em>Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' containment reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(Expression value);

	/**
	 * Returns the value of the '<em><b>Group Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Group resource that defines this population as a set of characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Definition</em>' containment reference.
	 * @see #setGroupDefinition(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier_GroupDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getGroupDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MeasureStratifier#getGroupDefinition <em>Group Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Definition</em>' containment reference.
	 * @see #getGroupDefinition()
	 * @generated
	 */
	void setGroupDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MeasureComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component of the stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library or a valid FHIR Resource Path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMeasureStratifier_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureComponent> getComponent();

} // MeasureStratifier
