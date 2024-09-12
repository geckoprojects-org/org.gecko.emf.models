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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type is deprecated for tuples with ordinate values that are numbers.
 * CoordinatesType is a text string, intended to be used to record an array of tuples or coordinates. 
 * While it is not possible to enforce the internal structure of the string through schema validation, some optional attributes have been provided in previous versions of GML to support a description of the internal structure. These attributes are deprecated. The attributes were intended to be used as follows:
 * Decimal	symbol used for a decimal point (default="." a stop or period)
 * cs        	symbol used to separate components within a tuple or coordinate string (default="," a comma)
 * ts        	symbol used to separate tuples or coordinate strings (default=" " a space)
 * Since it is based on the XML Schema string type, CoordinatesType may be used in the construction of tables of tuples or arrays of tuples, including ones that contain mixed text and numeric values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.CoordinatesType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinatesType#getCs <em>Cs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinatesType#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CoordinatesType#getTs <em>Ts</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getCoordinatesType()
 * @model extendedMetaData="name='CoordinatesType' kind='simple'"
 * @generated
 */
@ProviderType
public interface CoordinatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinatesType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Cs</b></em>' attribute.
	 * The default value is <code>","</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' attribute.
	 * @see #isSetCs()
	 * @see #unsetCs()
	 * @see #setCs(String)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinatesType_Cs()
	 * @model default="," unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cs'"
	 * @generated
	 */
	String getCs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getCs <em>Cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs</em>' attribute.
	 * @see #isSetCs()
	 * @see #unsetCs()
	 * @see #getCs()
	 * @generated
	 */
	void setCs(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getCs <em>Cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCs()
	 * @see #getCs()
	 * @see #setCs(String)
	 * @generated
	 */
	void unsetCs();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CoordinatesType#getCs <em>Cs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cs</em>' attribute is set.
	 * @see #unsetCs()
	 * @see #getCs()
	 * @see #setCs(String)
	 * @generated
	 */
	boolean isSetCs();

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * The default value is <code>"."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #isSetDecimal()
	 * @see #unsetDecimal()
	 * @see #setDecimal(String)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinatesType_Decimal()
	 * @model default="." unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='decimal'"
	 * @generated
	 */
	String getDecimal();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #isSetDecimal()
	 * @see #unsetDecimal()
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecimal()
	 * @see #getDecimal()
	 * @see #setDecimal(String)
	 * @generated
	 */
	void unsetDecimal();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CoordinatesType#getDecimal <em>Decimal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decimal</em>' attribute is set.
	 * @see #unsetDecimal()
	 * @see #getDecimal()
	 * @see #setDecimal(String)
	 * @generated
	 */
	boolean isSetDecimal();

	/**
	 * Returns the value of the '<em><b>Ts</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ts</em>' attribute.
	 * @see #isSetTs()
	 * @see #unsetTs()
	 * @see #setTs(String)
	 * @see net.opengis.gml.gml.GMLPackage#getCoordinatesType_Ts()
	 * @model default=" " unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ts'"
	 * @generated
	 */
	String getTs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getTs <em>Ts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ts</em>' attribute.
	 * @see #isSetTs()
	 * @see #unsetTs()
	 * @see #getTs()
	 * @generated
	 */
	void setTs(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CoordinatesType#getTs <em>Ts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTs()
	 * @see #getTs()
	 * @see #setTs(String)
	 * @generated
	 */
	void unsetTs();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CoordinatesType#getTs <em>Ts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ts</em>' attribute is set.
	 * @see #unsetTs()
	 * @see #getTs()
	 * @see #setTs(String)
	 * @generated
	 */
	boolean isSetTs();

} // CoordinatesType
