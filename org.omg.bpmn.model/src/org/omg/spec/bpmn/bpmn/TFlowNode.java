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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFlow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TFlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TFlowNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTFlowNode()
 * @model abstract="true"
 *        extendedMetaData="name='tFlowNode' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TFlowNode extends TFlowElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTFlowNode_Incoming()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='incoming' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTFlowNode_Outgoing()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='element' name='outgoing' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getOutgoing();

} // TFlowNode
