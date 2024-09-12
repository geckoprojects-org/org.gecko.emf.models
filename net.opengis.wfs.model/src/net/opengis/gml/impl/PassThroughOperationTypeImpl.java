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

import java.math.BigInteger;

import java.util.Collection;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.OperationRefType;
import net.opengis.gml.PassThroughOperationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pass Through Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.PassThroughOperationTypeImpl#getModifiedCoordinate <em>Modified Coordinate</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PassThroughOperationTypeImpl#getUsesOperation <em>Uses Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassThroughOperationTypeImpl extends AbstractCoordinateOperationTypeImpl implements PassThroughOperationType {
	/**
	 * The cached value of the '{@link #getModifiedCoordinate() <em>Modified Coordinate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> modifiedCoordinate;

	/**
	 * The cached value of the '{@link #getUsesOperation() <em>Uses Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationRefType usesOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassThroughOperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPassThroughOperationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getModifiedCoordinate() {
		if (modifiedCoordinate == null) {
			modifiedCoordinate = new EDataTypeEList<BigInteger>(BigInteger.class, this, GMLPackage.PASS_THROUGH_OPERATION_TYPE__MODIFIED_COORDINATE);
		}
		return modifiedCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRefType getUsesOperation() {
		return usesOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesOperation(OperationRefType newUsesOperation, NotificationChain msgs) {
		OperationRefType oldUsesOperation = usesOperation;
		usesOperation = newUsesOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION, oldUsesOperation, newUsesOperation);
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
	public void setUsesOperation(OperationRefType newUsesOperation) {
		if (newUsesOperation != usesOperation) {
			NotificationChain msgs = null;
			if (usesOperation != null)
				msgs = ((InternalEObject)usesOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION, null, msgs);
			if (newUsesOperation != null)
				msgs = ((InternalEObject)newUsesOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION, null, msgs);
			msgs = basicSetUsesOperation(newUsesOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION, newUsesOperation, newUsesOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION:
				return basicSetUsesOperation(null, msgs);
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
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__MODIFIED_COORDINATE:
				return getModifiedCoordinate();
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION:
				return getUsesOperation();
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
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__MODIFIED_COORDINATE:
				getModifiedCoordinate().clear();
				getModifiedCoordinate().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION:
				setUsesOperation((OperationRefType)newValue);
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
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__MODIFIED_COORDINATE:
				getModifiedCoordinate().clear();
				return;
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION:
				setUsesOperation((OperationRefType)null);
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
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__MODIFIED_COORDINATE:
				return modifiedCoordinate != null && !modifiedCoordinate.isEmpty();
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE__USES_OPERATION:
				return usesOperation != null;
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
		result.append(" (modifiedCoordinate: ");
		result.append(modifiedCoordinate);
		result.append(')');
		return result.toString();
	}

} //PassThroughOperationTypeImpl
