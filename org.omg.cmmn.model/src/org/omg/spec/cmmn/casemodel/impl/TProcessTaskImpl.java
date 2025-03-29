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
import org.omg.spec.cmmn.casemodel.TExpression;
import org.omg.spec.cmmn.casemodel.TParameterMapping;
import org.omg.spec.cmmn.casemodel.TProcessTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TProcess Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl#getProcessRefExpression <em>Process Ref Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TProcessTaskImpl extends TTaskImpl implements TProcessTask {
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
	 * The cached value of the '{@link #getProcessRefExpression() <em>Process Ref Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRefExpression()
	 * @generated
	 * @ordered
	 */
	protected TExpression processRefExpression;

	/**
	 * The default value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName PROCESS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected QName processRef = PROCESS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TProcessTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TPROCESS_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TParameterMapping> getParameterMapping() {
		if (parameterMapping == null) {
			parameterMapping = new EObjectContainmentEList<TParameterMapping>(TParameterMapping.class, this, CaseModelPackage.TPROCESS_TASK__PARAMETER_MAPPING);
		}
		return parameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getProcessRefExpression() {
		return processRefExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessRefExpression(TExpression newProcessRefExpression, NotificationChain msgs) {
		TExpression oldProcessRefExpression = processRefExpression;
		processRefExpression = newProcessRefExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION, oldProcessRefExpression, newProcessRefExpression);
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
	public void setProcessRefExpression(TExpression newProcessRefExpression) {
		if (newProcessRefExpression != processRefExpression) {
			NotificationChain msgs = null;
			if (processRefExpression != null)
				msgs = ((InternalEObject)processRefExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION, null, msgs);
			if (newProcessRefExpression != null)
				msgs = ((InternalEObject)newProcessRefExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION, null, msgs);
			msgs = basicSetProcessRefExpression(newProcessRefExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION, newProcessRefExpression, newProcessRefExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getProcessRef() {
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessRef(QName newProcessRef) {
		QName oldProcessRef = processRef;
		processRef = newProcessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TPROCESS_TASK__PROCESS_REF, oldProcessRef, processRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.TPROCESS_TASK__PARAMETER_MAPPING:
				return ((InternalEList<?>)getParameterMapping()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION:
				return basicSetProcessRefExpression(null, msgs);
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
			case CaseModelPackage.TPROCESS_TASK__PARAMETER_MAPPING:
				return getParameterMapping();
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION:
				return getProcessRefExpression();
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF:
				return getProcessRef();
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
			case CaseModelPackage.TPROCESS_TASK__PARAMETER_MAPPING:
				getParameterMapping().clear();
				getParameterMapping().addAll((Collection<? extends TParameterMapping>)newValue);
				return;
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION:
				setProcessRefExpression((TExpression)newValue);
				return;
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF:
				setProcessRef((QName)newValue);
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
			case CaseModelPackage.TPROCESS_TASK__PARAMETER_MAPPING:
				getParameterMapping().clear();
				return;
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION:
				setProcessRefExpression((TExpression)null);
				return;
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF:
				setProcessRef(PROCESS_REF_EDEFAULT);
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
			case CaseModelPackage.TPROCESS_TASK__PARAMETER_MAPPING:
				return parameterMapping != null && !parameterMapping.isEmpty();
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF_EXPRESSION:
				return processRefExpression != null;
			case CaseModelPackage.TPROCESS_TASK__PROCESS_REF:
				return PROCESS_REF_EDEFAULT == null ? processRef != null : !PROCESS_REF_EDEFAULT.equals(processRef);
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
		result.append(" (processRef: ");
		result.append(processRef);
		result.append(')');
		return result.toString();
	}

} //TProcessTaskImpl
