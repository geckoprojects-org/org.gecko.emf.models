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
 * A representation of the model object '<em><b>Engineering CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getAffineCSGroup <em>Affine CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getAffineCS <em>Affine CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getCartesianCSGroup <em>Cartesian CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getCylindricalCS <em>Cylindrical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getLinearCS <em>Linear CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getPolarCS <em>Polar CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getSphericalCSGroup <em>Spherical CS Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getUserDefinedCS <em>User Defined CS</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getCoordinateSystemGroup <em>Coordinate System Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getEngineeringDatumGroup <em>Engineering Datum Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EngineeringCRSType#getEngineeringDatum <em>Engineering Datum</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType()
 * @model extendedMetaData="name='EngineeringCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EngineeringCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Affine CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:affineCS is an association role to the affine coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_AffineCSGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='affineCS:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAffineCSGroup();

	/**
	 * Returns the value of the '<em><b>Affine CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:affineCS is an association role to the affine coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affine CS</em>' containment reference.
	 * @see #setAffineCS(AffineCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_AffineCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='affineCS' namespace='##targetNamespace' group='affineCS:group'"
	 * @generated
	 */
	AffineCSPropertyType getAffineCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getAffineCS <em>Affine CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affine CS</em>' containment reference.
	 * @see #getAffineCS()
	 * @generated
	 */
	void setAffineCS(AffineCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cartesian CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cartesianCS is an association role to the Cartesian coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cartesian CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_CartesianCSGroup()
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
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_CartesianCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cartesianCS' namespace='##targetNamespace' group='cartesianCS:group'"
	 * @generated
	 */
	CartesianCSPropertyType getCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getCartesianCS <em>Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian CS</em>' containment reference.
	 * @see #getCartesianCS()
	 * @generated
	 */
	void setCartesianCS(CartesianCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Cylindrical CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:cylindricalCS is an association role to the cylindrical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cylindrical CS</em>' containment reference.
	 * @see #setCylindricalCS(CylindricalCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_CylindricalCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cylindricalCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CylindricalCSPropertyType getCylindricalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getCylindricalCS <em>Cylindrical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylindrical CS</em>' containment reference.
	 * @see #getCylindricalCS()
	 * @generated
	 */
	void setCylindricalCS(CylindricalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Linear CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:linearCS is an association role to the linear coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear CS</em>' containment reference.
	 * @see #setLinearCS(LinearCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_LinearCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linearCS' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearCSPropertyType getLinearCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getLinearCS <em>Linear CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear CS</em>' containment reference.
	 * @see #getLinearCS()
	 * @generated
	 */
	void setLinearCS(LinearCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Polar CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:polarCS is an association role to the polar coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polar CS</em>' containment reference.
	 * @see #setPolarCS(PolarCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_PolarCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='polarCS' namespace='##targetNamespace'"
	 * @generated
	 */
	PolarCSPropertyType getPolarCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getPolarCS <em>Polar CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polar CS</em>' containment reference.
	 * @see #getPolarCS()
	 * @generated
	 */
	void setPolarCS(PolarCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Spherical CS Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:sphericalCS is an association role to the spherical coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spherical CS Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_SphericalCSGroup()
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
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_SphericalCS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sphericalCS' namespace='##targetNamespace' group='sphericalCS:group'"
	 * @generated
	 */
	SphericalCSPropertyType getSphericalCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getSphericalCS <em>Spherical CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spherical CS</em>' containment reference.
	 * @see #getSphericalCS()
	 * @generated
	 */
	void setSphericalCS(SphericalCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>User Defined CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:userDefinedCS is an association role to the user defined coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined CS</em>' containment reference.
	 * @see #setUserDefinedCS(UserDefinedCSPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_UserDefinedCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userDefinedCS' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDefinedCSPropertyType getUserDefinedCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getUserDefinedCS <em>User Defined CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined CS</em>' containment reference.
	 * @see #getUserDefinedCS()
	 * @generated
	 */
	void setUserDefinedCS(UserDefinedCSPropertyType value);

	/**
	 * Returns the value of the '<em><b>Coordinate System Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association role to the coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_CoordinateSystemGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='coordinateSystem:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCoordinateSystemGroup();

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association role to the coordinate system used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate System</em>' containment reference.
	 * @see #setCoordinateSystem(CoordinateSystemPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_CoordinateSystem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinateSystem' namespace='##targetNamespace' group='coordinateSystem:group'"
	 * @generated
	 */
	CoordinateSystemPropertyType getCoordinateSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' containment reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	void setCoordinateSystem(CoordinateSystemPropertyType value);

	/**
	 * Returns the value of the '<em><b>Engineering Datum Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:engineeringDatum is an association role to the engineering datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Datum Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_EngineeringDatumGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='engineeringDatum:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEngineeringDatumGroup();

	/**
	 * Returns the value of the '<em><b>Engineering Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:engineeringDatum is an association role to the engineering datum used by this CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Datum</em>' containment reference.
	 * @see #setEngineeringDatum(EngineeringDatumPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getEngineeringCRSType_EngineeringDatum()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='engineeringDatum' namespace='##targetNamespace' group='engineeringDatum:group'"
	 * @generated
	 */
	EngineeringDatumPropertyType getEngineeringDatum();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EngineeringCRSType#getEngineeringDatum <em>Engineering Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Datum</em>' containment reference.
	 * @see #getEngineeringDatum()
	 * @generated
	 */
	void setEngineeringDatum(EngineeringDatumPropertyType value);

} // EngineeringCRSType
