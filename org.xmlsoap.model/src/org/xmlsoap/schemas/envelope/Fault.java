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
package org.xmlsoap.schemas.envelope;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	    Fault reporting structure
 * 	  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.envelope.Fault#getFaultcode <em>Faultcode</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.Fault#getFaultstring <em>Faultstring</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.Fault#getFaultactor <em>Faultactor</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.Fault#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getFault()
 * @model extendedMetaData="name='Fault' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Fault extends EObject {
	/**
	 * Returns the value of the '<em><b>Faultcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultcode</em>' attribute.
	 * @see #setFaultcode(QName)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getFault_Faultcode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='faultcode'"
	 * @generated
	 */
	QName getFaultcode();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.Fault#getFaultcode <em>Faultcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faultcode</em>' attribute.
	 * @see #getFaultcode()
	 * @generated
	 */
	void setFaultcode(QName value);

	/**
	 * Returns the value of the '<em><b>Faultstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultstring</em>' attribute.
	 * @see #setFaultstring(String)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getFault_Faultstring()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='faultstring'"
	 * @generated
	 */
	String getFaultstring();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.Fault#getFaultstring <em>Faultstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faultstring</em>' attribute.
	 * @see #getFaultstring()
	 * @generated
	 */
	void setFaultstring(String value);

	/**
	 * Returns the value of the '<em><b>Faultactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faultactor</em>' attribute.
	 * @see #setFaultactor(String)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getFault_Faultactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='faultactor'"
	 * @generated
	 */
	String getFaultactor();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.Fault#getFaultactor <em>Faultactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faultactor</em>' attribute.
	 * @see #getFaultactor()
	 * @generated
	 */
	void setFaultactor(String value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(Detail)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getFault_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail'"
	 * @generated
	 */
	Detail getDetail();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.Fault#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(Detail value);

} // Fault
