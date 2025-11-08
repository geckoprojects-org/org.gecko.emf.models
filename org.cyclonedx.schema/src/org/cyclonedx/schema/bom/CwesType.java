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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cwes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                             List of Common Weaknesses Enumerations (CWEs) codes that describes this vulnerability.
 *                             For example 399 (of https://cwe.mitre.org/data/definitions/399.html)
 *                         
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CwesType#getCwe <em>Cwe</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCwesType()
 * @model extendedMetaData="name='cwes_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CwesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cwe</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwe</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCwesType_Cwe()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='cwe' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getCwe();

} // CwesType
