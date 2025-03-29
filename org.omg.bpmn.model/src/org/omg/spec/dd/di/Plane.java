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
package org.omg.spec.dd.di;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

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
 *   <li>{@link org.omg.spec.dd.di.Plane#getDiagramElementGroup <em>Diagram Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dd.di.Plane#getDiagramElement <em>Diagram Element</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dd.di.DIPackage#getPlane()
 * @model abstract="true"
 *        extendedMetaData="name='Plane' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Plane extends Node {
	/**
	 * Returns the value of the '<em><b>Diagram Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Element Group</em>' attribute list.
	 * @see org.omg.spec.dd.di.DIPackage#getPlane_DiagramElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DiagramElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDiagramElementGroup();

	/**
	 * Returns the value of the '<em><b>Diagram Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dd.di.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Element</em>' containment reference list.
	 * @see org.omg.spec.dd.di.DIPackage#getPlane_DiagramElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagramElement' namespace='##targetNamespace' group='DiagramElement:group'"
	 * @generated
	 */
	EList<DiagramElement> getDiagramElement();

} // Plane
