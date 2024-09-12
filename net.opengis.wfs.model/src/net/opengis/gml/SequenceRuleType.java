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
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.SequenceRuleType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.SequenceRuleType#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getSequenceRuleType()
 * @model extendedMetaData="name='SequenceRuleType' kind='simple'"
 * @generated
 */
@ProviderType
public interface SequenceRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.SequenceRuleNames}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see net.opengis.gml.SequenceRuleNames
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SequenceRuleNames)
	 * @see net.opengis.gml.GMLPackage#getSequenceRuleType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	SequenceRuleNames getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.SequenceRuleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see net.opengis.gml.SequenceRuleNames
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SequenceRuleNames value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.SequenceRuleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SequenceRuleNames)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.SequenceRuleType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SequenceRuleNames)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.IncrementOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see net.opengis.gml.IncrementOrder
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(IncrementOrder)
	 * @see net.opengis.gml.GMLPackage#getSequenceRuleType_Order()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	IncrementOrder getOrder();

	/**
	 * Sets the value of the '{@link net.opengis.gml.SequenceRuleType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see net.opengis.gml.IncrementOrder
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(IncrementOrder value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.SequenceRuleType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(IncrementOrder)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.SequenceRuleType#getOrder <em>Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order</em>' attribute is set.
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @see #setOrder(IncrementOrder)
	 * @generated
	 */
	boolean isSetOrder();

} // SequenceRuleType
