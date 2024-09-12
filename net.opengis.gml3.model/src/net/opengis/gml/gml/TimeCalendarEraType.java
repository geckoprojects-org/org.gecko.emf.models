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

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Calendar Era Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimeCalendarEraType#getReferenceEvent <em>Reference Event</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeCalendarEraType#getReferenceDate <em>Reference Date</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeCalendarEraType#getJulianReference <em>Julian Reference</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimeCalendarEraType#getEpochOfUse <em>Epoch Of Use</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarEraType()
 * @model extendedMetaData="name='TimeCalendarEraType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeCalendarEraType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Reference Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Event</em>' containment reference.
	 * @see #setReferenceEvent(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarEraType_ReferenceEvent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getReferenceEvent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeCalendarEraType#getReferenceEvent <em>Reference Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event</em>' containment reference.
	 * @see #getReferenceEvent()
	 * @generated
	 */
	void setReferenceEvent(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Reference Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Date</em>' attribute.
	 * @see #setReferenceDate(XMLGregorianCalendar)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarEraType_ReferenceDate()
	 * @model dataType="net.opengis.gml.gml.CalDate" required="true"
	 *        extendedMetaData="kind='element' name='referenceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getReferenceDate();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeCalendarEraType#getReferenceDate <em>Reference Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Date</em>' attribute.
	 * @see #getReferenceDate()
	 * @generated
	 */
	void setReferenceDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Julian Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Julian Reference</em>' attribute.
	 * @see #setJulianReference(BigDecimal)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarEraType_JulianReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='julianReference' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getJulianReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeCalendarEraType#getJulianReference <em>Julian Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Julian Reference</em>' attribute.
	 * @see #getJulianReference()
	 * @generated
	 */
	void setJulianReference(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Epoch Of Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epoch Of Use</em>' containment reference.
	 * @see #setEpochOfUse(TimePeriodPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarEraType_EpochOfUse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='epochOfUse' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodPropertyType getEpochOfUse();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeCalendarEraType#getEpochOfUse <em>Epoch Of Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epoch Of Use</em>' containment reference.
	 * @see #getEpochOfUse()
	 * @generated
	 */
	void setEpochOfUse(TimePeriodPropertyType value);

} // TimeCalendarEraType
