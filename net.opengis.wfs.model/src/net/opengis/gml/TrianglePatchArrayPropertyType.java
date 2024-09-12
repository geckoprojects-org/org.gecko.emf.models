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
 * A representation of the model object '<em><b>Triangle Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type defines a container for an array of 
 *      triangle patches.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TrianglePatchArrayPropertyType#getTriangle <em>Triangle</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTrianglePatchArrayPropertyType()
 * @model extendedMetaData="name='TrianglePatchArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TrianglePatchArrayPropertyType extends SurfacePatchArrayPropertyType {
	/**
	 * Returns the value of the '<em><b>Triangle</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TriangleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triangle</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTrianglePatchArrayPropertyType_Triangle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Triangle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriangleType> getTriangle();

} // TrianglePatchArrayPropertyType
