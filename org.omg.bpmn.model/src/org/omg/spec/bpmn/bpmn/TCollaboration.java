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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCollaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationNodeGroup <em>Conversation Node Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationLink <em>Conversation Link</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCollaboration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration()
 * @model extendedMetaData="name='tCollaboration' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCollaboration extends TRootElement {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Message Flow</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TMessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_MessageFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messageFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TMessageFlow> getMessageFlow();

	/**
	 * Returns the value of the '<em><b>Artifact Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Group</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ArtifactGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='artifact:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getArtifactGroup();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_Artifact()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='artifact:group'"
	 * @generated
	 */
	EList<TArtifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Conversation Node Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Node Group</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ConversationNodeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='conversationNode:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConversationNodeGroup();

	/**
	 * Returns the value of the '<em><b>Conversation Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TConversationNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Node</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ConversationNode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conversationNode' namespace='##targetNamespace' group='conversationNode:group'"
	 * @generated
	 */
	EList<TConversationNode> getConversationNode();

	/**
	 * Returns the value of the '<em><b>Conversation Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TConversationAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Association</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ConversationAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conversationAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TConversationAssociation> getConversationAssociation();

	/**
	 * Returns the value of the '<em><b>Participant Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Association</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ParticipantAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participantAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParticipantAssociation> getParticipantAssociation();

	/**
	 * Returns the value of the '<em><b>Message Flow Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Association</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_MessageFlowAssociation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messageFlowAssociation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TMessageFlowAssociation> getMessageFlowAssociation();

	/**
	 * Returns the value of the '<em><b>Correlation Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TCorrelationKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Key</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_CorrelationKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='correlationKey' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCorrelationKey> getCorrelationKey();

	/**
	 * Returns the value of the '<em><b>Choreography Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ChoreographyRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='choreographyRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getChoreographyRef();

	/**
	 * Returns the value of the '<em><b>Conversation Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.bpmn.TConversationLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Link</em>' containment reference list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_ConversationLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conversationLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TConversationLink> getConversationLink();

	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #isSetIsClosed()
	 * @see #unsetIsClosed()
	 * @see #setIsClosed(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_IsClosed()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isClosed'"
	 * @generated
	 */
	boolean isIsClosed();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCollaboration#isIsClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #isSetIsClosed()
	 * @see #unsetIsClosed()
	 * @see #isIsClosed()
	 * @generated
	 */
	void setIsClosed(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TCollaboration#isIsClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsClosed()
	 * @see #isIsClosed()
	 * @see #setIsClosed(boolean)
	 * @generated
	 */
	void unsetIsClosed();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TCollaboration#isIsClosed <em>Is Closed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Closed</em>' attribute is set.
	 * @see #unsetIsClosed()
	 * @see #isIsClosed()
	 * @see #setIsClosed(boolean)
	 * @generated
	 */
	boolean isSetIsClosed();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCollaboration_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TCollaboration
