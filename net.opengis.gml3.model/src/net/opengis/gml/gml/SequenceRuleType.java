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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The gml:SequenceRuleType is derived from the gml:SequenceRuleEnumeration through the addition of an axisOrder attribute.  The gml:SequenceRuleEnumeration is an enumerated type. The rule names are defined in ISO 19123. If no rule name is specified the default is "Linear".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.SequenceRuleType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.gml.SequenceRuleType#getAxisOrder <em>Axis Order</em>}</li>
 *   <li>{@link net.opengis.gml.gml.SequenceRuleType#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getSequenceRuleType()
 * @model extendedMetaData="name='SequenceRuleType' kind='simple'"
 * @generated
 */
@ProviderType
public interface SequenceRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.SequenceRuleEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see net.opengis.gml.gml.SequenceRuleEnumeration
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SequenceRuleEnumeration)
	 * @see net.opengis.gml.gml.GMLPackage#getSequenceRuleType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	SequenceRuleEnumeration getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see net.opengis.gml.gml.SequenceRuleEnumeration
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SequenceRuleEnumeration value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SequenceRuleEnumeration)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SequenceRuleEnumeration)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Axis Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Order</em>' attribute.
	 * @see #setAxisOrder(List)
	 * @see net.opengis.gml.gml.GMLPackage#getSequenceRuleType_AxisOrder()
	 * @model dataType="net.opengis.gml.gml.AxisDirectionList" many="false"
	 *        extendedMetaData="kind='attribute' name='axisOrder'"
	 * @generated
	 */
	List<String> getAxisOrder();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getAxisOrder <em>Axis Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Order</em>' attribute.
	 * @see #getAxisOrder()
	 * @generated
	 */
	void setAxisOrder(List<String> value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.IncrementOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see net.opengis.gml.gml.IncrementOrder
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #setOrder(IncrementOrder)
	 * @see net.opengis.gml.gml.GMLPackage#getSequenceRuleType_Order()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='order'"
	 * @generated
	 */
	IncrementOrder getOrder();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see net.opengis.gml.gml.IncrementOrder
	 * @see #isSetOrder()
	 * @see #unsetOrder()
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(IncrementOrder value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrder()
	 * @see #getOrder()
	 * @see #setOrder(IncrementOrder)
	 * @generated
	 */
	void unsetOrder();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.SequenceRuleType#getOrder <em>Order</em>}' attribute is set.
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
