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
 * A representation of the model object '<em><b>Test Plan Test Data</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestPlanTestData#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestData#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestData#getSourceString <em>Source String</em>}</li>
 *   <li>{@link org.hl7.fhir.TestPlanTestData#getSourceReference <em>Source Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestData()
 * @model extendedMetaData="name='TestPlan.TestData' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestPlanTestData extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of test data description, e.g. 'synthea'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestData_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestData#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual test resources when they exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestData_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestData#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Reference value);

	/**
	 * Returns the value of the '<em><b>Source String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source String</em>' containment reference.
	 * @see #setSourceString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestData_SourceString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSourceString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestData#getSourceString <em>Source String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source String</em>' containment reference.
	 * @see #getSourceString()
	 * @generated
	 */
	void setSourceString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference</em>' containment reference.
	 * @see #setSourceReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getTestPlanTestData_SourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestPlanTestData#getSourceReference <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference</em>' containment reference.
	 * @see #getSourceReference()
	 * @generated
	 */
	void setSourceReference(Reference value);

} // TestPlanTestData
