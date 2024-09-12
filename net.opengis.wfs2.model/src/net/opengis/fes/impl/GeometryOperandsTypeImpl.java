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
import net.opengis.fes.GeometryOperandType;
import net.opengis.fes.GeometryOperandsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Operands Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.GeometryOperandsTypeImpl#getGeometryOperand <em>Geometry Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometryOperandsTypeImpl extends MinimalEObjectImpl.Container implements GeometryOperandsType {
	/**
	 * The cached value of the '{@link #getGeometryOperand() <em>Geometry Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<GeometryOperandType> geometryOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryOperandsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FESPackage.Literals.GEOMETRY_OPERANDS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeometryOperandType> getGeometryOperand() {
		if (geometryOperand == null) {
			geometryOperand = new EObjectContainmentEList<GeometryOperandType>(GeometryOperandType.class, this, FESPackage.GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND);
		}
		return geometryOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND:
				return ((InternalEList<?>)getGeometryOperand()).basicRemove(otherEnd, msgs);
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
			case FESPackage.GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND:
				return getGeometryOperand();
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
			case FESPackage.GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND:
				getGeometryOperand().clear();
				getGeometryOperand().addAll((Collection<? extends GeometryOperandType>)newValue);
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
			case FESPackage.GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND:
				getGeometryOperand().clear();
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
			case FESPackage.GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND:
				return geometryOperand != null && !geometryOperand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeometryOperandsTypeImpl
