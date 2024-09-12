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

import org.isotc211._2005.gss.GMObjectPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Bounding Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Boundary enclosing the dataset expressed as the closed set of (x,y) coordinates of the polygon (last point replicates first point)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.EXBoundingPolygonType#getPolygon <em>Polygon</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getEXBoundingPolygonType()
 * @model extendedMetaData="name='EX_BoundingPolygon_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXBoundingPolygonType extends AbstractEXGeographicExtentType {
	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gss.GMObjectPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXBoundingPolygonType_Polygon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GMObjectPropertyType> getPolygon();

} // EXBoundingPolygonType
