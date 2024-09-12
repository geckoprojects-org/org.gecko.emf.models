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
 * A representation of the model object '<em><b>Surface Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for an array of surface patches.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.SurfacePatchArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.SurfacePatchArrayPropertyType#getSurfacePatchGroup <em>Surface Patch Group</em>}</li>
 *   <li>{@link net.opengis.gml.SurfacePatchArrayPropertyType#getSurfacePatch <em>Surface Patch</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getSurfacePatchArrayPropertyType()
 * @model extendedMetaData="name='SurfacePatchArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SurfacePatchArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getSurfacePatchArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Surface Patch Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_SurfacePatch" element is the abstract head of the substituition group for all surface pach elements describing a continuous portion of a surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Patch Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getSurfacePatchArrayPropertyType_SurfacePatchGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='_SurfacePatch:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getSurfacePatchGroup();

	/**
	 * Returns the value of the '<em><b>Surface Patch</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractSurfacePatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_SurfacePatch" element is the abstract head of the substituition group for all surface pach elements describing a continuous portion of a surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Patch</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getSurfacePatchArrayPropertyType_SurfacePatch()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_SurfacePatch' namespace='##targetNamespace' group='_SurfacePatch:group'"
	 * @generated
	 */
	EList<AbstractSurfacePatchType> getSurfacePatch();

} // SurfacePatchArrayPropertyType
