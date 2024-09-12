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
 * A representation of the model object '<em><b>Abstract Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractContainerType#getAbstractContainerSimpleExtensionGroupGroup <em>Abstract Container Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractContainerType#getAbstractContainerSimpleExtensionGroup <em>Abstract Container Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractContainerType#getAbstractContainerObjectExtensionGroupGroup <em>Abstract Container Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractContainerType#getAbstractContainerObjectExtensionGroup <em>Abstract Container Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractContainerType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractContainerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractContainerType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Abstract Container Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractContainerType_AbstractContainerSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractContainerSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractContainerSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Container Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractContainerType_AbstractContainerSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractContainerSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractContainerSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractContainerSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Container Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractContainerType_AbstractContainerObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractContainerObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractContainerObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Container Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Container Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractContainerType_AbstractContainerObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractContainerObjectExtensionGroup' namespace='##targetNamespace' group='AbstractContainerObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractContainerObjectExtensionGroup();

} // AbstractContainerType
