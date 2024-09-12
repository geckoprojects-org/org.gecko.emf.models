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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.SubConversation#getConversationNodes <em>Conversation Nodes</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getSubConversation()
 * @model extendedMetaData="name='tSubConversation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubConversation extends ConversationNode {
	/**
	 * Returns the value of the '<em><b>Conversation Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.ConversationNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Nodes</em>' containment reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getSubConversation_ConversationNodes()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='conversationNode' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL' group='http://www.omg.org/spec/BPMN/20100524/MODEL#conversationNode'"
	 * @generated
	 */
	EList<ConversationNode> getConversationNodes();

} // SubConversation
