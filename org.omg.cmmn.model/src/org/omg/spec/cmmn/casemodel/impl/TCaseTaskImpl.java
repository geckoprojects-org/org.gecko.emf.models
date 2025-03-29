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
import org.omg.spec.cmmn.casemodel.TCaseTask;
import org.omg.spec.cmmn.casemodel.TExpression;
import org.omg.spec.cmmn.casemodel.TParameterMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCase Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl#getCaseRefExpression <em>Case Ref Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl#getCaseRef <em>Case Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCaseTaskImpl extends TTaskImpl implements TCaseTask {
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
	 * The cached value of the '{@link #getCaseRefExpression() <em>Case Ref Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseRefExpression()
	 * @generated
	 * @ordered
	 */
	protected TExpression caseRefExpression;

	/**
	 * The default value of the '{@link #getCaseRef() <em>Case Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName CASE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseRef() <em>Case Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseRef()
	 * @generated
	 * @ordered
	 */
	protected QName caseRef = CASE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCaseTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TCASE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TParameterMapping> getParameterMapping() {
		if (parameterMapping == null) {
			parameterMapping = new EObjectContainmentEList<TParameterMapping>(TParameterMapping.class, this, CaseModelPackage.TCASE_TASK__PARAMETER_MAPPING);
		}
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getCaseRefExpression() {
		return caseRefExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseRefExpression(TExpression newCaseRefExpression, NotificationChain msgs) {
		TExpression oldCaseRefExpression = caseRefExpression;
		caseRefExpression = newCaseRefExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION, oldCaseRefExpression, newCaseRefExpression);
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
	public void setCaseRefExpression(TExpression newCaseRefExpression) {
		if (newCaseRefExpression != caseRefExpression) {
			NotificationChain msgs = null;
			if (caseRefExpression != null)
				msgs = ((InternalEObject)caseRefExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION, null, msgs);
			if (newCaseRefExpression != null)
				msgs = ((InternalEObject)newCaseRefExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION, null, msgs);
			msgs = basicSetCaseRefExpression(newCaseRefExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION, newCaseRefExpression, newCaseRefExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getCaseRef() {
		return caseRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseRef(QName newCaseRef) {
		QName oldCaseRef = caseRef;
		caseRef = newCaseRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCASE_TASK__CASE_REF, oldCaseRef, caseRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TCASE_TASK__PARAMETER_MAPPING:
				return ((InternalEList<?>)getParameterMapping()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION:
				return basicSetCaseRefExpression(null, msgs);
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
			case CaseModelPackage.TCASE_TASK__PARAMETER_MAPPING:
				return getParameterMapping();
			case CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION:
				return getCaseRefExpression();
			case CaseModelPackage.TCASE_TASK__CASE_REF:
				return getCaseRef();
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
			case CaseModelPackage.TCASE_TASK__PARAMETER_MAPPING:
				getParameterMapping().clear();
				getParameterMapping().addAll((Collection<? extends TParameterMapping>)newValue);
				return;
			case CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION:
				setCaseRefExpression((TExpression)newValue);
				return;
			case CaseModelPackage.TCASE_TASK__CASE_REF:
				setCaseRef((QName)newValue);
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
			case CaseModelPackage.TCASE_TASK__PARAMETER_MAPPING:
				getParameterMapping().clear();
				return;
			case CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION:
				setCaseRefExpression((TExpression)null);
				return;
			case CaseModelPackage.TCASE_TASK__CASE_REF:
				setCaseRef(CASE_REF_EDEFAULT);
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
			case CaseModelPackage.TCASE_TASK__PARAMETER_MAPPING:
				return parameterMapping != null && !parameterMapping.isEmpty();
			case CaseModelPackage.TCASE_TASK__CASE_REF_EXPRESSION:
				return caseRefExpression != null;
			case CaseModelPackage.TCASE_TASK__CASE_REF:
				return CASE_REF_EDEFAULT == null ? caseRef != null : !CASE_REF_EDEFAULT.equals(caseRef);
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
		result.append(" (caseRef: ");
		result.append(caseRef);
		result.append(')');
		return result.toString();
	}

} //TCaseTaskImpl
