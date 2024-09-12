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
 * A representation of the model object '<em><b>Requirements Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of requirements - a list of features or behaviors of designed systems that are necessary to achieve organizational or regulatory goals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getConditionality <em>Conditionality</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.RequirementsStatement#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement()
 * @model extendedMetaData="name='Requirements.Statement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RequirementsStatement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key that identifies this statement (unique within this resource).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Id)
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Key()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequirementsStatement#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Id value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short human usable label for this statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLabel();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequirementsStatement#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConformanceExpectation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short human usable label for this statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Conformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConformanceExpectation> getConformance();

	/**
	 * Returns the value of the '<em><b>Conditionality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This boolean flag is set to true of the text of the requirement is conditional on something e.g. it includes lanauage like 'if x then y'. This conditionality flag is introduced for purposes of filtering and colour highlighting etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditionality</em>' containment reference.
	 * @see #setConditionality(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Conditionality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conditionality' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getConditionality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequirementsStatement#getConditionality <em>Conditionality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionality</em>' containment reference.
	 * @see #getConditionality()
	 * @generated
	 */
	void setConditionality(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual requirement for human consumption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Requirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequirementsStatement#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Markdown value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another statement on one of the requirements that this requirement clarifies or restricts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference.
	 * @see #setDerivedFrom(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDerivedFrom();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequirementsStatement#getDerivedFrom <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' containment reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A larger requirement that this requirement helps to refine and enable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getParent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.RequirementsStatement#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Url}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another artifact that satisfies this requirement. This could be a Profile, extension, or an element in one of those, or a CapabilityStatement, OperationDefinition, SearchParameter, CodeSystem(/code), ValueSet, Libary etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied By</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_SatisfiedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='satisfiedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Url> getSatisfiedBy();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Url}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to another artifact that created this requirement. This could be a Profile, etc., or external regulation, or business requirements expressed elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Url> getReference();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who asked for this statement to be a requirement. By default, it's assumed that the publisher knows who it is if it matters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getRequirementsStatement_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSource();

} // RequirementsStatement
