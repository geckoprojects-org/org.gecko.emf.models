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
 * A representation of the model object '<em><b>Test Script Requirement</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TestScriptRequirement#getLinkUri <em>Link Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.TestScriptRequirement#getLinkCanonical <em>Link Canonical</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTestScriptRequirement()
 * @model extendedMetaData="name='TestScript.Requirement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestScriptRequirement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Link Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Uri</em>' containment reference.
	 * @see #setLinkUri(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getTestScriptRequirement_LinkUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getLinkUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptRequirement#getLinkUri <em>Link Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Uri</em>' containment reference.
	 * @see #getLinkUri()
	 * @generated
	 */
	void setLinkUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Link Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Canonical</em>' containment reference.
	 * @see #setLinkCanonical(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getTestScriptRequirement_LinkCanonical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkCanonical' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getLinkCanonical();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TestScriptRequirement#getLinkCanonical <em>Link Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Canonical</em>' containment reference.
	 * @see #getLinkCanonical()
	 * @generated
	 */
	void setLinkCanonical(Canonical value);

} // TestScriptRequirement
