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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Vector Spatial Representation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the vector spatial objects in the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDVectorSpatialRepresentationType#getTopologyLevel <em>Topology Level</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDVectorSpatialRepresentationType#getGeometricObjects <em>Geometric Objects</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDVectorSpatialRepresentationType()
 * @model extendedMetaData="name='MD_VectorSpatialRepresentation_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDVectorSpatialRepresentationType extends AbstractMDSpatialRepresentationType {
	/**
	 * Returns the value of the '<em><b>Topology Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Level</em>' containment reference.
	 * @see #setTopologyLevel(MDTopologyLevelCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDVectorSpatialRepresentationType_TopologyLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topologyLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	MDTopologyLevelCodePropertyType getTopologyLevel();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDVectorSpatialRepresentationType#getTopologyLevel <em>Topology Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Level</em>' containment reference.
	 * @see #getTopologyLevel()
	 * @generated
	 */
	void setTopologyLevel(MDTopologyLevelCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Geometric Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDGeometricObjectsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Objects</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDVectorSpatialRepresentationType_GeometricObjects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometricObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDGeometricObjectsPropertyType> getGeometricObjects();

} // MDVectorSpatialRepresentationType
