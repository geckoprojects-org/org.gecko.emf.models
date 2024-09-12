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
 * A representation of the model object '<em><b>Polyhedral Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A polyhedral surface is a surface composed
 *    of polygon surfaces connected along their common boundary 
 *    curves. This differs from the surface type only in the
 *    restriction on the types of surface patches acceptable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.PolyhedralSurfaceType#getPolygonPatches <em>Polygon Patches</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getPolyhedralSurfaceType()
 * @model extendedMetaData="name='PolyhedralSurfaceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolyhedralSurfaceType extends SurfaceType {
	/**
	 * Returns the value of the '<em><b>Polygon Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property encapsulates the patches of 
	 *       the polyhedral surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon Patches</em>' containment reference.
	 * @see #setPolygonPatches(PolygonPatchArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getPolyhedralSurfaceType_PolygonPatches()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='polygonPatches' namespace='##targetNamespace'"
	 * @generated
	 */
	PolygonPatchArrayPropertyType getPolygonPatches();

	/**
	 * Sets the value of the '{@link net.opengis.gml.PolyhedralSurfaceType#getPolygonPatches <em>Polygon Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Patches</em>' containment reference.
	 * @see #getPolygonPatches()
	 * @generated
	 */
	void setPolygonPatches(PolygonPatchArrayPropertyType value);

} // PolyhedralSurfaceType
