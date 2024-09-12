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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Name Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gco.GenericNamePropertyType#getAbstractGenericNameGroup <em>Abstract Generic Name Group</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.GenericNamePropertyType#getAbstractGenericName <em>Abstract Generic Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gco.GenericNamePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gco.GCOPackage#getGenericNamePropertyType()
 * @model extendedMetaData="name='GenericName_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GenericNamePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Generic Name Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Generic Name Group</em>' attribute list.
	 * @see org.isotc211._2005.gco.GCOPackage#getGenericNamePropertyType_AbstractGenericNameGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractGenericName:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractGenericNameGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Generic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Generic Name</em>' containment reference.
	 * @see org.isotc211._2005.gco.GCOPackage#getGenericNamePropertyType_AbstractGenericName()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGenericName' namespace='##targetNamespace' group='AbstractGenericName:group'"
	 * @generated
	 */
	CodeType getAbstractGenericName();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gco.GCOPackage#getGenericNamePropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gco.GenericNamePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // GenericNamePropertyType
