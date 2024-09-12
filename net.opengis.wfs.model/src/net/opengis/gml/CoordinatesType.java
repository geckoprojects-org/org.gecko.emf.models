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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tables or arrays of tuples.  
 *         May be used for text-encoding of values from a table.  
 *         Actually just a string, but allows the user to indicate which characters are used as separators.  
 *         The value of the 'cs' attribute is the separator for coordinate values, 
 *         and the value of the 'ts' attribute gives the tuple separator (a single space by default); 
 *         the default values may be changed to reflect local usage.
 *         Defaults to CSV within a tuple, space between tuples.  
 *         However, any string content will be schema-valid.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CoordinatesType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.CoordinatesType#getCs <em>Cs</em>}</li>
 *   <li>{@link net.opengis.gml.CoordinatesType#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link net.opengis.gml.CoordinatesType#getTs <em>Ts</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCoordinatesType()
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
	 * @see net.opengis.gml.GMLPackage#getCoordinatesType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.CoordinatesType#getValue <em>Value</em>}' attribute.
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
	 * @see net.opengis.gml.GMLPackage#getCoordinatesType_Cs()
	 * @model default="," unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cs'"
	 * @generated
	 */
	String getCs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.CoordinatesType#getCs <em>Cs</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.CoordinatesType#getCs <em>Cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCs()
	 * @see #getCs()
	 * @see #setCs(String)
	 * @generated
	 */
	void unsetCs();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.CoordinatesType#getCs <em>Cs</em>}' attribute is set.
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
	 * @see net.opengis.gml.GMLPackage#getCoordinatesType_Decimal()
	 * @model default="." unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='decimal'"
	 * @generated
	 */
	String getDecimal();

	/**
	 * Sets the value of the '{@link net.opengis.gml.CoordinatesType#getDecimal <em>Decimal</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.CoordinatesType#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecimal()
	 * @see #getDecimal()
	 * @see #setDecimal(String)
	 * @generated
	 */
	void unsetDecimal();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.CoordinatesType#getDecimal <em>Decimal</em>}' attribute is set.
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
	 * @see net.opengis.gml.GMLPackage#getCoordinatesType_Ts()
	 * @model default=" " unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ts'"
	 * @generated
	 */
	String getTs();

	/**
	 * Sets the value of the '{@link net.opengis.gml.CoordinatesType#getTs <em>Ts</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.CoordinatesType#getTs <em>Ts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTs()
	 * @see #getTs()
	 * @see #setTs(String)
	 * @generated
	 */
	void unsetTs();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.CoordinatesType#getTs <em>Ts</em>}' attribute is set.
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
