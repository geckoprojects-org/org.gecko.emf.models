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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getSignalEventDefinition()
 * @model extendedMetaData="name='tSignalEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SignalEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Signal Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Ref</em>' reference.
	 * @see #setSignalRef(Signal)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getSignalEventDefinition_SignalRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='signalRef'"
	 * @generated
	 */
	Signal getSignalRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Ref</em>' reference.
	 * @see #getSignalRef()
	 * @generated
	 */
	void setSignalRef(Signal value);

} // SignalEventDefinition
