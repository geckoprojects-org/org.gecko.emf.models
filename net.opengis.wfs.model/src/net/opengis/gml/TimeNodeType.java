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
 * A representation of the model object '<em><b>Time Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type declaration of the element "TimeNode".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TimeNodeType#getPreviousEdge <em>Previous Edge</em>}</li>
 *   <li>{@link net.opengis.gml.TimeNodeType#getNextEdge <em>Next Edge</em>}</li>
 *   <li>{@link net.opengis.gml.TimeNodeType#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTimeNodeType()
 * @model extendedMetaData="name='TimeNodeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeNodeType extends AbstractTimeTopologyPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Previous Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TimeEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Edge</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTimeNodeType_PreviousEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='previousEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeEdgePropertyType> getPreviousEdge();

	/**
	 * Returns the value of the '<em><b>Next Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TimeEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Edge</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTimeNodeType_NextEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nextEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeEdgePropertyType> getNextEdge();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(TimeInstantPropertyType)
	 * @see net.opengis.gml.GMLPackage#getTimeNodeType_Position()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeInstantPropertyType getPosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TimeNodeType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(TimeInstantPropertyType value);

} // TimeNodeType
