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
package org.omg.spec.dmn.dmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TAuthorityRequirement;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TDecision;
import org.omg.spec.dmn.dmn.TExpression;
import org.omg.spec.dmn.dmn.TInformationItem;
import org.omg.spec.dmn.dmn.TInformationRequirement;
import org.omg.spec.dmn.dmn.TKnowledgeRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDecision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getAllowedAnswers <em>Allowed Answers</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getInformationRequirement <em>Information Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getKnowledgeRequirement <em>Knowledge Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getSupportedObjective <em>Supported Objective</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getImpactedPerformanceIndicator <em>Impacted Performance Indicator</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getDecisionMaker <em>Decision Maker</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getDecisionOwner <em>Decision Owner</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getUsingProcess <em>Using Process</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getUsingTask <em>Using Task</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDecisionImpl extends TDRGElementImpl implements TDecision {
	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedAnswers() <em>Allowed Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_ANSWERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedAnswers() <em>Allowed Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAnswers()
	 * @generated
	 * @ordered
	 */
	protected String allowedAnswers = ALLOWED_ANSWERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected TInformationItem variable;

	/**
	 * The cached value of the '{@link #getInformationRequirement() <em>Information Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TInformationRequirement> informationRequirement;

	/**
	 * The cached value of the '{@link #getKnowledgeRequirement() <em>Knowledge Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TKnowledgeRequirement> knowledgeRequirement;

	/**
	 * The cached value of the '{@link #getAuthorityRequirement() <em>Authority Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TAuthorityRequirement> authorityRequirement;

	/**
	 * The cached value of the '{@link #getSupportedObjective() <em>Supported Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> supportedObjective;

	/**
	 * The cached value of the '{@link #getImpactedPerformanceIndicator() <em>Impacted Performance Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactedPerformanceIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> impactedPerformanceIndicator;

	/**
	 * The cached value of the '{@link #getDecisionMaker() <em>Decision Maker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionMaker()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> decisionMaker;

	/**
	 * The cached value of the '{@link #getDecisionOwner() <em>Decision Owner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> decisionOwner;

	/**
	 * The cached value of the '{@link #getUsingProcess() <em>Using Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> usingProcess;

	/**
	 * The cached value of the '{@link #getUsingTask() <em>Using Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TDMNElementReference> usingTask;

	/**
	 * The cached value of the '{@link #getExpressionGroup() <em>Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap expressionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TDECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllowedAnswers() {
		return allowedAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedAnswers(String newAllowedAnswers) {
		String oldAllowedAnswers = allowedAnswers;
		allowedAnswers = newAllowedAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION__ALLOWED_ANSWERS, oldAllowedAnswers, allowedAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInformationItem getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(TInformationItem newVariable, NotificationChain msgs) {
		TInformationItem oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(TInformationItem newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TDECISION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TDECISION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInformationRequirement> getInformationRequirement() {
		if (informationRequirement == null) {
			informationRequirement = new EObjectContainmentEList<TInformationRequirement>(TInformationRequirement.class, this, DMNPackage.TDECISION__INFORMATION_REQUIREMENT);
		}
		return informationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TKnowledgeRequirement> getKnowledgeRequirement() {
		if (knowledgeRequirement == null) {
			knowledgeRequirement = new EObjectContainmentEList<TKnowledgeRequirement>(TKnowledgeRequirement.class, this, DMNPackage.TDECISION__KNOWLEDGE_REQUIREMENT);
		}
		return knowledgeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TAuthorityRequirement> getAuthorityRequirement() {
		if (authorityRequirement == null) {
			authorityRequirement = new EObjectContainmentEList<TAuthorityRequirement>(TAuthorityRequirement.class, this, DMNPackage.TDECISION__AUTHORITY_REQUIREMENT);
		}
		return authorityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getSupportedObjective() {
		if (supportedObjective == null) {
			supportedObjective = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION__SUPPORTED_OBJECTIVE);
		}
		return supportedObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getImpactedPerformanceIndicator() {
		if (impactedPerformanceIndicator == null) {
			impactedPerformanceIndicator = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION__IMPACTED_PERFORMANCE_INDICATOR);
		}
		return impactedPerformanceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getDecisionMaker() {
		if (decisionMaker == null) {
			decisionMaker = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION__DECISION_MAKER);
		}
		return decisionMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getDecisionOwner() {
		if (decisionOwner == null) {
			decisionOwner = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION__DECISION_OWNER);
		}
		return decisionOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getUsingProcess() {
		if (usingProcess == null) {
			usingProcess = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION__USING_PROCESS);
		}
		return usingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDMNElementReference> getUsingTask() {
		if (usingTask == null) {
			usingTask = new EObjectContainmentEList<TDMNElementReference>(TDMNElementReference.class, this, DMNPackage.TDECISION__USING_TASK);
		}
		return usingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, DMNPackage.TDECISION__EXPRESSION_GROUP);
		}
		return expressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getExpression() {
		return (TExpression)getExpressionGroup().get(DMNPackage.Literals.TDECISION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionGroup()).basicAdd(DMNPackage.Literals.TDECISION__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TDECISION__VARIABLE:
				return basicSetVariable(null, msgs);
			case DMNPackage.TDECISION__INFORMATION_REQUIREMENT:
				return ((InternalEList<?>)getInformationRequirement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__KNOWLEDGE_REQUIREMENT:
				return ((InternalEList<?>)getKnowledgeRequirement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__AUTHORITY_REQUIREMENT:
				return ((InternalEList<?>)getAuthorityRequirement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__SUPPORTED_OBJECTIVE:
				return ((InternalEList<?>)getSupportedObjective()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__IMPACTED_PERFORMANCE_INDICATOR:
				return ((InternalEList<?>)getImpactedPerformanceIndicator()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__DECISION_MAKER:
				return ((InternalEList<?>)getDecisionMaker()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__DECISION_OWNER:
				return ((InternalEList<?>)getDecisionOwner()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__USING_PROCESS:
				return ((InternalEList<?>)getUsingProcess()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__USING_TASK:
				return ((InternalEList<?>)getUsingTask()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION__EXPRESSION:
				return basicSetExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DMNPackage.TDECISION__QUESTION:
				return getQuestion();
			case DMNPackage.TDECISION__ALLOWED_ANSWERS:
				return getAllowedAnswers();
			case DMNPackage.TDECISION__VARIABLE:
				return getVariable();
			case DMNPackage.TDECISION__INFORMATION_REQUIREMENT:
				return getInformationRequirement();
			case DMNPackage.TDECISION__KNOWLEDGE_REQUIREMENT:
				return getKnowledgeRequirement();
			case DMNPackage.TDECISION__AUTHORITY_REQUIREMENT:
				return getAuthorityRequirement();
			case DMNPackage.TDECISION__SUPPORTED_OBJECTIVE:
				return getSupportedObjective();
			case DMNPackage.TDECISION__IMPACTED_PERFORMANCE_INDICATOR:
				return getImpactedPerformanceIndicator();
			case DMNPackage.TDECISION__DECISION_MAKER:
				return getDecisionMaker();
			case DMNPackage.TDECISION__DECISION_OWNER:
				return getDecisionOwner();
			case DMNPackage.TDECISION__USING_PROCESS:
				return getUsingProcess();
			case DMNPackage.TDECISION__USING_TASK:
				return getUsingTask();
			case DMNPackage.TDECISION__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case DMNPackage.TDECISION__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DMNPackage.TDECISION__QUESTION:
				setQuestion((String)newValue);
				return;
			case DMNPackage.TDECISION__ALLOWED_ANSWERS:
				setAllowedAnswers((String)newValue);
				return;
			case DMNPackage.TDECISION__VARIABLE:
				setVariable((TInformationItem)newValue);
				return;
			case DMNPackage.TDECISION__INFORMATION_REQUIREMENT:
				getInformationRequirement().clear();
				getInformationRequirement().addAll((Collection<? extends TInformationRequirement>)newValue);
				return;
			case DMNPackage.TDECISION__KNOWLEDGE_REQUIREMENT:
				getKnowledgeRequirement().clear();
				getKnowledgeRequirement().addAll((Collection<? extends TKnowledgeRequirement>)newValue);
				return;
			case DMNPackage.TDECISION__AUTHORITY_REQUIREMENT:
				getAuthorityRequirement().clear();
				getAuthorityRequirement().addAll((Collection<? extends TAuthorityRequirement>)newValue);
				return;
			case DMNPackage.TDECISION__SUPPORTED_OBJECTIVE:
				getSupportedObjective().clear();
				getSupportedObjective().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION__IMPACTED_PERFORMANCE_INDICATOR:
				getImpactedPerformanceIndicator().clear();
				getImpactedPerformanceIndicator().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION__DECISION_MAKER:
				getDecisionMaker().clear();
				getDecisionMaker().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION__DECISION_OWNER:
				getDecisionOwner().clear();
				getDecisionOwner().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION__USING_PROCESS:
				getUsingProcess().clear();
				getUsingProcess().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION__USING_TASK:
				getUsingTask().clear();
				getUsingTask().addAll((Collection<? extends TDMNElementReference>)newValue);
				return;
			case DMNPackage.TDECISION__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DMNPackage.TDECISION__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case DMNPackage.TDECISION__ALLOWED_ANSWERS:
				setAllowedAnswers(ALLOWED_ANSWERS_EDEFAULT);
				return;
			case DMNPackage.TDECISION__VARIABLE:
				setVariable((TInformationItem)null);
				return;
			case DMNPackage.TDECISION__INFORMATION_REQUIREMENT:
				getInformationRequirement().clear();
				return;
			case DMNPackage.TDECISION__KNOWLEDGE_REQUIREMENT:
				getKnowledgeRequirement().clear();
				return;
			case DMNPackage.TDECISION__AUTHORITY_REQUIREMENT:
				getAuthorityRequirement().clear();
				return;
			case DMNPackage.TDECISION__SUPPORTED_OBJECTIVE:
				getSupportedObjective().clear();
				return;
			case DMNPackage.TDECISION__IMPACTED_PERFORMANCE_INDICATOR:
				getImpactedPerformanceIndicator().clear();
				return;
			case DMNPackage.TDECISION__DECISION_MAKER:
				getDecisionMaker().clear();
				return;
			case DMNPackage.TDECISION__DECISION_OWNER:
				getDecisionOwner().clear();
				return;
			case DMNPackage.TDECISION__USING_PROCESS:
				getUsingProcess().clear();
				return;
			case DMNPackage.TDECISION__USING_TASK:
				getUsingTask().clear();
				return;
			case DMNPackage.TDECISION__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DMNPackage.TDECISION__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case DMNPackage.TDECISION__ALLOWED_ANSWERS:
				return ALLOWED_ANSWERS_EDEFAULT == null ? allowedAnswers != null : !ALLOWED_ANSWERS_EDEFAULT.equals(allowedAnswers);
			case DMNPackage.TDECISION__VARIABLE:
				return variable != null;
			case DMNPackage.TDECISION__INFORMATION_REQUIREMENT:
				return informationRequirement != null && !informationRequirement.isEmpty();
			case DMNPackage.TDECISION__KNOWLEDGE_REQUIREMENT:
				return knowledgeRequirement != null && !knowledgeRequirement.isEmpty();
			case DMNPackage.TDECISION__AUTHORITY_REQUIREMENT:
				return authorityRequirement != null && !authorityRequirement.isEmpty();
			case DMNPackage.TDECISION__SUPPORTED_OBJECTIVE:
				return supportedObjective != null && !supportedObjective.isEmpty();
			case DMNPackage.TDECISION__IMPACTED_PERFORMANCE_INDICATOR:
				return impactedPerformanceIndicator != null && !impactedPerformanceIndicator.isEmpty();
			case DMNPackage.TDECISION__DECISION_MAKER:
				return decisionMaker != null && !decisionMaker.isEmpty();
			case DMNPackage.TDECISION__DECISION_OWNER:
				return decisionOwner != null && !decisionOwner.isEmpty();
			case DMNPackage.TDECISION__USING_PROCESS:
				return usingProcess != null && !usingProcess.isEmpty();
			case DMNPackage.TDECISION__USING_TASK:
				return usingTask != null && !usingTask.isEmpty();
			case DMNPackage.TDECISION__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case DMNPackage.TDECISION__EXPRESSION:
				return getExpression() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (question: ");
		result.append(question);
		result.append(", allowedAnswers: ");
		result.append(allowedAnswers);
		result.append(", expressionGroup: ");
		result.append(expressionGroup);
		result.append(')');
		return result.toString();
	}

} //TDecisionImpl
