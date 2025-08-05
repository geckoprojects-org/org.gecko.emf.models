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
 * A representation of the model object '<em><b>Attribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.AttributionType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.AttributionType#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link net.opengis.wms.AttributionType#getLogoURL <em>Logo URL</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getAttributionType()
 * @model extendedMetaData="name='Attribution_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AttributionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Title is for informative display to a human.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wms.WMSPackage#getAttributionType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wms.AttributionType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see net.opengis.wms.WMSPackage#getAttributionType_OnlineResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OnlineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	OnlineResourceType getOnlineResource();

	/**
	 * Sets the value of the '{@link net.opengis.wms.AttributionType#getOnlineResource <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Resource</em>' containment reference.
	 * @see #getOnlineResource()
	 * @generated
	 */
	void setOnlineResource(OnlineResourceType value);

	/**
	 * Returns the value of the '<em><b>Logo URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo URL</em>' containment reference.
	 * @see #setLogoURL(LogoURLType)
	 * @see net.opengis.wms.WMSPackage#getAttributionType_LogoURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogoURL' namespace='##targetNamespace'"
	 * @generated
	 */
	LogoURLType getLogoURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.AttributionType#getLogoURL <em>Logo URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo URL</em>' containment reference.
	 * @see #getLogoURL()
	 * @generated
	 */
	void setLogoURL(LogoURLType value);

} // AttributionType
