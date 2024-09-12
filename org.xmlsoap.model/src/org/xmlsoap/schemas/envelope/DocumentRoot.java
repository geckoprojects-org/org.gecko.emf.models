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

import java.util.List;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getFault <em>Fault</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getActor <em>Actor</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#getEncodingStyle <em>Encoding Style</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.DocumentRoot#isMustUnderstand <em>Must Understand</em>}</li>
 * </ul>
 *
 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_Body()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope</em>' containment reference.
	 * @see #setEnvelope(Envelope)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_Envelope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Envelope' namespace='##targetNamespace'"
	 * @generated
	 */
	Envelope getEnvelope();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getEnvelope <em>Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope</em>' containment reference.
	 * @see #getEnvelope()
	 * @generated
	 */
	void setEnvelope(Envelope value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference.
	 * @see #setFault(Fault)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_Fault()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fault' namespace='##targetNamespace'"
	 * @generated
	 */
	Fault getFault();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getFault <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault</em>' containment reference.
	 * @see #getFault()
	 * @generated
	 */
	void setFault(Fault value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' attribute.
	 * @see #setActor(String)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_Actor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActor();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getActor <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' attribute.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(String value);

	/**
	 * Returns the value of the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding Style</em>' attribute.
	 * @see #setEncodingStyle(List)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_EncodingStyle()
	 * @model dataType="org.xmlsoap.schemas.envelope.EncodingStyle" many="false"
	 *        extendedMetaData="kind='attribute' name='encodingStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getEncodingStyle();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getEncodingStyle <em>Encoding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding Style</em>' attribute.
	 * @see #getEncodingStyle()
	 * @generated
	 */
	void setEncodingStyle(List<String> value);

	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #setMustUnderstand(boolean)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getDocumentRoot_MustUnderstand()
	 * @model unsettable="true" dataType="org.xmlsoap.schemas.envelope.MustUnderstandType"
	 *        extendedMetaData="kind='attribute' name='mustUnderstand' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMustUnderstand();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#isMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #isMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(boolean value);

	/**
	 * Unsets the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#isMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustUnderstand()
	 * @see #isMustUnderstand()
	 * @see #setMustUnderstand(boolean)
	 * @generated
	 */
	void unsetMustUnderstand();

	/**
	 * Returns whether the value of the '{@link org.xmlsoap.schemas.envelope.DocumentRoot#isMustUnderstand <em>Must Understand</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Understand</em>' attribute is set.
	 * @see #unsetMustUnderstand()
	 * @see #isMustUnderstand()
	 * @see #setMustUnderstand(boolean)
	 * @generated
	 */
	boolean isSetMustUnderstand();

} // DocumentRoot
