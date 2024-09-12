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
 * A representation of the model object '<em><b>Multi Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.MultiGeometryType#getAbstractGeometryGroupGroup <em>Abstract Geometry Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.MultiGeometryType#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}</li>
 *   <li>{@link net.opengis.kml.MultiGeometryType#getMultiGeometrySimpleExtensionGroupGroup <em>Multi Geometry Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.MultiGeometryType#getMultiGeometrySimpleExtensionGroup <em>Multi Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.MultiGeometryType#getMultiGeometryObjectExtensionGroupGroup <em>Multi Geometry Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.MultiGeometryType#getMultiGeometryObjectExtensionGroup <em>Multi Geometry Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getMultiGeometryType()
 * @model extendedMetaData="name='MultiGeometryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiGeometryType extends AbstractGeometryType {
	/**
	 * Returns the value of the '<em><b>Abstract Geometry Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getMultiGeometryType_AbstractGeometryGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractGeometryGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractGeometryGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getMultiGeometryType_AbstractGeometryGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometryGroup' namespace='##targetNamespace' group='AbstractGeometryGroup:group'"
	 * @generated
	 */
	EList<AbstractGeometryType> getAbstractGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Multi Geometry Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getMultiGeometryType_MultiGeometrySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MultiGeometrySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMultiGeometrySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Multi Geometry Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getMultiGeometryType_MultiGeometrySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometrySimpleExtensionGroup' namespace='##targetNamespace' group='MultiGeometrySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getMultiGeometrySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Multi Geometry Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getMultiGeometryType_MultiGeometryObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MultiGeometryObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMultiGeometryObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Multi Geometry Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getMultiGeometryType_MultiGeometryObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometryObjectExtensionGroup' namespace='##targetNamespace' group='MultiGeometryObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getMultiGeometryObjectExtensionGroup();

} // MultiGeometryType
