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
 * A representation of the model object '<em><b>TCase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tCase defines the type of element "case".
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCase#getCaseFileModel <em>Case File Model</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCase#getCasePlanModel <em>Case Plan Model</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCase#getCaseRoles <em>Case Roles</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCase#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCase#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCase#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase()
 * @model extendedMetaData="name='tCase' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCase extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Case File Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case File Model</em>' containment reference.
	 * @see #setCaseFileModel(TCaseFile)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase_CaseFileModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseFileModel' namespace='##targetNamespace'"
	 * @generated
	 */
	TCaseFile getCaseFileModel();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCase#getCaseFileModel <em>Case File Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case File Model</em>' containment reference.
	 * @see #getCaseFileModel()
	 * @generated
	 */
	void setCaseFileModel(TCaseFile value);

	/**
	 * Returns the value of the '<em><b>Case Plan Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Plan Model</em>' containment reference.
	 * @see #setCasePlanModel(TStage)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase_CasePlanModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='casePlanModel' namespace='##targetNamespace'"
	 * @generated
	 */
	TStage getCasePlanModel();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCase#getCasePlanModel <em>Case Plan Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Plan Model</em>' containment reference.
	 * @see #getCasePlanModel()
	 * @generated
	 */
	void setCasePlanModel(TStage value);

	/**
	 * Returns the value of the '<em><b>Case Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Roles</em>' containment reference.
	 * @see #setCaseRoles(TCaseRoles)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase_CaseRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	TCaseRoles getCaseRoles();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCase#getCaseRoles <em>Case Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Roles</em>' containment reference.
	 * @see #getCaseRoles()
	 * @generated
	 */
	void setCaseRoles(TCaseRoles value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TCaseParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCaseParameter> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TCaseParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCaseParameter> getOutput();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCase_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TCase
