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
package net.opengis.kml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snippet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.SnippetType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.kml.SnippetType#getMaxLines <em>Max Lines</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getSnippetType()
 * @model extendedMetaData="name='SnippetType' kind='simple'"
 * @generated
 */
@ProviderType
public interface SnippetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.kml.KMLPackage#getSnippetType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.kml.SnippetType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Lines</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lines</em>' attribute.
	 * @see #isSetMaxLines()
	 * @see #unsetMaxLines()
	 * @see #setMaxLines(int)
	 * @see net.opengis.kml.KMLPackage#getSnippetType_MaxLines()
	 * @model default="2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maxLines'"
	 * @generated
	 */
	int getMaxLines();

	/**
	 * Sets the value of the '{@link net.opengis.kml.SnippetType#getMaxLines <em>Max Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lines</em>' attribute.
	 * @see #isSetMaxLines()
	 * @see #unsetMaxLines()
	 * @see #getMaxLines()
	 * @generated
	 */
	void setMaxLines(int value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.SnippetType#getMaxLines <em>Max Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLines()
	 * @see #getMaxLines()
	 * @see #setMaxLines(int)
	 * @generated
	 */
	void unsetMaxLines();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.SnippetType#getMaxLines <em>Max Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Lines</em>' attribute is set.
	 * @see #unsetMaxLines()
	 * @see #getMaxLines()
	 * @see #setMaxLines(int)
	 * @generated
	 */
	boolean isSetMaxLines();

} // SnippetType
