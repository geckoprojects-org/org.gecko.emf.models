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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 4.0.0+
 * Section for management of default plugin information for use in a group of POMs.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.PluginManagement#getPlugins <em>Plugins</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getPluginManagement()
 * @model extendedMetaData="name='PluginManagement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PluginManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 4.0.0+
	 * The list of plugins to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference.
	 * @see #setPlugins(PluginsType3)
	 * @see org.apache.maven.pom.pom.POMPackage#getPluginManagement_Plugins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plugins' namespace='##targetNamespace'"
	 * @generated
	 */
	PluginsType3 getPlugins();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.PluginManagement#getPlugins <em>Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugins</em>' containment reference.
	 * @see #getPlugins()
	 * @generated
	 */
	void setPlugins(PluginsType3 value);

} // PluginManagement
