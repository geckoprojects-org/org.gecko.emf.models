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
package net.opengis.ogc.impl;

import java.util.Collection;

import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.SpatialOperatorType;
import net.opengis.ogc.SpatialOperatorsType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Operators Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.SpatialOperatorsTypeImpl#getSpatialOperator <em>Spatial Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialOperatorsTypeImpl extends MinimalEObjectImpl.Container implements SpatialOperatorsType {
	/**
	 * The cached value of the '{@link #getSpatialOperator() <em>Spatial Operator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<SpatialOperatorType> spatialOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialOperatorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.SPATIAL_OPERATORS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpatialOperatorType> getSpatialOperator() {
		if (spatialOperator == null) {
			spatialOperator = new EObjectContainmentEList<SpatialOperatorType>(SpatialOperatorType.class, this, OGCPackage.SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR);
		}
		return spatialOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR:
				return ((InternalEList<?>)getSpatialOperator()).basicRemove(otherEnd, msgs);
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
			case OGCPackage.SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR:
				return getSpatialOperator();
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
			case OGCPackage.SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR:
				getSpatialOperator().clear();
				getSpatialOperator().addAll((Collection<? extends SpatialOperatorType>)newValue);
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
			case OGCPackage.SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR:
				getSpatialOperator().clear();
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
			case OGCPackage.SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR:
				return spatialOperator != null && !spatialOperator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpatialOperatorsTypeImpl
