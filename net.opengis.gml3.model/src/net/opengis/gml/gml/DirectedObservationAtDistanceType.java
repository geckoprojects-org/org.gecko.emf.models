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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Observation At Distance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DirectedObservationAtDistanceType#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDirectedObservationAtDistanceType()
 * @model extendedMetaData="name='DirectedObservationAtDistanceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DirectedObservationAtDistanceType extends DirectedObservationType {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(MeasureType)
	 * @see net.opengis.gml.gml.GMLPackage#getDirectedObservationAtDistanceType_Distance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getDistance();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DirectedObservationAtDistanceType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(MeasureType value);

} // DirectedObservationAtDistanceType
