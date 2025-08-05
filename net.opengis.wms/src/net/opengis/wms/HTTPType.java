/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.HTTPType#getGet <em>Get</em>}</li>
 *   <li>{@link net.opengis.wms.HTTPType#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getHTTPType()
 * @model extendedMetaData="name='HTTP_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HTTPType extends EObject {
	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The URL prefix for the HTTP "Get" request method.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(GetType)
	 * @see net.opengis.wms.WMSPackage#getHTTPType_Get()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Get' namespace='##targetNamespace'"
	 * @generated
	 */
	GetType getGet();

	/**
	 * Sets the value of the '{@link net.opengis.wms.HTTPType#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(GetType value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The URL prefix for the HTTP "Post" request method.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(PostType)
	 * @see net.opengis.wms.WMSPackage#getHTTPType_Post()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Post' namespace='##targetNamespace'"
	 * @generated
	 */
	PostType getPost();

	/**
	 * Sets the value of the '{@link net.opengis.wms.HTTPType#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(PostType value);

} // HTTPType
