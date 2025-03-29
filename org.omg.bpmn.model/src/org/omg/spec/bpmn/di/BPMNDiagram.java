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
package org.omg.spec.bpmn.di;

import org.eclipse.emf.common.util.EList;

import org.omg.spec.dd.di.Diagram;

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
 *   <li>{@link org.omg.spec.bpmn.di.BPMNDiagram#getBPMNPlane <em>BPMN Plane</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.di.BPMNDiagram#getBPMNLabelStyle <em>BPMN Label Style</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNDiagram()
 * @model extendedMetaData="name='BPMNDiagram' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>BPMN Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Plane</em>' containment reference.
	 * @see #setBPMNPlane(BPMNPlane)
	 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNDiagram_BPMNPlane()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BPMNPlane' namespace='##targetNamespace'"
	 * @generated
	 */
	BPMNPlane getBPMNPlane();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.di.BPMNDiagram#getBPMNPlane <em>BPMN Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPMN Plane</em>' containment reference.
	 * @see #getBPMNPlane()
	 * @generated
	 */
	void setBPMNPlane(BPMNPlane value);

	/**
	 * Returns the value of the '<em><b>BPMN Label Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.bpmn.di.BPMNLabelStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPMN Label Style</em>' containment reference list.
	 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNDiagram_BPMNLabelStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPMNLabelStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPMNLabelStyle> getBPMNLabelStyle();

} // BPMNDiagram
