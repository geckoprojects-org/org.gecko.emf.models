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
package net.opengis.ows;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * XML encoded minimum rectangular bounding box (or region) parameter, surrounding all the associated data. 
 * This type is adapted from the EnvelopeType of GML 3.1, with modified contents and documentation for encoding a MINIMUM size box SURROUNDING all associated data. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.BoundingBoxType#getLowerCorner <em>Lower Corner</em>}</li>
 *   <li>{@link net.opengis.ows.BoundingBoxType#getUpperCorner <em>Upper Corner</em>}</li>
 *   <li>{@link net.opengis.ows.BoundingBoxType#getCrs <em>Crs</em>}</li>
 *   <li>{@link net.opengis.ows.BoundingBoxType#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getBoundingBoxType()
 * @model extendedMetaData="name='BoundingBoxType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundingBoxType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Corner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position of the bounding box corner at which the value of each coordinate normally is the algebraic minimum within this bounding box. In some cases, this position is normally displayed at the top, such as the top left for some image coordinates. For more information, see Subclauses 10.2.5 and C.13. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Corner</em>' attribute.
	 * @see #setLowerCorner(List)
	 * @see net.opengis.ows.OWSPackage#getBoundingBoxType_LowerCorner()
	 * @model dataType="net.opengis.ows.PositionType" required="true" many="false"
	 *        extendedMetaData="kind='element' name='LowerCorner' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getLowerCorner();

	/**
	 * Sets the value of the '{@link net.opengis.ows.BoundingBoxType#getLowerCorner <em>Lower Corner</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Position of the bounding box corner at which the value of each coordinate normally is the algebraic maximum within this bounding box. In some cases, this position is normally displayed at the bottom, such as the bottom right for some image coordinates. For more information, see Subclauses 10.2.5 and C.13. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Corner</em>' attribute.
	 * @see #setUpperCorner(List)
	 * @see net.opengis.ows.OWSPackage#getBoundingBoxType_UpperCorner()
	 * @model dataType="net.opengis.ows.PositionType" required="true" many="false"
	 *        extendedMetaData="kind='element' name='UpperCorner' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getUpperCorner();

	/**
	 * Sets the value of the '{@link net.opengis.ows.BoundingBoxType#getUpperCorner <em>Upper Corner</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Usually references the definition of a CRS, as specified in [OGC Topic 2]. Such a CRS definition can be XML encoded using the gml:CoordinateReferenceSystemType in [GML 3.1]. For well known references, it is not required that a CRS definition exist at the location the URI points to. If no anyURI value is included, the applicable CRS must be either:
	 * a)	Specified outside the bounding box, but inside a data structure that includes this bounding box, as specified for a specific OWS use of this bounding box type.
	 * b)	Fixed and specified in the Implementation Specification for a specific OWS use of the bounding box type. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crs</em>' attribute.
	 * @see #setCrs(String)
	 * @see net.opengis.ows.OWSPackage#getBoundingBoxType_Crs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='crs'"
	 * @generated
	 */
	String getCrs();

	/**
	 * Sets the value of the '{@link net.opengis.ows.BoundingBoxType#getCrs <em>Crs</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * The number of dimensions in this CRS (the length of a coordinate sequence in this use of the PositionType). This number is specified by the CRS definition, but can also be specified here. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute.
	 * @see #setDimensions(BigInteger)
	 * @see net.opengis.ows.OWSPackage#getBoundingBoxType_Dimensions()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='dimensions'"
	 * @generated
	 */
	BigInteger getDimensions();

	/**
	 * Sets the value of the '{@link net.opengis.ows.BoundingBoxType#getDimensions <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' attribute.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(BigInteger value);

} // BoundingBoxType
