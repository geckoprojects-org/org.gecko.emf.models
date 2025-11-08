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
 * A representation of the model object '<em><b>Identifiers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.IdentifiersType#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentifiersType()
 * @model extendedMetaData="name='identifiers_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifiersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         Cipher suite identifier. Examples include 0xC0 and 0x9E.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getIdentifiersType_Identifier()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIdentifier();

} // IdentifiersType
