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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.ConcatenatedOperationType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.SingleOperationRefType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concatenated Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.ConcatenatedOperationTypeImpl#getUsesSingleOperation <em>Uses Single Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcatenatedOperationTypeImpl extends AbstractCoordinateOperationTypeImpl implements ConcatenatedOperationType {
	/**
	 * The cached value of the '{@link #getUsesSingleOperation() <em>Uses Single Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesSingleOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleOperationRefType> usesSingleOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcatenatedOperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getConcatenatedOperationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleOperationRefType> getUsesSingleOperation() {
		if (usesSingleOperation == null) {
			usesSingleOperation = new EObjectContainmentEList<SingleOperationRefType>(SingleOperationRefType.class, this, GMLPackage.CONCATENATED_OPERATION_TYPE__USES_SINGLE_OPERATION);
		}
		return usesSingleOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CONCATENATED_OPERATION_TYPE__USES_SINGLE_OPERATION:
				return ((InternalEList<?>)getUsesSingleOperation()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__USES_SINGLE_OPERATION:
				return getUsesSingleOperation();
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__USES_SINGLE_OPERATION:
				getUsesSingleOperation().clear();
				getUsesSingleOperation().addAll((Collection<? extends SingleOperationRefType>)newValue);
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__USES_SINGLE_OPERATION:
				getUsesSingleOperation().clear();
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
			case GMLPackage.CONCATENATED_OPERATION_TYPE__USES_SINGLE_OPERATION:
				return usesSingleOperation != null && !usesSingleOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcatenatedOperationTypeImpl
