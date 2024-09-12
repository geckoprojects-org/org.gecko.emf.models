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
 * A representation of the model object '<em><b>Compensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCompensateEventDefinition()
 * @model extendedMetaData="name='tCompensateEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompensateEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Activity Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Ref</em>' reference.
	 * @see #setActivityRef(Activity)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCompensateEventDefinition_ActivityRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='activityRef'"
	 * @generated
	 */
	Activity getActivityRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Ref</em>' reference.
	 * @see #getActivityRef()
	 * @generated
	 */
	void setActivityRef(Activity value);

	/**
	 * Returns the value of the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For Completion</em>' attribute.
	 * @see #setWaitForCompletion(boolean)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCompensateEventDefinition_WaitForCompletion()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='waitForCompletion'"
	 * @generated
	 */
	boolean isWaitForCompletion();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait For Completion</em>' attribute.
	 * @see #isWaitForCompletion()
	 * @generated
	 */
	void setWaitForCompletion(boolean value);

} // CompensateEventDefinition
