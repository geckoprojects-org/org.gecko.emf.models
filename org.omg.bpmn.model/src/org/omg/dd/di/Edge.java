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
package org.omg.dd.di;

import org.eclipse.emf.common.util.EList;

import org.omg.dd.dc.Point;

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
 *   <li>{@link org.omg.dd.di.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.dd.di.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.dd.di.Edge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 *
 * @see org.omg.dd.di.DiPackage#getEdge()
 * @model abstract="true"
 *        extendedMetaData="name='Edge' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Edge extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see org.omg.dd.di.DiPackage#getEdge_Source()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see org.omg.dd.di.DiPackage#getEdge_Target()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getTarget();

	/**
	 * Returns the value of the '<em><b>Waypoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.dd.dc.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoint</em>' containment reference list.
	 * @see org.omg.dd.di.DiPackage#getEdge_Waypoint()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='waypoint' namespace='http://www.omg.org/spec/DD/20100524/DI'"
	 * @generated
	 */
	EList<Point> getWaypoint();

} // Edge
