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
 * A representation of the model object '<em><b>Multi Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.MultiPointType#getPointMember <em>Point Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MultiPointType#getPointMembers <em>Point Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getMultiPointType()
 * @model extendedMetaData="name='MultiPointType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiPointType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Point Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a Point via the XLink-attributes or contains the Point element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Member</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getMultiPointType_PointMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointPropertyType> getPointMember();

	/**
	 * Returns the value of the '<em><b>Point Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of points. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Members</em>' containment reference.
	 * @see #setPointMembers(PointArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getMultiPointType_PointMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	PointArrayPropertyType getPointMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MultiPointType#getPointMembers <em>Point Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Members</em>' containment reference.
	 * @see #getPointMembers()
	 * @generated
	 */
	void setPointMembers(PointArrayPropertyType value);

} // MultiPointType
