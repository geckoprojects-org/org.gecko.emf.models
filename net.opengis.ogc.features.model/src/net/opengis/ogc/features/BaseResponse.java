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
package net.opengis.ogc.features;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.BaseResponse#getService <em>Service</em>}</li>
 *   <li>{@link net.opengis.ogc.features.BaseResponse#getUpdateSequence <em>Update Sequence</em>}</li>
 *   <li>{@link net.opengis.ogc.features.BaseResponse#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBaseResponse()
 * @model abstract="true"
 *        extendedMetaData="name='BaseResponseType' kind='empty'"
 * @generated
 */
@ProviderType
public interface BaseResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBaseResponse_Service()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BaseResponse#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Sequence</em>' attribute.
	 * @see #setUpdateSequence(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBaseResponse_UpdateSequence()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='updateSequence'"
	 * @generated
	 */
	String getUpdateSequence();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BaseResponse#getUpdateSequence <em>Update Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Sequence</em>' attribute.
	 * @see #getUpdateSequence()
	 * @generated
	 */
	void setUpdateSequence(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBaseResponse_Version()
	 * @model dataType="net.opengis.ogc.features.VersionString"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BaseResponse#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // BaseResponse
