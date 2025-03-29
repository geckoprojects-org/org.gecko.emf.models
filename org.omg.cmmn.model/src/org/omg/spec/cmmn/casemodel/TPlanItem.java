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
package org.omg.spec.cmmn.casemodel;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPlan Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItem#getItemControl <em>Item Control</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItem#getEntryCriterion <em>Entry Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItem#getExitCriterion <em>Exit Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItem#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TPlanItem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItem()
 * @model extendedMetaData="name='tPlanItem' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPlanItem extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Item Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Control</em>' containment reference.
	 * @see #setItemControl(TPlanItemControl)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItem_ItemControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemControl' namespace='##targetNamespace'"
	 * @generated
	 */
	TPlanItemControl getItemControl();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getItemControl <em>Item Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Control</em>' containment reference.
	 * @see #getItemControl()
	 * @generated
	 */
	void setItemControl(TPlanItemControl value);

	/**
	 * Returns the value of the '<em><b>Entry Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TEntryCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Criterion</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItem_EntryCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entryCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEntryCriterion> getEntryCriterion();

	/**
	 * Returns the value of the '<em><b>Exit Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TExitCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Criterion</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItem_ExitCriterion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exitCriterion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TExitCriterion> getExitCriterion();

	/**
	 * Returns the value of the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               definitionRef refers a "planItemDefinition" element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Ref</em>' attribute.
	 * @see #setDefinitionRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItem_DefinitionRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='definitionRef'"
	 * @generated
	 */
	String getDefinitionRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getDefinitionRef <em>Definition Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Ref</em>' attribute.
	 * @see #getDefinitionRef()
	 * @generated
	 */
	void setDefinitionRef(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTPlanItem_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TPlanItem
