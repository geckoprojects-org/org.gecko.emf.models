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
 * A representation of the model object '<em><b>MD Geometric Object Type Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType#getMDGeometricObjectTypeCode <em>MD Geometric Object Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDGeometricObjectTypeCodePropertyType()
 * @model extendedMetaData="name='MD_GeometricObjectTypeCode_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDGeometricObjectTypeCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Geometric Object Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Geometric Object Type Code</em>' containment reference.
	 * @see #setMDGeometricObjectTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGeometricObjectTypeCodePropertyType_MDGeometricObjectTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_GeometricObjectTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDGeometricObjectTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType#getMDGeometricObjectTypeCode <em>MD Geometric Object Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Geometric Object Type Code</em>' containment reference.
	 * @see #getMDGeometricObjectTypeCode()
	 * @generated
	 */
	void setMDGeometricObjectTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGeometricObjectTypeCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDGeometricObjectTypeCodePropertyType
