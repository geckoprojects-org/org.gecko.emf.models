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
package net.opengis.gml.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.MultiSurfaceType#getSurfaceMember <em>Surface Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MultiSurfaceType#getSurfaceMembers <em>Surface Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getMultiSurfaceType()
 * @model extendedMetaData="name='MultiSurfaceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiSurfaceType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Surface Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.SurfacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a surface via the XLink-attributes or contains the surface element. A surface element is any element, which is substitutable for gml:AbstractSurface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Member</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getMultiSurfaceType_SurfaceMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='surfaceMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SurfacePropertyType> getSurfaceMember();

	/**
	 * Returns the value of the '<em><b>Surface Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of surfaces. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Members</em>' containment reference.
	 * @see #setSurfaceMembers(SurfaceArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getMultiSurfaceType_SurfaceMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='surfaceMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfaceArrayPropertyType getSurfaceMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MultiSurfaceType#getSurfaceMembers <em>Surface Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Members</em>' containment reference.
	 * @see #getSurfaceMembers()
	 * @generated
	 */
	void setSurfaceMembers(SurfaceArrayPropertyType value);

} // MultiSurfaceType
