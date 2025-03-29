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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TContextEntry;
import org.omg.spec.dmn.dmn.TExpression;
import org.omg.spec.dmn.dmn.TInformationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TContext Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TContextEntryImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TContextEntryImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TContextEntryImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TContextEntryImpl extends TDMNElementImpl implements TContextEntry {
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
	protected TContextEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TCONTEXT_ENTRY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TCONTEXT_ENTRY__VARIABLE, oldVariable, newVariable);
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
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TCONTEXT_ENTRY__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TCONTEXT_ENTRY__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TCONTEXT_ENTRY__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, DMNPackage.TCONTEXT_ENTRY__EXPRESSION_GROUP);
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
		return (TExpression)getExpressionGroup().get(DMNPackage.Literals.TCONTEXT_ENTRY__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionGroup()).basicAdd(DMNPackage.Literals.TCONTEXT_ENTRY__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TCONTEXT_ENTRY__VARIABLE:
				return basicSetVariable(null, msgs);
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION:
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
			case DMNPackage.TCONTEXT_ENTRY__VARIABLE:
				return getVariable();
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION:
				return getExpression();
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
			case DMNPackage.TCONTEXT_ENTRY__VARIABLE:
				setVariable((TInformationItem)newValue);
				return;
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION_GROUP:
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
			case DMNPackage.TCONTEXT_ENTRY__VARIABLE:
				setVariable((TInformationItem)null);
				return;
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION_GROUP:
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
			case DMNPackage.TCONTEXT_ENTRY__VARIABLE:
				return variable != null;
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case DMNPackage.TCONTEXT_ENTRY__EXPRESSION:
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
		result.append(" (expressionGroup: ");
		result.append(expressionGroup);
		result.append(')');
		return result.toString();
	}

} //TContextEntryImpl
