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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Point is defined by a single coordinate tuple.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.PointType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.PointType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.PointType#getCoord <em>Coord</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getPointType()
 * @model extendedMetaData="name='PointType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointType extends AbstractGeometricPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(DirectPositionType)
	 * @see net.opengis.gml.GMLPackage#getPointType_Pos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getPos();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PointType#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.1.0 for coordinates with ordinate values that are numbers. Use "pos" 
	 * 								instead. The "coordinates" element shall only be used for coordinates with ordinates that require a string 
	 * 								representation, e.g. DMS representations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml.GMLPackage#getPointType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PointType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Coord</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.0. Use "pos" instead. The "coord" element is included for 
	 * 								backwards compatibility with GML 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coord</em>' containment reference.
	 * @see #setCoord(CoordType)
	 * @see net.opengis.gml.GMLPackage#getPointType_Coord()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coord' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordType getCoord();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PointType#getCoord <em>Coord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coord</em>' containment reference.
	 * @see #getCoord()
	 * @generated
	 */
	void setCoord(CoordType value);

} // PointType
