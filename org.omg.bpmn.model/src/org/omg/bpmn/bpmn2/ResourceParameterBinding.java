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
 * A representation of the model object '<em><b>Resource Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.ResourceParameterBinding#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getResourceParameterBinding()
 * @model extendedMetaData="name='tResourceParameterBinding' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResourceParameterBinding extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getResourceParameterBinding_Expression()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='expression' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL' group='http://www.omg.org/spec/BPMN/20100524/MODEL#expression'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ResourceParameterBinding#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' reference.
	 * @see #setParameterRef(ResourceParameter)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getResourceParameterBinding_ParameterRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='parameterRef'"
	 * @generated
	 */
	ResourceParameter getParameterRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' reference.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(ResourceParameter value);

} // ResourceParameterBinding
