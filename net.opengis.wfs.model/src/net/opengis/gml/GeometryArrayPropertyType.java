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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for an array of geometry elements. The elements are always contained in the array property, 
 * 			referencing geometry elements or arrays of geometry elements is not supported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GeometryArrayPropertyType#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link net.opengis.gml.GeometryArrayPropertyType#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGeometryArrayPropertyType()
 * @model extendedMetaData="name='GeometryArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeometryArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_Geometry" element is the abstract head of the substituition group for all geometry elements of GML 3. This 
	 * 			includes pre-defined and user-defined geometry elements. Any geometry element must be a direct or indirect extension/restriction 
	 * 			of AbstractGeometryType and must be directly or indirectly in the substitution group of "_Geometry".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getGeometryArrayPropertyType_GeometryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_Geometry:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_Geometry" element is the abstract head of the substituition group for all geometry elements of GML 3. This 
	 * 			includes pre-defined and user-defined geometry elements. Any geometry element must be a direct or indirect extension/restriction 
	 * 			of AbstractGeometryType and must be directly or indirectly in the substitution group of "_Geometry".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getGeometryArrayPropertyType_Geometry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Geometry' namespace='##targetNamespace' group='_Geometry:group'"
	 * @generated
	 */
	EList<AbstractGeometryType> getGeometry();

} // GeometryArrayPropertyType
