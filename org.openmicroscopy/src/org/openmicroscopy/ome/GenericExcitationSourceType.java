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
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Excitation Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.GenericExcitationSourceType#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getGenericExcitationSourceType()
 * @model extendedMetaData="name='GenericExcitationSource_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GenericExcitationSourceType extends LightSource {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(Map)
	 * @see org.openmicroscopy.ome.OMEPackage#getGenericExcitationSourceType_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Map' namespace='##targetNamespace'"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.GenericExcitationSourceType#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

} // GenericExcitationSourceType
