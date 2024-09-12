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
 * A representation of the model object '<em><b>Multi Surface Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A discrete coverage type whose domain is defined by a collection of surface patches (includes polygons, triangles, rectangles, etc).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiSurfaceCoverageType#getMultiSurfaceDomain <em>Multi Surface Domain</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiSurfaceCoverageType()
 * @model extendedMetaData="name='MultiSurfaceCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiSurfaceCoverageType extends AbstractDiscreteCoverageType {
	/**
	 * Returns the value of the '<em><b>Multi Surface Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Surface Domain</em>' containment reference.
	 * @see #setMultiSurfaceDomain(MultiSurfaceDomainType)
	 * @see net.opengis.gml.GMLPackage#getMultiSurfaceCoverageType_MultiSurfaceDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='multiSurfaceDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfaceDomainType getMultiSurfaceDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiSurfaceCoverageType#getMultiSurfaceDomain <em>Multi Surface Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface Domain</em>' containment reference.
	 * @see #getMultiSurfaceDomain()
	 * @generated
	 */
	void setMultiSurfaceDomain(MultiSurfaceDomainType value);

} // MultiSurfaceCoverageType
