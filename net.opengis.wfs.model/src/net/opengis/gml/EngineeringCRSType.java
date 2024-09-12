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
 * A representation of the model object '<em><b>Engineering CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A contextually local coordinate reference system; which can be divided into two broad categories:
 * - earth-fixed systems applied to engineering activities on or near the surface of the earth;
 * - CRSs on moving platforms such as road vehicles, vessels, aircraft, or spacecraft.
 * For further information, see OGC Abstract Specification Topic 2. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.EngineeringCRSType#getUsesCS <em>Uses CS</em>}</li>
 *   <li>{@link net.opengis.gml.EngineeringCRSType#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getEngineeringCRSType()
 * @model extendedMetaData="name='EngineeringCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EngineeringCRSType extends AbstractReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Uses CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the coordinate system used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses CS</em>' containment reference.
	 * @see #setUsesCS(CoordinateSystemRefType)
	 * @see net.opengis.gml.GMLPackage#getEngineeringCRSType_UsesCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateSystemRefType getUsesCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.EngineeringCRSType#getUsesCS <em>Uses CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses CS</em>' containment reference.
	 * @see #getUsesCS()
	 * @generated
	 */
	void setUsesCS(CoordinateSystemRefType value);

	/**
	 * Returns the value of the '<em><b>Uses Engineering Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the engineering datum used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Engineering Datum</em>' containment reference.
	 * @see #setUsesEngineeringDatum(EngineeringDatumRefType)
	 * @see net.opengis.gml.GMLPackage#getEngineeringCRSType_UsesEngineeringDatum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesEngineeringDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineeringDatumRefType getUsesEngineeringDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.EngineeringCRSType#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Engineering Datum</em>' containment reference.
	 * @see #getUsesEngineeringDatum()
	 * @generated
	 */
	void setUsesEngineeringDatum(EngineeringDatumRefType value);

} // EngineeringCRSType
