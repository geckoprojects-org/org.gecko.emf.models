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
 * A representation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.AdHocSubProcess#getOrdering <em>Ordering</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getAdHocSubProcess()
 * @model extendedMetaData="name='tAdHocSubProcess' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdHocSubProcess extends SubProcess {
	/**
	 * Returns the value of the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Condition</em>' containment reference.
	 * @see #setCompletionCondition(Expression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getAdHocSubProcess_CompletionCondition()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='completionCondition' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getCompletionCondition();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Condition</em>' containment reference.
	 * @see #getCompletionCondition()
	 * @generated
	 */
	void setCompletionCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Cancel Remaining Instances</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Remaining Instances</em>' attribute.
	 * @see #setCancelRemainingInstances(boolean)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getAdHocSubProcess_CancelRemainingInstances()
	 * @model default="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='cancelRemainingInstances'"
	 * @generated
	 */
	boolean isCancelRemainingInstances();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Remaining Instances</em>' attribute.
	 * @see #isCancelRemainingInstances()
	 * @generated
	 */
	void setCancelRemainingInstances(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.bpmn.bpmn2.AdHocOrdering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see org.omg.bpmn.bpmn2.AdHocOrdering
	 * @see #setOrdering(AdHocOrdering)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getAdHocSubProcess_Ordering()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='ordering'"
	 * @generated
	 */
	AdHocOrdering getOrdering();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.AdHocSubProcess#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see org.omg.bpmn.bpmn2.AdHocOrdering
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(AdHocOrdering value);

} // AdHocSubProcess
