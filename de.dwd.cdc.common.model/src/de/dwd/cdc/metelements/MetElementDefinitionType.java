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
package de.dwd.cdc.metelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Met Element Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.metelements.MetElementDefinitionType#getMetElement <em>Met Element</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.metelements.MetElementsPackage#getMetElementDefinitionType()
 * @model extendedMetaData="name='MetElementDefinition_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MetElementDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Met Element</b></em>' containment reference list.
	 * The list contents are of type {@link de.dwd.cdc.metelements.MetElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Met Element</em>' containment reference list.
	 * @see de.dwd.cdc.metelements.MetElementsPackage#getMetElementDefinitionType_MetElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MetElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetElementType> getMetElement();

} // MetElementDefinitionType
