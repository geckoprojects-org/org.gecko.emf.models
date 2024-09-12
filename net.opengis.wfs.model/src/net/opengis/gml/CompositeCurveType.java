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
 * A representation of the model object '<em><b>Composite Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CompositeCurve is defined by a sequence of (orientable) curves such that the each curve in the sequence terminates at the start point of the subsequent curve in the list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CompositeCurveType#getCurveMember <em>Curve Member</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCompositeCurveType()
 * @model extendedMetaData="name='CompositeCurveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositeCurveType extends AbstractCurveType {
	/**
	 * Returns the value of the '<em><b>Curve Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.CurvePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element references or contains one curve in the composite curve. The curves are contiguous, the collection of curves is ordered.
	 * NOTE: This definition allows for a nested structure, i.e. a CompositeCurve may use, for example, another CompositeCurve as a curve member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getCompositeCurveType_CurveMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='curveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CurvePropertyType> getCurveMember();

} // CompositeCurveType
