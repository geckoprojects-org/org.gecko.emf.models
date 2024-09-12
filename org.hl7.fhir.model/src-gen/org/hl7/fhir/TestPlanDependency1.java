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
 * A representation of the model object '<em><b>Test Plan Dependency1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A plan for executing testing on an artifact or specifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestPlanDependency1#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanDependency1#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestPlanDependency1()
 * @model extendedMetaData="name='TestPlan.Dependency1' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestPlanDependency1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the criteria.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanDependency1_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanDependency1#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to predecessor test plans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor</em>' containment reference.
	 * @see #setPredecessor(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanDependency1_Predecessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predecessor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPredecessor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanDependency1#getPredecessor <em>Predecessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' containment reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Reference value);

} // TestPlanDependency1
