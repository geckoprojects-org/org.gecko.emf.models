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
 * A representation of the model object '<em><b>EX Spatial Temporal Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extent with respect to date and time
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.EXSpatialTemporalExtentType#getSpatialExtent <em>Spatial Extent</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getEXSpatialTemporalExtentType()
 * @model extendedMetaData="name='EX_SpatialTemporalExtent_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXSpatialTemporalExtentType extends EXTemporalExtentType {
	/**
	 * Returns the value of the '<em><b>Spatial Extent</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.EXGeographicExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Extent</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXSpatialTemporalExtentType_SpatialExtent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='spatialExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXGeographicExtentPropertyType> getSpatialExtent();

} // EXSpatialTemporalExtentType
