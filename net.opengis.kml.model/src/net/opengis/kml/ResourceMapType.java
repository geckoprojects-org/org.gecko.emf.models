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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ResourceMapType#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.opengis.kml.ResourceMapType#getResourceMapSimpleExtensionGroupGroup <em>Resource Map Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ResourceMapType#getResourceMapSimpleExtensionGroup <em>Resource Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ResourceMapType#getResourceMapObjectExtensionGroupGroup <em>Resource Map Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ResourceMapType#getResourceMapObjectExtensionGroup <em>Resource Map Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getResourceMapType()
 * @model extendedMetaData="name='ResourceMapType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResourceMapType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AliasType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getResourceMapType_Alias()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Alias' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AliasType> getAlias();

	/**
	 * Returns the value of the '<em><b>Resource Map Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getResourceMapType_ResourceMapSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ResourceMapSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getResourceMapSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Resource Map Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getResourceMapType_ResourceMapSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceMapSimpleExtensionGroup' namespace='##targetNamespace' group='ResourceMapSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getResourceMapSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Resource Map Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getResourceMapType_ResourceMapObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ResourceMapObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getResourceMapObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Resource Map Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getResourceMapType_ResourceMapObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceMapObjectExtensionGroup' namespace='##targetNamespace' group='ResourceMapObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getResourceMapObjectExtensionGroup();

} // ResourceMapType
