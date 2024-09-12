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
 * A representation of the model object '<em><b>Conversation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getConversationAssociation()
 * @model extendedMetaData="name='tConversationAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConversationAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Conversation Node Ref</em>' reference.
	 * @see #setInnerConversationNodeRef(ConversationNode)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getConversationAssociation_InnerConversationNodeRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='innerConversationNodeRef'"
	 * @generated
	 */
	ConversationNode getInnerConversationNodeRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Conversation Node Ref</em>' reference.
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 */
	void setInnerConversationNodeRef(ConversationNode value);

	/**
	 * Returns the value of the '<em><b>Outer Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Conversation Node Ref</em>' reference.
	 * @see #setOuterConversationNodeRef(ConversationNode)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getConversationAssociation_OuterConversationNodeRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='outerConversationNodeRef'"
	 * @generated
	 */
	ConversationNode getOuterConversationNodeRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Conversation Node Ref</em>' reference.
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 */
	void setOuterConversationNodeRef(ConversationNode value);

} // ConversationAssociation
