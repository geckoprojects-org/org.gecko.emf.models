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
 * A representation of the model object '<em><b>TBusiness Knowledge Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getEncapsulatedLogic <em>Encapsulated Logic</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getKnowledgeRequirement <em>Knowledge Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTBusinessKnowledgeModel()
 * @model extendedMetaData="name='tBusinessKnowledgeModel' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TBusinessKnowledgeModel extends TInvocable {
	/**
	 * Returns the value of the '<em><b>Encapsulated Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Logic</em>' containment reference.
	 * @see #setEncapsulatedLogic(TFunctionDefinition)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTBusinessKnowledgeModel_EncapsulatedLogic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encapsulatedLogic' namespace='##targetNamespace'"
	 * @generated
	 */
	TFunctionDefinition getEncapsulatedLogic();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getEncapsulatedLogic <em>Encapsulated Logic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulated Logic</em>' containment reference.
	 * @see #getEncapsulatedLogic()
	 * @generated
	 */
	void setEncapsulatedLogic(TFunctionDefinition value);

	/**
	 * Returns the value of the '<em><b>Knowledge Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TKnowledgeRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Requirement</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTBusinessKnowledgeModel_KnowledgeRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='knowledgeRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TKnowledgeRequirement> getKnowledgeRequirement();

	/**
	 * Returns the value of the '<em><b>Authority Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TAuthorityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority Requirement</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTBusinessKnowledgeModel_AuthorityRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorityRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TAuthorityRequirement> getAuthorityRequirement();

} // TBusinessKnowledgeModel
