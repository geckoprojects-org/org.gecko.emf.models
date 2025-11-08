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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A collection of reusable objects that are defined and may be used elsewhere in the BOM.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DefinitionsType#getStandards <em>Standards</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDefinitionsType()
 * @model extendedMetaData="name='definitionsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Standards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standards</em>' containment reference.
	 * @see #setStandards(StandardsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDefinitionsType_Standards()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standards' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardsType getStandards();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DefinitionsType#getStandards <em>Standards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standards</em>' containment reference.
	 * @see #getStandards()
	 * @generated
	 */
	void setStandards(StandardsType value);

} // DefinitionsType
