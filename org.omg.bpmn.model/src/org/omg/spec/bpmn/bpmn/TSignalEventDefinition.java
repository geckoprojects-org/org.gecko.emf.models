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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSignal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TSignalEventDefinition#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTSignalEventDefinition()
 * @model extendedMetaData="name='tSignalEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TSignalEventDefinition extends TEventDefinition {
	/**
	 * Returns the value of the '<em><b>Signal Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Ref</em>' attribute.
	 * @see #setSignalRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTSignalEventDefinition_SignalRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='signalRef'"
	 * @generated
	 */
	QName getSignalRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TSignalEventDefinition#getSignalRef <em>Signal Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Ref</em>' attribute.
	 * @see #getSignalRef()
	 * @generated
	 */
	void setSignalRef(QName value);

} // TSignalEventDefinition
