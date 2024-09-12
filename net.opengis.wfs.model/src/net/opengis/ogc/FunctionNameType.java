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
package net.opengis.ogc;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.FunctionNameType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.ogc.FunctionNameType#getNArgs <em>NArgs</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getFunctionNameType()
 * @model extendedMetaData="name='FunctionNameType' kind='simple'"
 * @generated
 */
@ProviderType
public interface FunctionNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.ogc.OGCPackage#getFunctionNameType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.FunctionNameType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>NArgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NArgs</em>' attribute.
	 * @see #setNArgs(String)
	 * @see net.opengis.ogc.OGCPackage#getFunctionNameType_NArgs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='nArgs'"
	 * @generated
	 */
	String getNArgs();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.FunctionNameType#getNArgs <em>NArgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NArgs</em>' attribute.
	 * @see #getNArgs()
	 * @generated
	 */
	void setNArgs(String value);

} // FunctionNameType
