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
 * A representation of the model object '<em><b>TCall Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCallConversation#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCallConversation()
 * @model extendedMetaData="name='tCallConversation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCallConversation extends TConversationNode {
	/**
	 * Returns the value of the '<em><b>Participant Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Association</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCallConversation_ParticipantAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParticipantAssociation> getParticipantAssociation();

	/**
	 * Returns the value of the '<em><b>Called Collaboration Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Collaboration Ref</em>' attribute.
	 * @see #setCalledCollaborationRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCallConversation_CalledCollaborationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='calledCollaborationRef'"
	 * @generated
	 */
	QName getCalledCollaborationRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Collaboration Ref</em>' attribute.
	 * @see #getCalledCollaborationRef()
	 * @generated
	 */
	void setCalledCollaborationRef(QName value);

} // TCallConversation
