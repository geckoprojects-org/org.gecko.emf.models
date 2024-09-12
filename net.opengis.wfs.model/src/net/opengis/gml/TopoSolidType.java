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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The topological boundary of a TopoSolid consists of a set of directed faces. Note that all faces associated with the TopoSolid, including dangling faces, appear in the boundary. The coboundary of a TopoSolid is empty and hence requires no representation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopoSolidType#getDirectedFace <em>Directed Face</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopoSolidType()
 * @model extendedMetaData="name='TopoSolidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoSolidType extends AbstractTopoPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Directed Face</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.DirectedFacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed Face</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTopoSolidType_DirectedFace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedFace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedFacePropertyType> getDirectedFace();

} // TopoSolidType
