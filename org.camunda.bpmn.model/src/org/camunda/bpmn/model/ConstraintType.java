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
 * A representation of the model object '<em><b>Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.ConstraintType#getName <em>Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.ConstraintType#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.model.CamundaPackage#getConstraintType()
 * @model extendedMetaData="name='constraint_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface ConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getConstraintType_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.ConstraintType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.camunda.bpmn.model.CamundaPackage#getConstraintType_Config()
	 * @model extendedMetaData="kind='attribute' name='config'"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.model.ConstraintType#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

} // ConstraintType
