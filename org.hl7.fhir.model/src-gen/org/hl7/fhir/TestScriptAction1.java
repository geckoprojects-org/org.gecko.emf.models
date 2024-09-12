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
 * A representation of the model object '<em><b>Test Script Action1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestScriptAction1#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptAction1#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestScriptAction1()
 * @model extendedMetaData="name='TestScript.Action1' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestScriptAction1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An operation would involve a REST request to a server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestScriptOperation)
	 * @see org.hl7.fhir.FHIRPackage#getTestScriptAction1_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptOperation getOperation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptAction1#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestScriptOperation value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(TestScriptAssert)
	 * @see org.hl7.fhir.FHIRPackage#getTestScriptAction1_Assert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptAssert getAssert();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptAction1#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestScriptAssert value);

} // TestScriptAction1
