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
 * A representation of the model object '<em><b>TTask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTask#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTask#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TTask#isIsBlocking <em>Is Blocking</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTask()
 * @model extendedMetaData="name='tTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTask extends TPlanItemDefinition {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TCaseParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTask_Input()
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
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTask_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCaseParameter> getOutput();

	/**
	 * Returns the value of the '<em><b>Is Blocking</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Blocking</em>' attribute.
	 * @see #isSetIsBlocking()
	 * @see #unsetIsBlocking()
	 * @see #setIsBlocking(boolean)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTTask_IsBlocking()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isBlocking'"
	 * @generated
	 */
	boolean isIsBlocking();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TTask#isIsBlocking <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Blocking</em>' attribute.
	 * @see #isSetIsBlocking()
	 * @see #unsetIsBlocking()
	 * @see #isIsBlocking()
	 * @generated
	 */
	void setIsBlocking(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.cmmn.casemodel.TTask#isIsBlocking <em>Is Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBlocking()
	 * @see #isIsBlocking()
	 * @see #setIsBlocking(boolean)
	 * @generated
	 */
	void unsetIsBlocking();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.cmmn.casemodel.TTask#isIsBlocking <em>Is Blocking</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Blocking</em>' attribute is set.
	 * @see #unsetIsBlocking()
	 * @see #isIsBlocking()
	 * @see #setIsBlocking(boolean)
	 * @generated
	 */
	boolean isSetIsBlocking();

} // TTask
