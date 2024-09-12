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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projected CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ProjectedCRSType#getBaseGeodeticCRS <em>Base Geodetic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ProjectedCRSType#getBaseGeographicCRS <em>Base Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ProjectedCRSType#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ProjectedCRSType#getCartesianCS <em>Cartesian CS</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getProjectedCRSType()
 * @model extendedMetaData="name='ProjectedCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProjectedCRSType extends AbstractGeneralDerivedCRSType {
	/**
	 * Returns the value of the '<em><b>Base Geodetic CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:baseGeodeticCRS is an association role to the geodetic coordinate reference system used by this projected CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Geodetic CRS</em>' containment reference.
	 * @see #setBaseGeodeticCRS(GeodeticCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getProjectedCRSType_BaseGeodeticCRS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseGeodeticCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	GeodeticCRSPropertyType getBaseGeodeticCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ProjectedCRSType#getBaseGeodeticCRS <em>Base Geodetic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Geodetic CRS</em>' containment reference.
	 * @see #getBaseGeodeticCRS()
	 * @generated
	 */
	void setBaseGeodeticCRS(GeodeticCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Base Geographic CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Geographic CRS</em>' containment reference.
	 * @see #setBaseGeographicCRS(GeographicCRSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getProjectedCRSType_BaseGeographicCRS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseGeographicCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicCRSPropertyType getBaseGeographicCRS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ProjectedCRSType#getBaseGeographicCRS <em>Base Geographic CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Geographic CRS</em>' containment reference.
	 * @see #getBaseGeographicCRS()
	 * @generated
	 */
	void setBaseGeographicCRS(GeographicCRSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getProjectedCRSType_CartesianCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='cartesianCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCartesianCSGroup();

	/**
	 * Returns the value of the '<em><b>Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #setCartesianCS(CartesianCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getProjectedCRSType_CartesianCS()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCS' namespace='##targetNamespace' group='cartesianCS:group'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ProjectedCRSType#getCartesianCS <em>Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #getCartesianCS()
	 * @generated
	 */
	void setCartesianCS(CartesianCSPropertyType value);

} // ProjectedCRSType
