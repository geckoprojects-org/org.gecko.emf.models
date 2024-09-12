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
 * A representation of the model object '<em><b>Example Scenario Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Example of workflow instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExampleScenarioProcess#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioProcess#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioProcess#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioProcess#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioProcess#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioProcess()
 * @model extendedMetaData="name='ExampleScenario.Process' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExampleScenarioProcess extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short descriptive label the process to be used in tables or diagrams.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioProcess_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioProcess#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanation of what the process represents and what it does.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioProcess_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioProcess#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the initial state of the actors, environment and data before the process starts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #setPreConditions(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioProcess_PreConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPreConditions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioProcess#getPreConditions <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #getPreConditions()
	 * @generated
	 */
	void setPreConditions(Markdown value);

	/**
	 * Returns the value of the '<em><b>Post Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the final state of the actors, environment and data after the process has been successfully completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Conditions</em>' containment reference.
	 * @see #setPostConditions(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioProcess_PostConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='postConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getPostConditions();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioProcess#getPostConditions <em>Post Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Conditions</em>' containment reference.
	 * @see #getPostConditions()
	 * @generated
	 */
	void setPostConditions(Markdown value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExampleScenarioStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A significant action that occurs as part of the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioProcess_Step()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExampleScenarioStep> getStep();

} // ExampleScenarioProcess
