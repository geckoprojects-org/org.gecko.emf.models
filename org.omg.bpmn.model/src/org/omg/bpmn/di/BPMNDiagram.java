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

import org.omg.dd.di.Diagram;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.di.BPMNDiagram#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNDiagram#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDiagram()
 * @model extendedMetaData="name='BPMNDiagram' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(BPMNPlane)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDiagram_Plane()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='BPMNPlane' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	BPMNPlane getPlane();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNDiagram#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(BPMNPlane value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.di.BPMNLabelStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference list.
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNDiagram_LabelStyle()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='BPMNLabelStyle' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	EList<BPMNLabelStyle> getLabelStyle();

} // BPMNDiagram
