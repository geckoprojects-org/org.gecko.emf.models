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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for an array of surfaces. The elements are always contained in the array property, referencing geometry elements or arrays of geometry elements is not supported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.SurfaceArrayPropertyType#getSurfaceGroup <em>Surface Group</em>}</li>
 *   <li>{@link net.opengis.gml.SurfaceArrayPropertyType#getSurface <em>Surface</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getSurfaceArrayPropertyType()
 * @model extendedMetaData="name='SurfaceArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SurfaceArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_Surface" element is the abstract head of the substituition group for all (continuous) surface elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getSurfaceArrayPropertyType_SurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_Surface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Surface</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractSurfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_Surface" element is the abstract head of the substituition group for all (continuous) surface elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getSurfaceArrayPropertyType_Surface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Surface' namespace='##targetNamespace' group='_Surface:group'"
	 * @generated
	 */
	EList<AbstractSurfaceType> getSurface();

} // SurfaceArrayPropertyType
