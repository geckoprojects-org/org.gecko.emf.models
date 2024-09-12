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
package net.opengis.ows;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

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
 *   <li>{@link net.opengis.ows.HTTPType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ows.HTTPType#getGet <em>Get</em>}</li>
 *   <li>{@link net.opengis.ows.HTTPType#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getHTTPType()
 * @model extendedMetaData="name='HTTP_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HTTPType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getHTTPType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.RequestMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connect point URL prefix and any constraints for the HTTP "Get" request method for this operation request. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get</em>' containment reference list.
	 * @see net.opengis.ows.OWSPackage#getHTTPType_Get()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Get' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RequestMethodType> getGet();

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ows.RequestMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connect point URL and any constraints for the HTTP "Post" request method for this operation request. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' containment reference list.
	 * @see net.opengis.ows.OWSPackage#getHTTPType_Post()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Post' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RequestMethodType> getPost();

} // HTTPType
