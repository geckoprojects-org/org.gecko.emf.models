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
 * A representation of the model object '<em><b>Operation Parameter Group Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for operation parameter group objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.OperationParameterGroupBaseType#getGroupName <em>Group Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getOperationParameterGroupBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='OperationParameterGroupBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationParameterGroupBaseType extends AbstractGeneralOperationParameterType {
	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this operation parameter group is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Name</em>' containment reference.
	 * @see #setGroupName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getOperationParameterGroupBaseType_GroupName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='groupName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getGroupName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.OperationParameterGroupBaseType#getGroupName <em>Group Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' containment reference.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(CodeType value);

} // OperationParameterGroupBaseType
