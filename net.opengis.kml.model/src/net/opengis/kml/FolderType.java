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
 * A representation of the model object '<em><b>Folder Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.FolderType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.FolderType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.FolderType#getFolderSimpleExtensionGroupGroup <em>Folder Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.FolderType#getFolderSimpleExtensionGroup <em>Folder Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.FolderType#getFolderObjectExtensionGroupGroup <em>Folder Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.FolderType#getFolderObjectExtensionGroup <em>Folder Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getFolderType()
 * @model extendedMetaData="name='FolderType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FolderType extends AbstractContainerType {
	/**
	 * Returns the value of the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getFolderType_AbstractFeatureGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractFeatureGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getFolderType_AbstractFeatureGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureGroup' namespace='##targetNamespace' group='AbstractFeatureGroup:group'"
	 * @generated
	 */
	EList<AbstractFeatureType> getAbstractFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Folder Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getFolderType_FolderSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FolderSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFolderSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Folder Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getFolderType_FolderSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FolderSimpleExtensionGroup' namespace='##targetNamespace' group='FolderSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getFolderSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Folder Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getFolderType_FolderObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FolderObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFolderObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Folder Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getFolderType_FolderObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FolderObjectExtensionGroup' namespace='##targetNamespace' group='FolderObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getFolderObjectExtensionGroup();

} // FolderType
