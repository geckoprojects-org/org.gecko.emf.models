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
 * A representation of the model object '<em><b>TTimer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeCycle <em>Time Cycle</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTTimerEventDefinition()
 * @model extendedMetaData="name='tTimerEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTimerEventDefinition extends TEventDefinition {
	/**
	 * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date</em>' containment reference.
	 * @see #setTimeDate(TExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTTimerEventDefinition_TimeDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeDate' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getTimeDate();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDate <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date</em>' containment reference.
	 * @see #getTimeDate()
	 * @generated
	 */
	void setTimeDate(TExpression value);

	/**
	 * Returns the value of the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Duration</em>' containment reference.
	 * @see #setTimeDuration(TExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTTimerEventDefinition_TimeDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getTimeDuration();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDuration <em>Time Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Duration</em>' containment reference.
	 * @see #getTimeDuration()
	 * @generated
	 */
	void setTimeDuration(TExpression value);

	/**
	 * Returns the value of the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Cycle</em>' containment reference.
	 * @see #setTimeCycle(TExpression)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTTimerEventDefinition_TimeCycle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeCycle' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getTimeCycle();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeCycle <em>Time Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Cycle</em>' containment reference.
	 * @see #getTimeCycle()
	 * @generated
	 */
	void setTimeCycle(TExpression value);

} // TTimerEventDefinition
