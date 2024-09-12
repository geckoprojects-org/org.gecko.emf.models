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
package org.camunda.bpmn.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.InputOutputType#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.InputOutputType#getOutputParameters <em>Output Parameters</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.model.CamundaPackage#getInputOutputType()
 * @model extendedMetaData="name='inputOutput_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InputOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.camunda.bpmn.model.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getInputOutputType_InputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterType> getInputParameters();

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.camunda.bpmn.model.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference list.
	 * @see org.camunda.bpmn.model.CamundaPackage#getInputOutputType_OutputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterType> getOutputParameters();

} // InputOutputType
