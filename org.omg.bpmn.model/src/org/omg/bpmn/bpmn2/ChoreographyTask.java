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
 * A representation of the model object '<em><b>Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getChoreographyTask()
 * @model extendedMetaData="name='tChoreographyTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChoreographyTask extends ChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getChoreographyTask_MessageFlowRef()
	 * @model required="true" upper="2" ordered="false"
	 *        extendedMetaData="kind='element' name='messageFlowRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<MessageFlow> getMessageFlowRef();

} // ChoreographyTask
