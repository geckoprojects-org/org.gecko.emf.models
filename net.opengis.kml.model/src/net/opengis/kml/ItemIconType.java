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
package net.opengis.kml;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Icon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ItemIconType#getState <em>State</em>}</li>
 *   <li>{@link net.opengis.kml.ItemIconType#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.kml.ItemIconType#getItemIconSimpleExtensionGroupGroup <em>Item Icon Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ItemIconType#getItemIconSimpleExtensionGroup <em>Item Icon Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ItemIconType#getItemIconObjectExtensionGroupGroup <em>Item Icon Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ItemIconType#getItemIconObjectExtensionGroup <em>Item Icon Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getItemIconType()
 * @model extendedMetaData="name='ItemIconType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ItemIconType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(List)
	 * @see net.opengis.kml.KMLPackage#getItemIconType_State()
	 * @model dataType="net.opengis.kml.ItemIconStateType" many="false"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	List<ItemIconStateEnumType> getState();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ItemIconType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(List<ItemIconStateEnumType> value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not anyURI due to $[x] substitution in
	 *       PhotoOverlay
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see net.opengis.kml.KMLPackage#getItemIconType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ItemIconType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Item Icon Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getItemIconType_ItemIconSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemIconSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemIconSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Item Icon Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getItemIconType_ItemIconSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemIconSimpleExtensionGroup' namespace='##targetNamespace' group='ItemIconSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getItemIconSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Item Icon Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getItemIconType_ItemIconObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemIconObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemIconObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Item Icon Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getItemIconType_ItemIconObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemIconObjectExtensionGroup' namespace='##targetNamespace' group='ItemIconObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getItemIconObjectExtensionGroup();

} // ItemIconType
