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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Classification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies the data classification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DataClassificationType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DataClassificationType#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDataClassificationType()
 * @model extendedMetaData="name='dataClassificationType' kind='simple'"
 * @generated
 */
@ProviderType
public interface DataClassificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataClassificationType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataClassificationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.DataFlowType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the flow direction of the data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see org.cyclonedx.schema.bom.DataFlowType1
	 * @see #isSetFlow()
	 * @see #unsetFlow()
	 * @see #setFlow(DataFlowType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDataClassificationType_Flow()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='flow'"
	 * @generated
	 */
	DataFlowType1 getFlow();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DataClassificationType#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see org.cyclonedx.schema.bom.DataFlowType1
	 * @see #isSetFlow()
	 * @see #unsetFlow()
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(DataFlowType1 value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.DataClassificationType#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlow()
	 * @see #getFlow()
	 * @see #setFlow(DataFlowType1)
	 * @generated
	 */
	void unsetFlow();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.DataClassificationType#getFlow <em>Flow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow</em>' attribute is set.
	 * @see #unsetFlow()
	 * @see #getFlow()
	 * @see #setFlow(DataFlowType1)
	 * @generated
	 */
	boolean isSetFlow();

} // DataClassificationType
