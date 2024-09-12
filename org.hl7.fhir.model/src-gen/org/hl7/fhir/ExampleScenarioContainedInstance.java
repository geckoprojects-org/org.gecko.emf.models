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
 * A representation of the model object '<em><b>Example Scenario Contained Instance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ExampleScenarioContainedInstance#getInstanceReference <em>Instance Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExampleScenarioContainedInstance#getVersionReference <em>Version Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioContainedInstance()
 * @model extendedMetaData="name='ExampleScenario.ContainedInstance' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExampleScenarioContainedInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Instance Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the key of an instance found within this one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Reference</em>' containment reference.
	 * @see #setInstanceReference(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioContainedInstance_InstanceReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instanceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInstanceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioContainedInstance#getInstanceReference <em>Instance Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Reference</em>' containment reference.
	 * @see #getInstanceReference()
	 * @generated
	 */
	void setInstanceReference(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the key of a specific version of an instance in this instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Reference</em>' containment reference.
	 * @see #setVersionReference(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getExampleScenarioContainedInstance_VersionReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='versionReference' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersionReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExampleScenarioContainedInstance#getVersionReference <em>Version Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Reference</em>' containment reference.
	 * @see #getVersionReference()
	 * @generated
	 */
	void setVersionReference(org.hl7.fhir.String value);

} // ExampleScenarioContainedInstance
