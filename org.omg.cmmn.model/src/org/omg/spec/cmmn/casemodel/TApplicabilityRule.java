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
 * A representation of the model object '<em><b>TApplicability Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getContextRef <em>Context Ref</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTApplicabilityRule()
 * @model extendedMetaData="name='tApplicabilityRule' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TApplicabilityRule extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTApplicabilityRule_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getCondition();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getCondition <em>Condition</em>}' containment reference.
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
	 *               contexRef refers a "caseFileItem" element
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Ref</em>' attribute.
	 * @see #setContextRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTApplicabilityRule_ContextRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='contextRef'"
	 * @generated
	 */
	String getContextRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getContextRef <em>Context Ref</em>}' attribute.
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
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTApplicabilityRule_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TApplicabilityRule
