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
 * A representation of the model object '<em><b>Ring Property Type</b></em>'.
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
 *   <li>{@link net.opengis.gml.RingPropertyType#getRing <em>Ring</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getRingPropertyType()
 * @model extendedMetaData="name='RingPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring</em>' containment reference.
	 * @see #setRing(RingType)
	 * @see net.opengis.gml.GMLPackage#getRingPropertyType_Ring()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ring' namespace='##targetNamespace'"
	 * @generated
	 */
	RingType getRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.RingPropertyType#getRing <em>Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring</em>' containment reference.
	 * @see #getRing()
	 * @generated
	 */
	void setRing(RingType value);

} // RingPropertyType
