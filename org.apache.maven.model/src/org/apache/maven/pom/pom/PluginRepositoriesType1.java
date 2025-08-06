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
package org.apache.maven.pom.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Repositories Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.PluginRepositoriesType1#getPluginRepository <em>Plugin Repository</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getPluginRepositoriesType1()
 * @model extendedMetaData="name='pluginRepositories_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PluginRepositoriesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugin Repository</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom.pom.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Repository</em>' containment reference list.
	 * @see org.apache.maven.pom.pom.POMPackage#getPluginRepositoriesType1_PluginRepository()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pluginRepository' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Repository> getPluginRepository();

} // PluginRepositoriesType1
