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
 * A representation of the model object '<em><b>TInformation Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredDecision <em>Required Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredInput <em>Required Input</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTInformationRequirement()
 * @model extendedMetaData="name='tInformationRequirement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TInformationRequirement extends TDMNElement {
	/**
	 * Returns the value of the '<em><b>Required Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Decision</em>' containment reference.
	 * @see #setRequiredDecision(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTInformationRequirement_RequiredDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getRequiredDecision();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredDecision <em>Required Decision</em>}' containment reference.
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
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTInformationRequirement_RequiredInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredInput' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getRequiredInput();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredInput <em>Required Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Input</em>' containment reference.
	 * @see #getRequiredInput()
	 * @generated
	 */
	void setRequiredInput(TDMNElementReference value);

} // TInformationRequirement
