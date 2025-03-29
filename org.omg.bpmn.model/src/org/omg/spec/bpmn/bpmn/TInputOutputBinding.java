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
 * A representation of the model object '<em><b>TInput Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputBinding()
 * @model extendedMetaData="name='tInputOutputBinding' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TInputOutputBinding extends TBaseElement {
	/**
	 * Returns the value of the '<em><b>Input Data Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Ref</em>' attribute.
	 * @see #setInputDataRef(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputBinding_InputDataRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='inputDataRef'"
	 * @generated
	 */
	String getInputDataRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getInputDataRef <em>Input Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data Ref</em>' attribute.
	 * @see #getInputDataRef()
	 * @generated
	 */
	void setInputDataRef(String value);

	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' attribute.
	 * @see #setOperationRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputBinding_OperationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='operationRef'"
	 * @generated
	 */
	QName getOperationRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOperationRef <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' attribute.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(QName value);

	/**
	 * Returns the value of the '<em><b>Output Data Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Ref</em>' attribute.
	 * @see #setOutputDataRef(String)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTInputOutputBinding_OutputDataRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='outputDataRef'"
	 * @generated
	 */
	String getOutputDataRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data Ref</em>' attribute.
	 * @see #getOutputDataRef()
	 * @generated
	 */
	void setOutputDataRef(String value);

} // TInputOutputBinding
