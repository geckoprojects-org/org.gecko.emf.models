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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRepetition Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tRepetitionRule defines the type of element "repetitionRule".
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTRepetitionRule()
 * @model extendedMetaData="name='tRepetitionRule' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TRepetitionRule extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTRepetitionRule_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getCondition();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TExpression value);

	/**
	 * Returns the value of the '<em><b>Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               contextRef MUST refer a CaseFileItem if specified. 
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Ref</em>' attribute.
	 * @see #setContextRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTRepetitionRule_ContextRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='contextRef'"
	 * @generated
	 */
	String getContextRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getContextRef <em>Context Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Ref</em>' attribute.
	 * @see #getContextRef()
	 * @generated
	 */
	void setContextRef(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTRepetitionRule_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TRepetitionRule
