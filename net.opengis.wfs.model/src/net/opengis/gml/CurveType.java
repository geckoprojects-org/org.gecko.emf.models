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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Curve is a 1-dimensional primitive. Curves are continuous, connected, and have a measurable length in terms of the coordinate system. 
 * 				A curve is composed of one or more curve segments. Each curve segment within a curve may be defined using a different interpolation method. The curve segments are connected to one another, with the end point of each segment except the last being the start point of the next segment in the segment list.
 * 				The orientation of the curve is positive.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CurveType#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCurveType()
 * @model extendedMetaData="name='CurveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CurveType extends AbstractCurveType {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element encapsulates the segments of the curve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(CurveSegmentArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getCurveType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveSegmentArrayPropertyType getSegments();

	/**
	 * Sets the value of the '{@link net.opengis.gml.CurveType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(CurveSegmentArrayPropertyType value);

} // CurveType
