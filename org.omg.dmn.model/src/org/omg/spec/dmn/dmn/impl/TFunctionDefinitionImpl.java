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
import org.omg.spec.dmn.dmn.TExpression;
import org.omg.spec.dmn.dmn.TFunctionDefinition;
import org.omg.spec.dmn.dmn.TFunctionKind;
import org.omg.spec.dmn.dmn.TInformationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunction Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionDefinitionImpl extends TExpressionImpl implements TFunctionDefinition {
	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TInformationItem> formalParameter;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TFunctionKind KIND_EDEFAULT = TFunctionKind.FEEL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TFunctionKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TFunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TFUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInformationItem> getFormalParameter() {
		if (formalParameter == null) {
			formalParameter = new EObjectContainmentEList<TInformationItem>(TInformationItem.class, this, DMNPackage.TFUNCTION_DEFINITION__FORMAL_PARAMETER);
		}
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, DMNPackage.TFUNCTION_DEFINITION__EXPRESSION_GROUP);
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
		return (TExpression)getExpressionGroup().get(DMNPackage.Literals.TFUNCTION_DEFINITION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExpressionGroup()).basicAdd(DMNPackage.Literals.TFUNCTION_DEFINITION__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(TFunctionKind newKind) {
		TFunctionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TFUNCTION_DEFINITION__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKind() {
		TFunctionKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TFUNCTION_DEFINITION__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TFUNCTION_DEFINITION__FORMAL_PARAMETER:
				return ((InternalEList<?>)getFormalParameter()).basicRemove(otherEnd, msgs);
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION:
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
			case DMNPackage.TFUNCTION_DEFINITION__FORMAL_PARAMETER:
				return getFormalParameter();
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION:
				return getExpression();
			case DMNPackage.TFUNCTION_DEFINITION__KIND:
				return getKind();
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
			case DMNPackage.TFUNCTION_DEFINITION__FORMAL_PARAMETER:
				getFormalParameter().clear();
				getFormalParameter().addAll((Collection<? extends TInformationItem>)newValue);
				return;
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
			case DMNPackage.TFUNCTION_DEFINITION__KIND:
				setKind((TFunctionKind)newValue);
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
			case DMNPackage.TFUNCTION_DEFINITION__FORMAL_PARAMETER:
				getFormalParameter().clear();
				return;
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
			case DMNPackage.TFUNCTION_DEFINITION__KIND:
				unsetKind();
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
			case DMNPackage.TFUNCTION_DEFINITION__FORMAL_PARAMETER:
				return formalParameter != null && !formalParameter.isEmpty();
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case DMNPackage.TFUNCTION_DEFINITION__EXPRESSION:
				return getExpression() != null;
			case DMNPackage.TFUNCTION_DEFINITION__KIND:
				return isSetKind();
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
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TFunctionDefinitionImpl
