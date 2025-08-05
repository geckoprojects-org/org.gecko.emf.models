/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.geojson;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GeoJSON geometry collection object as defined in
 * <a href="https://tools.ietf.org/html/rfc7946#section-3.1">the GeoJSON
 * specification</a>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geojson.GeometryCollection#getGeometries <em>Geometries</em>}</li>
 * </ul>
 *
 * @see org.geojson.GeoJsonPackage#getGeometryCollection()
 * @model
 * @generated
 */
@ProviderType
public interface GeometryCollection extends Geometry {
	/**
	 * Returns the value of the '<em><b>Geometries</b></em>' containment reference list.
	 * The list contents are of type {@link org.geojson.Geometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometries</em>' containment reference list.
	 * @see org.geojson.GeoJsonPackage#getGeometryCollection_Geometries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Geometry> getGeometries();

} // GeometryCollection
