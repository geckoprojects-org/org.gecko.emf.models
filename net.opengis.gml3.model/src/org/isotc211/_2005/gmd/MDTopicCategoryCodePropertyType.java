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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Topic Category Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDTopicCategoryCodePropertyType()
 * @model extendedMetaData="name='MD_TopicCategoryCode_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDTopicCategoryCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Topic Category Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211._2005.gmd.MDTopicCategoryCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Topic Category Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDTopicCategoryCodeType
	 * @see #isSetMDTopicCategoryCode()
	 * @see #unsetMDTopicCategoryCode()
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDTopicCategoryCodePropertyType_MDTopicCategoryCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MD_TopicCategoryCode' namespace='##targetNamespace'"
	 * @generated
	 */
	MDTopicCategoryCodeType getMDTopicCategoryCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Topic Category Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDTopicCategoryCodeType
	 * @see #isSetMDTopicCategoryCode()
	 * @see #unsetMDTopicCategoryCode()
	 * @see #getMDTopicCategoryCode()
	 * @generated
	 */
	void setMDTopicCategoryCode(MDTopicCategoryCodeType value);

	/**
	 * Unsets the value of the '{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMDTopicCategoryCode()
	 * @see #getMDTopicCategoryCode()
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @generated
	 */
	void unsetMDTopicCategoryCode();

	/**
	 * Returns whether the value of the '{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MD Topic Category Code</em>' attribute is set.
	 * @see #unsetMDTopicCategoryCode()
	 * @see #getMDTopicCategoryCode()
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @generated
	 */
	boolean isSetMDTopicCategoryCode();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDTopicCategoryCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml.gml.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDTopicCategoryCodePropertyType
