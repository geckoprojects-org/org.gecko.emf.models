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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Aggregate value built from other Values using the Composite pattern. It contains zero or an arbitrary number of valueComponent elements, and zero or one valueComponents elements.  It may be used for strongly coupled aggregates (vectors, tensors) or for arbitrary collections of values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CompositeValueType#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link net.opengis.gml.CompositeValueType#getValueComponents <em>Value Components</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCompositeValueType()
 * @model extendedMetaData="name='CompositeValueType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositeValueType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.ValuePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element which refers to, or contains, a Value.  This version is used in CompositeValues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Component</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getCompositeValueType_ValueComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValuePropertyType> getValueComponent();

	/**
	 * Returns the value of the '<em><b>Value Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element which refers to, or contains, a set of homogeneously typed Values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Components</em>' containment reference.
	 * @see #setValueComponents(ValueArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getCompositeValueType_ValueComponents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueArrayPropertyType getValueComponents();

	/**
	 * Sets the value of the '{@link net.opengis.gml.CompositeValueType#getValueComponents <em>Value Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Components</em>' containment reference.
	 * @see #getValueComponents()
	 * @generated
	 */
	void setValueComponents(ValueArrayPropertyType value);

} // CompositeValueType
