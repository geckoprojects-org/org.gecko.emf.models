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
 * A representation of the model object '<em><b>Style Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.StyleMapType#getPair <em>Pair</em>}</li>
 *   <li>{@link net.opengis.kml.StyleMapType#getStyleMapSimpleExtensionGroupGroup <em>Style Map Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.StyleMapType#getStyleMapSimpleExtensionGroup <em>Style Map Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.StyleMapType#getStyleMapObjectExtensionGroupGroup <em>Style Map Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.StyleMapType#getStyleMapObjectExtensionGroup <em>Style Map Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getStyleMapType()
 * @model extendedMetaData="name='StyleMapType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StyleMapType extends AbstractStyleSelectorType {
	/**
	 * Returns the value of the '<em><b>Pair</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.PairType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getStyleMapType_Pair()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pair' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PairType> getPair();

	/**
	 * Returns the value of the '<em><b>Style Map Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getStyleMapType_StyleMapSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StyleMapSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStyleMapSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Style Map Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getStyleMapType_StyleMapSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleMapSimpleExtensionGroup' namespace='##targetNamespace' group='StyleMapSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getStyleMapSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Style Map Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getStyleMapType_StyleMapObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StyleMapObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStyleMapObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Style Map Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getStyleMapType_StyleMapObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleMapObjectExtensionGroup' namespace='##targetNamespace' group='StyleMapObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getStyleMapObjectExtensionGroup();

} // StyleMapType
