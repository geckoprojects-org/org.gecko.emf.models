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
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.FlowNode#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowNode()
 * @model abstract="true"
 *        extendedMetaData="name='tFlowNode' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowNode_Incoming()
	 * @see org.omg.bpmn.bpmn2.SequenceFlow#getTargetRef
	 * @model opposite="targetRef" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element' name='incoming' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.Lane}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowNode_Lanes()
	 * @see org.omg.bpmn.bpmn2.Lane#getFlowNodeRefs
	 * @model opposite="flowNodeRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Lane> getLanes();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.omg.bpmn.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowNode_Outgoing()
	 * @see org.omg.bpmn.bpmn2.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='outgoing' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

} // FlowNode
