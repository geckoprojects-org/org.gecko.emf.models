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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * gml:LineStringSegmentArrayPropertyType provides a container for line strings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.LineStringSegmentArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.LineStringSegmentArrayPropertyType#getLineStringSegment <em>Line String Segment</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getLineStringSegmentArrayPropertyType()
 * @model extendedMetaData="name='LineStringSegmentArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineStringSegmentArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getLineStringSegmentArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Line String Segment</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.LineStringSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LineStringSegment is a curve segment that is defined by two or more control points including the start and end point, with linear interpolation between them.
	 * The content model follows the general pattern for the encoding of curve segments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line String Segment</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getLineStringSegmentArrayPropertyType_LineStringSegment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStringSegment' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LineStringSegmentType> getLineStringSegment();

} // LineStringSegmentArrayPropertyType
