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
package net.opengis.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Method Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for operation method objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.OperationMethodBaseType#getMethodName <em>Method Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getOperationMethodBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='OperationMethodBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationMethodBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this operation method is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name</em>' containment reference.
	 * @see #setMethodName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getOperationMethodBaseType_MethodName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='methodName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getMethodName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.OperationMethodBaseType#getMethodName <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' containment reference.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(CodeType value);

} // OperationMethodBaseType
