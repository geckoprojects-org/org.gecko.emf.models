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
 * A representation of the model object '<em><b>Topo Volume Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopoVolumePropertyType#getTopoVolume <em>Topo Volume</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopoVolumePropertyType()
 * @model extendedMetaData="name='TopoVolumePropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoVolumePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Volume</em>' containment reference.
	 * @see #setTopoVolume(TopoVolumeType)
	 * @see net.opengis.gml.GMLPackage#getTopoVolumePropertyType_TopoVolume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoVolumeType getTopoVolume();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopoVolumePropertyType#getTopoVolume <em>Topo Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Volume</em>' containment reference.
	 * @see #getTopoVolume()
	 * @generated
	 */
	void setTopoVolume(TopoVolumeType value);

} // TopoVolumePropertyType
