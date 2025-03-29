/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.di;

import org.eclipse.emf.common.util.EList;

import org.omg.spec.dmn.dc.Point;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.di.Edge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.di.DIPackage#getEdge()
 * @model abstract="true"
 *        extendedMetaData="name='Edge' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Edge extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Waypoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dc.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waypoint</em>' containment reference list.
	 * @see org.omg.spec.dmn.di.DIPackage#getEdge_Waypoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='waypoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Point> getWaypoint();

} // Edge
