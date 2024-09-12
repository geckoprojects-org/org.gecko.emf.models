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
package net.opengis.gml.gml;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.OperationParameterGroupType#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationParameterGroupType#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OperationParameterGroupType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getOperationParameterGroupType()
 * @model extendedMetaData="name='OperationParameterGroupType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OperationParameterGroupType extends AbstractGeneralOperationParameterType {
	/**
	 * Returns the value of the '<em><b>Maximum Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:maximumOccurs is the maximum number of times that values for this parameter group may be included. If this attribute is omitted, the maximum number shall be one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Occurs</em>' attribute.
	 * @see #setMaximumOccurs(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getOperationParameterGroupType_MaximumOccurs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='maximumOccurs' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaximumOccurs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OperationParameterGroupType#getMaximumOccurs <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Occurs</em>' attribute.
	 * @see #getMaximumOccurs()
	 * @generated
	 */
	void setMaximumOccurs(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameter is an association to an operation parameter or parameter group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getOperationParameterGroupType_ParameterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" many="true"
	 *        extendedMetaData="kind='group' name='parameter:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getParameterGroup();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameter is an association to an operation parameter or parameter group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getOperationParameterGroupType_Parameter()
	 * @model containment="true" lower="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace' group='parameter:group'"
	 * @generated
	 */
	EList<AbstractGeneralOperationParameterPropertyType> getParameter();

} // OperationParameterGroupType
