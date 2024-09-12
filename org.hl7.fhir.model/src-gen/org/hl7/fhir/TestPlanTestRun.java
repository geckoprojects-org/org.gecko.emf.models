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
 * A representation of the model object '<em><b>Test Plan Test Run</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestPlanTestRun#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestRun#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestRun()
 * @model extendedMetaData="name='TestPlan.TestRun' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestPlanTestRun extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Narrative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The narrative description of the tests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Narrative</em>' containment reference.
	 * @see #setNarrative(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestRun_Narrative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='narrative' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getNarrative();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestRun#getNarrative <em>Narrative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrative</em>' containment reference.
	 * @see #getNarrative()
	 * @generated
	 */
	void setNarrative(Markdown value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(TestPlanScript)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestRun_Script()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace'"
	 * @generated
	 */
	TestPlanScript getScript();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestRun#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(TestPlanScript value);

} // TestPlanTestRun
