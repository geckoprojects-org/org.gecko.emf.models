/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DependenciesType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DependenciesType1#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDependenciesType1()
 * @model extendedMetaData="name='dependenciesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DependenciesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependenciesType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.DependencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the direct dependencies of a component or service. Components or services
	 *                         that do not have their own dependencies must be declared as empty elements within the graph.
	 *                         Components or services that are not represented in the dependency graph may have unknown
	 *                         dependencies. It is recommended that implementations assume this to be opaque and not an
	 *                         indicator of a object being dependency-free. It is recommended to leverage compositions to
	 *                         indicate unknown dependency graphs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDependenciesType1_Dependency()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependency' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DependencyType> getDependency();

} // DependenciesType1
