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
 * A representation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCorrelationPropertyBinding()
 * @model extendedMetaData="name='tCorrelationPropertyBinding' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CorrelationPropertyBinding extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' containment reference.
	 * @see #setDataPath(FormalExpression)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCorrelationPropertyBinding_DataPath()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='dataPath' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	FormalExpression getDataPath();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' containment reference.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #setCorrelationPropertyRef(CorrelationProperty)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getCorrelationPropertyBinding_CorrelationPropertyRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='correlationPropertyRef'"
	 * @generated
	 */
	CorrelationProperty getCorrelationPropertyRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #getCorrelationPropertyRef()
	 * @generated
	 */
	void setCorrelationPropertyRef(CorrelationProperty value);

} // CorrelationPropertyBinding
