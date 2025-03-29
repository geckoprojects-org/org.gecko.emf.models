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

import javax.xml.namespace.QName;

import org.omg.spec.dd.di.Plane;

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
 *   <li>{@link org.omg.spec.bpmn.di.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNPlane()
 * @model extendedMetaData="name='BPMNPlane' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNPlane extends Plane {
	/**
	 * Returns the value of the '<em><b>Bpmn Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Element</em>' attribute.
	 * @see #setBpmnElement(QName)
	 * @see org.omg.spec.bpmn.di.BPMNDIPackage#getBPMNPlane_BpmnElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='bpmnElement'"
	 * @generated
	 */
	QName getBpmnElement();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.di.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' attribute.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(QName value);

} // BPMNPlane
