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
package net.opengis.gml.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TopoPointType#getDirectedNode <em>Directed Node</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTopoPointType()
 * @model extendedMetaData="name='TopoPointType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoPointType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Directed Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedNode property element describes the boundary of topology edges and is used in the support of topological point features via the gml:TopoPoint expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included node is used: start ("-") or end ("+") node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Node</em>' containment reference.
	 * @see #setDirectedNode(DirectedNodePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoPointType_DirectedNode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedNode' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectedNodePropertyType getDirectedNode();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoPointType#getDirectedNode <em>Directed Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Node</em>' containment reference.
	 * @see #getDirectedNode()
	 * @generated
	 */
	void setDirectedNode(DirectedNodePropertyType value);

} // TopoPointType
