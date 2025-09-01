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
package net.opengis.ogc.features;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.Exception#getExceptionText <em>Exception Text</em>}</li>
 *   <li>{@link net.opengis.ogc.features.Exception#getExceptionCode <em>Exception Code</em>}</li>
 *   <li>{@link net.opengis.ogc.features.Exception#getLocator <em>Locator</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getException()
 * @model extendedMetaData="name='ExceptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Exception extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Text</em>' attribute list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getException_ExceptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ExceptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getExceptionText();

	/**
	 * Returns the value of the '<em><b>Exception Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Code</em>' attribute.
	 * @see #setExceptionCode(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getException_ExceptionCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='exceptionCode'"
	 * @generated
	 */
	String getExceptionCode();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.Exception#getExceptionCode <em>Exception Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Code</em>' attribute.
	 * @see #getExceptionCode()
	 * @generated
	 */
	void setExceptionCode(String value);

	/**
	 * Returns the value of the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locator</em>' attribute.
	 * @see #setLocator(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getException_Locator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locator'"
	 * @generated
	 */
	String getLocator();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.Exception#getLocator <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locator</em>' attribute.
	 * @see #getLocator()
	 * @generated
	 */
	void setLocator(String value);

} // Exception
