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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDecision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getAllowedAnswers <em>Allowed Answers</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getInformationRequirement <em>Information Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getKnowledgeRequirement <em>Knowledge Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getSupportedObjective <em>Supported Objective</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getImpactedPerformanceIndicator <em>Impacted Performance Indicator</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getDecisionMaker <em>Decision Maker</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getDecisionOwner <em>Decision Owner</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getUsingProcess <em>Using Process</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getUsingTask <em>Using Task</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TDecision#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision()
 * @model extendedMetaData="name='tDecision' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TDecision extends TDRGElement {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_Question()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecision#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Answers</em>' attribute.
	 * @see #setAllowedAnswers(String)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_AllowedAnswers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='allowedAnswers' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAllowedAnswers();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecision#getAllowedAnswers <em>Allowed Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Answers</em>' attribute.
	 * @see #getAllowedAnswers()
	 * @generated
	 */
	void setAllowedAnswers(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(TInformationItem)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	TInformationItem getVariable();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TDecision#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(TInformationItem value);

	/**
	 * Returns the value of the '<em><b>Information Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TInformationRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Requirement</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_InformationRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informationRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TInformationRequirement> getInformationRequirement();

	/**
	 * Returns the value of the '<em><b>Knowledge Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TKnowledgeRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Requirement</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_KnowledgeRequirement()
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
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_AuthorityRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorityRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TAuthorityRequirement> getAuthorityRequirement();

	/**
	 * Returns the value of the '<em><b>Supported Objective</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Objective</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_SupportedObjective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedObjective' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getSupportedObjective();

	/**
	 * Returns the value of the '<em><b>Impacted Performance Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacted Performance Indicator</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_ImpactedPerformanceIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='impactedPerformanceIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getImpactedPerformanceIndicator();

	/**
	 * Returns the value of the '<em><b>Decision Maker</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Maker</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_DecisionMaker()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionMaker' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getDecisionMaker();

	/**
	 * Returns the value of the '<em><b>Decision Owner</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Owner</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_DecisionOwner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionOwner' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getDecisionOwner();

	/**
	 * Returns the value of the '<em><b>Using Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Process</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_UsingProcess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usingProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getUsingProcess();

	/**
	 * Returns the value of the '<em><b>Using Task</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Task</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_UsingTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usingTask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getUsingTask();

	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_ExpressionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='expression:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTDecision_Expression()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='expression:group'"
	 * @generated
	 */
	TExpression getExpression();

} // TDecision
