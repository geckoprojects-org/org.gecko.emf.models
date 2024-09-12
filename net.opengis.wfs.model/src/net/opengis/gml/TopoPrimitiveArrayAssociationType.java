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
 * A representation of the model object '<em><b>Topo Primitive Array Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type supports embedding an array of topological primitives in a TopoComplex
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopoPrimitiveArrayAssociationType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.TopoPrimitiveArrayAssociationType#getTopoPrimitiveGroup <em>Topo Primitive Group</em>}</li>
 *   <li>{@link net.opengis.gml.TopoPrimitiveArrayAssociationType#getTopoPrimitive <em>Topo Primitive</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopoPrimitiveArrayAssociationType()
 * @model extendedMetaData="name='TopoPrimitiveArrayAssociationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoPrimitiveArrayAssociationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getTopoPrimitiveArrayAssociationType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Topo Primitive Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substitution group branch for Topo Primitives, used by TopoPrimitiveArrayAssociationType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Primitive Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getTopoPrimitiveArrayAssociationType_TopoPrimitiveGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='_TopoPrimitive:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getTopoPrimitiveGroup();

	/**
	 * Returns the value of the '<em><b>Topo Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractTopoPrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substitution group branch for Topo Primitives, used by TopoPrimitiveArrayAssociationType
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Primitive</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getTopoPrimitiveArrayAssociationType_TopoPrimitive()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_TopoPrimitive' namespace='##targetNamespace' group='_TopoPrimitive:group'"
	 * @generated
	 */
	EList<AbstractTopoPrimitiveType> getTopoPrimitive();

} // TopoPrimitiveArrayAssociationType
