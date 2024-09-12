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

import java.util.Collection;

import net.opengis.fes.FESPackage;
import net.opengis.fes.TemporalOperandType;
import net.opengis.fes.TemporalOperandsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Operands Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.TemporalOperandsTypeImpl#getTemporalOperand <em>Temporal Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalOperandsTypeImpl extends MinimalEObjectImpl.Container implements TemporalOperandsType {
	/**
	 * The cached value of the '{@link #getTemporalOperand() <em>Temporal Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalOperandType> temporalOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalOperandsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.TEMPORAL_OPERANDS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalOperandType> getTemporalOperand() {
		if (temporalOperand == null) {
			temporalOperand = new EObjectContainmentEList<TemporalOperandType>(TemporalOperandType.class, this, FESPackage.TEMPORAL_OPERANDS_TYPE__TEMPORAL_OPERAND);
		}
		return temporalOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.TEMPORAL_OPERANDS_TYPE__TEMPORAL_OPERAND:
				return ((InternalEList<?>)getTemporalOperand()).basicRemove(otherEnd, msgs);
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
			case FESPackage.TEMPORAL_OPERANDS_TYPE__TEMPORAL_OPERAND:
				return getTemporalOperand();
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
			case FESPackage.TEMPORAL_OPERANDS_TYPE__TEMPORAL_OPERAND:
				getTemporalOperand().clear();
				getTemporalOperand().addAll((Collection<? extends TemporalOperandType>)newValue);
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
			case FESPackage.TEMPORAL_OPERANDS_TYPE__TEMPORAL_OPERAND:
				getTemporalOperand().clear();
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
			case FESPackage.TEMPORAL_OPERANDS_TYPE__TEMPORAL_OPERAND:
				return temporalOperand != null && !temporalOperand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemporalOperandsTypeImpl
