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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TStart Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TStartEvent#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTStartEvent()
 * @model extendedMetaData="name='tStartEvent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TStartEvent extends TCatchEvent {
	/**
	 * Returns the value of the '<em><b>Is Interrupting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interrupting</em>' attribute.
	 * @see #isSetIsInterrupting()
	 * @see #unsetIsInterrupting()
	 * @see #setIsInterrupting(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTStartEvent_IsInterrupting()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isInterrupting'"
	 * @generated
	 */
	boolean isIsInterrupting();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TStartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interrupting</em>' attribute.
	 * @see #isSetIsInterrupting()
	 * @see #unsetIsInterrupting()
	 * @see #isIsInterrupting()
	 * @generated
	 */
	void setIsInterrupting(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TStartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInterrupting()
	 * @see #isIsInterrupting()
	 * @see #setIsInterrupting(boolean)
	 * @generated
	 */
	void unsetIsInterrupting();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TStartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Interrupting</em>' attribute is set.
	 * @see #unsetIsInterrupting()
	 * @see #isIsInterrupting()
	 * @see #setIsInterrupting(boolean)
	 * @generated
	 */
	boolean isSetIsInterrupting();

} // TStartEvent
