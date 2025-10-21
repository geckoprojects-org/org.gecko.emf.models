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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RuleType1;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RuleSetTypeImpl#getMaxScaleDenominator <em>Max Scale Denominator</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RuleSetTypeImpl#getMinScaleDenominator <em>Min Scale Denominator</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RuleSetTypeImpl#getTargetScaleDenominator <em>Target Scale Denominator</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RuleSetTypeImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleSetTypeImpl extends ElementType1Impl implements RuleSetType {
	/**
	 * The default value of the '{@link #getMaxScaleDenominator() <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxScaleDenominator() <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected double maxScaleDenominator = MAX_SCALE_DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Max Scale Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxScaleDenominatorESet;

	/**
	 * The default value of the '{@link #getMinScaleDenominator() <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinScaleDenominator() <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected double minScaleDenominator = MIN_SCALE_DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Min Scale Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minScaleDenominatorESet;

	/**
	 * The default value of the '{@link #getTargetScaleDenominator() <em>Target Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double TARGET_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTargetScaleDenominator() <em>Target Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected double targetScaleDenominator = TARGET_SCALE_DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Target Scale Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetScaleDenominatorESet;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleType1> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getRuleSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxScaleDenominator() {
		return maxScaleDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScaleDenominator(double newMaxScaleDenominator) {
		double oldMaxScaleDenominator = maxScaleDenominator;
		maxScaleDenominator = newMaxScaleDenominator;
		boolean oldMaxScaleDenominatorESet = maxScaleDenominatorESet;
		maxScaleDenominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RULE_SET_TYPE__MAX_SCALE_DENOMINATOR, oldMaxScaleDenominator, maxScaleDenominator, !oldMaxScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaxScaleDenominator() {
		double oldMaxScaleDenominator = maxScaleDenominator;
		boolean oldMaxScaleDenominatorESet = maxScaleDenominatorESet;
		maxScaleDenominator = MAX_SCALE_DENOMINATOR_EDEFAULT;
		maxScaleDenominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.RULE_SET_TYPE__MAX_SCALE_DENOMINATOR, oldMaxScaleDenominator, MAX_SCALE_DENOMINATOR_EDEFAULT, oldMaxScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaxScaleDenominator() {
		return maxScaleDenominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinScaleDenominator() {
		return minScaleDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinScaleDenominator(double newMinScaleDenominator) {
		double oldMinScaleDenominator = minScaleDenominator;
		minScaleDenominator = newMinScaleDenominator;
		boolean oldMinScaleDenominatorESet = minScaleDenominatorESet;
		minScaleDenominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RULE_SET_TYPE__MIN_SCALE_DENOMINATOR, oldMinScaleDenominator, minScaleDenominator, !oldMinScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinScaleDenominator() {
		double oldMinScaleDenominator = minScaleDenominator;
		boolean oldMinScaleDenominatorESet = minScaleDenominatorESet;
		minScaleDenominator = MIN_SCALE_DENOMINATOR_EDEFAULT;
		minScaleDenominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.RULE_SET_TYPE__MIN_SCALE_DENOMINATOR, oldMinScaleDenominator, MIN_SCALE_DENOMINATOR_EDEFAULT, oldMinScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinScaleDenominator() {
		return minScaleDenominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTargetScaleDenominator() {
		return targetScaleDenominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetScaleDenominator(double newTargetScaleDenominator) {
		double oldTargetScaleDenominator = targetScaleDenominator;
		targetScaleDenominator = newTargetScaleDenominator;
		boolean oldTargetScaleDenominatorESet = targetScaleDenominatorESet;
		targetScaleDenominatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RULE_SET_TYPE__TARGET_SCALE_DENOMINATOR, oldTargetScaleDenominator, targetScaleDenominator, !oldTargetScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTargetScaleDenominator() {
		double oldTargetScaleDenominator = targetScaleDenominator;
		boolean oldTargetScaleDenominatorESet = targetScaleDenominatorESet;
		targetScaleDenominator = TARGET_SCALE_DENOMINATOR_EDEFAULT;
		targetScaleDenominatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.RULE_SET_TYPE__TARGET_SCALE_DENOMINATOR, oldTargetScaleDenominator, TARGET_SCALE_DENOMINATOR_EDEFAULT, oldTargetScaleDenominatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTargetScaleDenominator() {
		return targetScaleDenominatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RuleType1> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<RuleType1>(RuleType1.class, this, AAAPackage.RULE_SET_TYPE__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.RULE_SET_TYPE__RULE:
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
			case AAAPackage.RULE_SET_TYPE__MAX_SCALE_DENOMINATOR:
				return getMaxScaleDenominator();
			case AAAPackage.RULE_SET_TYPE__MIN_SCALE_DENOMINATOR:
				return getMinScaleDenominator();
			case AAAPackage.RULE_SET_TYPE__TARGET_SCALE_DENOMINATOR:
				return getTargetScaleDenominator();
			case AAAPackage.RULE_SET_TYPE__RULE:
				return getRule();
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
			case AAAPackage.RULE_SET_TYPE__MAX_SCALE_DENOMINATOR:
				setMaxScaleDenominator((Double)newValue);
				return;
			case AAAPackage.RULE_SET_TYPE__MIN_SCALE_DENOMINATOR:
				setMinScaleDenominator((Double)newValue);
				return;
			case AAAPackage.RULE_SET_TYPE__TARGET_SCALE_DENOMINATOR:
				setTargetScaleDenominator((Double)newValue);
				return;
			case AAAPackage.RULE_SET_TYPE__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends RuleType1>)newValue);
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
			case AAAPackage.RULE_SET_TYPE__MAX_SCALE_DENOMINATOR:
				unsetMaxScaleDenominator();
				return;
			case AAAPackage.RULE_SET_TYPE__MIN_SCALE_DENOMINATOR:
				unsetMinScaleDenominator();
				return;
			case AAAPackage.RULE_SET_TYPE__TARGET_SCALE_DENOMINATOR:
				unsetTargetScaleDenominator();
				return;
			case AAAPackage.RULE_SET_TYPE__RULE:
				getRule().clear();
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
			case AAAPackage.RULE_SET_TYPE__MAX_SCALE_DENOMINATOR:
				return isSetMaxScaleDenominator();
			case AAAPackage.RULE_SET_TYPE__MIN_SCALE_DENOMINATOR:
				return isSetMinScaleDenominator();
			case AAAPackage.RULE_SET_TYPE__TARGET_SCALE_DENOMINATOR:
				return isSetTargetScaleDenominator();
			case AAAPackage.RULE_SET_TYPE__RULE:
				return rule != null && !rule.isEmpty();
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
		result.append(" (maxScaleDenominator: ");
		if (maxScaleDenominatorESet) result.append(maxScaleDenominator); else result.append("<unset>");
		result.append(", minScaleDenominator: ");
		if (minScaleDenominatorESet) result.append(minScaleDenominator); else result.append("<unset>");
		result.append(", targetScaleDenominator: ");
		if (targetScaleDenominatorESet) result.append(targetScaleDenominator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RuleSetTypeImpl
