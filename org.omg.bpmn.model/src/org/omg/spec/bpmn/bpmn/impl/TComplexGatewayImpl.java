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
package org.omg.spec.bpmn.bpmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TComplexGateway;
import org.omg.spec.bpmn.bpmn.TExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TComplex Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TComplexGatewayImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TComplexGatewayImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TComplexGatewayImpl extends TGatewayImpl implements TComplexGateway {
	/**
	 * The cached value of the '{@link #getActivationCondition() <em>Activation Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCondition()
	 * @generated
	 * @ordered
	 */
	protected TExpression activationCondition;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TComplexGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTComplexGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getActivationCondition() {
		return activationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationCondition(TExpression newActivationCondition, NotificationChain msgs) {
		TExpression oldActivationCondition = activationCondition;
		activationCondition = newActivationCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION, oldActivationCondition, newActivationCondition);
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
	public void setActivationCondition(TExpression newActivationCondition) {
		if (newActivationCondition != activationCondition) {
			NotificationChain msgs = null;
			if (activationCondition != null)
				msgs = ((InternalEObject)activationCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION, null, msgs);
			if (newActivationCondition != null)
				msgs = ((InternalEObject)newActivationCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION, null, msgs);
			msgs = basicSetActivationCondition(newActivationCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION, newActivationCondition, newActivationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCOMPLEX_GATEWAY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION:
				return basicSetActivationCondition(null, msgs);
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
			case BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION:
				return getActivationCondition();
			case BPMNPackage.TCOMPLEX_GATEWAY__DEFAULT:
				return getDefault();
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
			case BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION:
				setActivationCondition((TExpression)newValue);
				return;
			case BPMNPackage.TCOMPLEX_GATEWAY__DEFAULT:
				setDefault((String)newValue);
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
			case BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION:
				setActivationCondition((TExpression)null);
				return;
			case BPMNPackage.TCOMPLEX_GATEWAY__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
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
			case BPMNPackage.TCOMPLEX_GATEWAY__ACTIVATION_CONDITION:
				return activationCondition != null;
			case BPMNPackage.TCOMPLEX_GATEWAY__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
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
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //TComplexGatewayImpl
