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
 * A representation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.CallConversation#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallConversation()
 * @model extendedMetaData="name='tCallConversation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CallConversation extends ConversationNode {
	/**
	 * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.ParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Associations</em>' containment reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallConversation_ParticipantAssociations()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='participantAssociation' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

	/**
	 * Returns the value of the '<em><b>Called Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #setCalledCollaborationRef(Collaboration)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallConversation_CalledCollaborationRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='calledCollaborationRef'"
	 * @generated
	 */
	Collaboration getCalledCollaborationRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #getCalledCollaborationRef()
	 * @generated
	 */
	void setCalledCollaborationRef(Collaboration value);

} // CallConversation
