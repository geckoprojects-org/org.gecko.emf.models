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
 * A representation of the model object '<em><b>Feature Collections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.FeatureCollections#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollections#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollections()
 * @model extendedMetaData="name='CollectionsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureCollections extends BaseResponse {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2005.atom.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollections_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='http://www.w3.org/2005/Atom'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.features.FeatureCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollections_Collection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Collection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeatureCollection> getCollection();

} // FeatureCollections
