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
package org.omg.bpmn.bpmn2;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getErrorEventDefinition()
 * @model extendedMetaData="name='tErrorEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ErrorEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Error Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Ref</em>' reference.
	 * @see #setErrorRef(org.omg.bpmn.bpmn2.Error)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getErrorEventDefinition_ErrorRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='errorRef'"
	 * @generated
	 */
	org.omg.bpmn.bpmn2.Error getErrorRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Ref</em>' reference.
	 * @see #getErrorRef()
	 * @generated
	 */
	void setErrorRef(org.omg.bpmn.bpmn2.Error value);

} // ErrorEventDefinition
