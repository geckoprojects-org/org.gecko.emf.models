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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.DecimalPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Geographic Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Geographic area of the entire dataset referenced to WGS 84
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicBoundingBoxType()
 * @model extendedMetaData="name='EX_GeographicBoundingBox_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXGeographicBoundingBoxType extends AbstractEXGeographicExtentType {
	/**
	 * Returns the value of the '<em><b>West Bound Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West Bound Longitude</em>' containment reference.
	 * @see #setWestBoundLongitude(DecimalPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicBoundingBoxType_WestBoundLongitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='westBoundLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalPropertyType getWestBoundLongitude();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West Bound Longitude</em>' containment reference.
	 * @see #getWestBoundLongitude()
	 * @generated
	 */
	void setWestBoundLongitude(DecimalPropertyType value);

	/**
	 * Returns the value of the '<em><b>East Bound Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East Bound Longitude</em>' containment reference.
	 * @see #setEastBoundLongitude(DecimalPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicBoundingBoxType_EastBoundLongitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eastBoundLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalPropertyType getEastBoundLongitude();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East Bound Longitude</em>' containment reference.
	 * @see #getEastBoundLongitude()
	 * @generated
	 */
	void setEastBoundLongitude(DecimalPropertyType value);

	/**
	 * Returns the value of the '<em><b>South Bound Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South Bound Latitude</em>' containment reference.
	 * @see #setSouthBoundLatitude(DecimalPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicBoundingBoxType_SouthBoundLatitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='southBoundLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalPropertyType getSouthBoundLatitude();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South Bound Latitude</em>' containment reference.
	 * @see #getSouthBoundLatitude()
	 * @generated
	 */
	void setSouthBoundLatitude(DecimalPropertyType value);

	/**
	 * Returns the value of the '<em><b>North Bound Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North Bound Latitude</em>' containment reference.
	 * @see #setNorthBoundLatitude(DecimalPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXGeographicBoundingBoxType_NorthBoundLatitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='northBoundLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalPropertyType getNorthBoundLatitude();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North Bound Latitude</em>' containment reference.
	 * @see #getNorthBoundLatitude()
	 * @generated
	 */
	void setNorthBoundLatitude(DecimalPropertyType value);

} // EXGeographicBoundingBoxType
