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

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Vector instances hold the compoents for a (usually spatial) vector within some coordinate reference system (CRS). 
 * 			Since Vectors will often be included in larger objects that have references to CRS, the "srsName" attribute may be missing. 
 * 			In this case, the CRS is implicitly assumed to take on the value of the containing object's CRS.
 * 
 * 			Note that this content model is the same as DirectPositionType, but is defined separately to reflect the distinct semantics, and to avoid validation problems. SJDC 2004-12-02
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.VectorType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.VectorType#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.gml.VectorType#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.gml.VectorType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.gml.VectorType#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getVectorType()
 * @model extendedMetaData="name='VectorType' kind='simple'"
 * @generated
 */
@ProviderType
public interface VectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see net.opengis.gml.GMLPackage#getVectorType_Value()
	 * @model dataType="net.opengis.gml.DoubleList" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.VectorType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Axis Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of labels for all the axes of this CRS. The gml:axisAbbrev value should be used for these axis 
	 * 				labels, after spaces and forbiddden characters are removed. When the srsName attribute is included, this attribute is optional. 
	 * 				When the srsName attribute is omitted, this attribute shall also be omitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Labels</em>' attribute.
	 * @see #setAxisLabels(List)
	 * @see net.opengis.gml.GMLPackage#getVectorType_AxisLabels()
	 * @model dataType="net.opengis.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='axisLabels'"
	 * @generated
	 */
	List<String> getAxisLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml.VectorType#getAxisLabels <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Labels</em>' attribute.
	 * @see #getAxisLabels()
	 * @generated
	 */
	void setAxisLabels(List<String> value);

	/**
	 * Returns the value of the '<em><b>Srs Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "srsDimension" is the length of coordinate sequence (the number of entries in the list). This dimension is 
	 * 				specified by the coordinate reference system. When the srsName attribute is omitted, this attribute shall be omitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Dimension</em>' attribute.
	 * @see #setSrsDimension(BigInteger)
	 * @see net.opengis.gml.GMLPackage#getVectorType_SrsDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='srsDimension'"
	 * @generated
	 */
	BigInteger getSrsDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml.VectorType#getSrsDimension <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Dimension</em>' attribute.
	 * @see #getSrsDimension()
	 * @generated
	 */
	void setSrsDimension(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In general this reference points to a CRS instance of gml:CoordinateReferenceSystemType 
	 * 				(see coordinateReferenceSystems.xsd). For well known references it is not required that the CRS description exists at the 
	 * 				location the URI points to. If no srsName attribute is given, the CRS must be specified as part of the larger context this 
	 * 				geometry element is part of, e.g. a geometric element like point, curve, etc. It is expected that this attribute will be specified 
	 * 				at the direct position level only in rare cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.gml.GMLPackage#getVectorType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.VectorType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

	/**
	 * Returns the value of the '<em><b>Uom Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of unit of measure (uom) labels for all the axes of this CRS. The value of the string in the 
	 * 				gml:catalogSymbol should be used for this uom labels, after spaces and forbiddden characters are removed. When the 
	 * 				axisLabels attribute is included, this attribute shall also be included. When the axisLabels attribute is omitted, this attribute 
	 * 				shall also be omitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uom Labels</em>' attribute.
	 * @see #setUomLabels(List)
	 * @see net.opengis.gml.GMLPackage#getVectorType_UomLabels()
	 * @model dataType="net.opengis.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='uomLabels'"
	 * @generated
	 */
	List<String> getUomLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml.VectorType#getUomLabels <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Labels</em>' attribute.
	 * @see #getUomLabels()
	 * @generated
	 */
	void setUomLabels(List<String> value);

} // VectorType
