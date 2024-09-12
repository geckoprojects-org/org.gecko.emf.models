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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval Length Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type extends the built-in xsd:decimal simple type to allow floating-point 
 *       values for temporal length. According to  the ISO 11404 model you have to use 
 *       positiveInteger together with appropriate values for radix and factor. The 
 *       resolution of the time interval is to one radix ^(-factor) of the specified 
 *       time unit (e.g. unit="second", radix="10", factor="3" specifies a resolution 
 *       of milliseconds). It is a subtype of TimeDurationType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TimeIntervalLengthType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.TimeIntervalLengthType#getFactor <em>Factor</em>}</li>
 *   <li>{@link net.opengis.gml.TimeIntervalLengthType#getRadix <em>Radix</em>}</li>
 *   <li>{@link net.opengis.gml.TimeIntervalLengthType#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTimeIntervalLengthType()
 * @model extendedMetaData="name='TimeIntervalLengthType' kind='simple'"
 * @generated
 */
@ProviderType
public interface TimeIntervalLengthType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see net.opengis.gml.GMLPackage#getTimeIntervalLengthType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeIntervalLengthType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(BigInteger)
	 * @see net.opengis.gml.GMLPackage#getTimeIntervalLengthType_Factor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='factor'"
	 * @generated
	 */
	BigInteger getFactor();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeIntervalLengthType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radix</em>' attribute.
	 * @see #setRadix(BigInteger)
	 * @see net.opengis.gml.GMLPackage#getTimeIntervalLengthType_Radix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='radix'"
	 * @generated
	 */
	BigInteger getRadix();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeIntervalLengthType#getRadix <em>Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radix</em>' attribute.
	 * @see #getRadix()
	 * @generated
	 */
	void setRadix(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(Object)
	 * @see net.opengis.gml.GMLPackage#getTimeIntervalLengthType_Unit()
	 * @model dataType="net.opengis.gml.TimeUnitType" required="true"
	 *        extendedMetaData="kind='attribute' name='unit'"
	 * @generated
	 */
	Object getUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeIntervalLengthType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Object value);

} // TimeIntervalLengthType
