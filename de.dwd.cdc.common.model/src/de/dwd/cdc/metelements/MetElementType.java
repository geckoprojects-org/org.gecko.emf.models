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
package de.dwd.cdc.metelements;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Met Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.metelements.MetElementType#getShortName <em>Short Name</em>}</li>
 *   <li>{@link de.dwd.cdc.metelements.MetElementType#getUnitOfMeasurement <em>Unit Of Measurement</em>}</li>
 *   <li>{@link de.dwd.cdc.metelements.MetElementType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.metelements.MetElementsPackage#getMetElementType()
 * @model extendedMetaData="name='MetElement_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MetElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see de.dwd.cdc.metelements.MetElementsPackage#getMetElementType_ShortName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.metelements.MetElementType#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Unit Of Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measurement</em>' attribute.
	 * @see #setUnitOfMeasurement(String)
	 * @see de.dwd.cdc.metelements.MetElementsPackage#getMetElementType_UnitOfMeasurement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='UnitOfMeasurement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitOfMeasurement();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.metelements.MetElementType#getUnitOfMeasurement <em>Unit Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Measurement</em>' attribute.
	 * @see #getUnitOfMeasurement()
	 * @generated
	 */
	void setUnitOfMeasurement(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dwd.cdc.metelements.MetElementsPackage#getMetElementType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.metelements.MetElementType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // MetElementType
