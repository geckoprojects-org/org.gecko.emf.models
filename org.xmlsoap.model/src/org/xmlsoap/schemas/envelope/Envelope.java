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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Envelope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.envelope.Envelope#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.Envelope#getBody <em>Body</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.Envelope#getAny <em>Any</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.Envelope#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getEnvelope()
 * @model extendedMetaData="name='Envelope' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Envelope extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getEnvelope_Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Header' namespace='##targetNamespace'"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.Envelope#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getEnvelope_Body()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link org.xmlsoap.schemas.envelope.Envelope#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getEnvelope_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.xmlsoap.schemas.envelope.EnvelopePackage#getEnvelope_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Envelope
