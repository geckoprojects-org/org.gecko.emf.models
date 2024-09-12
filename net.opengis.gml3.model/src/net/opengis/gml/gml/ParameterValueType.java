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

import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getDmsAngleValue <em>Dms Angle Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getStringValue <em>String Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getIntegerValueList <em>Integer Value List</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getValueFile <em>Value File</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getOperationParameterGroup <em>Operation Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ParameterValueType#getOperationParameter <em>Operation Parameter</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType()
 * @model extendedMetaData="name='ParameterValueType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ParameterValueType extends AbstractGeneralParameterValueType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:value is a numeric value of an operation parameter, with its associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Dms Angle Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dms Angle Value</em>' containment reference.
	 * @see #setDmsAngleValue(DMSAngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_DmsAngleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dmsAngleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DMSAngleType getDmsAngleValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getDmsAngleValue <em>Dms Angle Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dms Angle Value</em>' containment reference.
	 * @see #getDmsAngleValue()
	 * @generated
	 */
	void setDmsAngleValue(DMSAngleType value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:stringValue is a character string value of an operation parameter. A string value does not have an associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_StringValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='stringValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:integerValue is a positive integer value of an operation parameter, usually used for a count. An integer value does not have an associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_IntegerValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='integerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIntegerValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:booleanValue is a boolean value of an operation parameter. A Boolean value does not have an associated unit of measure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #isSetBooleanValue()
	 * @see #unsetBooleanValue()
	 * @see #setBooleanValue(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_BooleanValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='booleanValue' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBooleanValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#isBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #isSetBooleanValue()
	 * @see #unsetBooleanValue()
	 * @see #isBooleanValue()
	 * @generated
	 */
	void setBooleanValue(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.ParameterValueType#isBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBooleanValue()
	 * @see #isBooleanValue()
	 * @see #setBooleanValue(boolean)
	 * @generated
	 */
	void unsetBooleanValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.ParameterValueType#isBooleanValue <em>Boolean Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boolean Value</em>' attribute is set.
	 * @see #unsetBooleanValue()
	 * @see #isBooleanValue()
	 * @see #setBooleanValue(boolean)
	 * @generated
	 */
	boolean isSetBooleanValue();

	/**
	 * Returns the value of the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:valueList is an ordered sequence of two or more numeric values of an operation parameter list, where each value has the same associated unit of measure. An element of this type contains a space-separated sequence of double values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value List</em>' containment reference.
	 * @see #setValueList(MeasureListType)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_ValueList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueList' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureListType getValueList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getValueList <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List</em>' containment reference.
	 * @see #getValueList()
	 * @generated
	 */
	void setValueList(MeasureListType value);

	/**
	 * Returns the value of the '<em><b>Integer Value List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:integerValueList is an ordered sequence of two or more integer values of an operation parameter list, usually used for counts. These integer values do not have an associated unit of measure. An element of this type contains a space-separated sequence of integer values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integer Value List</em>' attribute.
	 * @see #setIntegerValueList(List)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_IntegerValueList()
	 * @model dataType="net.opengis.gml.gml.IntegerList" many="false"
	 *        extendedMetaData="kind='element' name='integerValueList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getIntegerValueList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getIntegerValueList <em>Integer Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value List</em>' attribute.
	 * @see #getIntegerValueList()
	 * @generated
	 */
	void setIntegerValueList(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>Value File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:valueFile is a reference to a file or a part of a file containing one or more parameter values, each numeric value with its associated unit of measure. When referencing a part of a file, that file shall contain multiple identified parts, such as an XML encoded document. Furthermore, the referenced file or part of a file may reference another part of the same or different files, as allowed in XML documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value File</em>' attribute.
	 * @see #setValueFile(String)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_ValueFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='valueFile' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValueFile();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getValueFile <em>Value File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value File</em>' attribute.
	 * @see #getValueFile()
	 * @generated
	 */
	void setValueFile(String value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:operationParameter is an association role to the operation parameter of which this is a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_OperationParameterGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='operationParameter:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOperationParameterGroup();

	/**
	 * Returns the value of the '<em><b>Operation Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:operationParameter is an association role to the operation parameter of which this is a value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Parameter</em>' containment reference.
	 * @see #setOperationParameter(OperationParameterPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getParameterValueType_OperationParameter()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='operationParameter' namespace='##targetNamespace' group='operationParameter:group'"
	 * @generated
	 */
	OperationParameterPropertyType getOperationParameter();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ParameterValueType#getOperationParameter <em>Operation Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter</em>' containment reference.
	 * @see #getOperationParameter()
	 * @generated
	 */
	void setOperationParameter(OperationParameterPropertyType value);

} // ParameterValueType
