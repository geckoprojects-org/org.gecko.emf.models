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
 * A representation of the model object '<em><b>Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.OutType#getSource <em>Source</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.OutType#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.OutType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.OutType#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.model.CamundaPackage#getOutType()
 * @model extendedMetaData="name='out_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface OutType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getOutType_Source()
	 * @model extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.OutType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Expression</em>' attribute.
	 * @see #setSourceExpression(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getOutType_SourceExpression()
	 * @model dataType="org.camunda.bpmn.model.TExpression"
	 *        extendedMetaData="kind='attribute' name='sourceExpression'"
	 * @generated
	 */
	String getSourceExpression();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.OutType#getSourceExpression <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Expression</em>' attribute.
	 * @see #getSourceExpression()
	 * @generated
	 */
	void setSourceExpression(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getOutType_Target()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.OutType#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute.
	 * @see #setVariables(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getOutType_Variables()
	 * @model extendedMetaData="kind='attribute' name='variables'"
	 * @generated
	 */
	String getVariables();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.OutType#getVariables <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' attribute.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(String value);

} // OutType
