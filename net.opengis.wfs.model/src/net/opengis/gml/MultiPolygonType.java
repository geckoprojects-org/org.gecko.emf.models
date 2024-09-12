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
 * A representation of the model object '<em><b>Multi Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MultiPolygon is defined by one or more Polygons, referenced through polygonMember elements. Deprecated with GML version 3.0. Use MultiSurfaceType instead.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiPolygonType#getPolygonMember <em>Polygon Member</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiPolygonType()
 * @model extendedMetaData="name='MultiPolygonType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiPolygonType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Polygon Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.PolygonPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML 3.0 and included only for backwards compatibility with GML 2.0. Use "surfaceMember" instead.
	 * This property element either references a polygon via the XLink-attributes or contains the polygon element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getMultiPolygonType_PolygonMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='polygonMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PolygonPropertyType> getPolygonMember();

} // MultiPolygonType
