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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TGateway;
import org.omg.spec.bpmn.bpmn.TGatewayDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TGatewayImpl#getGatewayDirection <em>Gateway Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGatewayImpl extends TFlowNodeImpl implements TGateway {
	/**
	 * The default value of the '{@link #getGatewayDirection() <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TGatewayDirection GATEWAY_DIRECTION_EDEFAULT = TGatewayDirection.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getGatewayDirection() <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayDirection()
	 * @generated
	 * @ordered
	 */
	protected TGatewayDirection gatewayDirection = GATEWAY_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Gateway Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gatewayDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGatewayDirection getGatewayDirection() {
		return gatewayDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayDirection(TGatewayDirection newGatewayDirection) {
		TGatewayDirection oldGatewayDirection = gatewayDirection;
		gatewayDirection = newGatewayDirection == null ? GATEWAY_DIRECTION_EDEFAULT : newGatewayDirection;
		boolean oldGatewayDirectionESet = gatewayDirectionESet;
		gatewayDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TGATEWAY__GATEWAY_DIRECTION, oldGatewayDirection, gatewayDirection, !oldGatewayDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGatewayDirection() {
		TGatewayDirection oldGatewayDirection = gatewayDirection;
		boolean oldGatewayDirectionESet = gatewayDirectionESet;
		gatewayDirection = GATEWAY_DIRECTION_EDEFAULT;
		gatewayDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TGATEWAY__GATEWAY_DIRECTION, oldGatewayDirection, GATEWAY_DIRECTION_EDEFAULT, oldGatewayDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGatewayDirection() {
		return gatewayDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TGATEWAY__GATEWAY_DIRECTION:
				return getGatewayDirection();
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
			case BPMNPackage.TGATEWAY__GATEWAY_DIRECTION:
				setGatewayDirection((TGatewayDirection)newValue);
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
			case BPMNPackage.TGATEWAY__GATEWAY_DIRECTION:
				unsetGatewayDirection();
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
			case BPMNPackage.TGATEWAY__GATEWAY_DIRECTION:
				return isSetGatewayDirection();
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
		result.append(" (gatewayDirection: ");
		if (gatewayDirectionESet) result.append(gatewayDirection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TGatewayImpl
