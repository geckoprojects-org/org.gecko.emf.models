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
package org.omg.bpmn.di;

import org.eclipse.emf.common.util.EList;

import org.omg.bpmn.bpmn2.BaseElement;

import org.omg.dd.di.Plane;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.di.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNPlane#getBpmnShape <em>Bpmn Shape</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNPlane#getBpmnEdge <em>Bpmn Edge</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNPlane()
 * @model extendedMetaData="name='BPMNPlane' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNPlane extends Plane {
	/**
	 * Returns the value of the '<em><b>Bpmn Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Element</em>' reference.
	 * @see #setBpmnElement(BaseElement)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNPlane_BpmnElement()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='bpmnElement'"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' reference.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Bpmn Shape</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.di.BPMNShape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Shape</em>' containment reference list.
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNPlane_BpmnShape()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='BPMNShape' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPMNShape> getBpmnShape();

	/**
	 * Returns the value of the '<em><b>Bpmn Edge</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.di.BPMNEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Edge</em>' containment reference list.
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNPlane_BpmnEdge()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='BPMNEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPMNEdge> getBpmnEdge();

} // BPMNPlane
