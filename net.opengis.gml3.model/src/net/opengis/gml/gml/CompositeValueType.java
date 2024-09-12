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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.CompositeValueType#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CompositeValueType#getValueComponents <em>Value Components</em>}</li>
 *   <li>{@link net.opengis.gml.gml.CompositeValueType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getCompositeValueType()
 * @model extendedMetaData="name='CompositeValueType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositeValueType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.ValuePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property that refers to, or contains, a Value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Component</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getCompositeValueType_ValueComponent()
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
	 * Property that contains Values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Components</em>' containment reference.
	 * @see #setValueComponents(ValueArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getCompositeValueType_ValueComponents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueArrayPropertyType getValueComponents();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CompositeValueType#getValueComponents <em>Value Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Components</em>' containment reference.
	 * @see #getValueComponents()
	 * @generated
	 */
	void setValueComponents(ValueArrayPropertyType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml.gml.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml.gml.GMLPackage#getCompositeValueType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.CompositeValueType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml.gml.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.CompositeValueType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.CompositeValueType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // CompositeValueType
