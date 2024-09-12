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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.dd.di.Plane#getPlaneElement <em>Plane Element</em>}</li>
 * </ul>
 *
 * @see org.omg.dd.di.DiPackage#getPlane()
 * @model abstract="true"
 *        extendedMetaData="name='Plane' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Plane extends Node {
	/**
	 * Returns the value of the '<em><b>Plane Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.dd.di.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane Element</em>' containment reference list.
	 * @see org.omg.dd.di.DiPackage#getPlane_PlaneElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagramElement' namespace='http://www.omg.org/spec/DD/20100524/DI' group='http://www.omg.org/spec/DD/20100524/DI#DiagramElement'"
	 * @generated
	 */
	EList<DiagramElement> getPlaneElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * planeElement->forAll(oclIsKindOf(Shape) or oclIsKindOf(Edge))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean plane_element_type(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Plane
