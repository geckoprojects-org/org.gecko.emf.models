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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.DataAssociation#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.DataAssociation#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.DataAssociation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.DataAssociation#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataAssociation()
 * @model extendedMetaData="name='tDataAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.ItemAwareElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataAssociation_SourceRef()
	 * @model resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element' name='sourceRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<ItemAwareElement> getSourceRef();

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(ItemAwareElement)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataAssociation_TargetRef()
	 * @model resolveProxies="false" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='targetRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	ItemAwareElement getTargetRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataAssociation#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(ItemAwareElement value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(FormalExpression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataAssociation_Transformation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='transformation' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	FormalExpression getTransformation();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.DataAssociation#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.bpmn.bpmn2.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getDataAssociation_Assignment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='assignment' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<Assignment> getAssignment();

} // DataAssociation
