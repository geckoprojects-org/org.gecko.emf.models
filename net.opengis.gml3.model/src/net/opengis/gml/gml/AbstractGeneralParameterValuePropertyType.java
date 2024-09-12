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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract General Parameter Value Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:AbstractGeneralParameterValuePropertyType is a  property type for inline association roles to a parameter value or group of parameter values, always containing the values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType#getAbstractGeneralParameterValueGroup <em>Abstract General Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType#getAbstractGeneralParameterValue <em>Abstract General Parameter Value</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralParameterValuePropertyType()
 * @model extendedMetaData="name='AbstractGeneralParameterValuePropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractGeneralParameterValuePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract General Parameter Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractGeneralParameterValue is an abstract parameter value or group of parameter values.
	 * This abstract complexType is expected to be extended and restricted for well-known operation methods with many instances, in Application Schemas that define operation-method-specialized element names and contents. Specific parameter value elements are directly contained in concrete subtypes, not in this abstract type. All concrete types derived from this type shall extend this type to include one "...Value" element with an appropriate type, which should be one of the element types allowed in the ParameterValueType. In addition, all derived concrete types shall extend this type to include a "operationParameter" property element that references one element substitutable for the "OperationParameter" object element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Parameter Value Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralParameterValuePropertyType_AbstractGeneralParameterValueGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='AbstractGeneralParameterValue:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractGeneralParameterValueGroup();

	/**
	 * Returns the value of the '<em><b>Abstract General Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:AbstractGeneralParameterValue is an abstract parameter value or group of parameter values.
	 * This abstract complexType is expected to be extended and restricted for well-known operation methods with many instances, in Application Schemas that define operation-method-specialized element names and contents. Specific parameter value elements are directly contained in concrete subtypes, not in this abstract type. All concrete types derived from this type shall extend this type to include one "...Value" element with an appropriate type, which should be one of the element types allowed in the ParameterValueType. In addition, all derived concrete types shall extend this type to include a "operationParameter" property element that references one element substitutable for the "OperationParameter" object element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract General Parameter Value</em>' containment reference.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralParameterValuePropertyType_AbstractGeneralParameterValue()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeneralParameterValue' namespace='##targetNamespace' group='AbstractGeneralParameterValue:group'"
	 * @generated
	 */
	AbstractGeneralParameterValueType getAbstractGeneralParameterValue();

} // AbstractGeneralParameterValuePropertyType
