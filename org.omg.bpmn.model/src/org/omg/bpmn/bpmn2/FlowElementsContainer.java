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
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface FlowElementsContainer extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Lane Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.LaneSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane Sets</em>' containment reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowElementsContainer_LaneSets()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='laneSet' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<LaneSet> getLaneSets();

	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getFlowElementsContainer_FlowElements()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='flowElement' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL' group='http://www.omg.org/spec/BPMN/20100524/MODEL#flowElement'"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

} // FlowElementsContainer
