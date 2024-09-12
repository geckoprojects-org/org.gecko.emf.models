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
 * A representation of the model object '<em><b>Message Flow Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getMessageFlowAssociation()
 * @model extendedMetaData="name='tMessageFlowAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MessageFlowAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Message Flow Ref</em>' reference.
	 * @see #setInnerMessageFlowRef(MessageFlow)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getMessageFlowAssociation_InnerMessageFlowRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='innerMessageFlowRef'"
	 * @generated
	 */
	MessageFlow getInnerMessageFlowRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Message Flow Ref</em>' reference.
	 * @see #getInnerMessageFlowRef()
	 * @generated
	 */
	void setInnerMessageFlowRef(MessageFlow value);

	/**
	 * Returns the value of the '<em><b>Outer Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Message Flow Ref</em>' reference.
	 * @see #setOuterMessageFlowRef(MessageFlow)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getMessageFlowAssociation_OuterMessageFlowRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='outerMessageFlowRef'"
	 * @generated
	 */
	MessageFlow getOuterMessageFlowRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Message Flow Ref</em>' reference.
	 * @see #getOuterMessageFlowRef()
	 * @generated
	 */
	void setOuterMessageFlowRef(MessageFlow value);

} // MessageFlowAssociation
