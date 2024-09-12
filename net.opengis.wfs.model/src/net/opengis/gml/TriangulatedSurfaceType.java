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
 * A representation of the model object '<em><b>Triangulated Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A triangulated surface is a polyhedral 
 *    surface that is composed only of triangles. There is no
 *    restriction on how the triangulation is derived.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TriangulatedSurfaceType#getTrianglePatches <em>Triangle Patches</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTriangulatedSurfaceType()
 * @model extendedMetaData="name='TriangulatedSurfaceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TriangulatedSurfaceType extends SurfaceType {
	/**
	 * Returns the value of the '<em><b>Triangle Patches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property encapsulates the patches of 
	 *       the triangulated surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triangle Patches</em>' containment reference.
	 * @see #setTrianglePatches(TrianglePatchArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getTriangulatedSurfaceType_TrianglePatches()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trianglePatches' namespace='##targetNamespace'"
	 * @generated
	 */
	TrianglePatchArrayPropertyType getTrianglePatches();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TriangulatedSurfaceType#getTrianglePatches <em>Triangle Patches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triangle Patches</em>' containment reference.
	 * @see #getTrianglePatches()
	 * @generated
	 */
	void setTrianglePatches(TrianglePatchArrayPropertyType value);

} // TriangulatedSurfaceType
