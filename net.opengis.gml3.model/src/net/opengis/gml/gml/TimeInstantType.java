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
 * A representation of the model object '<em><b>Time Instant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimeInstantType#getTimePosition <em>Time Position</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimeInstantType()
 * @model extendedMetaData="name='TimeInstantType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeInstantType extends AbstractTimeGeometricPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Time Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element is used directly as a property of gml:TimeInstant (see 15.2.2.3), and may also be used in application schemas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Position</em>' containment reference.
	 * @see #setTimePosition(TimePositionType)
	 * @see net.opengis.gml.gml.GMLPackage#getTimeInstantType_TimePosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePositionType getTimePosition();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TimeInstantType#getTimePosition <em>Time Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Position</em>' containment reference.
	 * @see #getTimePosition()
	 * @generated
	 */
	void setTimePosition(TimePositionType value);

} // TimeInstantType
