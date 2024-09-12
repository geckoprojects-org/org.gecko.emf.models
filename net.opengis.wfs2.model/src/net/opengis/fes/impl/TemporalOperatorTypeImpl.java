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
package net.opengis.fes.impl;

import net.opengis.fes.FESPackage;
import net.opengis.fes.TemporalOperandsType;
import net.opengis.fes.TemporalOperatorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Operator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.TemporalOperatorTypeImpl#getTemporalOperands <em>Temporal Operands</em>}</li>
 *   <li>{@link net.opengis.fes.impl.TemporalOperatorTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalOperatorTypeImpl extends MinimalEObjectImpl.Container implements TemporalOperatorType {
	/**
	 * The cached value of the '{@link #getTemporalOperands() <em>Temporal Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperands()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperandsType temporalOperands;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalOperatorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.TEMPORAL_OPERATOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperandsType getTemporalOperands() {
		return temporalOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalOperands(TemporalOperandsType newTemporalOperands, NotificationChain msgs) {
		TemporalOperandsType oldTemporalOperands = temporalOperands;
		temporalOperands = newTemporalOperands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS, oldTemporalOperands, newTemporalOperands);
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
	public void setTemporalOperands(TemporalOperandsType newTemporalOperands) {
		if (newTemporalOperands != temporalOperands) {
			NotificationChain msgs = null;
			if (temporalOperands != null)
				msgs = ((InternalEObject)temporalOperands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS, null, msgs);
			if (newTemporalOperands != null)
				msgs = ((InternalEObject)newTemporalOperands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS, null, msgs);
			msgs = basicSetTemporalOperands(newTemporalOperands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS, newTemporalOperands, newTemporalOperands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_OPERATOR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS:
				return basicSetTemporalOperands(null, msgs);
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
			case FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS:
				return getTemporalOperands();
			case FESPackage.TEMPORAL_OPERATOR_TYPE__NAME:
				return getName();
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
			case FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS:
				setTemporalOperands((TemporalOperandsType)newValue);
				return;
			case FESPackage.TEMPORAL_OPERATOR_TYPE__NAME:
				setName(newValue);
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
			case FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS:
				setTemporalOperands((TemporalOperandsType)null);
				return;
			case FESPackage.TEMPORAL_OPERATOR_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case FESPackage.TEMPORAL_OPERATOR_TYPE__TEMPORAL_OPERANDS:
				return temporalOperands != null;
			case FESPackage.TEMPORAL_OPERATOR_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TemporalOperatorTypeImpl
