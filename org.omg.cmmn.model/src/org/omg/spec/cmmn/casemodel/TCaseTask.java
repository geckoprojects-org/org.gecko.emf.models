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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCase Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tCaseTask defines the type of element "caseTask"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseTask#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRefExpression <em>Case Ref Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRef <em>Case Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseTask()
 * @model extendedMetaData="name='tCaseTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TCaseTask extends TTask {
	/**
	 * Returns the value of the '<em><b>Parameter Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mapping</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseTask_ParameterMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParameterMapping> getParameterMapping();

	/**
	 * Returns the value of the '<em><b>Case Ref Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 caseRefExpression is mutualy exclusive to caseRef and can be used to select a case 
	 *                 at runtime rather then specifying caseRef at design-time.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Ref Expression</em>' containment reference.
	 * @see #setCaseRefExpression(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseTask_CaseRefExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caseRefExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getCaseRefExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRefExpression <em>Case Ref Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Ref Expression</em>' containment reference.
	 * @see #getCaseRefExpression()
	 * @generated
	 */
	void setCaseRefExpression(TExpression value);

	/**
	 * Returns the value of the '<em><b>Case Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               caseRef refers a "case" element which is re-usable and can 
	 *               be imported via some other file. caseRef is mutually exclusive to "caseRefExpression"
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Ref</em>' attribute.
	 * @see #setCaseRef(QName)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTCaseTask_CaseRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='caseRef'"
	 * @generated
	 */
	QName getCaseRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRef <em>Case Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Ref</em>' attribute.
	 * @see #getCaseRef()
	 * @generated
	 */
	void setCaseRef(QName value);

} // TCaseTask
