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
 * A representation of the model object '<em><b>Topo Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TopoSolidType#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoSolidType#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoSolidType#getSolidProperty <em>Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoSolidType#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link net.opengis.gml.gml.TopoSolidType#isUniversal <em>Universal</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTopoSolidType()
 * @model extendedMetaData="name='TopoSolidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoSolidType extends AbstractTopoPrimitiveType {
	/**
	 * Returns the value of the '<em><b>Isolated</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.NodeOrEdgePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTopoSolidType_Isolated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isolated' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodeOrEdgePropertyType> getIsolated();

	/**
	 * Returns the value of the '<em><b>Directed Face</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.DirectedFacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:directedFace property element describes the boundary of topology solids, in the coBoundary of topology edges and is used in the support of surface features via the gml:TopoSurface expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included face is used i.e. inward or outward with respect to the surface normal in any geometric realisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Face</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTopoSolidType_DirectedFace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedFace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedFacePropertyType> getDirectedFace();

	/**
	 * Returns the value of the '<em><b>Solid Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a solid via the XLink-attributes or contains the solid element. solidProperty is the predefined property which may be used by GML Application Schemas whenever a GML feature has a property with a value that is substitutable for AbstractSolid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Property</em>' containment reference.
	 * @see #setSolidProperty(SolidPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoSolidType_SolidProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='solidProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getSolidProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoSolidType#getSolidProperty <em>Solid Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Property</em>' containment reference.
	 * @see #getSolidProperty()
	 * @generated
	 */
	void setSolidProperty(SolidPropertyType value);

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
	 * @see net.opengis.gml.gml.GMLPackage#getTopoSolidType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoSolidType#getAggregationType <em>Aggregation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.gml.TopoSolidType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TopoSolidType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
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
	 * A gml:TopoSolid must indicate whether it is a universal topo-solid or not, to ensure a lossless topology representation as defined by Kuijpers, et. al. (see OGC 05-102 Topology IPR). The optional universal attribute of type boolean is used to indicate this and the default is fault. NOTE The universal topo-solid is normally not part of any feature, and is used to represent the unbounded portion of the data set. Its interior boundary (it has no exterior boundary) would normally be considered the exterior boundary of the data set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Universal</em>' attribute.
	 * @see #isSetUniversal()
	 * @see #unsetUniversal()
	 * @see #setUniversal(boolean)
	 * @see net.opengis.gml.gml.GMLPackage#getTopoSolidType_Universal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='universal'"
	 * @generated
	 */
	boolean isUniversal();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.TopoSolidType#isUniversal <em>Universal</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml.gml.TopoSolidType#isUniversal <em>Universal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniversal()
	 * @see #isUniversal()
	 * @see #setUniversal(boolean)
	 * @generated
	 */
	void unsetUniversal();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.TopoSolidType#isUniversal <em>Universal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Universal</em>' attribute is set.
	 * @see #unsetUniversal()
	 * @see #isUniversal()
	 * @see #setUniversal(boolean)
	 * @generated
	 */
	boolean isSetUniversal();

} // TopoSolidType
