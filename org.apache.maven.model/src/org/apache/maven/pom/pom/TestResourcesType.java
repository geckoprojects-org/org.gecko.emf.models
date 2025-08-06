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
 * A representation of the model object '<em><b>Test Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.TestResourcesType#getTestResource <em>Test Resource</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getTestResourcesType()
 * @model extendedMetaData="name='testResources_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TestResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.maven.pom.pom.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Resource</em>' containment reference list.
	 * @see org.apache.maven.pom.pom.POMPackage#getTestResourcesType_TestResource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testResource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Resource> getTestResource();

} // TestResourcesType
