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
 * A representation of the model object '<em><b>Style Sheet URL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.StyleSheetURLType#getFormat <em>Format</em>}</li>
 *   <li>{@link net.opengis.wms.StyleSheetURLType#getOnlineResource <em>Online Resource</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getStyleSheetURLType()
 * @model extendedMetaData="name='StyleSheetURL_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StyleSheetURLType extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A container for listing an available format's MIME type.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see net.opengis.wms.WMSPackage#getStyleSheetURLType_Format()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleSheetURLType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An OnlineResource is typically an HTTP URL.  The URL is placed in
	 *         the xlink:href attribute, and the value "simple" is placed in the
	 *         xlink:type attribute.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Online Resource</em>' containment reference.
	 * @see #setOnlineResource(OnlineResourceType)
	 * @see net.opengis.wms.WMSPackage#getStyleSheetURLType_OnlineResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OnlineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	OnlineResourceType getOnlineResource();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleSheetURLType#getOnlineResource <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Resource</em>' containment reference.
	 * @see #getOnlineResource()
	 * @generated
	 */
	void setOnlineResource(OnlineResourceType value);

} // StyleSheetURLType
