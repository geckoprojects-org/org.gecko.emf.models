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
 * A representation of the model object '<em><b>TDecision Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         tDecisionTask defines the type of element "decision"
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRefExpression <em>Decision Ref Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRef <em>Decision Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecisionTask()
 * @model extendedMetaData="name='tDecisionTask' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDecisionTask extends TTask {
	/**
	 * Returns the value of the '<em><b>Parameter Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.cmmn.casemodel.TParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mapping</em>' containment reference list.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecisionTask_ParameterMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TParameterMapping> getParameterMapping();

	/**
	 * Returns the value of the '<em><b>Decision Ref Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 decisionRefExpression is mutually exclusive to decisionRef. It allows the selection of a
	 *                 decision at runtime via an expression rather then at design time with decisionRef.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Ref Expression</em>' containment reference.
	 * @see #setDecisionRefExpression(TExpression)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecisionTask_DecisionRefExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionRefExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getDecisionRefExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRefExpression <em>Decision Ref Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Ref Expression</em>' containment reference.
	 * @see #getDecisionRefExpression()
	 * @generated
	 */
	void setDecisionRefExpression(TExpression value);

	/**
	 * Returns the value of the '<em><b>Decision Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               decisionRef refers a "decision" element which is re-usable and can
	 *               be imported via some other file. decisionRef is mutually exclusive to decisionRefExpression
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Ref</em>' attribute.
	 * @see #setDecisionRef(QName)
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#getTDecisionTask_DecisionRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='decisionRef'"
	 * @generated
	 */
	QName getDecisionRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRef <em>Decision Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Ref</em>' attribute.
	 * @see #getDecisionRef()
	 * @generated
	 */
	void setDecisionRef(QName value);

} // TDecisionTask
