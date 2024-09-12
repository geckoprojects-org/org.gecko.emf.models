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
import net.opengis.fes.TemporalCapabilitiesType;
import net.opengis.fes.TemporalOperandsType;
import net.opengis.fes.TemporalOperatorsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.TemporalCapabilitiesTypeImpl#getTemporalOperands <em>Temporal Operands</em>}</li>
 *   <li>{@link net.opengis.fes.impl.TemporalCapabilitiesTypeImpl#getTemporalOperators <em>Temporal Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements TemporalCapabilitiesType {
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
	 * The cached value of the '{@link #getTemporalOperators() <em>Temporal Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperators()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperatorsType temporalOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.TEMPORAL_CAPABILITIES_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS, oldTemporalOperands, newTemporalOperands);
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
				msgs = ((InternalEObject)temporalOperands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS, null, msgs);
			if (newTemporalOperands != null)
				msgs = ((InternalEObject)newTemporalOperands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS, null, msgs);
			msgs = basicSetTemporalOperands(newTemporalOperands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS, newTemporalOperands, newTemporalOperands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperatorsType getTemporalOperators() {
		return temporalOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalOperators(TemporalOperatorsType newTemporalOperators, NotificationChain msgs) {
		TemporalOperatorsType oldTemporalOperators = temporalOperators;
		temporalOperators = newTemporalOperators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS, oldTemporalOperators, newTemporalOperators);
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
	public void setTemporalOperators(TemporalOperatorsType newTemporalOperators) {
		if (newTemporalOperators != temporalOperators) {
			NotificationChain msgs = null;
			if (temporalOperators != null)
				msgs = ((InternalEObject)temporalOperators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS, null, msgs);
			if (newTemporalOperators != null)
				msgs = ((InternalEObject)newTemporalOperators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS, null, msgs);
			msgs = basicSetTemporalOperators(newTemporalOperators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS, newTemporalOperators, newTemporalOperators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS:
				return basicSetTemporalOperands(null, msgs);
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS:
				return basicSetTemporalOperators(null, msgs);
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
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS:
				return getTemporalOperands();
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS:
				return getTemporalOperators();
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
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS:
				setTemporalOperands((TemporalOperandsType)newValue);
				return;
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS:
				setTemporalOperators((TemporalOperatorsType)newValue);
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
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS:
				setTemporalOperands((TemporalOperandsType)null);
				return;
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS:
				setTemporalOperators((TemporalOperatorsType)null);
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
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERANDS:
				return temporalOperands != null;
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE__TEMPORAL_OPERATORS:
				return temporalOperators != null;
		}
		return super.eIsSet(featureID);
	}

} //TemporalCapabilitiesTypeImpl
