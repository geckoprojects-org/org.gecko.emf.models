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
 * A representation of the model object '<em><b>TCriterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             Criterion is the abstract base class for EntryCriterion and ExitCriterion. It is
 *             primarily used for CMMN Diagram Interchange (CMMN DI).
 *           
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCriterion#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCriterion#getSentryRef <em>Sentry Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCriterion()
 * @model abstract="true"
 *        extendedMetaData="name='tCriterion' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCriterion extends TCmmnElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCriterion_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCriterion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sentry Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               sentryRef refers to an existing Sentry in this casePlanModel
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sentry Ref</em>' attribute.
	 * @see #setSentryRef(String)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCriterion_SentryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='sentryRef'"
	 * @generated
	 */
	String getSentryRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCriterion#getSentryRef <em>Sentry Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentry Ref</em>' attribute.
	 * @see #getSentryRef()
	 * @generated
	 */
	void setSentryRef(String value);

} // TCriterion
