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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAuthority Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredDecision <em>Required Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredInput <em>Required Input</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredAuthority <em>Required Authority</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAuthorityRequirement()
 * @model extendedMetaData="name='tAuthorityRequirement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TAuthorityRequirement extends TDMNElement {
	/**
	 * Returns the value of the '<em><b>Required Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Decision</em>' containment reference.
	 * @see #setRequiredDecision(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAuthorityRequirement_RequiredDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getRequiredDecision();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredDecision <em>Required Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Decision</em>' containment reference.
	 * @see #getRequiredDecision()
	 * @generated
	 */
	void setRequiredDecision(TDMNElementReference value);

	/**
	 * Returns the value of the '<em><b>Required Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Input</em>' containment reference.
	 * @see #setRequiredInput(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAuthorityRequirement_RequiredInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredInput' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getRequiredInput();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredInput <em>Required Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Input</em>' containment reference.
	 * @see #getRequiredInput()
	 * @generated
	 */
	void setRequiredInput(TDMNElementReference value);

	/**
	 * Returns the value of the '<em><b>Required Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Authority</em>' containment reference.
	 * @see #setRequiredAuthority(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAuthorityRequirement_RequiredAuthority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredAuthority' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getRequiredAuthority();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredAuthority <em>Required Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Authority</em>' containment reference.
	 * @see #getRequiredAuthority()
	 * @generated
	 */
	void setRequiredAuthority(TDMNElementReference value);

} // TAuthorityRequirement
