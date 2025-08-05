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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GeoJSON point object as defined in
 * <a href="https://tools.ietf.org/html/rfc7946#section-3.1">the GeoJSON
 * specification</a>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geojson.Point#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see org.geojson.GeoJsonPackage#getPoint()
 * @model features="data" 
 *        dataDataType="org.geojson.DoubleArray1D" dataVolatile="true" dataSuppressedGetVisibility="true" dataSuppressedSetVisibility="true" dataSuppressedIsSetVisibility="true" dataSuppressedUnsetVisibility="true"
 *        dataExtendedMetaData="name='coordinates'"
 *        dataAnnotation="http://www.eclipse.org/emf/2002/GenModel get='return org.geojson.util.GeoJsonHelper.convertCoordinates(getCoordinates());'"
 * @generated
 */
@ProviderType
public interface Point extends Geometry {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(Coordinates)
	 * @see org.geojson.GeoJsonPackage#getPoint_Coordinates()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	Coordinates getCoordinates();

	/**
	 * Sets the value of the '{@link org.geojson.Point#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(Coordinates value);

} // Point
