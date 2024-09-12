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
 * A representation of the model object '<em><b>Operation Definition Overload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.OperationDefinitionOverload#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.hl7.fhir.OperationDefinitionOverload#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getOperationDefinitionOverload()
 * @model extendedMetaData="name='OperationDefinition.Overload' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationDefinitionOverload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of parameter to include in overload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Name</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getOperationDefinitionOverload_ParameterName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getParameterName();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments to go on overload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getOperationDefinitionOverload_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.OperationDefinitionOverload#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

} // OperationDefinitionOverload
