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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Resource By Id Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Request to a service to perform the GetResourceByID operation. This operation allows a client to retrieve one or more identified resources, including datasets and resources that describe datasets or parameters. In this XML encoding, no "request" parameter is included, since the element name specifies the specific operation. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.GetResourceByIdType#getResourceID <em>Resource ID</em>}</li>
 *   <li>{@link net.opengis.ows.GetResourceByIdType#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link net.opengis.ows.GetResourceByIdType#getService <em>Service</em>}</li>
 *   <li>{@link net.opengis.ows.GetResourceByIdType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getGetResourceByIdType()
 * @model extendedMetaData="name='GetResourceByIdType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetResourceByIdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of zero or more resource identifiers. These identifiers can be listed in the Contents section of the service metadata (Capabilities) document. For more information on this parameter, see Subclause 9.4.2.1 of the OWS Common specification. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource ID</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getGetResourceByIdType_ResourceID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='ResourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getResourceID();

	/**
	 * Returns the value of the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional reference to the data format to be used for response to this operation request. This element shall be included when multiple output formats are available for the selected resource(s), and the client desires a format other than the specified default, if any. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Format</em>' attribute.
	 * @see #setOutputFormat(String)
	 * @see net.opengis.ows.OWSPackage#getGetResourceByIdType_OutputFormat()
	 * @model dataType="net.opengis.ows.MimeType"
	 *        extendedMetaData="kind='element' name='OutputFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputFormat();

	/**
	 * Sets the value of the '{@link net.opengis.ows.GetResourceByIdType#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Format</em>' attribute.
	 * @see #getOutputFormat()
	 * @generated
	 */
	void setOutputFormat(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(String)
	 * @see net.opengis.ows.OWSPackage#getGetResourceByIdType_Service()
	 * @model dataType="net.opengis.ows.ServiceType" required="true"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link net.opengis.ows.GetResourceByIdType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.opengis.ows.OWSPackage#getGetResourceByIdType_Version()
	 * @model dataType="net.opengis.ows.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.opengis.ows.GetResourceByIdType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // GetResourceByIdType
