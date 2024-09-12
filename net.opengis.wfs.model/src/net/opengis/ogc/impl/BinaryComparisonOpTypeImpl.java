/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.ogc.impl;

import net.opengis.ogc.BinaryComparisonOpType;
import net.opengis.ogc.ExpressionType;
import net.opengis.ogc.OGCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Comparison Op Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.BinaryComparisonOpTypeImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryComparisonOpTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.BinaryComparisonOpTypeImpl#isMatchCase <em>Match Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryComparisonOpTypeImpl extends ComparisonOpsTypeImpl implements BinaryComparisonOpType {
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
	 * The default value of the '{@link #isMatchCase() <em>Match Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_CASE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMatchCase() <em>Match Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchCase()
	 * @generated
	 * @ordered
	 */
	protected boolean matchCase = MATCH_CASE_EDEFAULT;

	/**
	 * This is true if the Match Case attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matchCaseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryComparisonOpTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.BINARY_COMPARISON_OP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP);
		}
		return expressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpressionType> getExpression() {
		return getExpressionGroup().list(OGCPackage.Literals.BINARY_COMPARISON_OP_TYPE__EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMatchCase() {
		return matchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchCase(boolean newMatchCase) {
		boolean oldMatchCase = matchCase;
		matchCase = newMatchCase;
		boolean oldMatchCaseESet = matchCaseESet;
		matchCaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.BINARY_COMPARISON_OP_TYPE__MATCH_CASE, oldMatchCase, matchCase, !oldMatchCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMatchCase() {
		boolean oldMatchCase = matchCase;
		boolean oldMatchCaseESet = matchCaseESet;
		matchCase = MATCH_CASE_EDEFAULT;
		matchCaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OGCPackage.BINARY_COMPARISON_OP_TYPE__MATCH_CASE, oldMatchCase, MATCH_CASE_EDEFAULT, oldMatchCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMatchCase() {
		return matchCaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION:
				return getExpression();
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__MATCH_CASE:
				return isMatchCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__MATCH_CASE:
				setMatchCase((Boolean)newValue);
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
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__MATCH_CASE:
				unsetMatchCase();
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
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__EXPRESSION:
				return !getExpression().isEmpty();
			case OGCPackage.BINARY_COMPARISON_OP_TYPE__MATCH_CASE:
				return isSetMatchCase();
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
		result.append(" (expressionGroup: ");
		result.append(expressionGroup);
		result.append(", matchCase: ");
		if (matchCaseESet) result.append(matchCase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BinaryComparisonOpTypeImpl
