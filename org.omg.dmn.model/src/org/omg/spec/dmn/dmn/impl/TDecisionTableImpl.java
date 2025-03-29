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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TBuiltinAggregator;
import org.omg.spec.dmn.dmn.TDecisionRule;
import org.omg.spec.dmn.dmn.TDecisionTable;
import org.omg.spec.dmn.dmn.TDecisionTableOrientation;
import org.omg.spec.dmn.dmn.THitPolicy;
import org.omg.spec.dmn.dmn.TInputClause;
import org.omg.spec.dmn.dmn.TOutputClause;
import org.omg.spec.dmn.dmn.TRuleAnnotationClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDecision Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getHitPolicy <em>Hit Policy</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getOutputLabel <em>Output Label</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl#getPreferredOrientation <em>Preferred Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDecisionTableImpl extends TExpressionImpl implements TDecisionTable {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TInputClause> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TOutputClause> output;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<TRuleAnnotationClause> annotation;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<TDecisionRule> rule;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final TBuiltinAggregator AGGREGATION_EDEFAULT = TBuiltinAggregator.SUM;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected TBuiltinAggregator aggregation = AGGREGATION_EDEFAULT;

	/**
	 * This is true if the Aggregation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationESet;

	/**
	 * The default value of the '{@link #getHitPolicy() <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final THitPolicy HIT_POLICY_EDEFAULT = THitPolicy.UNIQUE;

	/**
	 * The cached value of the '{@link #getHitPolicy() <em>Hit Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitPolicy()
	 * @generated
	 * @ordered
	 */
	protected THitPolicy hitPolicy = HIT_POLICY_EDEFAULT;

	/**
	 * This is true if the Hit Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hitPolicyESet;

	/**
	 * The default value of the '{@link #getOutputLabel() <em>Output Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputLabel() <em>Output Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLabel()
	 * @generated
	 * @ordered
	 */
	protected String outputLabel = OUTPUT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredOrientation() <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final TDecisionTableOrientation PREFERRED_ORIENTATION_EDEFAULT = TDecisionTableOrientation.RULE_AS_ROW;

	/**
	 * The cached value of the '{@link #getPreferredOrientation() <em>Preferred Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredOrientation()
	 * @generated
	 * @ordered
	 */
	protected TDecisionTableOrientation preferredOrientation = PREFERRED_ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Preferred Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preferredOrientationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDecisionTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TDECISION_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInputClause> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<TInputClause>(TInputClause.class, this, DMNPackage.TDECISION_TABLE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOutputClause> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<TOutputClause>(TOutputClause.class, this, DMNPackage.TDECISION_TABLE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRuleAnnotationClause> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<TRuleAnnotationClause>(TRuleAnnotationClause.class, this, DMNPackage.TDECISION_TABLE__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDecisionRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<TDecisionRule>(TDecisionRule.class, this, DMNPackage.TDECISION_TABLE__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBuiltinAggregator getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregation(TBuiltinAggregator newAggregation) {
		TBuiltinAggregator oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		boolean oldAggregationESet = aggregationESet;
		aggregationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION_TABLE__AGGREGATION, oldAggregation, aggregation, !oldAggregationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAggregation() {
		TBuiltinAggregator oldAggregation = aggregation;
		boolean oldAggregationESet = aggregationESet;
		aggregation = AGGREGATION_EDEFAULT;
		aggregationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TDECISION_TABLE__AGGREGATION, oldAggregation, AGGREGATION_EDEFAULT, oldAggregationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAggregation() {
		return aggregationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THitPolicy getHitPolicy() {
		return hitPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitPolicy(THitPolicy newHitPolicy) {
		THitPolicy oldHitPolicy = hitPolicy;
		hitPolicy = newHitPolicy == null ? HIT_POLICY_EDEFAULT : newHitPolicy;
		boolean oldHitPolicyESet = hitPolicyESet;
		hitPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION_TABLE__HIT_POLICY, oldHitPolicy, hitPolicy, !oldHitPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHitPolicy() {
		THitPolicy oldHitPolicy = hitPolicy;
		boolean oldHitPolicyESet = hitPolicyESet;
		hitPolicy = HIT_POLICY_EDEFAULT;
		hitPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TDECISION_TABLE__HIT_POLICY, oldHitPolicy, HIT_POLICY_EDEFAULT, oldHitPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHitPolicy() {
		return hitPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputLabel() {
		return outputLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputLabel(String newOutputLabel) {
		String oldOutputLabel = outputLabel;
		outputLabel = newOutputLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION_TABLE__OUTPUT_LABEL, oldOutputLabel, outputLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionTableOrientation getPreferredOrientation() {
		return preferredOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredOrientation(TDecisionTableOrientation newPreferredOrientation) {
		TDecisionTableOrientation oldPreferredOrientation = preferredOrientation;
		preferredOrientation = newPreferredOrientation == null ? PREFERRED_ORIENTATION_EDEFAULT : newPreferredOrientation;
		boolean oldPreferredOrientationESet = preferredOrientationESet;
		preferredOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDECISION_TABLE__PREFERRED_ORIENTATION, oldPreferredOrientation, preferredOrientation, !oldPreferredOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPreferredOrientation() {
		TDecisionTableOrientation oldPreferredOrientation = preferredOrientation;
		boolean oldPreferredOrientationESet = preferredOrientationESet;
		preferredOrientation = PREFERRED_ORIENTATION_EDEFAULT;
		preferredOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TDECISION_TABLE__PREFERRED_ORIENTATION, oldPreferredOrientation, PREFERRED_ORIENTATION_EDEFAULT, oldPreferredOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPreferredOrientation() {
		return preferredOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TDECISION_TABLE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_TABLE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_TABLE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDECISION_TABLE__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TDECISION_TABLE__INPUT:
				return getInput();
			case DMNPackage.TDECISION_TABLE__OUTPUT:
				return getOutput();
			case DMNPackage.TDECISION_TABLE__ANNOTATION:
				return getAnnotation();
			case DMNPackage.TDECISION_TABLE__RULE:
				return getRule();
			case DMNPackage.TDECISION_TABLE__AGGREGATION:
				return getAggregation();
			case DMNPackage.TDECISION_TABLE__HIT_POLICY:
				return getHitPolicy();
			case DMNPackage.TDECISION_TABLE__OUTPUT_LABEL:
				return getOutputLabel();
			case DMNPackage.TDECISION_TABLE__PREFERRED_ORIENTATION:
				return getPreferredOrientation();
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
			case DMNPackage.TDECISION_TABLE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends TInputClause>)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends TOutputClause>)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends TRuleAnnotationClause>)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends TDecisionRule>)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__AGGREGATION:
				setAggregation((TBuiltinAggregator)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__HIT_POLICY:
				setHitPolicy((THitPolicy)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__OUTPUT_LABEL:
				setOutputLabel((String)newValue);
				return;
			case DMNPackage.TDECISION_TABLE__PREFERRED_ORIENTATION:
				setPreferredOrientation((TDecisionTableOrientation)newValue);
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
			case DMNPackage.TDECISION_TABLE__INPUT:
				getInput().clear();
				return;
			case DMNPackage.TDECISION_TABLE__OUTPUT:
				getOutput().clear();
				return;
			case DMNPackage.TDECISION_TABLE__ANNOTATION:
				getAnnotation().clear();
				return;
			case DMNPackage.TDECISION_TABLE__RULE:
				getRule().clear();
				return;
			case DMNPackage.TDECISION_TABLE__AGGREGATION:
				unsetAggregation();
				return;
			case DMNPackage.TDECISION_TABLE__HIT_POLICY:
				unsetHitPolicy();
				return;
			case DMNPackage.TDECISION_TABLE__OUTPUT_LABEL:
				setOutputLabel(OUTPUT_LABEL_EDEFAULT);
				return;
			case DMNPackage.TDECISION_TABLE__PREFERRED_ORIENTATION:
				unsetPreferredOrientation();
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
			case DMNPackage.TDECISION_TABLE__INPUT:
				return input != null && !input.isEmpty();
			case DMNPackage.TDECISION_TABLE__OUTPUT:
				return output != null && !output.isEmpty();
			case DMNPackage.TDECISION_TABLE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case DMNPackage.TDECISION_TABLE__RULE:
				return rule != null && !rule.isEmpty();
			case DMNPackage.TDECISION_TABLE__AGGREGATION:
				return isSetAggregation();
			case DMNPackage.TDECISION_TABLE__HIT_POLICY:
				return isSetHitPolicy();
			case DMNPackage.TDECISION_TABLE__OUTPUT_LABEL:
				return OUTPUT_LABEL_EDEFAULT == null ? outputLabel != null : !OUTPUT_LABEL_EDEFAULT.equals(outputLabel);
			case DMNPackage.TDECISION_TABLE__PREFERRED_ORIENTATION:
				return isSetPreferredOrientation();
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
		result.append(" (aggregation: ");
		if (aggregationESet) result.append(aggregation); else result.append("<unset>");
		result.append(", hitPolicy: ");
		if (hitPolicyESet) result.append(hitPolicy); else result.append("<unset>");
		result.append(", outputLabel: ");
		result.append(outputLabel);
		result.append(", preferredOrientation: ");
		if (preferredOrientationESet) result.append(preferredOrientation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDecisionTableImpl
