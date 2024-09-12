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
 * A representation of the model object '<em><b>Linear Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Encapsulates a ring to represent properties in features or geometry collections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.LinearRingPropertyType#getLinearRing <em>Linear Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getLinearRingPropertyType()
 * @model extendedMetaData="name='LinearRingPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LinearRingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Ring</em>' containment reference.
	 * @see #setLinearRing(LinearRingType)
	 * @see net.opengis.gml.GMLPackage#getLinearRingPropertyType_LinearRing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LinearRing' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearRingType getLinearRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.LinearRingPropertyType#getLinearRing <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Ring</em>' containment reference.
	 * @see #getLinearRing()
	 * @generated
	 */
	void setLinearRing(LinearRingType value);

} // LinearRingPropertyType
