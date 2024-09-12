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
 * A representation of the model object '<em><b>Projected CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 2D coordinate reference system used to approximate the shape of the earth on a planar surface, but in such a way that the distortion that is inherent to the approximation is carefully controlled and known. Distortion correction is commonly applied to calculated bearings and distances to produce values that are a close match to actual field values. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.ProjectedCRSType#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getProjectedCRSType()
 * @model extendedMetaData="name='ProjectedCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProjectedCRSType extends AbstractGeneralDerivedCRSType {
	/**
	 * Returns the value of the '<em><b>Uses Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the Cartesian coordinate system used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #setUsesCartesianCS(CartesianCSRefType)
	 * @see net.opengis.gml.GMLPackage#getProjectedCRSType_UsesCartesianCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesCartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCSRefType getUsesCartesianCS();

	/**
	 * Sets the value of the '{@link net.opengis.gml.ProjectedCRSType#getUsesCartesianCS <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #getUsesCartesianCS()
	 * @generated
	 */
	void setUsesCartesianCS(CartesianCSRefType value);

} // ProjectedCRSType
