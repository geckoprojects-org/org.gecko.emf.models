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
 * A representation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getTimerEventDefinition()
 * @model extendedMetaData="name='tTimerEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimerEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date</em>' containment reference.
	 * @see #setTimeDate(Expression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='timeDate' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getTimeDate();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date</em>' containment reference.
	 * @see #getTimeDate()
	 * @generated
	 */
	void setTimeDate(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Duration</em>' containment reference.
	 * @see #setTimeDuration(Expression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeDuration()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='timeDuration' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getTimeDuration();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Duration</em>' containment reference.
	 * @see #getTimeDuration()
	 * @generated
	 */
	void setTimeDuration(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Cycle</em>' containment reference.
	 * @see #setTimeCycle(Expression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeCycle()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='timeCycle' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getTimeCycle();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Cycle</em>' containment reference.
	 * @see #getTimeCycle()
	 * @generated
	 */
	void setTimeCycle(Expression value);

} // TimerEventDefinition
