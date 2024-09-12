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
 * A representation of the model object '<em><b>Time Stamp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.TimeStampType#getWhen <em>When</em>}</li>
 *   <li>{@link net.opengis.kml.TimeStampType#getTimeStampSimpleExtensionGroupGroup <em>Time Stamp Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.TimeStampType#getTimeStampSimpleExtensionGroup <em>Time Stamp Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.TimeStampType#getTimeStampObjectExtensionGroupGroup <em>Time Stamp Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.TimeStampType#getTimeStampObjectExtensionGroup <em>Time Stamp Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getTimeStampType()
 * @model extendedMetaData="name='TimeStampType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeStampType extends AbstractTimePrimitiveType {
	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(XMLGregorianCalendar)
	 * @see net.opengis.kml.KMLPackage#getTimeStampType_When()
	 * @model dataType="net.opengis.kml.DateTimeType"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWhen();

	/**
	 * Sets the value of the '{@link net.opengis.kml.TimeStampType#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Time Stamp Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getTimeStampType_TimeStampSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TimeStampSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimeStampSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Time Stamp Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getTimeStampType_TimeStampSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeStampSimpleExtensionGroup' namespace='##targetNamespace' group='TimeStampSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getTimeStampSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Time Stamp Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getTimeStampType_TimeStampObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TimeStampObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimeStampObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Time Stamp Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getTimeStampType_TimeStampObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeStampObjectExtensionGroup' namespace='##targetNamespace' group='TimeStampObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getTimeStampObjectExtensionGroup();

} // TimeStampType
