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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TConversation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TConversationNode#getParticipantRef <em>Participant Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TConversationNode#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TConversationNode#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TConversationNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationNode()
 * @model abstract="true"
 *        extendedMetaData="name='tConversationNode' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TConversationNode extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Participant Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationNode_ParticipantRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='participantRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getParticipantRef();

	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationNode_MessageFlowRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='messageFlowRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getMessageFlowRef();

	/**
	 * Returns the value of the '<em><b>Correlation Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TCorrelationKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Key</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationNode_CorrelationKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correlationKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCorrelationKey> getCorrelationKey();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationNode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TConversationNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TConversationNode
