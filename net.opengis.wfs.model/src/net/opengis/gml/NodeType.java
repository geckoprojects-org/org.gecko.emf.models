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
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Its optional co-boundary is a set of connected directedEdges.  The orientation of one of these dirEdges is "+" if the Node is the "to" node of the Edge, and "-" if it is the "from" node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.NodeType#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml.NodeType#getPointProperty <em>Point Property</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getNodeType()
 * @model extendedMetaData="name='NodeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NodeType extends AbstractTopoPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Directed Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.DirectedEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed Edge</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getNodeType_DirectedEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directedEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedEdgePropertyType> getDirectedEdge();

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty 
	 * 			is the predefined property which can be used by GML Application Schemas whenever a GML Feature has a property with a value that 
	 * 			is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference.
	 * @see #setPointProperty(PointPropertyType)
	 * @see net.opengis.gml.GMLPackage#getNodeType_PointProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getPointProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.NodeType#getPointProperty <em>Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Property</em>' containment reference.
	 * @see #getPointProperty()
	 * @generated
	 */
	void setPointProperty(PointPropertyType value);

} // NodeType
