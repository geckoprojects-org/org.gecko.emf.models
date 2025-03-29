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
package org.omg.spec.cmmn.casemodel;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTimer Event Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerExpression <em>Timer Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStartGroup <em>Timer Start Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStart <em>Timer Start</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTimerEventListener()
 * @model extendedMetaData="name='tTimerEventListener' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTimerEventListener extends TEventListener {
	/**
	 * Returns the value of the '<em><b>Timer Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 timerExpression is supposed to be an ISO-8601 conformant expression
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Expression</em>' containment reference.
	 * @see #setTimerExpression(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTimerEventListener_TimerExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timerExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getTimerExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerExpression <em>Timer Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Expression</em>' containment reference.
	 * @see #getTimerExpression()
	 * @generated
	 */
	void setTimerExpression(TExpression value);

	/**
	 * Returns the value of the '<em><b>Timer Start Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 timerStart can be used to trigger the timer after a PlanItem or CaseFileItem 
	 *                 lifecycle state transition has occurred.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Start Group</em>' attribute list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTimerEventListener_TimerStartGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='timerStart:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimerStartGroup();

	/**
	 * Returns the value of the '<em><b>Timer Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 timerStart can be used to trigger the timer after a PlanItem or CaseFileItem 
	 *                 lifecycle state transition has occurred.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Start</em>' containment reference.
	 * @see #setTimerStart(TStartTrigger)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTimerEventListener_TimerStart()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timerStart' namespace='##targetNamespace' group='timerStart:group'"
	 * @generated
	 */
	TStartTrigger getTimerStart();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStart <em>Timer Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Start</em>' containment reference.
	 * @see #getTimerStart()
	 * @generated
	 */
	void setTimerStart(TStartTrigger value);

} // TTimerEventListener
