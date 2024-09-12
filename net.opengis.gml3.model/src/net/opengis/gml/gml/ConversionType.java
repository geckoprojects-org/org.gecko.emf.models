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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ConversionType#getMethodGroup <em>Method Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ConversionType#getMethod <em>Method</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ConversionType#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ConversionType#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getConversionType()
 * @model extendedMetaData="name='ConversionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConversionType extends AbstractGeneralConversionType {
	/**
	 * Returns the value of the '<em><b>Method Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:method is an association role to the operation method used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getConversionType_MethodGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='method:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMethodGroup();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:method is an association role to the operation method used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(OperationMethodPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getConversionType_Method()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace' group='method:group'"
	 * @generated
	 */
	OperationMethodPropertyType getMethod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ConversionType#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(OperationMethodPropertyType value);

	/**
	 * Returns the value of the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getConversionType_ParameterValueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='parameterValue:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getParameterValueGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getConversionType_ParameterValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterValue' namespace='##targetNamespace' group='parameterValue:group'"
	 * @generated
	 */
	EList<AbstractGeneralParameterValuePropertyType> getParameterValue();

} // ConversionType
