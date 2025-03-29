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
 * A representation of the model object '<em><b>TConversation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationAssociation()
 * @model extendedMetaData="name='tConversationAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TConversationAssociation extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Conversation Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Conversation Node Ref</em>' attribute.
	 * @see #setInnerConversationNodeRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationAssociation_InnerConversationNodeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='innerConversationNodeRef'"
	 * @generated
	 */
	QName getInnerConversationNodeRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Conversation Node Ref</em>' attribute.
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 */
	void setInnerConversationNodeRef(QName value);

	/**
	 * Returns the value of the '<em><b>Outer Conversation Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Conversation Node Ref</em>' attribute.
	 * @see #setOuterConversationNodeRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTConversationAssociation_OuterConversationNodeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='outerConversationNodeRef'"
	 * @generated
	 */
	QName getOuterConversationNodeRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Conversation Node Ref</em>' attribute.
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 */
	void setOuterConversationNodeRef(QName value);

} // TConversationAssociation
