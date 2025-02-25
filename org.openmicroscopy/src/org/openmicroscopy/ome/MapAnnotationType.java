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
 * A representation of the model object '<em><b>Map Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.MapAnnotationType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getMapAnnotationType()
 * @model extendedMetaData="name='MapAnnotation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MapAnnotationType extends Annotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Map)
	 * @see org.openmicroscopy.ome.OMEPackage#getMapAnnotationType_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	Map getValue();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.MapAnnotationType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Map value);

} // MapAnnotationType
