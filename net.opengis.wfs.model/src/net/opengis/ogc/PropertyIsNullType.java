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
package net.opengis.ogc;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Is Null Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.PropertyIsNullType#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getPropertyIsNullType()
 * @model extendedMetaData="name='PropertyIsNullType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PropertyIsNullType extends ComparisonOpsType {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference.
	 * @see #setPropertyName(PropertyNameType)
	 * @see net.opengis.ogc.OGCPackage#getPropertyIsNullType_PropertyName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyNameType getPropertyName();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.PropertyIsNullType#getPropertyName <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' containment reference.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(PropertyNameType value);

} // PropertyIsNullType
