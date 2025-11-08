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
 * A representation of the model object '<em><b>Algorithms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AlgorithmsType#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmsType()
 * @model extendedMetaData="name='algorithms_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AlgorithmsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The bom-ref to algorithm cryptographic asset.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAlgorithmsType_Algorithm()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='element' name='algorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAlgorithm();

} // AlgorithmsType
