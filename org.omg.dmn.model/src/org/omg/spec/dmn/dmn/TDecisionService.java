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
 * A representation of the model object '<em><b>TDecision Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionService#getOutputDecision <em>Output Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionService#getEncapsulatedDecision <em>Encapsulated Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionService#getInputDecision <em>Input Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecisionService#getInputData <em>Input Data</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionService()
 * @model extendedMetaData="name='tDecisionService' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDecisionService extends TInvocable {
	/**
	 * Returns the value of the '<em><b>Output Decision</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Decision</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionService_OutputDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getOutputDecision();

	/**
	 * Returns the value of the '<em><b>Encapsulated Decision</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Decision</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionService_EncapsulatedDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encapsulatedDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getEncapsulatedDecision();

	/**
	 * Returns the value of the '<em><b>Input Decision</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Decision</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionService_InputDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getInputDecision();

	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecisionService_InputData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getInputData();

} // TDecisionService
