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
 * A representation of the model object '<em><b>Multi Surface Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiSurfaceDomainType#getMultiSurface <em>Multi Surface</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiSurfaceDomainType()
 * @model extendedMetaData="name='MultiSurfaceDomainType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiSurfaceDomainType extends DomainSetType {
	/**
	 * Returns the value of the '<em><b>Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Surface</em>' containment reference.
	 * @see #setMultiSurface(MultiSurfaceType)
	 * @see net.opengis.gml.GMLPackage#getMultiSurfaceDomainType_MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfaceType getMultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiSurfaceDomainType#getMultiSurface <em>Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface</em>' containment reference.
	 * @see #getMultiSurface()
	 * @generated
	 */
	void setMultiSurface(MultiSurfaceType value);

} // MultiSurfaceDomainType
