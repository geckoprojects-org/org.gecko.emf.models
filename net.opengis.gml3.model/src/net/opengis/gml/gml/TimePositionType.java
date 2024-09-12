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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The method for identifying a temporal position is specific to each temporal reference system.  gml:TimePositionType supports the description of temporal position according to the subtypes described in ISO 19108.
 * Values based on calendars and clocks use lexical formats that are based on ISO 8601, as described in XML Schema Part 2:2001. A decimal value may be used with coordinate systems such as GPS time or UNIX time. A URI may be used to provide a reference to some era in an ordinal reference system . 
 * In common with many of the components modelled as data types in the ISO 19100 series of International Standards, the corresponding GML component has simple content. However, the content model gml:TimePositionType is defined in several steps.
 * Three XML attributes appear on gml:TimePositionType:
 * A time value shall be associated with a temporal reference system through the frame attribute that provides a URI reference that identifies a description of the reference system. Following ISO 19108, the Gregorian calendar with UTC is the default reference system, but others may also be used. Components for describing temporal reference systems are described in 14.4, but it is not required that the reference system be described in this, as the reference may refer to anything that may be indentified with a URI.  
 * For time values using a calendar containing more than one era, the (optional) calendarEraName attribute provides the name of the calendar era.  
 * Inexact temporal positions may be expressed using the optional indeterminatePosition attribute.  This takes a value from an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimePositionType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimePositionType#getCalendarEraName <em>Calendar Era Name</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimePositionType#getFrame <em>Frame</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TimePositionType#getIndeterminatePosition <em>Indeterminate Position</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimePositionType()
 * @model extendedMetaData="name='TimePositionType' kind='simple'"
 * @generated
 */
@ProviderType
public interface TimePositionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see net.opengis.gml.gml.GMLPackage#getTimePositionType_Value()
	 * @model dataType="net.opengis.gml.gml.TimePositionUnion"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimePositionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Calendar Era Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Era Name</em>' attribute.
	 * @see #setCalendarEraName(String)
	 * @see net.opengis.gml.gml.GMLPackage#getTimePositionType_CalendarEraName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='calendarEraName'"
	 * @generated
	 */
	String getCalendarEraName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimePositionType#getCalendarEraName <em>Calendar Era Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Era Name</em>' attribute.
	 * @see #getCalendarEraName()
	 * @generated
	 */
	void setCalendarEraName(String value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The default value is <code>"#ISO-8601"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(String)
	 * @see net.opengis.gml.gml.GMLPackage#getTimePositionType_Frame()
	 * @model default="#ISO-8601" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimePositionType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.TimePositionType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(String)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TimePositionType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(String)
	 * @generated
	 */
	boolean isSetFrame();

	/**
	 * Returns the value of the '<em><b>Indeterminate Position</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.TimeIndeterminateValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indeterminate Position</em>' attribute.
	 * @see net.opengis.gml.gml.TimeIndeterminateValueType
	 * @see #isSetIndeterminatePosition()
	 * @see #unsetIndeterminatePosition()
	 * @see #setIndeterminatePosition(TimeIndeterminateValueType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimePositionType_IndeterminatePosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='indeterminatePosition'"
	 * @generated
	 */
	TimeIndeterminateValueType getIndeterminatePosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimePositionType#getIndeterminatePosition <em>Indeterminate Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indeterminate Position</em>' attribute.
	 * @see net.opengis.gml.gml.TimeIndeterminateValueType
	 * @see #isSetIndeterminatePosition()
	 * @see #unsetIndeterminatePosition()
	 * @see #getIndeterminatePosition()
	 * @generated
	 */
	void setIndeterminatePosition(TimeIndeterminateValueType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.TimePositionType#getIndeterminatePosition <em>Indeterminate Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndeterminatePosition()
	 * @see #getIndeterminatePosition()
	 * @see #setIndeterminatePosition(TimeIndeterminateValueType)
	 * @generated
	 */
	void unsetIndeterminatePosition();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TimePositionType#getIndeterminatePosition <em>Indeterminate Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indeterminate Position</em>' attribute is set.
	 * @see #unsetIndeterminatePosition()
	 * @see #getIndeterminatePosition()
	 * @see #setIndeterminatePosition(TimeIndeterminateValueType)
	 * @generated
	 */
	boolean isSetIndeterminatePosition();

} // TimePositionType
