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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cipher Suites Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CipherSuitesType#getCipherSuite <em>Cipher Suite</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCipherSuitesType()
 * @model extendedMetaData="name='cipherSuites_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CipherSuitesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cipher Suite</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.CipherSuiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipher Suite</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCipherSuitesType_CipherSuite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cipherSuite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CipherSuiteType> getCipherSuite();

} // CipherSuitesType
