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
 * A representation of the model object '<em><b>Capability Statement Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CapabilityStatementOperation#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementOperation#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.CapabilityStatementOperation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getCapabilityStatementOperation()
 * @model extendedMetaData="name='CapabilityStatement.Operation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CapabilityStatementOperation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the operation or query. For an operation, this name is prefixed with $ and used in the URL. For a query, this is the name used in the _query parameter when the query is called. This SHOULD be the same as the OperationDefinition.code of the defining OperationDefinition.  However, it can sometimes differ if necessary to disambiguate when a server supports multiple OperationDefinition that happen to share the same code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getCapabilityStatementOperation_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementOperation#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the formal definition can be found. If a server references the base definition of an Operation (i.e. from the specification itself such as ```http://hl7.org/fhir/OperationDefinition/ValueSet-expand```), that means it supports the full capabilities of the operation - e.g. both GET and POST invocation.  If it only supports a subset, it must define its own custom [OperationDefinition](operationdefinition.html#) with a 'base' of the original OperationDefinition.  The custom definition would describe the specific subset of functionality supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getCapabilityStatementOperation_Definition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementOperation#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Canonical value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation that describes anything special about the operation behavior, possibly detailing different behavior for system, type and instance-level invocation of the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getCapabilityStatementOperation_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CapabilityStatementOperation#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

} // CapabilityStatementOperation
