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
 * A representation of the model object '<em><b>Geodetic Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A geodetic datum defines the precise location and orientation in 3-dimensional space of a defined ellipsoid (or sphere) that approximates the shape of the earth, or of a Cartesian coordinate system centered in this ellipsoid (or sphere). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GeodeticDatumType#getUsesPrimeMeridian <em>Uses Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.GeodeticDatumType#getUsesEllipsoid <em>Uses Ellipsoid</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGeodeticDatumType()
 * @model extendedMetaData="name='GeodeticDatumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeodeticDatumType extends AbstractDatumType {
	/**
	 * Returns the value of the '<em><b>Uses Prime Meridian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the prime meridian used by this geodetic datum. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Prime Meridian</em>' containment reference.
	 * @see #setUsesPrimeMeridian(PrimeMeridianRefType)
	 * @see net.opengis.gml.GMLPackage#getGeodeticDatumType_UsesPrimeMeridian()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesPrimeMeridian' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimeMeridianRefType getUsesPrimeMeridian();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GeodeticDatumType#getUsesPrimeMeridian <em>Uses Prime Meridian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Prime Meridian</em>' containment reference.
	 * @see #getUsesPrimeMeridian()
	 * @generated
	 */
	void setUsesPrimeMeridian(PrimeMeridianRefType value);

	/**
	 * Returns the value of the '<em><b>Uses Ellipsoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the ellipsoid used by this geodetic datum. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Ellipsoid</em>' containment reference.
	 * @see #setUsesEllipsoid(EllipsoidRefType)
	 * @see net.opengis.gml.GMLPackage#getGeodeticDatumType_UsesEllipsoid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesEllipsoid' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidRefType getUsesEllipsoid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GeodeticDatumType#getUsesEllipsoid <em>Uses Ellipsoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Ellipsoid</em>' containment reference.
	 * @see #getUsesEllipsoid()
	 * @generated
	 */
	void setUsesEllipsoid(EllipsoidRefType value);

} // GeodeticDatumType
