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
package net.opengis.ows;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Exception element describes one detected error that a server chooses to convey to the client. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.ExceptionType#getExceptionText <em>Exception Text</em>}</li>
 *   <li>{@link net.opengis.ows.ExceptionType#getExceptionCode <em>Exception Code</em>}</li>
 *   <li>{@link net.opengis.ows.ExceptionType#getLocator <em>Locator</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getExceptionType()
 * @model extendedMetaData="name='ExceptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExceptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered sequence of text strings that describe this specific exception or error. The contents of these strings are left open to definition by each server implementation. A server is strongly encouraged to include at least one ExceptionText value, to provide more information about the detected error than provided by the exceptionCode. When included, multiple ExceptionText values shall provide hierarchical information about one detected error, with the most significant information listed first. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Text</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getExceptionType_ExceptionText()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ExceptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getExceptionText();

	/**
	 * Returns the value of the '<em><b>Exception Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code representing the type of this exception, which shall be selected from a set of exceptionCode values specified for the specific service operation and server. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Code</em>' attribute.
	 * @see #setExceptionCode(String)
	 * @see net.opengis.ows.OWSPackage#getExceptionType_ExceptionCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='exceptionCode'"
	 * @generated
	 */
	String getExceptionCode();

	/**
	 * Sets the value of the '{@link net.opengis.ows.ExceptionType#getExceptionCode <em>Exception Code</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * When included, this locator shall indicate to the client where an exception was encountered in servicing the client's operation request. This locator should be included whenever meaningful information can be provided by the server. The contents of this locator will depend on the specific exceptionCode and OWS service, and shall be specified in the OWS Implementation Specification. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locator</em>' attribute.
	 * @see #setLocator(String)
	 * @see net.opengis.ows.OWSPackage#getExceptionType_Locator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locator'"
	 * @generated
	 */
	String getLocator();

	/**
	 * Sets the value of the '{@link net.opengis.ows.ExceptionType#getLocator <em>Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locator</em>' attribute.
	 * @see #getLocator()
	 * @generated
	 */
	void setLocator(String value);

} // ExceptionType
