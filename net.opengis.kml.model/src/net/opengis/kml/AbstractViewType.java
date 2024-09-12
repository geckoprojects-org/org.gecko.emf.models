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
 * A representation of the model object '<em><b>Abstract View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractViewType#getAbstractViewSimpleExtensionGroupGroup <em>Abstract View Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractViewType#getAbstractViewSimpleExtensionGroup <em>Abstract View Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractViewType#getAbstractViewObjectExtensionGroupGroup <em>Abstract View Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractViewType#getAbstractViewObjectExtensionGroup <em>Abstract View Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractViewType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractViewType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractViewType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Abstract View Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractViewType_AbstractViewSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractViewSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractViewSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractViewType_AbstractViewSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractViewSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractViewSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractViewType_AbstractViewObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractViewObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractViewObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract View Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract View Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractViewType_AbstractViewObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractViewObjectExtensionGroup' namespace='##targetNamespace' group='AbstractViewObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractViewObjectExtensionGroup();

} // AbstractViewType
