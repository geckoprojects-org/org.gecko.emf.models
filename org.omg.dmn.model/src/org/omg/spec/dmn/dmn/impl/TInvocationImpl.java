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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TBinding;
import org.omg.spec.dmn.dmn.TExpression;
import org.omg.spec.dmn.dmn.TInvocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInvocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInvocationImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInvocationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInvocationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInvocationImpl extends TExpressionImpl implements TInvocation {
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
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TBinding> binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TINVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, DMNPackage.TINVOCATION__EXPRESSION_GROUP);
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
		return (TExpression)getExpressionGroup().get(DMNPackage.Literals.TINVOCATION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionGroup()).basicAdd(DMNPackage.Literals.TINVOCATION__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBinding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<TBinding>(TBinding.class, this, DMNPackage.TINVOCATION__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TINVOCATION__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TINVOCATION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DMNPackage.TINVOCATION__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case DMNPackage.TINVOCATION__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case DMNPackage.TINVOCATION__EXPRESSION:
				return getExpression();
			case DMNPackage.TINVOCATION__BINDING:
				return getBinding();
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
			case DMNPackage.TINVOCATION__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
			case DMNPackage.TINVOCATION__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends TBinding>)newValue);
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
			case DMNPackage.TINVOCATION__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
			case DMNPackage.TINVOCATION__BINDING:
				getBinding().clear();
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
			case DMNPackage.TINVOCATION__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case DMNPackage.TINVOCATION__EXPRESSION:
				return getExpression() != null;
			case DMNPackage.TINVOCATION__BINDING:
				return binding != null && !binding.isEmpty();
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

} //TInvocationImpl
