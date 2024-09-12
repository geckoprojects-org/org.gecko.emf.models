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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMS Angle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DMSAngleType#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DMSAngleType#getDecimalMinutes <em>Decimal Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DMSAngleType#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DMSAngleType#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDMSAngleType()
 * @model extendedMetaData="name='DMSAngleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DMSAngleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' containment reference.
	 * @see #setDegrees(DegreesType)
	 * @see net.opengis.gml.gml.GMLPackage#getDMSAngleType_Degrees()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='degrees' namespace='##targetNamespace'"
	 * @generated
	 */
	DegreesType getDegrees();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DMSAngleType#getDegrees <em>Degrees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' containment reference.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(DegreesType value);

	/**
	 * Returns the value of the '<em><b>Decimal Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Minutes</em>' attribute.
	 * @see #setDecimalMinutes(BigDecimal)
	 * @see net.opengis.gml.gml.GMLPackage#getDMSAngleType_DecimalMinutes()
	 * @model dataType="net.opengis.gml.gml.DecimalMinutesType"
	 *        extendedMetaData="kind='element' name='decimalMinutes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getDecimalMinutes();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DMSAngleType#getDecimalMinutes <em>Decimal Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Minutes</em>' attribute.
	 * @see #getDecimalMinutes()
	 * @generated
	 */
	void setDecimalMinutes(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(BigInteger)
	 * @see net.opengis.gml.gml.GMLPackage#getDMSAngleType_Minutes()
	 * @model dataType="net.opengis.gml.gml.ArcMinutesType"
	 *        extendedMetaData="kind='element' name='minutes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMinutes();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DMSAngleType#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(BigDecimal)
	 * @see net.opengis.gml.gml.GMLPackage#getDMSAngleType_Seconds()
	 * @model dataType="net.opengis.gml.gml.ArcSecondsType"
	 *        extendedMetaData="kind='element' name='seconds' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getSeconds();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DMSAngleType#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(BigDecimal value);

} // DMSAngleType
