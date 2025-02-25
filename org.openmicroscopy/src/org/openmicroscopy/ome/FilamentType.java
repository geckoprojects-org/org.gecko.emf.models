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
 * A representation of the model object '<em><b>Filament Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.FilamentType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getFilamentType()
 * @model extendedMetaData="name='Filament_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilamentType extends LightSource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.TypeType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The type of filament.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType4
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType4)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilamentType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	TypeType4 getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilamentType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType4
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType4 value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.FilamentType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType4)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.FilamentType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType4)
	 * @generated
	 */
	boolean isSetType();

} // FilamentType
