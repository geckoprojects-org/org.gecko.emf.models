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
 * A representation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.CallActivity#getCalledElementRef <em>Called Element Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallActivity()
 * @model extendedMetaData="name='tCallActivity' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CallActivity extends Activity, InteractionNode {
	/**
	 * Returns the value of the '<em><b>Called Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Element Ref</em>' reference.
	 * @see #setCalledElementRef(CallableElement)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCallActivity_CalledElementRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='calledElement'"
	 * @generated
	 */
	CallableElement getCalledElementRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CallActivity#getCalledElementRef <em>Called Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Element Ref</em>' reference.
	 * @see #getCalledElementRef()
	 * @generated
	 */
	void setCalledElementRef(CallableElement value);

} // CallActivity
