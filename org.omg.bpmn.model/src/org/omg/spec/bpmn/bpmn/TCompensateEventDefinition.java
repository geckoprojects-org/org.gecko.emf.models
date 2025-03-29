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
 * A representation of the model object '<em><b>TCompensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#getActivityRef <em>Activity Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCompensateEventDefinition()
 * @model extendedMetaData="name='tCompensateEventDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCompensateEventDefinition extends TEventDefinition {
	/**
	 * Returns the value of the '<em><b>Activity Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Ref</em>' attribute.
	 * @see #setActivityRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCompensateEventDefinition_ActivityRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='activityRef'"
	 * @generated
	 */
	QName getActivityRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#getActivityRef <em>Activity Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Ref</em>' attribute.
	 * @see #getActivityRef()
	 * @generated
	 */
	void setActivityRef(QName value);

	/**
	 * Returns the value of the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For Completion</em>' attribute.
	 * @see #isSetWaitForCompletion()
	 * @see #unsetWaitForCompletion()
	 * @see #setWaitForCompletion(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTCompensateEventDefinition_WaitForCompletion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='waitForCompletion'"
	 * @generated
	 */
	boolean isWaitForCompletion();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait For Completion</em>' attribute.
	 * @see #isSetWaitForCompletion()
	 * @see #unsetWaitForCompletion()
	 * @see #isWaitForCompletion()
	 * @generated
	 */
	void setWaitForCompletion(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaitForCompletion()
	 * @see #isWaitForCompletion()
	 * @see #setWaitForCompletion(boolean)
	 * @generated
	 */
	void unsetWaitForCompletion();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wait For Completion</em>' attribute is set.
	 * @see #unsetWaitForCompletion()
	 * @see #isWaitForCompletion()
	 * @see #setWaitForCompletion(boolean)
	 * @generated
	 */
	boolean isSetWaitForCompletion();

} // TCompensateEventDefinition
