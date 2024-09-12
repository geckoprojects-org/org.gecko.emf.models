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
package net.opengis.gml.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geodetic Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.GeodeticDatumType#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticDatumType#getEllipsoid <em>Ellipsoid</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getGeodeticDatumType()
 * @model extendedMetaData="name='GeodeticDatumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeodeticDatumType extends AbstractDatumType {
	/**
	 * Returns the value of the '<em><b>Prime Meridian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:primeMeridian is an association role to the prime meridian used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prime Meridian</em>' containment reference.
	 * @see #setPrimeMeridian(PrimeMeridianPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticDatumType_PrimeMeridian()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='primeMeridian' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimeMeridianPropertyType getPrimeMeridian();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GeodeticDatumType#getPrimeMeridian <em>Prime Meridian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Meridian</em>' containment reference.
	 * @see #getPrimeMeridian()
	 * @generated
	 */
	void setPrimeMeridian(PrimeMeridianPropertyType value);

	/**
	 * Returns the value of the '<em><b>Ellipsoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoid is an association role to the ellipsoid used by this geodetic datum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid</em>' containment reference.
	 * @see #setEllipsoid(EllipsoidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticDatumType_Ellipsoid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ellipsoid' namespace='##targetNamespace'"
	 * @generated
	 */
	EllipsoidPropertyType getEllipsoid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GeodeticDatumType#getEllipsoid <em>Ellipsoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid</em>' containment reference.
	 * @see #getEllipsoid()
	 * @generated
	 */
	void setEllipsoid(EllipsoidPropertyType value);

} // GeodeticDatumType
