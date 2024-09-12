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
 * A representation of the model object '<em><b>Multi Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.MultiCurveType#getCurveMember <em>Curve Member</em>}</li>
 *   <li>{@link net.opengis.gml.gml.MultiCurveType#getCurveMembers <em>Curve Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getMultiCurveType()
 * @model extendedMetaData="name='MultiCurveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiCurveType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Curve Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.CurvePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Member</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getMultiCurveType_CurveMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='curveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CurvePropertyType> getCurveMember();

	/**
	 * Returns the value of the '<em><b>Curve Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of curves. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Members</em>' containment reference.
	 * @see #setCurveMembers(CurveArrayPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getMultiCurveType_CurveMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='curveMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveArrayPropertyType getCurveMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.MultiCurveType#getCurveMembers <em>Curve Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Members</em>' containment reference.
	 * @see #getCurveMembers()
	 * @generated
	 */
	void setCurveMembers(CurveArrayPropertyType value);

} // MultiCurveType
