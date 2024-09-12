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
 * A representation of the model object '<em><b>Bag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A non-abstract generic collection type that can be used as a document element for a collection of any GML types - Geometries, Topologies, Features ...
 * 
 * FeatureCollections may only contain Features.  GeometryCollections may only contain Geometrys.  Bags are less constrained  they must contain objects that are substitutable for gml:_Object.  This may mix several levels, including Features, Definitions, Dictionaries, Geometries etc.  
 * 
 * The content model would ideally be 
 *    member 0..*
 *    members 0..1
 *    member 0..*
 * for maximum flexibility in building a collection from both homogeneous and distinct components: 
 * included "member" elements each contain a single Object
 * an included "members" element contains a set of Objects 
 * 
 * However, this is non-deterministic, thus prohibited by XSD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.BagType#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.gml.BagType#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getBagType()
 * @model extendedMetaData="name='BagType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BagType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AssociationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getBagType_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AssociationType> getMember();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference.
	 * @see #setMembers(ArrayAssociationType)
	 * @see net.opengis.gml.GMLPackage#getBagType_Members()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='members' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayAssociationType getMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.BagType#getMembers <em>Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members</em>' containment reference.
	 * @see #getMembers()
	 * @generated
	 */
	void setMembers(ArrayAssociationType value);

} // BagType
