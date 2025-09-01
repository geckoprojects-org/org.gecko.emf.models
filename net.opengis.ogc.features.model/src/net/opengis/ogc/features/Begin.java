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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Begin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.Begin#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.ogc.features.Begin#isInclusive <em>Inclusive</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBegin()
 * @model extendedMetaData="name='begin_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface Begin extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBegin_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.Begin#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Inclusive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive</em>' attribute.
	 * @see #isSetInclusive()
	 * @see #unsetInclusive()
	 * @see #setInclusive(boolean)
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getBegin_Inclusive()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inclusive'"
	 * @generated
	 */
	boolean isInclusive();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.features.Begin#isInclusive <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive</em>' attribute.
	 * @see #isSetInclusive()
	 * @see #unsetInclusive()
	 * @see #isInclusive()
	 * @generated
	 */
	void setInclusive(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.ogc.features.Begin#isInclusive <em>Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInclusive()
	 * @see #isInclusive()
	 * @see #setInclusive(boolean)
	 * @generated
	 */
	void unsetInclusive();

	/**
	 * Returns whether the value of the '{@link net.opengis.ogc.features.Begin#isInclusive <em>Inclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inclusive</em>' attribute is set.
	 * @see #unsetInclusive()
	 * @see #isInclusive()
	 * @see #setInclusive(boolean)
	 * @generated
	 */
	boolean isSetInclusive();

} // Begin
