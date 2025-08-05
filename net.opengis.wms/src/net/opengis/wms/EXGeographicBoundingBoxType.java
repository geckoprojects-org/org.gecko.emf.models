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
package net.opengis.wms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Geographic Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}</li>
 *   <li>{@link net.opengis.wms.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}</li>
 *   <li>{@link net.opengis.wms.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}</li>
 *   <li>{@link net.opengis.wms.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getEXGeographicBoundingBoxType()
 * @model extendedMetaData="name='EX_GeographicBoundingBox_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXGeographicBoundingBoxType extends EObject {
	/**
	 * Returns the value of the '<em><b>West Bound Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West Bound Longitude</em>' attribute.
	 * @see #isSetWestBoundLongitude()
	 * @see #unsetWestBoundLongitude()
	 * @see #setWestBoundLongitude(double)
	 * @see net.opengis.wms.WMSPackage#getEXGeographicBoundingBoxType_WestBoundLongitude()
	 * @model unsettable="true" dataType="net.opengis.wms.LongitudeType" required="true"
	 *        extendedMetaData="kind='element' name='westBoundLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWestBoundLongitude();

	/**
	 * Sets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West Bound Longitude</em>' attribute.
	 * @see #isSetWestBoundLongitude()
	 * @see #unsetWestBoundLongitude()
	 * @see #getWestBoundLongitude()
	 * @generated
	 */
	void setWestBoundLongitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWestBoundLongitude()
	 * @see #getWestBoundLongitude()
	 * @see #setWestBoundLongitude(double)
	 * @generated
	 */
	void unsetWestBoundLongitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getWestBoundLongitude <em>West Bound Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>West Bound Longitude</em>' attribute is set.
	 * @see #unsetWestBoundLongitude()
	 * @see #getWestBoundLongitude()
	 * @see #setWestBoundLongitude(double)
	 * @generated
	 */
	boolean isSetWestBoundLongitude();

	/**
	 * Returns the value of the '<em><b>East Bound Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East Bound Longitude</em>' attribute.
	 * @see #isSetEastBoundLongitude()
	 * @see #unsetEastBoundLongitude()
	 * @see #setEastBoundLongitude(double)
	 * @see net.opengis.wms.WMSPackage#getEXGeographicBoundingBoxType_EastBoundLongitude()
	 * @model unsettable="true" dataType="net.opengis.wms.LongitudeType" required="true"
	 *        extendedMetaData="kind='element' name='eastBoundLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEastBoundLongitude();

	/**
	 * Sets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East Bound Longitude</em>' attribute.
	 * @see #isSetEastBoundLongitude()
	 * @see #unsetEastBoundLongitude()
	 * @see #getEastBoundLongitude()
	 * @generated
	 */
	void setEastBoundLongitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEastBoundLongitude()
	 * @see #getEastBoundLongitude()
	 * @see #setEastBoundLongitude(double)
	 * @generated
	 */
	void unsetEastBoundLongitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getEastBoundLongitude <em>East Bound Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>East Bound Longitude</em>' attribute is set.
	 * @see #unsetEastBoundLongitude()
	 * @see #getEastBoundLongitude()
	 * @see #setEastBoundLongitude(double)
	 * @generated
	 */
	boolean isSetEastBoundLongitude();

	/**
	 * Returns the value of the '<em><b>South Bound Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South Bound Latitude</em>' attribute.
	 * @see #isSetSouthBoundLatitude()
	 * @see #unsetSouthBoundLatitude()
	 * @see #setSouthBoundLatitude(double)
	 * @see net.opengis.wms.WMSPackage#getEXGeographicBoundingBoxType_SouthBoundLatitude()
	 * @model unsettable="true" dataType="net.opengis.wms.LatitudeType" required="true"
	 *        extendedMetaData="kind='element' name='southBoundLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSouthBoundLatitude();

	/**
	 * Sets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South Bound Latitude</em>' attribute.
	 * @see #isSetSouthBoundLatitude()
	 * @see #unsetSouthBoundLatitude()
	 * @see #getSouthBoundLatitude()
	 * @generated
	 */
	void setSouthBoundLatitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSouthBoundLatitude()
	 * @see #getSouthBoundLatitude()
	 * @see #setSouthBoundLatitude(double)
	 * @generated
	 */
	void unsetSouthBoundLatitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getSouthBoundLatitude <em>South Bound Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>South Bound Latitude</em>' attribute is set.
	 * @see #unsetSouthBoundLatitude()
	 * @see #getSouthBoundLatitude()
	 * @see #setSouthBoundLatitude(double)
	 * @generated
	 */
	boolean isSetSouthBoundLatitude();

	/**
	 * Returns the value of the '<em><b>North Bound Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North Bound Latitude</em>' attribute.
	 * @see #isSetNorthBoundLatitude()
	 * @see #unsetNorthBoundLatitude()
	 * @see #setNorthBoundLatitude(double)
	 * @see net.opengis.wms.WMSPackage#getEXGeographicBoundingBoxType_NorthBoundLatitude()
	 * @model unsettable="true" dataType="net.opengis.wms.LatitudeType" required="true"
	 *        extendedMetaData="kind='element' name='northBoundLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNorthBoundLatitude();

	/**
	 * Sets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North Bound Latitude</em>' attribute.
	 * @see #isSetNorthBoundLatitude()
	 * @see #unsetNorthBoundLatitude()
	 * @see #getNorthBoundLatitude()
	 * @generated
	 */
	void setNorthBoundLatitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNorthBoundLatitude()
	 * @see #getNorthBoundLatitude()
	 * @see #setNorthBoundLatitude(double)
	 * @generated
	 */
	void unsetNorthBoundLatitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.EXGeographicBoundingBoxType#getNorthBoundLatitude <em>North Bound Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>North Bound Latitude</em>' attribute is set.
	 * @see #unsetNorthBoundLatitude()
	 * @see #getNorthBoundLatitude()
	 * @see #setNorthBoundLatitude(double)
	 * @generated
	 */
	boolean isSetNorthBoundLatitude();

} // EXGeographicBoundingBoxType
