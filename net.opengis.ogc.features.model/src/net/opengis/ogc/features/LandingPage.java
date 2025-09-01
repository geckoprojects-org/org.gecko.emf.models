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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.LandingPage#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ogc.features.LandingPage#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogc.features.LandingPage#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getLandingPage()
 * @model extendedMetaData="name='LandingPageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LandingPage extends BaseResponse {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(LanguageString)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getLandingPage_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageString getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.LandingPage#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(LanguageString value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(LanguageString)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getLandingPage_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageString getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.LandingPage#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(LanguageString value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005.atom.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getLandingPage_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='http://www.w3.org/2005/Atom'"
	 * @generated
	 */
	EList<LinkType> getLink();

} // LandingPage
