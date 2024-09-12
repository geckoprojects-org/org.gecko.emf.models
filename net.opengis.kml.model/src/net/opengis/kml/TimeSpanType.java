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
package net.opengis.kml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Span Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.TimeSpanType#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.kml.TimeSpanType#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.kml.TimeSpanType#getTimeSpanSimpleExtensionGroupGroup <em>Time Span Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.TimeSpanType#getTimeSpanSimpleExtensionGroup <em>Time Span Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.TimeSpanType#getTimeSpanObjectExtensionGroupGroup <em>Time Span Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.TimeSpanType#getTimeSpanObjectExtensionGroup <em>Time Span Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getTimeSpanType()
 * @model extendedMetaData="name='TimeSpanType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeSpanType extends AbstractTimePrimitiveType {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getTimeSpanType_Begin()
	 * @model dataType="net.opengis.kml.DateTimeType"
	 *        extendedMetaData="kind='element' name='begin' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBegin();

	/**
	 * Sets the value of the '{@link net.opengis.kml.TimeSpanType#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getTimeSpanType_End()
	 * @model dataType="net.opengis.kml.DateTimeType"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.kml.TimeSpanType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Time Span Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getTimeSpanType_TimeSpanSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TimeSpanSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimeSpanSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Time Span Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getTimeSpanType_TimeSpanSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeSpanSimpleExtensionGroup' namespace='##targetNamespace' group='TimeSpanSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getTimeSpanSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Time Span Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getTimeSpanType_TimeSpanObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TimeSpanObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimeSpanObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Time Span Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getTimeSpanType_TimeSpanObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeSpanObjectExtensionGroup' namespace='##targetNamespace' group='TimeSpanObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getTimeSpanObjectExtensionGroup();

} // TimeSpanType
