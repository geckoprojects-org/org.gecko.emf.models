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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.MeasurePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDDimensionType#getDimensionName <em>Dimension Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDimensionType#getDimensionSize <em>Dimension Size</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDimensionType#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDDimensionType()
 * @model extendedMetaData="name='MD_Dimension_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDDimensionType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Dimension Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Name</em>' containment reference.
	 * @see #setDimensionName(MDDimensionNameTypeCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDimensionType_DimensionName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dimensionName' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDimensionNameTypeCodePropertyType getDimensionName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDDimensionType#getDimensionName <em>Dimension Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Name</em>' containment reference.
	 * @see #getDimensionName()
	 * @generated
	 */
	void setDimensionName(MDDimensionNameTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Dimension Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Size</em>' containment reference.
	 * @see #setDimensionSize(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDimensionType_DimensionSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dimensionSize' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getDimensionSize();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDDimensionType#getDimensionSize <em>Dimension Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Size</em>' containment reference.
	 * @see #getDimensionSize()
	 * @generated
	 */
	void setDimensionSize(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(MeasurePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDimensionType_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasurePropertyType getResolution();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDDimensionType#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(MeasurePropertyType value);

} // MDDimensionType
