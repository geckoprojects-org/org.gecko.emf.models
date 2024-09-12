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
 * A representation of the model object '<em><b>Topo Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The end Node of each directedEdge of a TopoCurveType
 * is the start Node of the next directedEdge of the TopoCurveType in document order.  The TopoCurve type and element represent a homogeneous topological expression, a list of directed edges, which if realised are isomorphic to a geometric curve primitive. The intended use of TopoCurve is to appear within a line feature instance to express the structural and geometric relationships of this line to other features via the shared edge definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopoCurveType#getDirectedEdge <em>Directed Edge</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopoCurveType()
 * @model extendedMetaData="name='TopoCurveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoCurveType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Directed Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.DirectedEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed Edge</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTopoCurveType_DirectedEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedEdgePropertyType> getDirectedEdge();

} // TopoCurveType
