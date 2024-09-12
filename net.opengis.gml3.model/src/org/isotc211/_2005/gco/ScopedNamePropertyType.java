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
package org.isotc211._2005.gco;

import net.opengis.gml.gml.CodeType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Name Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.ScopedNamePropertyType#getScopedName <em>Scoped Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.ScopedNamePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gco.GCOPackage#getScopedNamePropertyType()
 * @model extendedMetaData="name='ScopedName_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScopedNamePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped Name</em>' containment reference.
	 * @see #setScopedName(CodeType)
	 * @see org.isotc211._2005.gco.GCOPackage#getScopedNamePropertyType_ScopedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScopedName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getScopedName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.ScopedNamePropertyType#getScopedName <em>Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped Name</em>' containment reference.
	 * @see #getScopedName()
	 * @generated
	 */
	void setScopedName(CodeType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gco.GCOPackage#getScopedNamePropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.ScopedNamePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // ScopedNamePropertyType
