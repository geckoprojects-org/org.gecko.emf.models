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
 * A representation of the model object '<em><b>Placemark Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.PlacemarkType#getAbstractGeometryGroupGroup <em>Abstract Geometry Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PlacemarkType#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.kml.PlacemarkType#getPlacemarkSimpleExtensionGroupGroup <em>Placemark Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PlacemarkType#getPlacemarkSimpleExtensionGroup <em>Placemark Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.PlacemarkType#getPlacemarkObjectExtensionGroupGroup <em>Placemark Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PlacemarkType#getPlacemarkObjectExtensionGroup <em>Placemark Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getPlacemarkType()
 * @model extendedMetaData="name='PlacemarkType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PlacemarkType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Abstract Geometry Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPlacemarkType_AbstractGeometryGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='AbstractGeometryGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractGeometryGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getPlacemarkType_AbstractGeometryGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometryGroup' namespace='##targetNamespace' group='AbstractGeometryGroup:group'"
	 * @generated
	 */
	AbstractGeometryType getAbstractGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Placemark Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPlacemarkType_PlacemarkSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PlacemarkSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPlacemarkSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Placemark Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPlacemarkType_PlacemarkSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlacemarkSimpleExtensionGroup' namespace='##targetNamespace' group='PlacemarkSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getPlacemarkSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Placemark Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPlacemarkType_PlacemarkObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PlacemarkObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPlacemarkObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Placemark Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getPlacemarkType_PlacemarkObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlacemarkObjectExtensionGroup' namespace='##targetNamespace' group='PlacemarkObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getPlacemarkObjectExtensionGroup();

} // PlacemarkType
