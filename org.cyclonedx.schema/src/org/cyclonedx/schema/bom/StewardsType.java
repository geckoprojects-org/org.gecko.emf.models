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
 * A representation of the model object '<em><b>Stewards Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.StewardsType#getSteward <em>Steward</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getStewardsType()
 * @model extendedMetaData="name='stewards_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StewardsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Steward</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.OrganizationOrIndividualType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steward</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getStewardsType_Steward()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='steward' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationOrIndividualType> getSteward();

} // StewardsType
