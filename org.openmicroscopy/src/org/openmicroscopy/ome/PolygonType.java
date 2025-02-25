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
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.PolygonType#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getPolygonType()
 * @model extendedMetaData="name='Polygon_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolygonType extends Shape {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The points of the Polygon are defined as a list of comma
	 *               separated x,y coordinates seperated by spaces like "x1,y1 x2,y2 x3,y3" e.g.
	 *               "0,0 1,2 3,5" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getPolygonType_Points()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Points'"
	 * @generated
	 */
	String getPoints();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.PolygonType#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(String value);

} // PolygonType
