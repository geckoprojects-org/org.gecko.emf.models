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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A geometry collection must include one or more geometries, referenced through geometryMember elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiGeometryType#getGeometryMember <em>Geometry Member</em>}</li>
 *   <li>{@link net.opengis.gml.MultiGeometryType#getGeometryMembers <em>Geometry Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiGeometryType()
 * @model extendedMetaData="name='MultiGeometryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiGeometryType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Geometry Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.GeometryPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a geometry element via the XLink-attributes or contains the geometry element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getMultiGeometryType_GeometryMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometryMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeometryPropertyType> getGeometryMember();

	/**
	 * Returns the value of the '<em><b>Geometry Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of geometry elements. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Members</em>' containment reference.
	 * @see #setGeometryMembers(GeometryArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getMultiGeometryType_GeometryMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometryMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryArrayPropertyType getGeometryMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiGeometryType#getGeometryMembers <em>Geometry Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Members</em>' containment reference.
	 * @see #getGeometryMembers()
	 * @generated
	 */
	void setGeometryMembers(GeometryArrayPropertyType value);

} // MultiGeometryType
