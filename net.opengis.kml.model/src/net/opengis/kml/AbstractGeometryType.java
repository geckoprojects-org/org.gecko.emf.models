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
 * A representation of the model object '<em><b>Abstract Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometrySimpleExtensionGroupGroup <em>Abstract Geometry Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometrySimpleExtensionGroup <em>Abstract Geometry Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometryObjectExtensionGroupGroup <em>Abstract Geometry Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometryObjectExtensionGroup <em>Abstract Geometry Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractGeometryType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGeometryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractGeometryType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractGeometryType_AbstractGeometrySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractGeometrySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractGeometrySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractGeometryType_AbstractGeometrySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometrySimpleExtensionGroup' namespace='##targetNamespace' group='AbstractGeometrySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractGeometrySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractGeometryType_AbstractGeometryObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractGeometryObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractGeometryObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Geometry Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractGeometryType_AbstractGeometryObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractGeometryObjectExtensionGroup' namespace='##targetNamespace' group='AbstractGeometryObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractGeometryObjectExtensionGroup();

} // AbstractGeometryType
