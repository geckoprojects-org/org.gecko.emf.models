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
package org.isotc211._2005.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211._2005.gco.CodeListValueType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CountryPropertyType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CountryPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCountryPropertyType()
 * @model extendedMetaData="name='Country_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CountryPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCountryPropertyType_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getCountry();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CountryPropertyType#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCountryPropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CountryPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // CountryPropertyType
