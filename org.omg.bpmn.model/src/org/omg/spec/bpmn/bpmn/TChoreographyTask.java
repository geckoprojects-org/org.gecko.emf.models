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
 * A representation of the model object '<em><b>TChoreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTChoreographyTask()
 * @model extendedMetaData="name='tChoreographyTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TChoreographyTask extends TChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.namespace.QName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' attribute list.
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTChoreographyTask_MessageFlowRef()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='messageFlowRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QName> getMessageFlowRef();

} // TChoreographyTask
