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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.Operation#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.Operation#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.Operation#getErrorRefs <em>Error Refs</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.Operation#getImplementationRef <em>Implementation Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.Operation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOperation()
 * @model extendedMetaData="name='tOperation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Operation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>In Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Message Ref</em>' reference.
	 * @see #setInMessageRef(Message)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOperation_InMessageRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='inMessageRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Message getInMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Operation#getInMessageRef <em>In Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Message Ref</em>' reference.
	 * @see #getInMessageRef()
	 * @generated
	 */
	void setInMessageRef(Message value);

	/**
	 * Returns the value of the '<em><b>Out Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Message Ref</em>' reference.
	 * @see #setOutMessageRef(Message)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOperation_OutMessageRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='element' name='outMessageRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Message getOutMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Operation#getOutMessageRef <em>Out Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Message Ref</em>' reference.
	 * @see #getOutMessageRef()
	 * @generated
	 */
	void setOutMessageRef(Message value);

	/**
	 * Returns the value of the '<em><b>Error Refs</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.Error}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Refs</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOperation_ErrorRefs()
	 * @model ordered="false"
	 *        extendedMetaData="kind='element' name='errorRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<org.omg.bpmn.bpmn2.Error> getErrorRefs();

	/**
	 * Returns the value of the '<em><b>Implementation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Ref</em>' reference.
	 * @see #setImplementationRef(EObject)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOperation_ImplementationRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='implementationRef'"
	 * @generated
	 */
	EObject getImplementationRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Operation#getImplementationRef <em>Implementation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Ref</em>' reference.
	 * @see #getImplementationRef()
	 * @generated
	 */
	void setImplementationRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getOperation_Name()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Operation
