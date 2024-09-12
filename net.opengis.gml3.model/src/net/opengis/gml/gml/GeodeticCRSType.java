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
 * A representation of the model object '<em><b>Geodetic CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:GeodeticCRS is a coordinate reference system based on a geodetic datum.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getEllipsoidalCSGroup <em>Ellipsoidal CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getEllipsoidalCS <em>Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getSphericalCSGroup <em>Spherical CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getGeodeticDatumGroup <em>Geodetic Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.GeodeticCRSType#getGeodeticDatum <em>Geodetic Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType()
 * @model extendedMetaData="name='GeodeticCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeodeticCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoidalCS is an association role to the ellipsoidal coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoidal CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_EllipsoidalCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='ellipsoidalCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEllipsoidalCSGroup();

	/**
	 * Returns the value of the '<em><b>Ellipsoidal CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:ellipsoidalCS is an association role to the ellipsoidal coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoidal CS</em>' containment reference.
	 * @see #setEllipsoidalCS(EllipsoidalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_EllipsoidalCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipsoidalCS' namespace='##targetNamespace' group='ellipsoidalCS:group'"
	 * @generated
	 */
	EllipsoidalCSPropertyType getEllipsoidalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GeodeticCRSType#getEllipsoidalCS <em>Ellipsoidal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoidal CS</em>' containment reference.
	 * @see #getEllipsoidalCS()
	 * @generated
	 */
	void setEllipsoidalCS(EllipsoidalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_CartesianCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
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
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_CartesianCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCS' namespace='##targetNamespace' group='cartesianCS:group'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GeodeticCRSType#getCartesianCS <em>Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #getCartesianCS()
	 * @generated
	 */
	void setCartesianCS(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_SphericalCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='sphericalCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSphericalCSGroup();

	/**
	 * Returns the value of the '<em><b>Spherical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS</em>' containment reference.
	 * @see #setSphericalCS(SphericalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_SphericalCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sphericalCS' namespace='##targetNamespace' group='sphericalCS:group'"
	 * @generated
	 */
	SphericalCSPropertyType getSphericalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GeodeticCRSType#getSphericalCS <em>Spherical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS</em>' containment reference.
	 * @see #getSphericalCS()
	 * @generated
	 */
	void setSphericalCS(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geodetic Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:geodeticDatum is an association role to the geodetic datum used by this CRS.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodetic Datum Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_GeodeticDatumGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='geodeticDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGeodeticDatumGroup();

	/**
	 * Returns the value of the '<em><b>Geodetic Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:geodeticDatum is an association role to the geodetic datum used by this CRS.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geodetic Datum</em>' containment reference.
	 * @see #setGeodeticDatum(GeodeticDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getGeodeticCRSType_GeodeticDatum()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='geodeticDatum' namespace='##targetNamespace' group='geodeticDatum:group'"
	 * @generated
	 */
	GeodeticDatumPropertyType getGeodeticDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.GeodeticCRSType#getGeodeticDatum <em>Geodetic Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geodetic Datum</em>' containment reference.
	 * @see #getGeodeticDatum()
	 * @generated
	 */
	void setGeodeticDatum(GeodeticDatumPropertyType value);

} // GeodeticCRSType
