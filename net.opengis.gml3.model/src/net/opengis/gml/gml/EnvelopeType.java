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

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getLowerCorner <em>Lower Corner</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getUpperCorner <em>Upper Corner</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.EnvelopeType#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType()
 * @model extendedMetaData="name='EnvelopeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EnvelopeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower Corner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Corner</em>' containment reference.
	 * @see #setLowerCorner(DirectPositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_LowerCorner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerCorner' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getLowerCorner();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getLowerCorner <em>Lower Corner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Corner</em>' containment reference.
	 * @see #getLowerCorner()
	 * @generated
	 */
	void setLowerCorner(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Upper Corner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Corner</em>' containment reference.
	 * @see #setUpperCorner(DirectPositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_UpperCorner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperCorner' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getUpperCorner();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getUpperCorner <em>Upper Corner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Corner</em>' containment reference.
	 * @see #getUpperCorner()
	 * @generated
	 */
	void setUpperCorner(DirectPositionType value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.DirectPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_Pos()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectPositionType> getPos();

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Axis Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Labels</em>' attribute.
	 * @see #setAxisLabels(List)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_AxisLabels()
	 * @model dataType="net.opengis.gml.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='axisLabels'"
	 * @generated
	 */
	List<String> getAxisLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getAxisLabels <em>Axis Labels</em>}' attribute.
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
	 * @return the value of the '<em>Srs Dimension</em>' attribute.
	 * @see #setSrsDimension(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_SrsDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='srsDimension'"
	 * @generated
	 */
	BigInteger getSrsDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getSrsDimension <em>Srs Dimension</em>}' attribute.
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
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getSrsName <em>Srs Name</em>}' attribute.
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
	 * @return the value of the '<em>Uom Labels</em>' attribute.
	 * @see #setUomLabels(List)
	 * @see net.opengis.gml.gml.GMLPackage#getEnvelopeType_UomLabels()
	 * @model dataType="net.opengis.gml.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='uomLabels'"
	 * @generated
	 */
	List<String> getUomLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.EnvelopeType#getUomLabels <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Labels</em>' attribute.
	 * @see #getUomLabels()
	 * @generated
	 */
	void setUomLabels(List<String> value);

} // EnvelopeType
