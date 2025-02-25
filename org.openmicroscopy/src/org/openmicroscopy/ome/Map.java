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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This is a Mapping of key/value pairs.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.Map#getM <em>M</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getMap()
 * @model extendedMetaData="name='Map' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>M</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.MType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  This is a key/value pair used to build up a Mapping. The
	 *           Element and Attribute name are kept to single letters to minimize the
	 *           length at the expense of readability as they are likely to occur many
	 *           times. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>M</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getMap_M()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='M' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MType> getM();

} // Map
