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
import org.isotc211._2005.gco.BooleanPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract EX Geographic Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Geographic area of the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.AbstractEXGeographicExtentType#getExtentTypeCode <em>Extent Type Code</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractEXGeographicExtentType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractEX_GeographicExtent_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractEXGeographicExtentType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Extent Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent Type Code</em>' containment reference.
	 * @see #setExtentTypeCode(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractEXGeographicExtentType_ExtentTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extentTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getExtentTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractEXGeographicExtentType#getExtentTypeCode <em>Extent Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Type Code</em>' containment reference.
	 * @see #getExtentTypeCode()
	 * @generated
	 */
	void setExtentTypeCode(BooleanPropertyType value);

} // AbstractEXGeographicExtentType
