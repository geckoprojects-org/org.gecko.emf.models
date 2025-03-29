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

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TInputClause;
import org.omg.spec.dmn.dmn.TLiteralExpression;
import org.omg.spec.dmn.dmn.TUnaryTests;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInput Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInputClauseImpl#getInputExpression <em>Input Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TInputClauseImpl#getInputValues <em>Input Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInputClauseImpl extends TDMNElementImpl implements TInputClause {
	/**
	 * The cached value of the '{@link #getInputExpression() <em>Input Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputExpression()
	 * @generated
	 * @ordered
	 */
	protected TLiteralExpression inputExpression;

	/**
	 * The cached value of the '{@link #getInputValues() <em>Input Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValues()
	 * @generated
	 * @ordered
	 */
	protected TUnaryTests inputValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInputClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TINPUT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLiteralExpression getInputExpression() {
		return inputExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputExpression(TLiteralExpression newInputExpression, NotificationChain msgs) {
		TLiteralExpression oldInputExpression = inputExpression;
		inputExpression = newInputExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION, oldInputExpression, newInputExpression);
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
	public void setInputExpression(TLiteralExpression newInputExpression) {
		if (newInputExpression != inputExpression) {
			NotificationChain msgs = null;
			if (inputExpression != null)
				msgs = ((InternalEObject)inputExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION, null, msgs);
			if (newInputExpression != null)
				msgs = ((InternalEObject)newInputExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION, null, msgs);
			msgs = basicSetInputExpression(newInputExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION, newInputExpression, newInputExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUnaryTests getInputValues() {
		return inputValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputValues(TUnaryTests newInputValues, NotificationChain msgs) {
		TUnaryTests oldInputValues = inputValues;
		inputValues = newInputValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TINPUT_CLAUSE__INPUT_VALUES, oldInputValues, newInputValues);
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
	public void setInputValues(TUnaryTests newInputValues) {
		if (newInputValues != inputValues) {
			NotificationChain msgs = null;
			if (inputValues != null)
				msgs = ((InternalEObject)inputValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINPUT_CLAUSE__INPUT_VALUES, null, msgs);
			if (newInputValues != null)
				msgs = ((InternalEObject)newInputValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TINPUT_CLAUSE__INPUT_VALUES, null, msgs);
			msgs = basicSetInputValues(newInputValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TINPUT_CLAUSE__INPUT_VALUES, newInputValues, newInputValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION:
				return basicSetInputExpression(null, msgs);
			case DMNPackage.TINPUT_CLAUSE__INPUT_VALUES:
				return basicSetInputValues(null, msgs);
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
			case DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION:
				return getInputExpression();
			case DMNPackage.TINPUT_CLAUSE__INPUT_VALUES:
				return getInputValues();
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
			case DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION:
				setInputExpression((TLiteralExpression)newValue);
				return;
			case DMNPackage.TINPUT_CLAUSE__INPUT_VALUES:
				setInputValues((TUnaryTests)newValue);
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
			case DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION:
				setInputExpression((TLiteralExpression)null);
				return;
			case DMNPackage.TINPUT_CLAUSE__INPUT_VALUES:
				setInputValues((TUnaryTests)null);
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
			case DMNPackage.TINPUT_CLAUSE__INPUT_EXPRESSION:
				return inputExpression != null;
			case DMNPackage.TINPUT_CLAUSE__INPUT_VALUES:
				return inputValues != null;
		}
		return super.eIsSet(featureID);
	}

} //TInputClauseImpl
