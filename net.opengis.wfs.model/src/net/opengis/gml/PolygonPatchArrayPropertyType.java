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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type defines a container for an array of 
 *    polygon patches.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.PolygonPatchArrayPropertyType#getPolygonPatch <em>Polygon Patch</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getPolygonPatchArrayPropertyType()
 * @model extendedMetaData="name='PolygonPatchArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolygonPatchArrayPropertyType extends SurfacePatchArrayPropertyType {
	/**
	 * Returns the value of the '<em><b>Polygon Patch</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.PolygonPatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Patch</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getPolygonPatchArrayPropertyType_PolygonPatch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PolygonPatch' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PolygonPatchType> getPolygonPatch();

} // PolygonPatchArrayPropertyType
