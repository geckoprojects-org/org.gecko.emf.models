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
 * A representation of the model object '<em><b>Geographic CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordinate reference system based on an ellipsoidal approximation of the geoid; this provides an accurate representation of the geometry of geographic features for a large portion of the earth's surface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GeographicCRSType#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.GeographicCRSType#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGeographicCRSType()
 * @model extendedMetaData="name='GeographicCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeographicCRSType extends AbstractReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Uses Ellipsoidal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the ellipsoidal coordinate system used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Ellipsoidal CS</em>' containment reference.
	 * @see #setUsesEllipsoidalCS(EllipsoidalCSRefType)
	 * @see net.opengis.gml.GMLPackage#getGeographicCRSType_UsesEllipsoidalCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesEllipsoidalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidalCSRefType getUsesEllipsoidalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GeographicCRSType#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Ellipsoidal CS</em>' containment reference.
	 * @see #getUsesEllipsoidalCS()
	 * @generated
	 */
	void setUsesEllipsoidalCS(EllipsoidalCSRefType value);

	/**
	 * Returns the value of the '<em><b>Uses Geodetic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the geodetic datum used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #setUsesGeodeticDatum(GeodeticDatumRefType)
	 * @see net.opengis.gml.GMLPackage#getGeographicCRSType_UsesGeodeticDatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesGeodeticDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticDatumRefType getUsesGeodeticDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GeographicCRSType#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Geodetic Datum</em>' containment reference.
	 * @see #getUsesGeodeticDatum()
	 * @generated
	 */
	void setUsesGeodeticDatum(GeodeticDatumRefType value);

} // GeographicCRSType
