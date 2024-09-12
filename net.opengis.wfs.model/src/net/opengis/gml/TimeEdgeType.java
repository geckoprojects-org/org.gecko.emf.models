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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type declaration of the element "TimeEdge".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TimeEdgeType#getStart <em>Start</em>}</li>
 *   <li>{@link net.opengis.gml.TimeEdgeType#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.gml.TimeEdgeType#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTimeEdgeType()
 * @model extendedMetaData="name='TimeEdgeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeEdgeType extends AbstractTimeTopologyPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(TimeNodePropertyType)
	 * @see net.opengis.gml.GMLPackage#getTimeEdgeType_Start()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeNodePropertyType getStart();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeEdgeType#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(TimeNodePropertyType value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TimeNodePropertyType)
	 * @see net.opengis.gml.GMLPackage#getTimeEdgeType_End()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeNodePropertyType getEnd();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeEdgeType#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TimeNodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(TimePeriodPropertyType)
	 * @see net.opengis.gml.GMLPackage#getTimeEdgeType_Extent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodPropertyType getExtent();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeEdgeType#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(TimePeriodPropertyType value);

} // TimeEdgeType
