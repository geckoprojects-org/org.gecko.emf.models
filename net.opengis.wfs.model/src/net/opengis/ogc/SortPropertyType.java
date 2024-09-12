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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.SortPropertyType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.SortPropertyType#getSortOrder <em>Sort Order</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getSortPropertyType()
 * @model extendedMetaData="name='SortPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SortPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference.
	 * @see #setPropertyName(PropertyNameType)
	 * @see net.opengis.ogc.OGCPackage#getSortPropertyType_PropertyName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyNameType getPropertyName();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.SortPropertyType#getPropertyName <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' containment reference.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(PropertyNameType value);

	/**
	 * Returns the value of the '<em><b>Sort Order</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.ogc.SortOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Order</em>' attribute.
	 * @see net.opengis.ogc.SortOrderType
	 * @see #isSetSortOrder()
	 * @see #unsetSortOrder()
	 * @see #setSortOrder(SortOrderType)
	 * @see net.opengis.ogc.OGCPackage#getSortPropertyType_SortOrder()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SortOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	SortOrderType getSortOrder();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.SortPropertyType#getSortOrder <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Order</em>' attribute.
	 * @see net.opengis.ogc.SortOrderType
	 * @see #isSetSortOrder()
	 * @see #unsetSortOrder()
	 * @see #getSortOrder()
	 * @generated
	 */
	void setSortOrder(SortOrderType value);

	/**
	 * Unsets the value of the '{@link net.opengis.ogc.SortPropertyType#getSortOrder <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortOrder()
	 * @see #getSortOrder()
	 * @see #setSortOrder(SortOrderType)
	 * @generated
	 */
	void unsetSortOrder();

	/**
	 * Returns whether the value of the '{@link net.opengis.ogc.SortPropertyType#getSortOrder <em>Sort Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Order</em>' attribute is set.
	 * @see #unsetSortOrder()
	 * @see #getSortOrder()
	 * @see #setSortOrder(SortOrderType)
	 * @generated
	 */
	boolean isSetSortOrder();

} // SortPropertyType
