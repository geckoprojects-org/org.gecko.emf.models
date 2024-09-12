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
 * A representation of the model object '<em><b>Composite Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CompositeSurface is defined by a set of orientable surfaces. A composite surface is geometry type with all the geometric properties of a (primitive) surface. Essentially, a composite surface is a collection of surfaces that join in pairs on common boundary curves and which, when considered as a whole, form a single surface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CompositeSurfaceType#getSurfaceMember <em>Surface Member</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCompositeSurfaceType()
 * @model extendedMetaData="name='CompositeSurfaceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositeSurfaceType extends AbstractSurfaceType {
	/**
	 * Returns the value of the '<em><b>Surface Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.SurfacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element references or contains one surface in the composite surface. The surfaces are contiguous.
	 * NOTE: This definition allows for a nested structure, i.e. a CompositeSurface may use, for example, another CompositeSurface as a member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getCompositeSurfaceType_SurfaceMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='surfaceMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SurfacePropertyType> getSurfaceMember();

} // CompositeSurfaceType
