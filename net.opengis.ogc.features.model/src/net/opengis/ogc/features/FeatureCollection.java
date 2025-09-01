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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._2005.atom.LinkType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getItemType <em>Item Type</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ogc.features.FeatureCollection#getStorageCrs <em>Storage Crs</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection()
 * @model extendedMetaData="name='CollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.FeatureCollection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_ItemType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ItemType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getItemType();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.FeatureCollection#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(LanguageString)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageString getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.FeatureCollection#getTitle <em>Title</em>}' containment reference.
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
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageString getDescription();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.FeatureCollection#getDescription <em>Description</em>}' containment reference.
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
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='http://www.w3.org/2005/Atom'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(Extent)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_Extent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extent' namespace='##targetNamespace'"
	 * @generated
	 */
	Extent getExtent();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.FeatureCollection#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(Extent value);

	/**
	 * Returns the value of the '<em><b>Crs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs</em>' attribute list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_Crs()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='Crs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCrs();

	/**
	 * Returns the value of the '<em><b>Storage Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Crs</em>' attribute.
	 * @see #setStorageCrs(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getFeatureCollection_StorageCrs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='StorageCrs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStorageCrs();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.FeatureCollection#getStorageCrs <em>Storage Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Crs</em>' attribute.
	 * @see #getStorageCrs()
	 * @generated
	 */
	void setStorageCrs(String value);

} // FeatureCollection
