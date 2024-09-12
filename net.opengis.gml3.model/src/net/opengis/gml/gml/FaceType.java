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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Face Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.FaceType#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FaceType#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FaceType#getDirectedTopoSolid <em>Directed Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FaceType#getSurfaceProperty <em>Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FaceType#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FaceType#isUniversal <em>Universal</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getFaceType()
 * @model extendedMetaData="name='FaceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FaceType extends AbstractTopoPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Isolated</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.NodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getFaceType_Isolated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isolated' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodePropertyType> getIsolated();

	/**
	 * Returns the value of the '<em><b>Directed Edge</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.DirectedEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A gml:directedEdge property element describes the boundary of topology faces, the coBoundary of topology nodes and is used in the support of topological line features via the gml:TopoCurve expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included edge is used, i.e. forward or reverse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Edge</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getFaceType_DirectedEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedEdgePropertyType> getDirectedEdge();

	/**
	 * Returns the value of the '<em><b>Directed Topo Solid</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.DirectedTopoSolidPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:directedSolid property element describes the coBoundary of topology faces and is used in the support of volume features via the gml:TopoVolume expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included solid appears in the face coboundary. In the context of a gml:TopoVolume the orientation attribute has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Topo Solid</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getFaceType_DirectedTopoSolid()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='directedTopoSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedTopoSolidPropertyType> getDirectedTopoSolid();

	/**
	 * Returns the value of the '<em><b>Surface Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a surface via the XLink-attributes or contains the surface element. surfaceProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSurface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surface Property</em>' containment reference.
	 * @see #setSurfaceProperty(SurfacePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getFaceType_SurfaceProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='surfaceProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getSurfaceProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FaceType#getSurfaceProperty <em>Surface Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Property</em>' containment reference.
	 * @see #getSurfaceProperty()
	 * @generated
	 */
	void setSurfaceProperty(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.gml.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml.gml.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml.gml.GMLPackage#getFaceType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FaceType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml.gml.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.FaceType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.FaceType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

	/**
	 * Returns the value of the '<em><b>Universal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the topological representation exists an unbounded manifold (e.g. Euclidean plane), a gml:Face must indicate whether it is a universal face or not, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR). The optional universal attribute of type boolean is used to indicate this. NOTE The universal face is normally not part of any feature, and is used to represent the unbounded portion of the data set. Its interior boundary (it has no exterior boundary) would normally be considered the exterior boundary of the map represented by the data set. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Universal</em>' attribute.
	 * @see #isSetUniversal()
	 * @see #unsetUniversal()
	 * @see #setUniversal(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getFaceType_Universal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='universal'"
	 * @generated
	 */
	boolean isUniversal();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.FaceType#isUniversal <em>Universal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universal</em>' attribute.
	 * @see #isSetUniversal()
	 * @see #unsetUniversal()
	 * @see #isUniversal()
	 * @generated
	 */
	void setUniversal(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.FaceType#isUniversal <em>Universal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniversal()
	 * @see #isUniversal()
	 * @see #setUniversal(boolean)
	 * @generated
	 */
	void unsetUniversal();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.FaceType#isUniversal <em>Universal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Universal</em>' attribute is set.
	 * @see #unsetUniversal()
	 * @see #isUniversal()
	 * @see #setUniversal(boolean)
	 * @generated
	 */
	boolean isSetUniversal();

} // FaceType
