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
 * A representation of the model object '<em><b>Directed Observation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.DirectedObservationType#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getDirectedObservationType()
 * @model extendedMetaData="name='DirectedObservationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DirectedObservationType extends ObservationType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(DirectionPropertyType)
	 * @see net.opengis.gml.GMLPackage#getDirectedObservationType_Direction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionPropertyType getDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectedObservationType#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionPropertyType value);

} // DirectedObservationType
