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
 * A representation of the model object '<em><b>Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordinate reference system that is defined by its coordinate conversion from another coordinate reference system but is not a projected coordinate reference system. This category includes coordinate reference systems derived from a projected coordinate reference system. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.DerivedCRSType#getDerivedCRSType <em>Derived CRS Type</em>}</li>
 *   <li>{@link net.opengis.gml.DerivedCRSType#getUsesCS <em>Uses CS</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getDerivedCRSType()
 * @model extendedMetaData="name='DerivedCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DerivedCRSType extends AbstractGeneralDerivedCRSType {
	/**
	 * Returns the value of the '<em><b>Derived CRS Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived CRS Type</em>' containment reference.
	 * @see #setDerivedCRSType(DerivedCRSTypeType)
	 * @see net.opengis.gml.GMLPackage#getDerivedCRSType_DerivedCRSType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='derivedCRSType' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivedCRSTypeType getDerivedCRSType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DerivedCRSType#getDerivedCRSType <em>Derived CRS Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived CRS Type</em>' containment reference.
	 * @see #getDerivedCRSType()
	 * @generated
	 */
	void setDerivedCRSType(DerivedCRSTypeType value);

	/**
	 * Returns the value of the '<em><b>Uses CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the coordinate system used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses CS</em>' containment reference.
	 * @see #setUsesCS(CoordinateSystemRefType)
	 * @see net.opengis.gml.GMLPackage#getDerivedCRSType_UsesCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinateSystemRefType getUsesCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DerivedCRSType#getUsesCS <em>Uses CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses CS</em>' containment reference.
	 * @see #getUsesCS()
	 * @generated
	 */
	void setUsesCS(CoordinateSystemRefType value);

} // DerivedCRSType
