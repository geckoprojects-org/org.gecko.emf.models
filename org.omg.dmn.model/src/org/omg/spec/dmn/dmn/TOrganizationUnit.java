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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOrganization Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TOrganizationUnit#getDecisionMade <em>Decision Made</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TOrganizationUnit#getDecisionOwned <em>Decision Owned</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOrganizationUnit()
 * @model extendedMetaData="name='tOrganizationUnit' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TOrganizationUnit extends TBusinessContextElement {
	/**
	 * Returns the value of the '<em><b>Decision Made</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Made</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOrganizationUnit_DecisionMade()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionMade' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getDecisionMade();

	/**
	 * Returns the value of the '<em><b>Decision Owned</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Owned</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTOrganizationUnit_DecisionOwned()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionOwned' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getDecisionOwned();

} // TOrganizationUnit
