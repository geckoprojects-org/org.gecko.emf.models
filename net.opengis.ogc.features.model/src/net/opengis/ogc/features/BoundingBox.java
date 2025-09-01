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
package net.opengis.ogc.features;

import java.math.BigInteger;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.BoundingBox#getLowerCorner <em>Lower Corner</em>}</li>
 *   <li>{@link net.opengis.ogc.features.BoundingBox#getUpperCorner <em>Upper Corner</em>}</li>
 *   <li>{@link net.opengis.ogc.features.BoundingBox#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ogc.features.BoundingBox#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBoundingBox()
 * @model extendedMetaData="name='BoundingBoxType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundingBox extends SpatialExtent {
	/**
	 * Returns the value of the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Corner</em>' attribute.
	 * @see #setLowerCorner(List)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBoundingBox_LowerCorner()
	 * @model dataType="net.opengis.ogc.features.Position" required="true" many="false"
	 *        extendedMetaData="kind='element' name='LowerCorner' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getLowerCorner();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BoundingBox#getLowerCorner <em>Lower Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Corner</em>' attribute.
	 * @see #getLowerCorner()
	 * @generated
	 */
	void setLowerCorner(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Upper Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Corner</em>' attribute.
	 * @see #setUpperCorner(List)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBoundingBox_UpperCorner()
	 * @model dataType="net.opengis.ogc.features.Position" required="true" many="false"
	 *        extendedMetaData="kind='element' name='UpperCorner' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getUpperCorner();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BoundingBox#getUpperCorner <em>Upper Corner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Corner</em>' attribute.
	 * @see #getUpperCorner()
	 * @generated
	 */
	void setUpperCorner(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Crs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crs</em>' attribute.
	 * @see #setCrs(String)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBoundingBox_Crs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='crs'"
	 * @generated
	 */
	String getCrs();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BoundingBox#getCrs <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs</em>' attribute.
	 * @see #getCrs()
	 * @generated
	 */
	void setCrs(String value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(BigInteger)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBoundingBox_Dimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='dimensions'"
	 * @generated
	 */
	BigInteger getDimensions();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.BoundingBox#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(BigInteger value);

} // BoundingBox
