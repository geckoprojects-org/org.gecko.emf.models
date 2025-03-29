/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.bpmn.bpmn;

import javax.xml.namespace.QName;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMessage Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTMessageEventDefinition()
 * @model extendedMetaData="name='tMessageEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TMessageEventDefinition extends TEventDefinition {
	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' attribute.
	 * @see #setOperationRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTMessageEventDefinition_OperationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='operationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getOperationRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getOperationRef <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' attribute.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(QName value);

	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' attribute.
	 * @see #setMessageRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTMessageEventDefinition_MessageRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='messageRef'"
	 * @generated
	 */
	QName getMessageRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getMessageRef <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' attribute.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(QName value);

} // TMessageEventDefinition
