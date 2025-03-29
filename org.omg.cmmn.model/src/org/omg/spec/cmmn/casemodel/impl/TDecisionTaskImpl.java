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
package org.omg.spec.cmmn.casemodel.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TDecisionTask;
import org.omg.spec.cmmn.casemodel.TExpression;
import org.omg.spec.cmmn.casemodel.TParameterMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDecision Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl#getDecisionRefExpression <em>Decision Ref Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl#getDecisionRef <em>Decision Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDecisionTaskImpl extends TTaskImpl implements TDecisionTask {
	/**
	 * The cached value of the '{@link #getParameterMapping() <em>Parameter Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<TParameterMapping> parameterMapping;

	/**
	 * The cached value of the '{@link #getDecisionRefExpression() <em>Decision Ref Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionRefExpression()
	 * @generated
	 * @ordered
	 */
	protected TExpression decisionRefExpression;

	/**
	 * The default value of the '{@link #getDecisionRef() <em>Decision Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName DECISION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecisionRef() <em>Decision Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionRef()
	 * @generated
	 * @ordered
	 */
	protected QName decisionRef = DECISION_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDecisionTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TDECISION_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TParameterMapping> getParameterMapping() {
		if (parameterMapping == null) {
			parameterMapping = new EObjectContainmentEList<TParameterMapping>(TParameterMapping.class, this, CaseModelPackage.TDECISION_TASK__PARAMETER_MAPPING);
		}
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getDecisionRefExpression() {
		return decisionRefExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionRefExpression(TExpression newDecisionRefExpression, NotificationChain msgs) {
		TExpression oldDecisionRefExpression = decisionRefExpression;
		decisionRefExpression = newDecisionRefExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION, oldDecisionRefExpression, newDecisionRefExpression);
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
	public void setDecisionRefExpression(TExpression newDecisionRefExpression) {
		if (newDecisionRefExpression != decisionRefExpression) {
			NotificationChain msgs = null;
			if (decisionRefExpression != null)
				msgs = ((InternalEObject)decisionRefExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION, null, msgs);
			if (newDecisionRefExpression != null)
				msgs = ((InternalEObject)newDecisionRefExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION, null, msgs);
			msgs = basicSetDecisionRefExpression(newDecisionRefExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION, newDecisionRefExpression, newDecisionRefExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getDecisionRef() {
		return decisionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionRef(QName newDecisionRef) {
		QName oldDecisionRef = decisionRef;
		decisionRef = newDecisionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TDECISION_TASK__DECISION_REF, oldDecisionRef, decisionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TDECISION_TASK__PARAMETER_MAPPING:
				return ((InternalEList<?>)getParameterMapping()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION:
				return basicSetDecisionRefExpression(null, msgs);
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
			case CaseModelPackage.TDECISION_TASK__PARAMETER_MAPPING:
				return getParameterMapping();
			case CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION:
				return getDecisionRefExpression();
			case CaseModelPackage.TDECISION_TASK__DECISION_REF:
				return getDecisionRef();
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
			case CaseModelPackage.TDECISION_TASK__PARAMETER_MAPPING:
				getParameterMapping().clear();
				getParameterMapping().addAll((Collection<? extends TParameterMapping>)newValue);
				return;
			case CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION:
				setDecisionRefExpression((TExpression)newValue);
				return;
			case CaseModelPackage.TDECISION_TASK__DECISION_REF:
				setDecisionRef((QName)newValue);
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
			case CaseModelPackage.TDECISION_TASK__PARAMETER_MAPPING:
				getParameterMapping().clear();
				return;
			case CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION:
				setDecisionRefExpression((TExpression)null);
				return;
			case CaseModelPackage.TDECISION_TASK__DECISION_REF:
				setDecisionRef(DECISION_REF_EDEFAULT);
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
			case CaseModelPackage.TDECISION_TASK__PARAMETER_MAPPING:
				return parameterMapping != null && !parameterMapping.isEmpty();
			case CaseModelPackage.TDECISION_TASK__DECISION_REF_EXPRESSION:
				return decisionRefExpression != null;
			case CaseModelPackage.TDECISION_TASK__DECISION_REF:
				return DECISION_REF_EDEFAULT == null ? decisionRef != null : !DECISION_REF_EDEFAULT.equals(decisionRef);
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
		result.append(" (decisionRef: ");
		result.append(decisionRef);
		result.append(')');
		return result.toString();
	}

} //TDecisionTaskImpl
