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
 * A representation of the model object '<em><b>CI Presentation Form Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CIPresentationFormCodePropertyType#getCIPresentationFormCode <em>CI Presentation Form Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CIPresentationFormCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCIPresentationFormCodePropertyType()
 * @model extendedMetaData="name='CI_PresentationFormCode_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CIPresentationFormCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>CI Presentation Form Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Presentation Form Code</em>' containment reference.
	 * @see #setCIPresentationFormCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIPresentationFormCodePropertyType_CIPresentationFormCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CI_PresentationFormCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getCIPresentationFormCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIPresentationFormCodePropertyType#getCIPresentationFormCode <em>CI Presentation Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Presentation Form Code</em>' containment reference.
	 * @see #getCIPresentationFormCode()
	 * @generated
	 */
	void setCIPresentationFormCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gmd.GMDPackage#getCIPresentationFormCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.CIPresentationFormCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // CIPresentationFormCodePropertyType
