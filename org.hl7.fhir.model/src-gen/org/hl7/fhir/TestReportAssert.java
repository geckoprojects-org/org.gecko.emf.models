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
 * A representation of the model object '<em><b>Test Report Assert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A summary of information based on the results of executing a TestScript.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TestReportAssert#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReportAssert#getMessage <em>Message</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReportAssert#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.TestReportAssert#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestReportAssert()
 * @model extendedMetaData="name='TestReport.Assert' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestReportAssert extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result of this assertion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(TestReportActionResult)
	 * @see org.hl7.fhir.FHIRPackage#getTestReportAssert_Result()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReportActionResult getResult();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReportAssert#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(TestReportActionResult value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explanatory message associated with the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getTestReportAssert_Message()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getMessage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReportAssert#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Markdown value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A link to further details on the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getTestReportAssert_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestReportAssert#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.TestReportRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Links or references providing traceability to the testing requirements for this assert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getTestReportAssert_Requirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestReportRequirement> getRequirement();

} // TestReportAssert
