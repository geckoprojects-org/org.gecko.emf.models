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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.ConnectorType#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.ConnectorType#getInputOutput <em>Input Output</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.model.CamundaPackage#getConnectorType()
 * @model extendedMetaData="name='connector_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConnectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Id</em>' attribute.
	 * @see #setConnectorId(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getConnectorType_ConnectorId()
	 * @model extendedMetaData="kind='element' name='connectorId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConnectorId();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.ConnectorType#getConnectorId <em>Connector Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Id</em>' attribute.
	 * @see #getConnectorId()
	 * @generated
	 */
	void setConnectorId(String value);

	/**
	 * Returns the value of the '<em><b>Input Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Output</em>' containment reference.
	 * @see #setInputOutput(InputOutputType)
	 * @see org.camunda.bpmn.model.CamundaPackage#getConnectorType_InputOutput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	InputOutputType getInputOutput();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.ConnectorType#getInputOutput <em>Input Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Output</em>' containment reference.
	 * @see #getInputOutput()
	 * @generated
	 */
	void setInputOutput(InputOutputType value);

} // ConnectorType
