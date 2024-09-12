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
 * A representation of the model object '<em><b>Parameter Value Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ParameterValueGroupType#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueGroupType#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueGroupType#getGroupGroup <em>Group Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueGroupType#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getParameterValueGroupType()
 * @model extendedMetaData="name='ParameterValueGroupType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ParameterValueGroupType extends AbstractGeneralParameterValueType {
	/**
	 * Returns the value of the '<em><b>Parameter Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:parameterValue is a composition association to a parameter value or group of parameter values used by a coordinate operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueGroupType_ParameterValueGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" many="true"
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
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueGroupType_ParameterValue()
	 * @model containment="true" lower="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameterValue' namespace='##targetNamespace' group='parameterValue:group'"
	 * @generated
	 */
	EList<AbstractGeneralParameterValuePropertyType> getParameterValue();

	/**
	 * Returns the value of the '<em><b>Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:group is an association role to the operation parameter group for which this element provides parameter values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueGroupType_GroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='group:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGroupGroup();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:group is an association role to the operation parameter group for which this element provides parameter values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(OperationParameterGroupPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueGroupType_Group()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='group:group'"
	 * @generated
	 */
	OperationParameterGroupPropertyType getGroup();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueGroupType#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(OperationParameterGroupPropertyType value);

} // ParameterValueGroupType
